/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.gui;

import ic.poshtkohi.gui.nmos.JInternalFrame_design1;
import ic.poshtkohi.gui.nmos.JInternalFrame_design2;
import ic.poshtkohi.gui.nmos.JInternalFrame_scenario1;

import javax.swing.*;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import java.awt.Dimension;
import javax.swing.JList;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.WindowConstants;

public class NewWizard extends JDialog {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JDesktopPane jDesktopPane = null;

	private JList jList_models = null;

	private JButton jButton_ok = null;

	private JButton jButton_cancel = null;
	private Frame _owner = null;

	//--------------------------------------------------------------------------------------------------
	private void InitialiseJList_models()
	{
		String[] _JList_lists = new String[] {"nmos"};
		
		DefaultListModel listModel = new DefaultListModel();
		listModel.addElement("Debbie Scott");
		listModel.addElement("Scott Hommel");
		listModel.addElement("Alan Sommerer");

		jList_models = new JList(listModel);

		/*for(int i = 0 ; i < _JList_lists.length ; i++)
			jList_models.addElement();*/
		jList_models.setSelectedIndex(0);
	}
	//--------------------------------------------------------------------------------------------------
	/**
	 * @param owner
	 */
	public NewWizard(Frame owner) {
		super(owner);
		initialize();
		_owner = owner;
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(403, 263);
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		this.setTitle("New");
		this.setResizable(false);
		this.setModal(false);
		this.setContentPane(getJContentPane());
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.out.println("windowClosing()"); // TODO Auto-generated Event stub windowClosing()
				setVisible(false);
				_owner.enable(true);
			}
		});
		setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJDesktopPane(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getJDesktopPane() {
		if (jDesktopPane == null) {
			jDesktopPane = new JDesktopPane();
			jDesktopPane.setBackground(SystemColor.control);
			jDesktopPane.add(getJList_models(), null);
			jDesktopPane.add(getJButton_ok(), null);
			jDesktopPane.add(getJButton_cancel(), null);
		}
		return jDesktopPane;
	}

	/**
	 * This method initializes jList_models	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getJList_models() {
		if (jList_models == null) {
			DefaultListModel listModel = new DefaultListModel();
			listModel.addElement("nmos");
			jList_models = new JList(listModel);
			jList_models.setSelectedIndex(0);
			jList_models.setBounds(new Rectangle(11, 16, 256, 202));
		}
		return jList_models;
	}

	/**
	 * This method initializes jButton_ok	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_ok() {
		if (jButton_ok == null) {
			jButton_ok = new JButton();
			jButton_ok.setBounds(new Rectangle(287, 16, 106, 28));
			jButton_ok.setText("Ok");
			jButton_ok.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					switch(getJList_models().getSelectedIndex())
					{
						case 0:
							ic.poshtkohi.gui.nmos.JInternalFrame_scenario1 _scenario1 = new ic.poshtkohi.gui.nmos.JInternalFrame_scenario1();
							ic.poshtkohi.gui.nmos.JInternalFrame_design1 _design1 = new ic.poshtkohi.gui.nmos.JInternalFrame_design1();
							MainApp.createFrame(_scenario1, _design1, true);
							break;
						default:
							break;
					}
					setVisible(false);
					_owner.enable(true);
				}
			});
		}
		return jButton_ok;
	}

	/**
	 * This method initializes jButton_cancel	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_cancel() {
		if (jButton_cancel == null) {
			jButton_cancel = new JButton();
			jButton_cancel.setBounds(new Rectangle(287, 48, 106, 28));
			jButton_cancel.setText("Cancel");
			jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					setVisible(false);
					_owner.enable(true);
					
				}
			});
		}
		return jButton_cancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
