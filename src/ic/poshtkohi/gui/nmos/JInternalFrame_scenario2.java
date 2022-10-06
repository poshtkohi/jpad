/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.gui.nmos;
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

import ic.poshtkohi.gui.MainApp;
import ic.poshtkohi.gui.PictureBox;
import ic.poshtkohi.gui.Constants;
import java.awt.Point;

public class JInternalFrame_scenario2 extends JInternalFrame {

	private JPanel jContentPane = null;
	private JDesktopPane jDesktopPane = null;
	private JTextArea jTextArea_scenario1 = null;
	private JButton jButton_next = null;
	private JButton jButton_previous = null;
	private JButton jButton_reset = null;
	private PictureBox PictureBox1 = null;
	private PictureBox PictureBox11 = null;
	private JTextArea jTextArea_scenario12 = null;
	private JTextArea jTextArea_scenario121 = null;
	private JTextArea jTextArea_scenario11 = null;
	private JTextArea jTextArea_scenario13 = null;
	private PictureBox PictureBox12 = null;
	private JTextArea jTextArea_scenario122 = null;
	private JTextArea jTextArea_scenario1221 = null;
	private PictureBox PictureBox111 = null;
	private JTextArea jTextArea_scenario123 = null;
	private JTextArea jTextArea_scenario1231 = null;
	private JTextArea jTextArea_scenario12311 = null;
	/**
	 * This is the xxx default constructor
	 */
	public JInternalFrame_scenario2() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(406, 563);
		this.setTitle("Scenario (2/2) <nmos>");
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
			jDesktopPane.add(getPictureBox1(), null);
			jDesktopPane.add(getPictureBox11(), null);
			jDesktopPane.add(getJTextArea_scenario12(), null);
			jDesktopPane.add(getJTextArea_scenario121(), null);
			jDesktopPane.add(getJTextArea_scenario11(), null);
			jDesktopPane.add(getJTextArea_scenario13(), null);
			jDesktopPane.add(getPictureBox12(), null);
			jDesktopPane.add(getJTextArea_scenario122(), null);
			jDesktopPane.add(getJTextArea_scenario1221(), null);
			jDesktopPane.add(getPictureBox111(), null);
			jDesktopPane.add(getJTextArea_scenario123(), null);
			jDesktopPane.add(getJTextArea_scenario1231(), null);
			jDesktopPane.add(getJTextArea_scenario12311(), null);
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
			jTextArea_scenario1.setBounds(new Rectangle(75, 24, 118, 19));
			jTextArea_scenario1.setWrapStyleWord(true);
			jTextArea_scenario1.setEditable(false);
			jTextArea_scenario1.setEnabled(true);
			jTextArea_scenario1.setLineWrap(true);
			jTextArea_scenario1.setBackground(SystemColor.control);
			jTextArea_scenario1.setFont(new Font("Dialog", Font.PLAIN, 12));
			jTextArea_scenario1.setForeground(Color.black);
			jTextArea_scenario1.setText("transistor NMOS");
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
			jButton_next.setBounds(new Rectangle(305, 479, 80, 23));
			jButton_next.setHorizontalAlignment(SwingConstants.CENTER);
			jButton_next.setEnabled(false);
			jButton_next.setText("Next >>");
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
			jButton_previous.setBounds(new Rectangle(305, 502, 80, 23));
			jButton_previous.setHorizontalTextPosition(SwingConstants.TRAILING);
			jButton_previous.setHorizontalAlignment(SwingConstants.CENTER);
			jButton_previous.setActionCommand("");
			jButton_previous.setText(" << Prev");
			jButton_previous.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					MainApp.setVisiblityByScenarioNumber(1, true);
					MainApp.setVisiblityByScenarioNumber(2, false);
				}
			});
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
			jButton_reset.setBounds(new Rectangle(208, 502, 80, 23));
			jButton_reset.setText("Reset");
			jButton_reset.setActionCommand("");
			jButton_reset.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jButton_reset;
	}

	/**
	 * This method initializes PictureBox1	
	 * 	
	 * @return ic.poshtkohi.gui.PictureBox	
	 */
	private PictureBox getPictureBox1() {
		if (PictureBox1 == null) {
			PictureBox1 = new PictureBox(getClass().getResource("/images/nmos/red-nmos.png"));
			PictureBox1.setLayout(new GridBagLayout());
			PictureBox1.setLocation(new Point(27, 17));
			PictureBox1.setSize(new Dimension(40, 41));
		}
		return PictureBox1;
	}

	/**
	 * This method initializes PictureBox11	
	 * 	
	 * @return ic.poshtkohi.gui.PictureBox	
	 */
	private PictureBox getPictureBox11() {
		if (PictureBox11 == null) {
			PictureBox11 = new PictureBox(getClass().getResource(
					"/images/nmos/strong_inversion.png"));
			PictureBox11.setLayout(new GridBagLayout());
			PictureBox11.setBounds(new Rectangle(26, 155, 32, 36));
		}
		return PictureBox11;
	}

	/**
	 * This method initializes jTextArea_scenario12	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea_scenario12() {
		if (jTextArea_scenario12 == null) {
			jTextArea_scenario12 = new JTextArea();
			jTextArea_scenario12.setBounds(new Rectangle(74, 157, 278, 16));
			jTextArea_scenario12.setEnabled(true);
			jTextArea_scenario12.setFont(new Font("Dialog", Font.PLAIN, 12));
			jTextArea_scenario12.setForeground(Color.black);
			jTextArea_scenario12.setText("Indication for strong/moderate/weak inversion ");
			jTextArea_scenario12.setEditable(false);
			jTextArea_scenario12.setLineWrap(true);
			jTextArea_scenario12.setWrapStyleWord(true);
			jTextArea_scenario12.setBackground(SystemColor.control);
		}
		return jTextArea_scenario12;
	}

	/**
	 * This method initializes jTextArea_scenario121	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea_scenario121() {
		if (jTextArea_scenario121 == null) {
			jTextArea_scenario121 = new JTextArea();
			jTextArea_scenario121.setBounds(new Rectangle(45, 199, 341, 32));
			jTextArea_scenario121.setEnabled(true);
			jTextArea_scenario121.setFont(new Font("Dialog", Font.PLAIN, 12));
			jTextArea_scenario121.setForeground(Color.black);
			jTextArea_scenario121.setText("For O.5Vds_sat <= Vds <= 1.5Vds_sat, compare your result with your simulator.");
			jTextArea_scenario121.setEditable(false);
			jTextArea_scenario121.setLineWrap(true);
			jTextArea_scenario121.setWrapStyleWord(true);
			jTextArea_scenario121.setBackground(SystemColor.control);
		}
		return jTextArea_scenario121;
	}

	/**
	 * This method initializes jTextArea_scenario11	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea_scenario11() {
		if (jTextArea_scenario11 == null) {
			jTextArea_scenario11 = new JTextArea();
			jTextArea_scenario11.setBounds(new Rectangle(34, 70, 296, 16));
			jTextArea_scenario11.setEnabled(true);
			jTextArea_scenario11.setFont(new Font("Dialog", Font.PLAIN, 12));
			jTextArea_scenario11.setForeground(Color.black);
			jTextArea_scenario11.setText("-All terminal voltages: Vg, Vs, Vd, Vb can be changed. (Respect Vd > Vs!)");
			jTextArea_scenario11.setEditable(false);
			jTextArea_scenario11.setLineWrap(true);
			jTextArea_scenario11.setWrapStyleWord(true);
			jTextArea_scenario11.setBackground(SystemColor.control);
		}
		return jTextArea_scenario11;
	}

	/**
	 * This method initializes jTextArea_scenario13	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea_scenario13() {
		if (jTextArea_scenario13 == null) {
			jTextArea_scenario13 = new JTextArea();
			jTextArea_scenario13.setBounds(new Rectangle(36, 95, 352, 35));
			jTextArea_scenario13.setEnabled(true);
			jTextArea_scenario13.setFont(new Font("Dialog", Font.PLAIN, 12));
			jTextArea_scenario13.setForeground(Color.black);
			jTextArea_scenario13.setText("- Spice-like treshold voltage Vth and saturation voltage Vds_sat are calculated and indicated");
			jTextArea_scenario13.setEditable(false);
			jTextArea_scenario13.setLineWrap(true);
			jTextArea_scenario13.setWrapStyleWord(true);
			jTextArea_scenario13.setBackground(SystemColor.control);
		}
		return jTextArea_scenario13;
	}

	/**
	 * This method initializes PictureBox12	
	 * 	
	 * @return ic.poshtkohi.gui.PictureBox	
	 */
	private PictureBox getPictureBox12() {
		if (PictureBox12 == null) {
			PictureBox12 = new PictureBox(getClass().getResource(
					"/images/nmos/blue_attention.png"));
			PictureBox12.setLayout(new GridBagLayout());
			PictureBox12.setBounds(new Rectangle(20, 201, 17, 15));
			PictureBox12.setBackground(SystemColor.control);
		}
		return PictureBox12;
	}

	/**
	 * This method initializes jTextArea_scenario122	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea_scenario122() {
		if (jTextArea_scenario122 == null) {
			jTextArea_scenario122 = new JTextArea();
			jTextArea_scenario122.setBounds(new Rectangle(26, 240, 352, 32));
			jTextArea_scenario122.setEnabled(true);
			jTextArea_scenario122.setFont(new Font("Dialog", Font.PLAIN, 12));
			jTextArea_scenario122.setForeground(Color.black);
			jTextArea_scenario122.setText("* W (L) can be changed to calculate Idsat when W/L is constant or W/L is variable, or to calculate Vg when Idsat is constant ");
			jTextArea_scenario122.setEditable(false);
			jTextArea_scenario122.setLineWrap(true);
			jTextArea_scenario122.setWrapStyleWord(true);
			jTextArea_scenario122.setBackground(SystemColor.control);
		}
		return jTextArea_scenario122;
	}

	/**
	 * This method initializes jTextArea_scenario1221	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea_scenario1221() {
		if (jTextArea_scenario1221 == null) {
			jTextArea_scenario1221 = new JTextArea();
			jTextArea_scenario1221.setBounds(new Rectangle(29, 278, 351, 50));
			jTextArea_scenario1221.setEnabled(true);
			jTextArea_scenario1221.setFont(new Font("Dialog", Font.PLAIN, 12));
			jTextArea_scenario1221.setForeground(Color.black);
			jTextArea_scenario1221.setText("* W/L can be changed to calculate Idsat when W(L) is constant or to calculate Vg (when Idsat is constant) when W(L) is constant (If W<Wmin, or L<Lmin, warning!)");
			jTextArea_scenario1221.setEditable(false);
			jTextArea_scenario1221.setLineWrap(true);
			jTextArea_scenario1221.setWrapStyleWord(true);
			jTextArea_scenario1221.setBackground(SystemColor.control);
		}
		return jTextArea_scenario1221;
	}

	/**
	 * This method initializes PictureBox111	
	 * 	
	 * @return ic.poshtkohi.gui.PictureBox	
	 */
	private PictureBox getPictureBox111() {
		if (PictureBox111 == null) {
			PictureBox111 = new PictureBox(getClass().getResource(
					"/images/nmos/saturation_region.png"));
			PictureBox111.setLayout(new GridBagLayout());
			PictureBox111.setBounds(new Rectangle(22, 326, 31, 35));
		}
		return PictureBox111;
	}

	/**
	 * This method initializes jTextArea_scenario123	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea_scenario123() {
		if (jTextArea_scenario123 == null) {
			jTextArea_scenario123 = new JTextArea();
			jTextArea_scenario123.setBounds(new Rectangle(65, 336, 309, 16));
			jTextArea_scenario123.setEnabled(true);
			jTextArea_scenario123.setFont(new Font("Dialog", Font.PLAIN, 12));
			jTextArea_scenario123.setForeground(Color.black);
			jTextArea_scenario123.setText("Indication for linear/saturation region");
			jTextArea_scenario123.setEditable(false);
			jTextArea_scenario123.setLineWrap(true);
			jTextArea_scenario123.setWrapStyleWord(true);
			jTextArea_scenario123.setBackground(SystemColor.control);
		}
		return jTextArea_scenario123;
	}

	/**
	 * This method initializes jTextArea_scenario1231	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea_scenario1231() {
		if (jTextArea_scenario1231 == null) {
			jTextArea_scenario1231 = new JTextArea();
			jTextArea_scenario1231.setBounds(new Rectangle(23, 365, 368, 47));
			jTextArea_scenario1231.setEnabled(true);
			jTextArea_scenario1231.setFont(new Font("Dialog", Font.PLAIN, 12));
			jTextArea_scenario1231.setForeground(Color.black);
			jTextArea_scenario1231.setText("*Idsat can be changed to calculate W(L), to calculate W/L when W(L) is constant or to calculate Vg. (If Idsat < 1 pA too small current warning!) ");
			jTextArea_scenario1231.setEditable(false);
			jTextArea_scenario1231.setLineWrap(true);
			jTextArea_scenario1231.setWrapStyleWord(true);
			jTextArea_scenario1231.setBackground(SystemColor.control);
		}
		return jTextArea_scenario1231;
	}

	/**
	 * This method initializes jTextArea_scenario12311	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea_scenario12311() {
		if (jTextArea_scenario12311 == null) {
			jTextArea_scenario12311 = new JTextArea();
			jTextArea_scenario12311.setBounds(new Rectangle(18, 419, 372, 50));
			jTextArea_scenario12311.setEnabled(true);
			jTextArea_scenario12311.setFont(new Font("Dialog", Font.PLAIN, 12));
			jTextArea_scenario12311.setForeground(Color.black);
			jTextArea_scenario12311.setText("-Intrisic and overlap capacitances, transition frequency ft, transconductances transistor area, noise parameters, gm/Id ratio, Early voltage and transconductance efficiency factor are calculated and indicated. ");
			jTextArea_scenario12311.setEditable(false);
			jTextArea_scenario12311.setLineWrap(true);
			jTextArea_scenario12311.setWrapStyleWord(true);
			jTextArea_scenario12311.setBackground(SystemColor.control);
		}
		return jTextArea_scenario12311;
	}
	
	
	

}  //  @jve:decl-index=0:visual-constraint="3,-409"
