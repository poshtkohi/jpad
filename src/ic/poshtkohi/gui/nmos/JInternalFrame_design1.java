/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.gui.nmos;

import ic.poshtkohi.gui.*;
import ic.poshtkohi.common.*;
import ic.poshtkohi.gui.PictureBox;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import java.awt.Color;

public class JInternalFrame_design1 extends JInternalFrame {

	private JPanel jContentPane = null;
	private JDesktopPane jDesktopPane = null;
	private JDesktopPane jDesktopPane1 = null;
	private JLabel jLabel = null;
	private JPanel jPanel15 = null;
	//----------------------------------------------------
	public static JTextField jTextField_Wmin = null;
	public static JTextField jTextField_Lmin = null;
	public static JTextField jTextField_step = null;
	public static JTextField jTextField_VTO = null;
	public static JTextField jTextField_GAMMA = null;
	public static JTextField jTextField_PHI = null;
	public static JTextField jTextField_KP = null;
	public static JTextField jTextField_TCV = null;
	public static JTextField jTextField_BEX = null;
	public static JTextField jTextField_UCEX = null;
	public static JTextField jTextField_Tnom = null;
	public static JTextField jTextField_T = null;
	public static JTextField jTextField_DW = null;
	public static JTextField jTextField_DL = null;
	public static JTextField jTextField_XJ = null;
	public static JTextField jTextField_UCRIT = null;
	public static JTextField jTextField_LAMBADA = null;
	public static JTextField jTextField_LETA = null;
	public static JTextField jTextField_WETA = null;
	public static JTextField jTextField_COX = null;
	public static JTextField jTextField_CGSO = null;
	public static JTextField jTextField_CGDO = null;
	public static JTextField jTextField_CGBO = null;
	public static JTextField jTextField_Avt = null;
	public static JTextField jTextField_Abeta = null;
	public static JTextField jTextField_Vg = null;
	public static JTextField jTextField_Vs = null;
	public static JTextField jTextField_Vd = null;
	public static JTextField jTextField_Vb = null;
	public static JTextField jTextField_W = null;
	public static JTextField jTextField_L = null;
	public static JTextField jTextField_KF = null;
	public static JTextField jTextField_AF = null;
	public static JTextField jTextField_f = null;
	public static EkvMosParameters _ekv = null;
	//----------------------------------------------------
	private JLabel jLabel1 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JLabel jLabel15 = null;
	private JPanel jPanel151 = null;
	private JLabel jLabel16 = null;
	private JLabel jLabel111 = null;
	private JLabel jLabel121 = null;
	private JLabel jLabel131 = null;
	private JLabel jLabel141 = null;
	private JLabel jLabel151 = null;
	private JLabel jLabel1511 = null;
	private JLabel jLabel1211 = null;
	private JPanel jPanel1511 = null;
	private JLabel jLabel161 = null;
	private JLabel jLabel1311 = null;
	private JLabel jLabel1411 = null;
	private JLabel jLabel1512 = null;
	private JLabel jLabel15111 = null;
	private JLabel jLabel12111 = null;
	private JLabel jLabel121111 = null;
	private JLabel jLabel151111 = null;
	private JPanel jPanel152 = null;
	private JLabel jLabel17 = null;
	private JLabel jLabel112 = null;
	private JLabel jLabel132 = null;
	private JLabel jLabel142 = null;
	private JPanel jPanel153 = null;
	private JLabel jLabel18 = null;
	private JLabel jLabel113 = null;
	private JLabel jLabel133 = null;
	private JLabel jLabel143 = null;
	private JLabel jLabel152 = null;
	private JPanel jPanel1521 = null;
	private JLabel jLabel1321 = null;
	private JLabel jLabel1421 = null;
	private JPanel jPanel1512 = null;
	private JLabel jLabel162 = null;
	private JLabel jLabel1111 = null;
	private JLabel jLabel1212 = null;
	private JLabel jLabel1312 = null;
	private JLabel jLabel1412 = null;
	private JLabel jLabel1513 = null;
	private JLabel jLabel15112 = null;
	private JLabel jLabel12112 = null;
	private JPanel jPanel15211 = null;
	private JLabel jLabel1711 = null;
	private JLabel jLabel11211 = null;
	private JLabel jLabel13211 = null;
	private JLabel jLabel14211 = null;
	private JLabel jLabel2 = null;
	private JPanel jPanel1513 = null;
	private JLabel jLabel163 = null;
	private JLabel jLabel1112 = null;
	private JLabel jLabel1213 = null;
	private JLabel jLabel1313 = null;
	private JLabel jLabel1413 = null;
	private JLabel jLabel1514 = null;
	private JLabel jLabel15113 = null;
	private JLabel jLabel12113 = null;
	private PictureBox PictureBox1 = null;
	private JPanel jPanel15311 = null;
	private JLabel jLabel1811 = null;
	private JLabel jLabel11311 = null;
	private JLabel jLabel13311 = null;
	private JLabel jLabel14311 = null;
	private JLabel jLabel21 = null;
	private JPanel jPanel154 = null;
	private JLabel jLabel122 = null;
	private JLabel jLabel134 = null;
	private JLabel jLabel144 = null;
	private JLabel jLabel153 = null;
	/**
	 * This is the xxx default constructor
	 */
	public JInternalFrame_design1() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(737, 603);
		this.setTitle("Design (1/2) <nmos>");
		this.setFrameIcon(new ImageIcon(getClass().getResource("/images/icons/paste_24.png")));
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
			jContentPane.add(getJDesktopPane(), BorderLayout.EAST);
			jContentPane.add(getJDesktopPane1(), BorderLayout.CENTER);
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
		}
		return jDesktopPane;
	}

	/**
	 * This method initializes jDesktopPane1	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getJDesktopPane1() {
		if (jDesktopPane1 == null) {
			jLabel21 = new JLabel();
			jLabel21.setBounds(new Rectangle(479, 453, 172, 16));
			jLabel21.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel21.setText("transistor width and lenght:");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(32, 404, 172, 16));
			jLabel2.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel2.setText("input voltages:");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(34, 13, 194, 16));
			jLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel.setText("NMOS EKV model parameters:");
			jDesktopPane1 = new JDesktopPane();
			jDesktopPane1.setBackground(SystemColor.control);
			jDesktopPane1.add(jLabel, null);
			jDesktopPane1.add(getJPanel15(), null);
			jDesktopPane1.add(getJPanel151(), null);
			jDesktopPane1.add(getJPanel1511(), null);
			jDesktopPane1.add(getJPanel152(), null);
			jDesktopPane1.add(getJPanel153(), null);
			jDesktopPane1.add(getJPanel1521(), null);
			jDesktopPane1.add(getJPanel1512(), null);
			jDesktopPane1.add(getJPanel15211(), null);
			jDesktopPane1.add(jLabel2, null);
			jDesktopPane1.add(getJPanel1513(), null);
			jDesktopPane1.add(getPictureBox1(), null);
			jDesktopPane1.add(getJPanel15311(), null);
			jDesktopPane1.add(jLabel21, null);
			jDesktopPane1.add(getJPanel154(), null);
		}
		return jDesktopPane1;
	}

	/**
	 * This method initializes jPanel15	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel15() {
		if (jPanel15 == null) {
			jLabel15 = new JLabel();
			jLabel15.setBounds(new Rectangle(15, 75, 46, 16));
			jLabel15.setText("step");
			jLabel15.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel14 = new JLabel();
			jLabel14.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel14.setText("Lmin");
			jLabel14.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel13 = new JLabel();
			jLabel13.setBounds(new Rectangle(15, 15, 46, 16));
			jLabel13.setText("Wmin");
			jLabel13.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel13.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel12 = new JLabel();
			jLabel12.setBounds(new Rectangle(150, 75, 18, 16));
			jLabel12.setText("um");
			jLabel12.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel11 = new JLabel();
			jLabel11.setBounds(new Rectangle(150, 45, 18, 16));
			jLabel11.setText("um");
			jLabel11.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(150, 15, 18, 16));
			jLabel1.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1.setText("um");
			jPanel15 = new JPanel();
			jPanel15.setLayout(null);
			jPanel15.setBounds(new Rectangle(30, 45, 193, 106));
			jPanel15.setBackground(SystemColor.info);
			jPanel15.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel15.add(getJTextField_Wmin(), null);
			jPanel15.add(getJTextField_Lmin(), null);
			jPanel15.add(getJTextField_step(), null);
			jPanel15.add(jLabel1, null);
			jPanel15.add(jLabel11, null);
			jPanel15.add(jLabel12, null);
			jPanel15.add(jLabel13, null);
			jPanel15.add(jLabel14, null);
			jPanel15.add(jLabel15, null);
		}
		return jPanel15;
	}

	/**
	 * This method initializes jTextField_Wmin	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Wmin() {
		if (jTextField_Wmin == null) {
			jTextField_Wmin = new JTextField();
			jTextField_Wmin.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_Wmin.setText("0.5");
			jTextField_Wmin.setHorizontalAlignment(JTextField.RIGHT);
		}
		return jTextField_Wmin;
	}

	/**
	 * This method initializes jTextField_Lmin	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Lmin() {
		if (jTextField_Lmin == null) {
			jTextField_Lmin = new JTextField();
			jTextField_Lmin.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_Lmin.setText("0.5");
			jTextField_Lmin.setHorizontalAlignment(JTextField.RIGHT);
		}
		return jTextField_Lmin;
	}

	/**
	 * This method initializes jTextField_step	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_step() {
		if (jTextField_step == null) {
			jTextField_step = new JTextField();
			jTextField_step.setBounds(new Rectangle(60, 75, 90, 27));
			jTextField_step.setText("0.1");
			jTextField_step.setHorizontalAlignment(JTextField.RIGHT);
		}
		return jTextField_step;
	}

	/**
	 * This method initializes jPanel151	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel151() {
		if (jPanel151 == null) {
			jLabel1211 = new JLabel();
			jLabel1211.setBounds(new Rectangle(150, 104, 46, 16));
			jLabel1211.setText("A / V x V");
			jLabel1211.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1511 = new JLabel();
			jLabel1511.setBounds(new Rectangle(15, 104, 40, 16));
			jLabel1511.setText("KP");
			jLabel1511.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel151 = new JLabel();
			jLabel151.setBounds(new Rectangle(15, 75, 46, 16));
			jLabel151.setText("PHI");
			jLabel151.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel141 = new JLabel();
			jLabel141.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel141.setText("GAMMA");
			jLabel141.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel131 = new JLabel();
			jLabel131.setBounds(new Rectangle(15, 15, 46, 16));
			jLabel131.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel131.setText("VTO");
			jLabel131.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel121 = new JLabel();
			jLabel121.setBounds(new Rectangle(150, 75, 18, 16));
			jLabel121.setText("V");
			jLabel121.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel111 = new JLabel();
			jLabel111.setBounds(new Rectangle(150, 45, 46, 16));
			jLabel111.setText("sqrt(V)");
			jLabel111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel16 = new JLabel();
			jLabel16.setBounds(new Rectangle(150, 15, 18, 16));
			jLabel16.setText("V");
			jLabel16.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel151 = new JPanel();
			jPanel151.setLayout(null);
			jPanel151.setBounds(new Rectangle(255, 45, 203, 136));
			jPanel151.setBackground(SystemColor.info);
			jPanel151.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel151.add(getJTextField_VTO(), null);
			jPanel151.add(getJTextField_GAMMA(), null);
			jPanel151.add(getJTextField_PHI(), null);
			jPanel151.add(jLabel16, null);
			jPanel151.add(jLabel111, null);
			jPanel151.add(jLabel121, null);
			jPanel151.add(jLabel131, null);
			jPanel151.add(jLabel141, null);
			jPanel151.add(jLabel151, null);
			jPanel151.add(getJTextField_KP(), null);
			jPanel151.add(jLabel1511, null);
			jPanel151.add(jLabel1211, null);
		}
		return jPanel151;
	}

	/**
	 * This method initializes jTextField_VTO	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_VTO() {
		if (jTextField_VTO == null) {
			jTextField_VTO = new JTextField();
			jTextField_VTO.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_VTO.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_VTO.setText("0.61");
		}
		return jTextField_VTO;
	}

	/**
	 * This method initializes jTextField_GAMMA	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_GAMMA() {
		if (jTextField_GAMMA == null) {
			jTextField_GAMMA = new JTextField();
			jTextField_GAMMA.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_GAMMA.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_GAMMA.setText("0.66");
		}
		return jTextField_GAMMA;
	}

	/**
	 * This method initializes jTextField_PHI	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_PHI() {
		if (jTextField_PHI == null) {
			jTextField_PHI = new JTextField();
			jTextField_PHI.setBounds(new Rectangle(60, 75, 90, 27));
			jTextField_PHI.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_PHI.setText("0.8");
		}
		return jTextField_PHI;
	}

	/**
	 * This method initializes jTextField_KP	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_KP() {
		if (jTextField_KP == null) {
			jTextField_KP = new JTextField();
			jTextField_KP.setBounds(new Rectangle(60, 105, 90, 27));
			jTextField_KP.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_KP.setText("0.000169");
		}
		return jTextField_KP;
	}

	/**
	 * This method initializes jPanel1511	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1511() {
		if (jPanel1511 == null) {
			jLabel151111 = new JLabel();
			jLabel151111.setBounds(new Rectangle(15, 135, 47, 16));
			jLabel151111.setText("T");
			jLabel151111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel121111 = new JLabel();
			jLabel121111.setBounds(new Rectangle(150, 135, 25, 16));
			jLabel121111.setText("K");
			jLabel121111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel12111 = new JLabel();
			jLabel12111.setBounds(new Rectangle(150, 104, 46, 16));
			jLabel12111.setText("K");
			jLabel12111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel15111 = new JLabel();
			jLabel15111.setBounds(new Rectangle(15, 104, 40, 16));
			jLabel15111.setText("Tnom");
			jLabel15111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1512 = new JLabel();
			jLabel1512.setBounds(new Rectangle(15, 75, 46, 16));
			jLabel1512.setText("UCEX");
			jLabel1512.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1411 = new JLabel();
			jLabel1411.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel1411.setText("BEX");
			jLabel1411.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1311 = new JLabel();
			jLabel1311.setBounds(new Rectangle(15, 15, 46, 16));
			jLabel1311.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel1311.setText("TCV");
			jLabel1311.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel161 = new JLabel();
			jLabel161.setBounds(new Rectangle(150, 15, 31, 16));
			jLabel161.setText("V / K");
			jLabel161.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel1511 = new JPanel();
			jPanel1511.setLayout(null);
			jPanel1511.setBounds(new Rectangle(480, 45, 211, 166));
			jPanel1511.setBackground(SystemColor.info);
			jPanel1511.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel1511.add(getJTextField_TCV(), null);
			jPanel1511.add(getJTextField_BEX(), null);
			jPanel1511.add(getJTextField_UCEX(), null);
			jPanel1511.add(jLabel161, null);
			jPanel1511.add(jLabel1311, null);
			jPanel1511.add(jLabel1411, null);
			jPanel1511.add(jLabel1512, null);
			jPanel1511.add(getJTextField_Tnom(), null);
			jPanel1511.add(jLabel15111, null);
			jPanel1511.add(jLabel12111, null);
			jPanel1511.add(getJTextField_T(), null);
			jPanel1511.add(jLabel121111, null);
			jPanel1511.add(jLabel151111, null);
		}
		return jPanel1511;
	}

	/**
	 * This method initializes jTextField_TCV	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_TCV() {
		if (jTextField_TCV == null) {
			jTextField_TCV = new JTextField();
			jTextField_TCV.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_TCV.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_TCV.setText("0.0017");
		}
		return jTextField_TCV;
	}

	/**
	 * This method initializes jTextField_BEX	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_BEX() {
		if (jTextField_BEX == null) {
			jTextField_BEX = new JTextField();
			jTextField_BEX.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_BEX.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_BEX.setText("-1.57");
		}
		return jTextField_BEX;
	}

	/**
	 * This method initializes jTextField_UCEX	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_UCEX() {
		if (jTextField_UCEX == null) {
			jTextField_UCEX = new JTextField();
			jTextField_UCEX.setBounds(new Rectangle(60, 75, 90, 27));
			jTextField_UCEX.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_UCEX.setText("1.6");
		}
		return jTextField_UCEX;
	}

	/**
	 * This method initializes jTextField_Tnom	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Tnom() {
		if (jTextField_Tnom == null) {
			jTextField_Tnom = new JTextField();
			jTextField_Tnom.setBounds(new Rectangle(60, 105, 90, 27));
			jTextField_Tnom.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Tnom.setText("300.15");
		}
		return jTextField_Tnom;
	}

	/**
	 * This method initializes jTextField_T	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_T() {
		if (jTextField_T == null) {
			jTextField_T = new JTextField();
			jTextField_T.setBounds(new Rectangle(60, 135, 90, 27));
			jTextField_T.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_T.setText("300.15");
		}
		return jTextField_T;
	}

	/**
	 * This method initializes jPanel152	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel152() {
		if (jPanel152 == null) {
			jLabel142 = new JLabel();
			jLabel142.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel142.setText("DL");
			jLabel142.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel132 = new JLabel();
			jLabel132.setBounds(new Rectangle(15, 15, 46, 16));
			jLabel132.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel132.setText("DW");
			jLabel132.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel112 = new JLabel();
			jLabel112.setBounds(new Rectangle(150, 45, 18, 16));
			jLabel112.setText("m");
			jLabel112.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel17 = new JLabel();
			jLabel17.setBounds(new Rectangle(150, 15, 18, 16));
			jLabel17.setText("m");
			jLabel17.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel152 = new JPanel();
			jPanel152.setLayout(null);
			jPanel152.setBounds(new Rectangle(30, 165, 195, 76));
			jPanel152.setBackground(SystemColor.info);
			jPanel152.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel152.add(getJTextField_DW(), null);
			jPanel152.add(getJTextField_DL(), null);
			jPanel152.add(jLabel17, null);
			jPanel152.add(jLabel112, null);
			jPanel152.add(jLabel132, null);
			jPanel152.add(jLabel142, null);
		}
		return jPanel152;
	}

	/**
	 * This method initializes jTextField_DW	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_DW() {
		if (jTextField_DW == null) {
			jTextField_DW = new JTextField();
			jTextField_DW.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_DW.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_DW.setText("2.5e-008");
		}
		return jTextField_DW;
	}

	/**
	 * This method initializes jTextField_DL	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_DL() {
		if (jTextField_DL == null) {
			jTextField_DL = new JTextField();
			jTextField_DL.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_DL.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_DL.setText("-7e-008");
		}
		return jTextField_DL;
	}

	/**
	 * This method initializes jPanel153	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel153() {
		if (jPanel153 == null) {
			jLabel152 = new JLabel();
			jLabel152.setBounds(new Rectangle(2, 75, 59, 16));
			jLabel152.setText("LAMBADA");
			jLabel152.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel143 = new JLabel();
			jLabel143.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel143.setText("UCRIT");
			jLabel143.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel133 = new JLabel();
			jLabel133.setBounds(new Rectangle(15, 15, 46, 16));
			jLabel133.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel133.setText("XJ");
			jLabel133.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel113 = new JLabel();
			jLabel113.setBounds(new Rectangle(150, 45, 29, 16));
			jLabel113.setText("V / m");
			jLabel113.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel18 = new JLabel();
			jLabel18.setBounds(new Rectangle(150, 15, 18, 16));
			jLabel18.setText("m");
			jLabel18.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel153 = new JPanel();
			jPanel153.setLayout(null);
			jPanel153.setBounds(new Rectangle(255, 195, 203, 106));
			jPanel153.setBackground(SystemColor.info);
			jPanel153.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel153.add(getJTextField_XJ(), null);
			jPanel153.add(getJTextField_UCRIT(), null);
			jPanel153.add(getJTextField_LAMBADA(), null);
			jPanel153.add(jLabel18, null);
			jPanel153.add(jLabel113, null);
			jPanel153.add(jLabel133, null);
			jPanel153.add(jLabel143, null);
			jPanel153.add(jLabel152, null);
		}
		return jPanel153;
	}

	/**
	 * This method initializes jTextField_XJ	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_XJ() {
		if (jTextField_XJ == null) {
			jTextField_XJ = new JTextField();
			jTextField_XJ.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_XJ.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_XJ.setText("1e-007");
		}
		return jTextField_XJ;
	}

	/**
	 * This method initializes jTextField_UCRIT	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_UCRIT() {
		if (jTextField_UCRIT == null) {
			jTextField_UCRIT = new JTextField();
			jTextField_UCRIT.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_UCRIT.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_UCRIT.setText("4.3e+006");
		}
		return jTextField_UCRIT;
	}

	/**
	 * This method initializes jTextField_LAMBADA	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_LAMBADA() {
		if (jTextField_LAMBADA == null) {
			jTextField_LAMBADA = new JTextField();
			jTextField_LAMBADA.setBounds(new Rectangle(60, 75, 90, 27));
			jTextField_LAMBADA.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_LAMBADA.setText("0.27");
		}
		return jTextField_LAMBADA;
	}

	/**
	 * This method initializes jPanel1521	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1521() {
		if (jPanel1521 == null) {
			jLabel1421 = new JLabel();
			jLabel1421.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel1421.setText("WETA");
			jLabel1421.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1321 = new JLabel();
			jLabel1321.setBounds(new Rectangle(15, 15, 46, 16));
			jLabel1321.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel1321.setText("LETA");
			jLabel1321.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel1521 = new JPanel();
			jPanel1521.setLayout(null);
			jPanel1521.setBounds(new Rectangle(480, 225, 211, 76));
			jPanel1521.setBackground(SystemColor.info);
			jPanel1521.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel1521.add(getJTextField_LETA(), null);
			jPanel1521.add(getJTextField_WETA(), null);
			jPanel1521.add(jLabel1321, null);
			jPanel1521.add(jLabel1421, null);
		}
		return jPanel1521;
	}

	/**
	 * This method initializes jTextField_LETA	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_LETA() {
		if (jTextField_LETA == null) {
			jTextField_LETA = new JTextField();
			jTextField_LETA.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_LETA.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_LETA.setText("0.51");
		}
		return jTextField_LETA;
	}

	/**
	 * This method initializes jTextField_WETA	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_WETA() {
		if (jTextField_WETA == null) {
			jTextField_WETA = new JTextField();
			jTextField_WETA.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_WETA.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_WETA.setText("0.01");
		}
		return jTextField_WETA;
	}

	/**
	 * This method initializes jPanel1512	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1512() {
		if (jPanel1512 == null) {
			jLabel12112 = new JLabel();
			jLabel12112.setBounds(new Rectangle(150, 104, 46, 16));
			jLabel12112.setText("F / M");
			jLabel12112.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel15112 = new JLabel();
			jLabel15112.setBounds(new Rectangle(15, 104, 40, 16));
			jLabel15112.setText("CGBO");
			jLabel15112.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1513 = new JLabel();
			jLabel1513.setBounds(new Rectangle(15, 75, 46, 16));
			jLabel1513.setText("CGDO");
			jLabel1513.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1412 = new JLabel();
			jLabel1412.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel1412.setText("CGSO");
			jLabel1412.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1312 = new JLabel();
			jLabel1312.setBounds(new Rectangle(15, 15, 46, 16));
			jLabel1312.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel1312.setText("COX");
			jLabel1312.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1212 = new JLabel();
			jLabel1212.setBounds(new Rectangle(150, 75, 39, 16));
			jLabel1212.setText("F / M");
			jLabel1212.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1111 = new JLabel();
			jLabel1111.setBounds(new Rectangle(150, 45, 46, 16));
			jLabel1111.setText("F / M");
			jLabel1111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel162 = new JLabel();
			jLabel162.setBounds(new Rectangle(150, 15, 48, 16));
			jLabel162.setText("F/m x m");
			jLabel162.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel1512 = new JPanel();
			jPanel1512.setLayout(null);
			jPanel1512.setBounds(new Rectangle(30, 255, 196, 138));
			jPanel1512.setBackground(SystemColor.info);
			jPanel1512.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel1512.add(getJTextField_COX(), null);
			jPanel1512.add(getJTextField_CGSO(), null);
			jPanel1512.add(getJTextField_CGDO(), null);
			jPanel1512.add(jLabel162, null);
			jPanel1512.add(jLabel1111, null);
			jPanel1512.add(jLabel1212, null);
			jPanel1512.add(jLabel1312, null);
			jPanel1512.add(jLabel1412, null);
			jPanel1512.add(jLabel1513, null);
			jPanel1512.add(getJTextField_CGBO(), null);
			jPanel1512.add(jLabel15112, null);
			jPanel1512.add(jLabel12112, null);
		}
		return jPanel1512;
	}

	/**
	 * This method initializes jTextField_COX	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_COX() {
		if (jTextField_COX == null) {
			jTextField_COX = new JTextField();
			jTextField_COX.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_COX.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_COX.setText("0.0034");
		}
		return jTextField_COX;
	}

	/**
	 * This method initializes jTextField_CGSO	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_CGSO() {
		if (jTextField_CGSO == null) {
			jTextField_CGSO = new JTextField();
			jTextField_CGSO.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_CGSO.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_CGSO.setText("1.38e-010");
		}
		return jTextField_CGSO;
	}

	/**
	 * This method initializes jTextField_CGDO	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_CGDO() {
		if (jTextField_CGDO == null) {
			jTextField_CGDO = new JTextField();
			jTextField_CGDO.setBounds(new Rectangle(60, 75, 90, 27));
			jTextField_CGDO.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_CGDO.setText("1.38e-010");
		}
		return jTextField_CGDO;
	}

	/**
	 * This method initializes jTextField_CGBO	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_CGBO() {
		if (jTextField_CGBO == null) {
			jTextField_CGBO = new JTextField();
			jTextField_CGBO.setBounds(new Rectangle(60, 105, 90, 27));
			jTextField_CGBO.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_CGBO.setText("3.45e-010");
		}
		return jTextField_CGBO;
	}

	/**
	 * This method initializes jPanel15211	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel15211() {
		if (jPanel15211 == null) {
			jLabel14211 = new JLabel();
			jLabel14211.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel14211.setText("Abeta");
			jLabel14211.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel13211 = new JLabel();
			jLabel13211.setBounds(new Rectangle(15, 15, 46, 16));
			jLabel13211.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel13211.setText("Avt");
			jLabel13211.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel11211 = new JLabel();
			jLabel11211.setBounds(new Rectangle(150, 45, 18, 16));
			jLabel11211.setText("um");
			jLabel11211.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1711 = new JLabel();
			jLabel1711.setBounds(new Rectangle(150, 15, 49, 16));
			jLabel1711.setText("mV*um");
			jLabel1711.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel15211 = new JPanel();
			jPanel15211.setLayout(null);
			jPanel15211.setBounds(new Rectangle(255, 315, 203, 76));
			jPanel15211.setBackground(SystemColor.info);
			jPanel15211.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel15211.add(getJTextField_Avt(), null);
			jPanel15211.add(getJTextField_Abeta(), null);
			jPanel15211.add(jLabel1711, null);
			jPanel15211.add(jLabel11211, null);
			jPanel15211.add(jLabel13211, null);
			jPanel15211.add(jLabel14211, null);
		}
		return jPanel15211;
	}

	/**
	 * This method initializes jTextField_Avt	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Avt() {
		if (jTextField_Avt == null) {
			jTextField_Avt = new JTextField();
			jTextField_Avt.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_Avt.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Avt.setText("12.3");
		}
		return jTextField_Avt;
	}

	/**
	 * This method initializes jTextField_Abeta	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Abeta() {
		if (jTextField_Abeta == null) {
			jTextField_Abeta = new JTextField();
			jTextField_Abeta.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_Abeta.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Abeta.setText("0.025");
		}
		return jTextField_Abeta;
	}

	/**
	 * This method initializes jPanel1513	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1513() {
		if (jPanel1513 == null) {
			jLabel12113 = new JLabel();
			jLabel12113.setBounds(new Rectangle(150, 104, 46, 16));
			jLabel12113.setText("V");
			jLabel12113.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel15113 = new JLabel();
			jLabel15113.setBounds(new Rectangle(15, 104, 40, 16));
			jLabel15113.setText("Vb");
			jLabel15113.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1514 = new JLabel();
			jLabel1514.setBounds(new Rectangle(15, 75, 46, 16));
			jLabel1514.setText("Vd");
			jLabel1514.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1413 = new JLabel();
			jLabel1413.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel1413.setText("Vs");
			jLabel1413.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1313 = new JLabel();
			jLabel1313.setBounds(new Rectangle(15, 15, 46, 16));
			jLabel1313.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel1313.setText("Vg");
			jLabel1313.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1213 = new JLabel();
			jLabel1213.setBounds(new Rectangle(150, 75, 18, 16));
			jLabel1213.setText("V");
			jLabel1213.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1112 = new JLabel();
			jLabel1112.setBounds(new Rectangle(150, 45, 46, 16));
			jLabel1112.setText("V");
			jLabel1112.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel163 = new JLabel();
			jLabel163.setBounds(new Rectangle(150, 15, 18, 16));
			jLabel163.setText("V");
			jLabel163.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel1513 = new JPanel();
			jPanel1513.setLayout(null);
			jPanel1513.setBounds(new Rectangle(27, 430, 211, 136));
			jPanel1513.setBackground(SystemColor.info);
			jPanel1513.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel1513.add(getJTextField_Vg(), null);
			jPanel1513.add(getJTextField_Vs(), null);
			jPanel1513.add(getJTextField_Vd(), null);
			jPanel1513.add(jLabel163, null);
			jPanel1513.add(jLabel1112, null);
			jPanel1513.add(jLabel1213, null);
			jPanel1513.add(jLabel1313, null);
			jPanel1513.add(jLabel1413, null);
			jPanel1513.add(jLabel1514, null);
			jPanel1513.add(getJTextField_Vb(), null);
			jPanel1513.add(jLabel15113, null);
			jPanel1513.add(jLabel12113, null);
		}
		return jPanel1513;
	}

	/**
	 * This method initializes jTextField_Vg	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Vg() {
		if (jTextField_Vg == null) {
			jTextField_Vg = new JTextField();
			jTextField_Vg.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_Vg.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Vg.setText("1");
		}
		return jTextField_Vg;
	}

	/**
	 * This method initializes jTextField_Vs	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Vs() {
		if (jTextField_Vs == null) {
			jTextField_Vs = new JTextField();
			jTextField_Vs.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_Vs.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Vs.setText("0");
		}
		return jTextField_Vs;
	}

	/**
	 * This method initializes jTextField_Vd	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Vd() {
		if (jTextField_Vd == null) {
			jTextField_Vd = new JTextField();
			jTextField_Vd.setBounds(new Rectangle(60, 75, 90, 27));
			jTextField_Vd.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Vd.setText("1");
		}
		return jTextField_Vd;
	}

	/**
	 * This method initializes jTextField_Vb	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Vb() {
		if (jTextField_Vb == null) {
			jTextField_Vb = new JTextField();
			jTextField_Vb.setBounds(new Rectangle(60, 105, 90, 27));
			jTextField_Vb.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Vb.setText("0");
		}
		return jTextField_Vb;
	}

	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private PictureBox getPictureBox1() {
		if (PictureBox1 == null) {
			PictureBox1 = new PictureBox(getClass().getResource("/images/nmos/design1.png"));
			PictureBox1.setLayout(new GridBagLayout());
			PictureBox1.setBounds(new Rectangle(293, 438, 147, 125));
		}
		return PictureBox1;
	}

	/**
	 * This method initializes jPanel15311	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel15311() {
		if (jPanel15311 == null) {
			jLabel14311 = new JLabel();
			jLabel14311.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel14311.setText("L");
			jLabel14311.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel13311 = new JLabel();
			jLabel13311.setBounds(new Rectangle(15, 15, 46, 16));
			jLabel13311.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel13311.setText("W");
			jLabel13311.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel11311 = new JLabel();
			jLabel11311.setBounds(new Rectangle(150, 45, 18, 16));
			jLabel11311.setText("um");
			jLabel11311.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1811 = new JLabel();
			jLabel1811.setBounds(new Rectangle(150, 15, 18, 16));
			jLabel1811.setText("um");
			jLabel1811.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel15311 = new JPanel();
			jPanel15311.setLayout(null);
			jPanel15311.setBounds(new Rectangle(479, 476, 188, 80));
			jPanel15311.setBackground(SystemColor.info);
			jPanel15311.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel15311.add(getJTextField_W(), null);
			jPanel15311.add(getJTextField_L(), null);
			jPanel15311.add(jLabel1811, null);
			jPanel15311.add(jLabel11311, null);
			jPanel15311.add(jLabel13311, null);
			jPanel15311.add(jLabel14311, null);
		}
		return jPanel15311;
	}

	/**
	 * This method initializes jTextField_W	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_W() {
		if (jTextField_W == null) {
			jTextField_W = new JTextField();
			jTextField_W.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_W.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_W.setText("50");
		}
		return jTextField_W;
	}

	/**
	 * This method initializes jTextField_L	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_L() {
		if (jTextField_L == null) {
			jTextField_L = new JTextField();
			jTextField_L.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_L.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_L.setText("10");
		}
		return jTextField_L;
	}

	/**
	 * This method initializes jPanel154	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel154() {
		if (jPanel154 == null) {
			jLabel153 = new JLabel();
			jLabel153.setBounds(new Rectangle(15, 75, 46, 16));
			jLabel153.setText("f");
			jLabel153.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel144 = new JLabel();
			jLabel144.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel144.setText("AF");
			jLabel144.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel134 = new JLabel();
			jLabel134.setBounds(new Rectangle(15, 15, 46, 16));
			jLabel134.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel134.setText("KF");
			jLabel134.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel122 = new JLabel();
			jLabel122.setBounds(new Rectangle(150, 75, 18, 16));
			jLabel122.setText("Hz");
			jLabel122.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel154 = new JPanel();
			jPanel154.setLayout(null);
			jPanel154.setBounds(new Rectangle(480, 313, 211, 105));
			jPanel154.setBackground(SystemColor.info);
			jPanel154.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel154.add(getJTextField_KF(), null);
			jPanel154.add(getJTextField_AF(), null);
			jPanel154.add(getJTextField_f(), null);
			jPanel154.add(jLabel122, null);
			jPanel154.add(jLabel134, null);
			jPanel154.add(jLabel144, null);
			jPanel154.add(jLabel153, null);
		}
		return jPanel154;
	}

	/**
	 * This method initializes jTextField_KF	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_KF() {
		if (jTextField_KF == null) {
			jTextField_KF = new JTextField();
			jTextField_KF.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_KF.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_KF.setText("1.6e-024");
		}
		return jTextField_KF;
	}

	/**
	 * This method initializes jTextField_AF	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_AF() {
		if (jTextField_AF == null) {
			jTextField_AF = new JTextField();
			jTextField_AF.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_AF.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_AF.setText("1");
		}
		return jTextField_AF;
	}

	/**
	 * This method initializes jTextField_f	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_f() {
		if (jTextField_f == null) {
			jTextField_f = new JTextField();
			jTextField_f.setBounds(new Rectangle(60, 75, 90, 27));
			jTextField_f.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_f.setText("1");
		}
		return jTextField_f;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
