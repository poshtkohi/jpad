/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.gui;
import java.util.*;
import ic.poshtkohi.gui.NewWizard;
import ic.poshtkohi.gui.nmos.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;


public class MainApp
{
	
	private static JDesktopPane jdpDesktop;
	public static ArrayList _designsJInternalFrame = new ArrayList();  //  @jve:decl-index=0:
	public static ArrayList _scenariosJInternalFrame = new ArrayList();  //  @jve:decl-index=0:
	public static int openFrameCount = 0;
	//--------------------------------------------------------------------------------------------
	public static void setVisiblityByScenarioNumber(int i, boolean _visible)
	{
		i--;
		if(MainApp._designsJInternalFrame == null)
			return;
		if(i > MainApp._designsJInternalFrame.size() - 1)
			return ;
		
		JInternalFrame _temp = (JInternalFrame)MainApp._designsJInternalFrame.get(i);
		_temp.setVisible(_visible);
		
		_temp = (JInternalFrame)MainApp._scenariosJInternalFrame.get(i);
		_temp.setVisible(_visible);
	}
	//--------------------------------------------------------------------------------------------	
	public static void createFrame(JInternalFrame _scenario, JInternalFrame _design, boolean _createNewSession)
	{
		if(_createNewSession)
		{
			if(MainApp._designsJInternalFrame.size() > 0)
			{
				for(int i= 0 ; i < MainApp._designsJInternalFrame.size() ; i++)
				{
					JInternalFrame _temp = (JInternalFrame)MainApp._designsJInternalFrame.get(i);
					_temp.dispose();
					_temp = null;
					
					_temp = (JInternalFrame)MainApp._scenariosJInternalFrame.get(i);
					_temp.dispose();
					_temp = null;
				}
				MainApp._designsJInternalFrame.clear();
				MainApp._scenariosJInternalFrame.clear();
			}
		}
		
		MainApp._designsJInternalFrame.add(_scenario);
		MainApp._scenariosJInternalFrame.add(_design);
		
		_scenario.setLocation(30,30);
		_scenario.setVisible(true);
		
		
		_design.setLocation(_scenario.getLocation().x + _scenario.getSize().width + 20, _scenario.getLocation().y);
		_design.setVisible(true);
		
		MainApp.jdpDesktop.add(_scenario);
		MainApp.jdpDesktop.add(_design);
		
		try
		{
			_scenario.setSelected(true);
			_design.setSelected(true);
		}
		catch (java.beans.PropertyVetoException e) {}
	}
	//----------------------------------------------------------------
	private JFrame MainjFrame = null;  //  @jve:decl-index=0:visual-constraint="9,-5"
	private JDesktopPane jDesktopPane = null;  //  @jve:decl-index=0:visual-constraint="386,366"
	private JMenuBar MainjJMenuBar = null;
	private JMenu MainjMenu_File = null;
	private JMenuItem MainjMenuItem_open = null;
	private JMenuItem MainjMenuItem_save = null;
	private JMenuItem MainjMenuItem_exit = null;
	private JMenu MainjMenu_view = null;
	private JMenuItem MainjMenuItem_sample = null;
	private JMenu MainjMenu_help = null;
	private JMenuItem MainjMenuItem_about = null;
	private JMenuItem MainjMenuItem_new = null;
	private NewWizard _NewWizard = null;
	/**
	 * This method initializes MainjFrame	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getMainjFrame() {
		if (MainjFrame == null) {
			MainjFrame = new JFrame();
			MainjFrame.setSize(new Dimension(322, 216));
			MainjFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons/edit_16.png")));
			MainjFrame.setJMenuBar(getMainjJMenuBar());
			MainjFrame.setTitle("IC Design");
			
			_NewWizard = new NewWizard(MainjFrame);
			
			
			
			/*int inset = 50;
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			jFrame.setBounds(inset, inset, screenSize.width - inset * 2,
					screenSize.height - inset * 2);*/
			// Add a Window Exit Listener
			MainjFrame.addWindowListener(new WindowAdapter() {   
				public void windowOpened(java.awt.event.WindowEvent e) {    
					System.out.println("windowOpened()"); // TODO Auto-generated Event stub windowOpened()
					//createFrame();
				}

				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			// Create and Set up the GUI.
			jdpDesktop = new JDesktopPane();
			// A specialized layered pane to be used with JInternalFrames
			jdpDesktop.setBackground(Color.lightGray);
			MainjFrame.setContentPane(jdpDesktop);
			//setJMenuBar(createMenuBar());
			// Make dragging faster by setting drag mode to Outline
			jdpDesktop.putClientProperty("JDesktopPane.dragMode", "outline");
		}
		return MainjFrame;
	}

	/**
	 * This method initializes MainjJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getMainjJMenuBar() {
		if (MainjJMenuBar == null) {
			MainjJMenuBar = new JMenuBar();
			MainjJMenuBar.add(getMainjMenu_File());
			MainjJMenuBar.add(getMainjMenu_view());
			MainjJMenuBar.add(getMainjMenu_help());
		}
		return MainjJMenuBar;
	}

	/**
	 * This method initializes MainjMenu_File	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMainjMenu_File() {
		if (MainjMenu_File == null) {
			MainjMenu_File = new JMenu();
			MainjMenu_File.setText("File");
			MainjMenu_File.add(getMainjMenuItem_new());
			MainjMenu_File.add(getMainjMenuItem_open());
			MainjMenu_File.add(getMainjMenuItem_save());
			MainjMenu_File.addSeparator();
			MainjMenu_File.add(getMainjMenuItem_exit());
		}
		return MainjMenu_File;
	}

	/**
	 * This method initializes MainjMenuItem_open	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMainjMenuItem_open() {
		if (MainjMenuItem_open == null) {
			MainjMenuItem_open = new JMenuItem();
			MainjMenuItem_open.setText("Open");
		}
		return MainjMenuItem_open;
	}

	/**
	 * This method initializes MainjMenuItem_save	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMainjMenuItem_save() {
		if (MainjMenuItem_save == null) {
			MainjMenuItem_save = new JMenuItem();
			MainjMenuItem_save.setText("Save");
		}
		return MainjMenuItem_save;
	}

	/**
	 * This method initializes MainjMenuItem_exit	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMainjMenuItem_exit() {
		if (MainjMenuItem_exit == null) {
			MainjMenuItem_exit = new JMenuItem();
			MainjMenuItem_exit.setText("Exit");
		}
		return MainjMenuItem_exit;
	}

	/**
	 * This method initializes MainjMenu_view	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMainjMenu_view() {
		if (MainjMenu_view == null) {
			MainjMenu_view = new JMenu();
			MainjMenu_view.setText("View");
			MainjMenu_view.add(getMainjMenuItem_sample());
		}
		return MainjMenu_view;
	}

	/**
	 * This method initializes MainjMenuItem_sample	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMainjMenuItem_sample() {
		if (MainjMenuItem_sample == null) {
			MainjMenuItem_sample = new JMenuItem();
			MainjMenuItem_sample.setText("sample window");
		}
		return MainjMenuItem_sample;
	}

	/**
	 * This method initializes MainjMenu_help	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMainjMenu_help() {
		if (MainjMenu_help == null) {
			MainjMenu_help = new JMenu();
			MainjMenu_help.setText("Help");
			MainjMenu_help.add(getMainjMenuItem_about());
		}
		return MainjMenu_help;
	}

	/**
	 * This method initializes MainjMenuItem_about	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMainjMenuItem_about() {
		if (MainjMenuItem_about == null) {
			MainjMenuItem_about = new JMenuItem();
			MainjMenuItem_about.setText("About");
			MainjMenuItem_about.setToolTipText("");
		}
		return MainjMenuItem_about;
	}

	/**
	 * This method initializes MainjMenuItem_new	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMainjMenuItem_new() {
		if (MainjMenuItem_new == null) {
			MainjMenuItem_new = new JMenuItem();
			MainjMenuItem_new.setText("New");
			MainjMenuItem_new.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					//createFrame();
					_NewWizard.setVisible(true);
					MainjFrame.enable(false);
					
				}
			});
		}
		return MainjMenuItem_new;
	}

	public void setInitialSettings()
	{
		/*Dimension _si = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle _rectangle = this.getJToolBar().getBounds();
		int _y = _si.height - this.getMainjFrame().getSize().height;
		this.getJToolBar().setBounds(new Rectangle(_rectangle.x, _y, _rectangle.width, _rectangle.height));
		_si.height = this.getJToolBar().getSize().height;
		this.getJToolBar().setSize(_si);*/
		
		this.getMainjFrame().setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		this.getMainjFrame().setExtendedState(JFrame.MAXIMIZED_BOTH);
		//jToolBar.setBounds(new Rectangle(0, _si.height - _height, 316, _height));
		
		
		
		
		
		/////
		
		ic.poshtkohi.gui.nmos.JInternalFrame_scenario1 _scenario1 = new ic.poshtkohi.gui.nmos.JInternalFrame_scenario1();
		ic.poshtkohi.gui.nmos.JInternalFrame_design1 _design1 = new ic.poshtkohi.gui.nmos.JInternalFrame_design1();
		MainApp.createFrame(_scenario1, _design1, true);
		
		/////
		
		
		
	}

	/**
	 * Launches this application
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainApp application = new MainApp();
				application.setInitialSettings();
				application.getMainjFrame().setVisible(true);
			}
		});
	}
	//--------------------------------------------------------------------------------------------

}

