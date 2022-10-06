/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.gui.nmos;
import ic.poshtkohi.common.EkvMosParameters;
import ic.poshtkohi.gui.*;

import javax.swing.*;
import java.awt.*; 
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JTextPane;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class JInternalFrame_scenario1 extends JInternalFrame {

	private JPanel jContentPane = null;
	private JDesktopPane jDesktopPane = null;
	private JTextArea jTextArea_scenario1 = null;
	private JButton jButton_next = null;
	private JButton jButton_previous = null;
	private JButton jButton_reset = null;
	/**
	 * This is the xxx default constructor
	 */
	public JInternalFrame_scenario1() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(210, 316);
		this.setTitle("Scenario (1/2) <nmos>");
		this.setFrameIcon(new ImageIcon(getClass().getResource("/images/icons/pictures_24.png")));
		this.setContentPane(getJContentPane());
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
			jDesktopPane.add(getJTextArea_scenario1(), null);
			jDesktopPane.add(getJButton_next(), null);
			jDesktopPane.add(getJButton_previous(), null);
			jDesktopPane.add(getJButton_reset(), null);
		}
		return jDesktopPane;
	}

	/**
	 * This method initializes jTextArea_scenario1	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea_scenario1() {
		if (jTextArea_scenario1 == null) {
			jTextArea_scenario1 = new JTextArea();
			jTextArea_scenario1.setBounds(new Rectangle(11, 12, 175, 180));
			jTextArea_scenario1.setWrapStyleWord(true);
			jTextArea_scenario1.setEditable(false);
			jTextArea_scenario1.setEnabled(true);
			jTextArea_scenario1.setLineWrap(true);
			jTextArea_scenario1.setBackground(SystemColor.control);
			jTextArea_scenario1.setFont(new Font("Dialog", Font.PLAIN, 12));
			jTextArea_scenario1.setForeground(Color.black);
			jTextArea_scenario1.setText("Initialisation \n- Enter EKV rnodel pararneters. (default values can be used. but it is recornrnended to use the sarne values like in your sirnulator) \n- Enter input voltages and transistor width and lenght. ");
		}
		return jTextArea_scenario1;
	}

	/**
	 * This method initializes jButton_next	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_next() {
		if (jButton_next == null) {
			jButton_next = new JButton();
			jButton_next.setBounds(new Rectangle(105, 224, 80, 23));
			jButton_next.setHorizontalAlignment(SwingConstants.CENTER);
			jButton_next.setText("Next >>");
			jButton_next.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					if(MainApp._designsJInternalFrame.size() ==1)
					{
						ic.poshtkohi.gui.nmos.JInternalFrame_scenario2 _scenario2 = new ic.poshtkohi.gui.nmos.JInternalFrame_scenario2();
						ic.poshtkohi.gui.nmos.JInternalFrame_design2 _design2 = new ic.poshtkohi.gui.nmos.JInternalFrame_design2();
						MainApp.createFrame(_scenario2, _design2, false);
					}
					MainApp.setVisiblityByScenarioNumber(1, false);
					MainApp.setVisiblityByScenarioNumber(2, true);
					ic.poshtkohi.gui.nmos.JInternalFrame_design2.ekv = new EkvMosParameters();
				}
			});
		}
		return jButton_next;
	}

	/**
	 * This method initializes jButton_previous	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_previous() {
		if (jButton_previous == null) {
			jButton_previous = new JButton();
			jButton_previous.setBounds(new Rectangle(105, 247, 80, 23));
			jButton_previous.setHorizontalTextPosition(SwingConstants.TRAILING);
			jButton_previous.setHorizontalAlignment(SwingConstants.CENTER);
			jButton_previous.setActionCommand("");
			jButton_previous.setEnabled(false);
			jButton_previous.setText(" << Prev");
		}
		return jButton_previous;
	}

	/**
	 * This method initializes jButton_reset	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_reset() {
		if (jButton_reset == null) {
			jButton_reset = new JButton();
			jButton_reset.setBounds(new Rectangle(8, 247,  80, 23));
			jButton_reset.setText("Reset");
			jButton_reset.setActionCommand("");
			jButton_reset.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jButton_reset;
	}
	
	
	

}  //  @jve:decl-index=0:visual-constraint="5,-367"
