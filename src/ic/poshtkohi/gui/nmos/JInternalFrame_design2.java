/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.gui.nmos;
import ic.poshtkohi.common.*;

import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JDesktopPane;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.KeyEvent;
import ic.poshtkohi.gui.PictureBox;
import ic.poshtkohi.gui.Constants;
import java.awt.GridBagLayout;
import javax.swing.JSlider;
import java.awt.GridBagConstraints;
import ic.poshtkohi.gui.FloatJSlider;
import javax.swing.JTabbedPane;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;

public class JInternalFrame_design2 extends JInternalFrame {

	private JPanel jContentPane = null;
	private JDesktopPane jDesktopPane = null;
	private JPanel jPanel15 = null;
	private PictureBox PictureBox1 = null;
	private FloatJSlider FloatJSlider_Vg = null;
	private JPanel jPanel1511 = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	//-------------------------------------------------
	public static EkvMosParameters ekv;
	//-----------------JTextField----------------------
	public static JTextField jTextField_Vg = null;
	public static JTextField jTextField_Vth = null;
	public static JTextField jTextField_Vd = null;
	public static JTextField jTextField_Vb = null;
	public static JTextField jTextField_Vs = null;
	public static JTextField jTextField_Vds_sat = null;
	public static JTextField jTextField_W = null;
	public static JTextField jTextField_L = null;
	public static JTextField jTextField_WdivL = null;
	public static JTextField jTextField_Id = null;
	public static JTextField jTextField_Idsat = null;
	public static JTextField jTextField_v_thermal = null;
	public static JTextField jTextField_v_flicker = null;
	public static JTextField jTextField_v_eq = null;
	public static JTextField jTextField_corner_freq = null;
	public static JTextField jTextField_gmDIVgds = null;
	public static JTextField jTextField_rds = null;
	public static JTextField jTextField_gm = null;
	public static JTextField jTextField_gds = null;
	public static JTextField jTextField_gmbs = null;
	public static JTextField jTextField_if = null;
	public static JTextField jTextField_Cgs = null;
	public static JTextField jTextField_Cgd = null;
	public static JTextField jTextField_Cgb = null;
	public static JTextField jTextField_Csb = null;
	public static JTextField jTextField_Cdb = null;
	public static JTextField jTextField_Cgsov = null;
	public static JTextField jTextField_Cgdov = null;
	public static JTextField jTextField_Cgbov = null;
	public static JTextField jTextField_ft = null;
	public static JTextField jTextField_Vp = null;
	public static JTextField jTextField_Vg2 = null;
	//-----------------FloatJSlider--------------------
	public static FloatJSlider FloatJSlider_Vd = null;
	public static FloatJSlider FloatJSlider_W = null;
	public static FloatJSlider FloatJSlider_Idsat = null;
	public static FloatJSlider FloatJSlider_L = null;
	public static FloatJSlider FloatJSlider_WdivL = null;
	public static FloatJSlider FloatJSlider_Id = null;
	public static FloatJSlider FloatJSlider_gm = null;
	public static FloatJSlider FloatJSlider_gds = null;
	//-----------------------------------------------
	private JPanel jPanel15111 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel21 = null;
	private JLabel jLabel31 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JLabel jLabel141 = null;
	private JLabel jLabel121 = null;
	private JLabel jLabel1411 = null;
	private JLabel jLabel14111 = null;
	private JLabel jLabel141111 = null;
	private JLabel jLabel141112 = null;
	private JLabel jLabel141113 = null;
	private JLabel jLabel141114 = null;
	private JLabel jLabel1411111 = null;
	private JPanel jPanel1512 = null;
	private JPanel jPanel15121 = null;
	private JTabbedPane jTabbedPane = null;
	private JDesktopPane jDesktopPane1 = null;
	private JDesktopPane jDesktopPane2 = null;
	private JPanel jPanel151111 = null;
	private JLabel jLabel41 = null;
	private JLabel jLabel311 = null;
	private JLabel jLabel15 = null;
	private JPanel jPanel1511111 = null;
	private JLabel jLabel411 = null;
	private JLabel jLabel3111 = null;
	private JLabel jLabel151 = null;
	private JComboBox jComboBox_W = null;
	private JComboBox jComboBox_L = null;
	private JPanel jPanel15111111 = null;
	private JLabel jLabel4111 = null;
	private JLabel jLabel31111 = null;
	private JLabel jLabel1511 = null;
	private JComboBox jComboBox_WdivL = null;
	private JLabel jLabel15111 = null;
	private JLabel jLabel15112 = null;
	private JLabel jLabel15113 = null;
	private JLabel jLabel_W = null;
	private JLabel jLabel_L = null;
	private JTabbedPane jTabbedPane1 = null;
	private JDesktopPane jDesktopPane11 = null;
	private PictureBox PictureBox_saturation_region = null;
	private PictureBox PictureBox_linear_region = null;
	private JPanel jPanel1511112 = null;
	private JLabel jLabel412 = null;
	private JLabel jLabel3112 = null;
	private JLabel jLabel152 = null;
	private JLabel jLabel151111 = null;
	private JPanel jPanel15111121 = null;
	private JLabel jLabel4121 = null;
	private JLabel jLabel31121 = null;
	private JLabel jLabel1521 = null;
	private JLabel jLabel1511111 = null;
	private JComboBox jComboBox_Idsat = null;
	private JPanel jPanel151 = null;
	private JLabel jLabel16 = null;
	private JLabel jLabel111 = null;
	private JLabel jLabel1211 = null;
	private JLabel jLabel131 = null;
	private JLabel jLabel1412 = null;
	private JLabel jLabel1512 = null;
	private JLabel jLabel15114 = null;
	private JLabel jLabel12111 = null;
	private JPanel jPanel15211 = null;
	private JLabel jLabel1711 = null;
	private JLabel jLabel11211 = null;
	private JLabel jLabel13211 = null;
	private JLabel jLabel14211 = null;
	private JPanel jPanel15112 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel32 = null;
	private JLabel jLabel132111 = null;
	private JLabel jLabel17111 = null;
	private JPanel jPanel151121 = null;
	private JLabel jLabel51 = null;
	private JLabel jLabel321 = null;
	private JLabel jLabel1321111 = null;
	private JLabel jLabel171111 = null;
	private JLabel jLabel1321112 = null;
	private JLabel jLabel171112 = null;
	private JPanel jPanel1511211 = null;
	private JLabel jLabel13211111 = null;
	private PictureBox PictureBox_strong_inversion = null;
	private PictureBox PictureBox_weak_inversion = null;
	private PictureBox PictureBox_moderate_inversion = null;
	private JPanel jPanel15113 = null;
	private JLabel jLabel1311 = null;
	private JLabel jLabel14112 = null;
	private JLabel jLabel15121 = null;
	private JLabel jLabel151112 = null;
	private JLabel jLabel121111 = null;
	private JLabel jLabel1511112 = null;
	private JPanel jPanel151131 = null;
	private JLabel jLabel13111 = null;
	private JLabel jLabel141121 = null;
	private JLabel jLabel151211 = null;
	private JLabel jLabel12111111 = null;
	private JLabel jLabel15111121 = null;
	private JLabel jLabel1211111 = null;
	private JLabel jLabel1211113 = null;
	private JLabel jLabel1211114 = null;
	private JLabel jLabel1211115 = null;
	private JLabel jLabel12111131 = null;
	private JLabel jLabel12111132 = null;
	private JLabel jLabel12111133 = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel132 = null;
	//--------------------------------------------------------------------------------------------------
	private void InitialiseJComboBoxes()
	{
		String[] jComboBox_W_lists = new String[] {"to Vg, Idsat const", "W/L constant", "W/L variable"};
		String[] jComboBox_L_lists = new String[] {"to Vg, Idsat const", "W/L constant", "W/L variable"};
		String[] jComboBox_WdivL_lists = new String[] {"L constant", "to Vg, L const", "to Vg, W const", "W constant"};
		String[] jComboBox_Idsat_lists = new String[] {"to L", "to Vg", "to Vg, Vd same", "to W", "to W/L, L const", "to W/L, W const"};
		
		AddItmesToJComboBox(jComboBox_L, jComboBox_L_lists, 0);
		AddItmesToJComboBox(jComboBox_W, jComboBox_W_lists, 0);
		AddItmesToJComboBox(jComboBox_WdivL, jComboBox_WdivL_lists, 1);
		AddItmesToJComboBox(jComboBox_Idsat, jComboBox_Idsat_lists, 1);
	}
	private void AddItmesToJComboBox(JComboBox _JComboBox, String[] _lists, int _selectedIndex)
	{
		if(_lists != null)
		{
			if(_lists.length > 0)
			{
				for(int i = 0 ; i < _lists.length; i++)
					_JComboBox.addItem(_lists[i]);
				if(_selectedIndex <= _lists.length - 1)
					_JComboBox.setSelectedIndex(_selectedIndex);
				else
					_JComboBox.setSelectedIndex(0);
			}
		}
	}
	//--------------------------------------------------------------------------------------------------

	
	/**
	 * This is the xxx default constructor
	 */
	public JInternalFrame_design2() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(934, 604);
		this.setTitle("Design (2/2) <nmos>");
		this.setFrameIcon(new ImageIcon(getClass().getResource("/images/icons/paste_24.png")));
		this.setContentPane(getJContentPane());
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
			public void internalFrameOpened(javax.swing.event.InternalFrameEvent e) {
				System.out.println("internalFrameOpened()"); // TODO Auto-generated Event stub internalFrameOpened()
//				jTextField.setText(Float.toString(XYZ.getFloatValue()));
			}
		});
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
			public void internalFrameOpened(javax.swing.event.InternalFrameEvent e) {
				System.out.println("internalFrameOpened()"); // TODO Auto-generated Event stub internalFrameOpened()
				InitialiseJComboBoxes();
			}
		});
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
			jDesktopPane.add(getJPanel15(), null);
			jDesktopPane.add(getJPanel1512(), null);
			jDesktopPane.add(getJPanel15121(), null);
			jDesktopPane.add(getJTabbedPane(), null);
			jDesktopPane.add(getJTabbedPane1(), null);
			
		}
		return jDesktopPane;
	}

	/**
	 * This method initializes jPanel15	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel15() {
		if (jPanel15 == null) {
			jLabel132 = new JLabel();
			jLabel132.setBounds(new Rectangle(210, 173, 28, 16));
			jLabel132.setText("Vg2");
			jLabel132.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1411111 = new JLabel();
			jLabel1411111.setBounds(new Rectangle(294, 174, 20, 16));
			jLabel1411111.setText("Vs");
			jLabel1411111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel141114 = new JLabel();
			jLabel141114.setBounds(new Rectangle(375, 78, 49, 16));
			jLabel141114.setText("Vds_sat");
			jLabel141114.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel141113 = new JLabel();
			jLabel141113.setBounds(new Rectangle(331, 100, 21, 15));
			jLabel141113.setText("Vb");
			jLabel141113.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel141112 = new JLabel();
			jLabel141112.setBounds(new Rectangle(499, 75, 10, 16));
			jLabel141112.setText("V");
			jLabel141112.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel141111 = new JLabel();
			jLabel141111.setBounds(new Rectangle(424, 99, 10, 16));
			jLabel141111.setText("V");
			jLabel141111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel14111 = new JLabel();
			jLabel14111.setBounds(new Rectangle(384, 173, 10, 16));
			jLabel14111.setText("V");
			jLabel14111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1411 = new JLabel();
			jLabel1411.setBounds(new Rectangle(328, 18, 10, 16));
			jLabel1411.setText("V");
			jLabel1411.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel121 = new JLabel();
			jLabel121.setBounds(new Rectangle(214, 17, 17, 16));
			jLabel121.setText("Vd");
			jLabel121.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel141 = new JLabel();
			jLabel141.setBounds(new Rectangle(161, 91, 10, 16));
			jLabel141.setText("V");
			jLabel141.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel14 = new JLabel();
			jLabel14.setBounds(new Rectangle(170, 150, 18, 16));
			jLabel14.setText("V");
			jLabel14.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel13 = new JLabel();
			jLabel13.setBounds(new Rectangle(84, 127, 28, 16));
			jLabel13.setText("Vg1");
			jLabel13.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel12 = new JLabel();
			jLabel12.setBounds(new Rectangle(149, 42, 18, 16));
			jLabel12.setText("Vth");
			jLabel12.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel15 = new JPanel();
			jPanel15.setLayout(null);
			jPanel15.setBounds(new Rectangle(12, 9, 525, 195));
			jPanel15.setBackground(SystemColor.info);
			jPanel15.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel15.add(getPictureBox1(), null);
			jPanel15.add(getJPanel1511(), null);
			jPanel15.add(getJTextField_Vg(), null);
			jPanel15.add(getJTextField_Vth(), null);
			jPanel15.add(getJPanel15111(), null);
			jPanel15.add(jLabel12, null);
			jPanel15.add(jLabel13, null);
			jPanel15.add(jLabel14, null);
			jPanel15.add(jLabel141, null);
			jPanel15.add(getJTextField_Vd(), null);
			jPanel15.add(jLabel121, null);
			jPanel15.add(jLabel1411, null);
			jPanel15.add(getJTextField_Vb(), null);
			jPanel15.add(getJTextField_Vs(), null);
			jPanel15.add(getJTextField_Vds_sat(), null);
			jPanel15.add(jLabel14111, null);
			jPanel15.add(jLabel141111, null);
			jPanel15.add(jLabel141112, null);
			jPanel15.add(jLabel141113, null);
			jPanel15.add(jLabel141114, null);
			jPanel15.add(jLabel1411111, null);
			jPanel15.add(getJTextField_Vg2(), null);
			jPanel15.add(jLabel132, null);
		}
		return jPanel15;
	}

	/**
	 * This method initializes PictureBox1	
	 * 	
	 * @return ic.poshtkohi.gui.PictureBox	
	 */
	private PictureBox getPictureBox1() {
		if (PictureBox1 == null) {
			PictureBox1 = new PictureBox(getClass().getResource("/images/nmos/design1.png"));
			PictureBox1.setLayout(new GridBagLayout());
			PictureBox1.setBounds(new Rectangle(181, 47, 148, 123));
		}
		return PictureBox1;
	}

	/**
	 * This method initializes FloatJSlider_Vg	
	 * 	
	 * @return ic.poshtkohi.gui.FloatJSlider	
	 */
	private FloatJSlider getFloatJSlider_Vg() {
		if (FloatJSlider_Vg == null) {
			FloatJSlider_Vg = new FloatJSlider(0, 3, 1);
			FloatJSlider_Vg.setFloatValue(1.0F);
			FloatJSlider_Vg.setBackground(SystemColor.info);
			FloatJSlider_Vg.setMajorTickSpacing(10000);
			FloatJSlider_Vg.setSnapToTicks(false);
			FloatJSlider_Vg.setToolTipText("");
			FloatJSlider_Vg.setExtent(0);
			FloatJSlider_Vg.setPaintLabels(false);
			FloatJSlider_Vg.setPaintTicks(true);
			FloatJSlider_Vg.setBounds(new Rectangle(7, 6, 34, 159));
			FloatJSlider_Vg.setOrientation(JSlider.VERTICAL);
			FloatJSlider_Vg.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					System.out.println("stateChanged()"); // TODO Auto-generated Event stub stateChanged()
					jTextField_Vg.setText(Float.toString(FloatJSlider_Vg.getFloatValue()));
				}
			});
		}
		return FloatJSlider_Vg;
	}

	/**
	 * This method initializes jPanel1511	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1511() {
		if (jPanel1511 == null) {
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(44, 8, 10, 16));
			jLabel3.setText("3");
			jLabel3.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(44, 53, 10, 16));
			jLabel2.setText("2");
			jLabel2.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(44, 101, 10, 16));
			jLabel1.setText("1");
			jLabel1.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(44, 150, 12, 16));
			jLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel.setText("0");
			jPanel1511 = new JPanel();
			jPanel1511.setLayout(null);
			jPanel1511.setBackground(SystemColor.info);
			jPanel1511.setBounds(new Rectangle(14, 20, 68, 170));
			jPanel1511.add(getFloatJSlider_Vg(), null);
			jPanel1511.add(jLabel, null);
			jPanel1511.add(jLabel1, null);
			jPanel1511.add(jLabel2, null);
			jPanel1511.add(jLabel3, null);
		}
		return jPanel1511;
	}

	/**
	 * This method initializes jTextField_Vg	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Vg() {
		if (jTextField_Vg == null) {
			jTextField_Vg = new JTextField();
			jTextField_Vg.setBounds(new Rectangle(84, 148, 76, 20));
			jTextField_Vg.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Vg.setText("1");
		}
		return jTextField_Vg;
	}

	/**
	 * This method initializes jTextField_Vth	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Vth() {
		if (jTextField_Vth == null) {
			jTextField_Vth = new JTextField();
			jTextField_Vth.setBounds(new Rectangle(94, 64, 76, 20));
			jTextField_Vth.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Vth.setEditable(false);
			jTextField_Vth.setText("0.611217");
		}
		return jTextField_Vth;
	}

	/**
	 * This method initializes jPanel15111	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel15111() {
		if (jPanel15111 == null) {
			jLabel31 = new JLabel();
			jLabel31.setBounds(new Rectangle(165, 33, 10, 16));
			jLabel31.setText("3");
			jLabel31.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel21 = new JLabel();
			jLabel21.setBounds(new Rectangle(117, 33, 10, 16));
			jLabel21.setText("2");
			jLabel21.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel11 = new JLabel();
			jLabel11.setBounds(new Rectangle(61, 33, 10, 16));
			jLabel11.setText("1");
			jLabel11.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(5, 33, 12, 16));
			jLabel4.setText("0");
			jLabel4.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel15111 = new JPanel();
			jPanel15111.setLayout(null);
			jPanel15111.setBackground(SystemColor.info);
			jPanel15111.setBounds(new Rectangle(341, 18, 181, 53));
			jPanel15111.add(getFloatJSlider_Vd(), null);
			jPanel15111.add(jLabel4, null);
			jPanel15111.add(jLabel11, null);
			jPanel15111.add(jLabel21, null);
			jPanel15111.add(jLabel31, null);
		}
		return jPanel15111;
	}

	/**
	 * This method initializes FloatJSlider_Vd	
	 * 	
	 * @return ic.poshtkohi.gui.FloatJSlider	
	 */
	private FloatJSlider getFloatJSlider_Vd() {
		if (FloatJSlider_Vd == null) {
			FloatJSlider_Vd = new FloatJSlider(0, 3, 1);
			FloatJSlider_Vd.setBounds(new Rectangle(1, 0, 177, 27));
			FloatJSlider_Vd.setToolTipText("");
			FloatJSlider_Vd.setExtent(0);
			FloatJSlider_Vd.setMajorTickSpacing(10000);
			FloatJSlider_Vd.setOrientation(JSlider.HORIZONTAL);
			FloatJSlider_Vd.setPaintLabels(false);
			FloatJSlider_Vd.setPaintTicks(true);
			FloatJSlider_Vd.setSnapToTicks(false);
			FloatJSlider_Vd.setFloatValue(1.0F);
			FloatJSlider_Vd.setBackground(SystemColor.info);
			FloatJSlider_Vd.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					System.out.println("stateChanged()"); // TODO Auto-generated Event stub stateChanged()
					jTextField_Vd.setText(Float.toString(FloatJSlider_Vd.getFloatValue()));
				}
			});
		}
		return FloatJSlider_Vd;
	}

	/**
	 * This method initializes jTextField_Vd	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Vd() {
		if (jTextField_Vd == null) {
			jTextField_Vd = new JTextField();
			jTextField_Vd.setBounds(new Rectangle(238, 17, 84, 20));
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
			jTextField_Vb.setBounds(new Rectangle(350, 98, 66, 20));
			jTextField_Vb.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Vb.setText("0");
		}
		return jTextField_Vb;
	}

	/**
	 * This method initializes jTextField_Vs	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Vs() {
		if (jTextField_Vs == null) {
			jTextField_Vs = new JTextField();
			jTextField_Vs.setBounds(new Rectangle(319, 171, 59, 20));
			jTextField_Vs.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Vs.setText("0");
		}
		return jTextField_Vs;
	}

	/**
	 * This method initializes jTextField_Vds_sat	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Vds_sat() {
		if (jTextField_Vds_sat == null) {
			jTextField_Vds_sat = new JTextField();
			jTextField_Vds_sat.setBounds(new Rectangle(428, 75, 67, 20));
			jTextField_Vds_sat.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Vds_sat.setEditable(false);
			jTextField_Vds_sat.setText("0377884");
		}
		return jTextField_Vds_sat;
	}

	/**
	 * This method initializes jPanel1512	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1512() {
		if (jPanel1512 == null) {
			jPanel1512 = new JPanel();
			jPanel1512.setLayout(null);
			jPanel1512.setBounds(new Rectangle(11, 207, 525, 211));
			jPanel1512.setBackground(SystemColor.info);
			jPanel1512.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel1512.add(getJPanel151111(), null);
			jPanel1512.add(getJPanel1511111(), null);
			jPanel1512.add(getJPanel15111111(), null);
			
		}
		return jPanel1512;
	}

	/**
	 * This method initializes jPanel15121	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel15121() {
		if (jPanel15121 == null) {
			jPanel15121 = new JPanel();
			jPanel15121.setLayout(null);
			jPanel15121.setBounds(new Rectangle(11, 421, 523, 143));
			jPanel15121.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel15121.setBackground(SystemColor.info);
			jPanel15121.add(getPictureBox_saturation_region(), null);
			jPanel15121.add(getPictureBox_linear_region(), null);
			jPanel15121.add(getJPanel1511112(), null);
			jPanel15121.add(getJPanel15111121(), null);
			jPanel15121.add(getJComboBox_Idsat(), null);
		}
		return jPanel15121;
	}

	/**
	 * This method initializes jTabbedPane	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.setBounds(new Rectangle(541, 250, 370, 311));
			jTabbedPane.setBackground(SystemColor.info);
			jTabbedPane.addTab("small signal params", null, getJDesktopPane1(), null);
			jTabbedPane.addTab("speed", null, getJDesktopPane2(), null);
		}
		return jTabbedPane;
	}

	/**
	 * This method initializes jDesktopPane1	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getJDesktopPane1() {
		if (jDesktopPane1 == null) {
			jLabel171112 = new JLabel();
			jLabel171112.setBounds(new Rectangle(127, 234, 15, 16));
			jLabel171112.setText("uS");
			jLabel171112.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1321112 = new JLabel();
			jLabel1321112.setBounds(new Rectangle(35, 233, 37, 16));
			jLabel1321112.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel1321112.setText("gmbs");
			jLabel1321112.setFont(new Font("Dialog", Font.PLAIN, 12));
			jDesktopPane1 = new JDesktopPane();
			jDesktopPane1.setBackground(SystemColor.info);
			jDesktopPane1.add(getJPanel15211(), null);
			jDesktopPane1.add(getJPanel15112(), null);
			jDesktopPane1.add(getJPanel151121(), null);
			jDesktopPane1.add(getJTextField_gmbs(), null);
			jDesktopPane1.add(jLabel1321112, null);
			jDesktopPane1.add(jLabel171112, null);
			jDesktopPane1.add(getJPanel1511211(), null);
		}
		return jDesktopPane1;
	}

	/**
	 * This method initializes jDesktopPane2	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getJDesktopPane2() {
		if (jDesktopPane2 == null) {
			jDesktopPane2 = new JDesktopPane();
			jDesktopPane2.setBackground(SystemColor.info);
			jDesktopPane2.add(getJPanel15113(), null);
			jDesktopPane2.add(getJPanel151131(), null);
		}
		return jDesktopPane2;
	}

	/**
	 * This method initializes jTextField_W	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_W() {
		if (jTextField_W == null) {
			jTextField_W = new JTextField();
			jTextField_W.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_W.setBounds(new Rectangle(397, 9, 67, 20));
			jTextField_W.setText("50");
		}
		return jTextField_W;
	}

	/**
	 * This method initializes jPanel151111	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel151111() {
		if (jPanel151111 == null) {
			jLabel_W = new JLabel();
			jLabel_W.setBounds(new Rectangle(489, 1, 9, 34));
			jLabel_W.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel_W.setFont(new Font("Dialog", Font.BOLD, 30));
			jLabel_W.setForeground(Color.red);
			jLabel_W.setText("!");
			jLabel15111 = new JLabel();
			jLabel15111.setBounds(new Rectangle(142, 20, 18, 16));
			jLabel15111.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel15111.setText("W");
			jLabel15111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel15 = new JLabel();
			jLabel15.setBounds(new Rectangle(463, 10, 18, 16));
			jLabel15.setText("um");
			jLabel15.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel311 = new JLabel();
			jLabel311.setBounds(new Rectangle(367, 42, 28, 16));
			jLabel311.setText("1000");
			jLabel311.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel41 = new JLabel();
			jLabel41.setBounds(new Rectangle(169, 44, 24, 16));
			jLabel41.setText("0.5");
			jLabel41.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel151111 = new JPanel();
			jPanel151111.setLayout(null);
			jPanel151111.setBounds(new Rectangle(4, 4, 514, 66));
			jPanel151111.setBackground(SystemColor.info);
			jPanel151111.setBorder(BorderFactory.createLineBorder(SystemColor.controlShadow, 1));
			jPanel151111.add(getFloatJSlider_W(), null);
			jPanel151111.add(jLabel41, null);
			jPanel151111.add(jLabel311, null);
			jPanel151111.add(getJTextField_W(), null);
			jPanel151111.add(jLabel15, null);
			jPanel151111.add(getJComboBox_W(), null);
			jPanel151111.add(jLabel15111, null);
			jPanel151111.add(jLabel_W, null);
		}
		return jPanel151111;
	}

	/**
	 * This method initializes FloatJSlider_W	
	 * 	
	 * @return ic.poshtkohi.gui.FloatJSlider	
	 */
	private FloatJSlider getFloatJSlider_W() {
		if (FloatJSlider_W == null) {
			FloatJSlider_W = new FloatJSlider(0.5f, 1000f, 1);
			//FloatJSlider_Vd1.setFloatValue(0.5f);
			FloatJSlider_W.setBounds(new Rectangle(165, 11, 227, 27));
			FloatJSlider_W.setToolTipText("");
			FloatJSlider_W.setExtent(0);
			FloatJSlider_W.setMajorTickSpacing(1000000);
			FloatJSlider_W.setOrientation(JSlider.HORIZONTAL);
			FloatJSlider_W.setPaintLabels(false);
			FloatJSlider_W.setPaintTicks(true);
			FloatJSlider_W.setSnapToTicks(false);
			FloatJSlider_W.setFloatValue(50.0F);
			FloatJSlider_W.setBackground(SystemColor.info);
			FloatJSlider_W.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					System.out.println("stateChanged()"); // TODO Auto-generated Event stub stateChanged()
					JInternalFrame_design2_events.W_variaition(true);
				}
			});
		}
		return FloatJSlider_W;
	}

	/**
	 * This method initializes jPanel1511111	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1511111() {
		if (jPanel1511111 == null) {
			jLabel_L = new JLabel();
			jLabel_L.setBounds(new Rectangle(489, 2, 10, 39));
			jLabel_L.setForeground(Color.red);
			jLabel_L.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel_L.setText("!");
			jLabel_L.setFont(new Font("Dialog", Font.BOLD, 30));
			jLabel15112 = new JLabel();
			jLabel15112.setBounds(new Rectangle(141, 18, 18, 16));
			jLabel15112.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel15112.setText("L");
			jLabel15112.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel151 = new JLabel();
			jLabel151.setBounds(new Rectangle(466, 13, 18, 16));
			jLabel151.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel151.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel151.setText("um");
			jLabel3111 = new JLabel();
			jLabel3111.setBounds(new Rectangle(367, 42, 28, 16));
			jLabel3111.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel3111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel3111.setText("50");
			jLabel411 = new JLabel();
			jLabel411.setBounds(new Rectangle(169, 44, 24, 16));
			jLabel411.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel411.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel411.setText("0.5");
			jPanel1511111 = new JPanel();
			jPanel1511111.setLayout(null);
			jPanel1511111.setBounds(new Rectangle(4, 73, 514, 66));
			jPanel1511111.setBackground(SystemColor.info);
			jPanel1511111.setBorder(BorderFactory.createLineBorder(SystemColor.controlShadow, 1));
			jPanel1511111.add(getFloatJSlider_L(), null);
			jPanel1511111.add(jLabel411, null);
			jPanel1511111.add(jLabel3111, null);
			jPanel1511111.add(getJTextField_L(), null);
			jPanel1511111.add(jLabel151, null);
			jPanel1511111.add(getJComboBox_L(), null);
			jPanel1511111.add(jLabel15112, null);
			jPanel1511111.add(jLabel_L, null);
		}
		return jPanel1511111;
	}
	
	private JComboBox getJComboBox_L() {
		if (jComboBox_L == null) {
			//String[] jComboBox_W_lists = new String[] {"to Vg, Idsat const", "W/L constant", "W/L variable"}; 
			jComboBox_L = new JComboBox();
			jComboBox_L.setBounds(new Rectangle(5, 16, 132, 25));
			
		}
		return jComboBox_L;
	}

	/**
	 * This method initializes FloatJSlider_L	
	 * 	
	 * @return ic.poshtkohi.gui.FloatJSlider	
	 */
	private FloatJSlider getFloatJSlider_L() {
		if (FloatJSlider_L == null) {
			FloatJSlider_L = new FloatJSlider(0.5f, 50f, 1);
			FloatJSlider_L.setBounds(new Rectangle(165, 11, 227, 27));
			FloatJSlider_L.setToolTipText("");
			FloatJSlider_L.setExtent(0);
			FloatJSlider_L.setMajorTickSpacing(1000000);
			FloatJSlider_L.setOrientation(JSlider.HORIZONTAL);
			FloatJSlider_L.setPaintLabels(false);
			FloatJSlider_L.setPaintTicks(true);
			FloatJSlider_L.setSnapToTicks(false);
			FloatJSlider_L.setFloatValue(10.0F);
			FloatJSlider_L.setMinimum(1);
			FloatJSlider_L.setFloatMinimum(0.5F);
			FloatJSlider_L.setBackground(SystemColor.info);
			FloatJSlider_L.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					System.out.println("stateChanged()"); // TODO Auto-generated Event stub stateChanged()
					JInternalFrame_design2_events.L_variaition(true);
				}
			});
		}
		return FloatJSlider_L;
	}

	/**
	 * This method initializes jTextField_L	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_L() {
		if (jTextField_L == null) {
			jTextField_L = new JTextField();
			jTextField_L.setBounds(new Rectangle(399, 10, 67, 20));
			jTextField_L.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_L.setText("10");
		}
		return jTextField_L;
	}

	/**
	 * This method initializes jComboBox_W	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox_W() {
		if (jComboBox_W == null) {
			
			jComboBox_W = new JComboBox();
			jComboBox_W.setBounds(new Rectangle(5, 18, 132, 25));
			
		}
		return jComboBox_W;
	}

	/**
	 * This method initializes jPanel15111111	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel15111111() {
		if (jPanel15111111 == null) {
			jLabel15113 = new JLabel();
			jLabel15113.setBounds(new Rectangle(140, 15, 29, 16));
			jLabel15113.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel15113.setText("W/L");
			jLabel15113.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1511 = new JLabel();
			jLabel1511.setBounds(new Rectangle(468, 12, 18, 16));
			jLabel1511.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel1511.setText("um");
			jLabel1511.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel31111 = new JLabel();
			jLabel31111.setBounds(new Rectangle(367, 42, 28, 16));
			jLabel31111.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel31111.setText("1000");
			jLabel31111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel4111 = new JLabel();
			jLabel4111.setBounds(new Rectangle(169, 44, 24, 16));
			jLabel4111.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel4111.setText("0.5");
			jLabel4111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel15111111 = new JPanel();
			jPanel15111111.setLayout(null);
			jPanel15111111.setBounds(new Rectangle(4, 143, 514, 66));
			jPanel15111111.setBackground(SystemColor.info);
			jPanel15111111.setBorder(BorderFactory.createLineBorder(SystemColor.controlShadow, 1));
			jPanel15111111.add(getFloatJSlider_WdivL(), null);
			jPanel15111111.add(jLabel4111, null);
			jPanel15111111.add(jLabel31111, null);
			jPanel15111111.add(getJTextField_WdivL(), null);
			jPanel15111111.add(jLabel1511, null);
			jPanel15111111.add(getJComboBox_WdivL(), null);
			jPanel15111111.add(jLabel15113, null);
		}
		return jPanel15111111;
	}

	/**
	 * This method initializes FloatJSlider_WdivL	
	 * 	
	 * @return ic.poshtkohi.gui.FloatJSlider	
	 */
	private FloatJSlider getFloatJSlider_WdivL() {
		if (FloatJSlider_WdivL == null) {
			FloatJSlider_WdivL = new FloatJSlider(0.5f, 1000f, 1);
			FloatJSlider_WdivL.setBounds(new Rectangle(165, 11, 227, 27));
			FloatJSlider_WdivL.setToolTipText("");
			FloatJSlider_WdivL.setExtent(0);
			FloatJSlider_WdivL.setMajorTickSpacing(1000000);
			FloatJSlider_WdivL.setOrientation(JSlider.HORIZONTAL);
			FloatJSlider_WdivL.setPaintLabels(false);
			FloatJSlider_WdivL.setPaintTicks(true);
			FloatJSlider_WdivL.setSnapToTicks(false);
			FloatJSlider_WdivL.setFloatValue(5.0F);
			FloatJSlider_WdivL.setBackground(SystemColor.info);
			FloatJSlider_WdivL.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					System.out.println("stateChanged()"); // TODO Auto-generated Event stub stateChanged()
					JInternalFrame_design2_events.WdivL_variaition(true);
				}
			});
		}
		return FloatJSlider_WdivL;
	}

	/**
	 * This method initializes jTextField_WdivL	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_WdivL() {
		if (jTextField_WdivL == null) {
			jTextField_WdivL = new JTextField();
			jTextField_WdivL.setBounds(new Rectangle(399, 9, 67, 20));
			jTextField_WdivL.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_WdivL.setText("5");
		}
		return jTextField_WdivL;
	}

	/**
	 * This method initializes jComboBox_WdivL	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox_WdivL() {
		if (jComboBox_WdivL == null) {
			jComboBox_WdivL = new JComboBox();
			jComboBox_WdivL.setBounds(new Rectangle(5, 16, 132, 25));
		}
		return jComboBox_WdivL;
	}

	/**
	 * This method initializes jTabbedPane1	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane1() {
		if (jTabbedPane1 == null) {
			jTabbedPane1 = new JTabbedPane();
			jTabbedPane1.setBounds(new Rectangle(543, 8, 367, 241));
			jTabbedPane1.setBackground(SystemColor.info);
			jTabbedPane1.addTab("noise", null, getJDesktopPane11(), null);
		}
		return jTabbedPane1;
	}

	/**
	 * This method initializes jDesktopPane11	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getJDesktopPane11() {
		if (jDesktopPane11 == null) {
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(221, 7, 38, 16));
			jLabel6.setText("Vp");
			jDesktopPane11 = new JDesktopPane();
			jDesktopPane11.setBackground(SystemColor.info);
			jDesktopPane11.add(getJPanel151(), null);
			jDesktopPane11.add(getJTextField_Vp(), null);
			jDesktopPane11.add(jLabel6, null);
		}
		return jDesktopPane11;
	}

	/**
	 * This method initializes PictureBox_saturation_region	
	 * 	
	 * @return ic.poshtkohi.gui.PictureBox	
	 */
	private PictureBox getPictureBox_saturation_region() {
		if (PictureBox_saturation_region == null) {
			PictureBox_saturation_region = new PictureBox(getClass().getResource(
					"/images/nmos/saturation_region.png"));
			PictureBox_saturation_region.setLayout(new GridBagLayout());
			PictureBox_saturation_region.setBounds(new Rectangle(14, 11, 31, 36));
		}
		return PictureBox_saturation_region;
	}

	/**
	 * This method initializes PictureBox_linear_region	
	 * 	
	 * @return ic.poshtkohi.gui.PictureBox	
	 */
	private PictureBox getPictureBox_linear_region() {
		if (PictureBox_linear_region == null) {
			PictureBox_linear_region = new PictureBox(getClass().getResource(
					"/images/nmos/linear_region.png"));
			PictureBox_linear_region.setLayout(new GridBagLayout());
			PictureBox_linear_region.setBounds(new Rectangle(14, 11, 30, 37));
			PictureBox_linear_region.setVisible(false);
		}
		return PictureBox_linear_region;
	}

	/**
	 * This method initializes jPanel1511112	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1511112() {
		if (jPanel1511112 == null) {
			jLabel151111 = new JLabel();
			jLabel151111.setBounds(new Rectangle(4, 8, 18, 16));
			jLabel151111.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel151111.setText("Id");
			jLabel151111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel152 = new JLabel();
			jLabel152.setBounds(new Rectangle(326, 9, 18, 16));
			jLabel152.setText("uA");
			jLabel152.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel3112 = new JLabel();
			jLabel3112.setBounds(new Rectangle(230, 41, 28, 16));
			jLabel3112.setText("1000");
			jLabel3112.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel412 = new JLabel();
			jLabel412.setBounds(new Rectangle(32, 43, 43, 16));
			jLabel412.setText("0.001");
			jLabel412.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel1511112 = new JPanel();
			jPanel1511112.setLayout(null);
			jPanel1511112.setBounds(new Rectangle(133, 14, 349, 61));
			jPanel1511112.setBackground(SystemColor.info);
			jPanel1511112.setBorder(BorderFactory.createLineBorder(SystemColor.controlShadow, 1));
			jPanel1511112.add(getFloatJSlider_Id(), null);
			jPanel1511112.add(jLabel412, null);
			jPanel1511112.add(jLabel3112, null);
			jPanel1511112.add(getJTextField_Id(), null);
			jPanel1511112.add(jLabel152, null);
			jPanel1511112.add(jLabel151111, null);
		}
		return jPanel1511112;
	}

	/**
	 * This method initializes FloatJSlider_Id	
	 * 	
	 * @return ic.poshtkohi.gui.FloatJSlider	
	 */
	private FloatJSlider getFloatJSlider_Id() {
		if (FloatJSlider_Id == null) {
			FloatJSlider_Id = new FloatJSlider(0.001f, 1000f, 1);
			FloatJSlider_Id.setBounds(new Rectangle(28, 10, 227, 27));
			FloatJSlider_Id.setToolTipText("");
			FloatJSlider_Id.setExtent(0);
			FloatJSlider_Id.setMajorTickSpacing(1000000);
			FloatJSlider_Id.setOrientation(JSlider.HORIZONTAL);
			FloatJSlider_Id.setPaintLabels(false);
			FloatJSlider_Id.setPaintTicks(true);
			FloatJSlider_Id.setSnapToTicks(false);
			FloatJSlider_Id.setFloatValue(1.83f);
			FloatJSlider_Id.setBackground(SystemColor.info);
			FloatJSlider_Id.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					System.out.println("stateChanged()"); // TODO Auto-generated Event stub stateChanged()
					jTextField_Id.setText(Float.toString(FloatJSlider_Id.getFloatValue()));
				}
			});
		}
		return FloatJSlider_Id;
	}

	/**
	 * This method initializes jTextField_Id	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Id() {
		if (jTextField_Id == null) {
			jTextField_Id = new JTextField();
			jTextField_Id.setBounds(new Rectangle(260, 8, 67, 20));
			jTextField_Id.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Id.setText("43.0745");
		}
		return jTextField_Id;
	}

	/**
	 * This method initializes jPanel15111121	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel15111121() {
		if (jPanel15111121 == null) {
			jLabel1511111 = new JLabel();
			jLabel1511111.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel1511111.setText("Idsat");
			jLabel1511111.setBounds(new Rectangle(0, 10, 27, 16));
			jLabel1511111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1521 = new JLabel();
			jLabel1521.setBounds(new Rectangle(326, 9, 18, 16));
			jLabel1521.setText("uA");
			jLabel1521.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel31121 = new JLabel();
			jLabel31121.setBounds(new Rectangle(230, 41, 28, 16));
			jLabel31121.setText("1000");
			jLabel31121.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel4121 = new JLabel();
			jLabel4121.setBounds(new Rectangle(32, 43, 37, 16));
			jLabel4121.setText("0.001");
			jLabel4121.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel15111121 = new JPanel();
			jPanel15111121.setLayout(null);
			jPanel15111121.setBounds(new Rectangle(135, 81, 348, 58));
			jPanel15111121.setBackground(SystemColor.info);
			jPanel15111121.setBorder(BorderFactory.createLineBorder(SystemColor.controlShadow, 1));
			jPanel15111121.add(getFloatJSlider_Idsat(), null);
			jPanel15111121.add(jLabel4121, null);
			jPanel15111121.add(jLabel31121, null);
			jPanel15111121.add(getJTextField_Idsat(), null);
			jPanel15111121.add(jLabel1521, null);
			jPanel15111121.add(jLabel1511111, null);
		}
		return jPanel15111121;
	}

	/**
	 * This method initializes FloatJSlider_Idsat	
	 * 	
	 * @return ic.poshtkohi.gui.FloatJSlider	
	 */
	private FloatJSlider getFloatJSlider_Idsat() {
		if (FloatJSlider_Idsat == null) {
			FloatJSlider_Idsat = new FloatJSlider(0.001f, 1000f, 1);
			FloatJSlider_Idsat.setBounds(new Rectangle(28, 10, 227, 27));
			FloatJSlider_Idsat.setToolTipText("");
			FloatJSlider_Idsat.setExtent(0);
			FloatJSlider_Idsat.setMajorTickSpacing(1000000);
			FloatJSlider_Idsat.setOrientation(JSlider.HORIZONTAL);
			FloatJSlider_Idsat.setPaintLabels(false);
			FloatJSlider_Idsat.setPaintTicks(true);
			FloatJSlider_Idsat.setSnapToTicks(false);
			FloatJSlider_Idsat.setFloatValue(1.83f);
			FloatJSlider_Idsat.setBackground(SystemColor.info);
			FloatJSlider_Idsat.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					System.out.println("stateChanged()"); // TODO Auto-generated Event stub stateChanged()
					jTextField_Idsat.setText(Float.toString(FloatJSlider_Idsat.getFloatValue()));
				}
			});
		}
		return FloatJSlider_Idsat;
	}

	/**
	 * This method initializes jTextField_Idsat	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Idsat() {
		if (jTextField_Idsat == null) {
			jTextField_Idsat = new JTextField();
			jTextField_Idsat.setBounds(new Rectangle(260, 8, 67, 20));
			jTextField_Idsat.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Idsat.setText("43.0745");
		}
		return jTextField_Idsat;
	}

	/**
	 * This method initializes jComboBox_Idsat	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox_Idsat() {
		if (jComboBox_Idsat == null) {
			jComboBox_Idsat = new JComboBox();
			jComboBox_Idsat.setBounds(new Rectangle(6, 112, 117, 25));
		}
		return jComboBox_Idsat;
	}
	/**
	 * This method initializes jPanel151	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel151() {
		if (jPanel151 == null) {
			jLabel12111 = new JLabel();
			jLabel12111.setBounds(new Rectangle(169, 103, 46, 16));
			jLabel12111.setText("Hz");
			jLabel12111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel15114 = new JLabel();
			jLabel15114.setBounds(new Rectangle(19, 106, 60, 22));
			jLabel15114.setText("corner freq");
			jLabel15114.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1512 = new JLabel();
			jLabel1512.setBounds(new Rectangle(45, 74, 35, 16));
			jLabel1512.setText("v_eq");
			jLabel1512.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1412 = new JLabel();
			jLabel1412.setBounds(new Rectangle(34, 44, 46, 16));
			jLabel1412.setText("v_flicker");
			jLabel1412.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel131 = new JLabel();
			jLabel131.setBounds(new Rectangle(23, 16, 54, 16));
			jLabel131.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel131.setText("v_thermal");
			jLabel131.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1211 = new JLabel();
			jLabel1211.setBounds(new Rectangle(169, 74, 73, 16));
			jLabel1211.setText("nV/sqrt(Hz)");
			jLabel1211.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel111 = new JLabel();
			jLabel111.setBounds(new Rectangle(169, 44, 70, 16));
			jLabel111.setText("nV/sqrt(Hz)");
			jLabel111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel16 = new JLabel();
			jLabel16.setBounds(new Rectangle(169, 14, 64, 16));
			jLabel16.setText("nV/sqrt(Hz)");
			jLabel16.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel151 = new JPanel();
			jPanel151.setLayout(null);
			jPanel151.setBounds(new Rectangle(45, 29, 247, 148));
			jPanel151.setBackground(SystemColor.info);
			jPanel151.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
			jPanel151.add(getJTextField_v_thermal(), null);
			jPanel151.add(getJTextField_v_flicker(), null);
			jPanel151.add(getJTextField_v_eq(), null);
			jPanel151.add(jLabel16, null);
			jPanel151.add(jLabel111, null);
			jPanel151.add(jLabel1211, null);
			jPanel151.add(jLabel131, null);
			jPanel151.add(jLabel1412, null);
			jPanel151.add(jLabel1512, null);
			jPanel151.add(getJTextField_corner_freq(), null);
			jPanel151.add(jLabel15114, null);
			jPanel151.add(jLabel12111, null);
		}
		return jPanel151;
	}
	/**
	 * This method initializes jTextField_v_thermal	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_v_thermal() {
		if (jTextField_v_thermal == null) {
			jTextField_v_thermal = new JTextField();
			jTextField_v_thermal.setBounds(new Rectangle(79, 14, 90, 27));
			jTextField_v_thermal.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_v_thermal.setText("50.8097");
		}
		return jTextField_v_thermal;
	}
	/**
	 * This method initializes jTextField_v_flicker	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_v_flicker() {
		if (jTextField_v_flicker == null) {
			jTextField_v_flicker = new JTextField();
			jTextField_v_flicker.setBounds(new Rectangle(79, 44, 90, 27));
			jTextField_v_flicker.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_v_flicker.setText("973.313");
		}
		return jTextField_v_flicker;
	}
	/**
	 * This method initializes jTextField_v_eq	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_v_eq() {
		if (jTextField_v_eq == null) {
			jTextField_v_eq = new JTextField();
			jTextField_v_eq.setBounds(new Rectangle(79, 74, 90, 27));
			jTextField_v_eq.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_v_eq.setText("974.638");
			jTextField_v_eq.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_v_eq.setText("974.638");
		}
		return jTextField_v_eq;
	}
	/**
	 * This method initializes jTextField_corner_freq	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_corner_freq() {
		if (jTextField_corner_freq == null) {
			jTextField_corner_freq = new JTextField();
			jTextField_corner_freq.setBounds(new Rectangle(79, 104, 90, 27));
			jTextField_corner_freq.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_corner_freq.setText("366.954");
		}
		return jTextField_corner_freq;
	}
	/**
	 * This method initializes jPanel15211	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel15211() {
		if (jPanel15211 == null) {
			jLabel14211 = new JLabel();
			jLabel14211.setBounds(new Rectangle(211, 16, 28, 16));
			jLabel14211.setText("rds");
			jLabel14211.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel13211 = new JLabel();
			jLabel13211.setBounds(new Rectangle(3, 14, 46, 16));
			jLabel13211.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel13211.setText("gm/gds");
			jLabel13211.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel11211 = new JLabel();
			jLabel11211.setBounds(new Rectangle(330, 16, 18, 16));
			jLabel11211.setText("M");
			jLabel11211.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1711 = new JLabel();
			jLabel1711.setBounds(new Rectangle(138, 14, 20, 16));
			jLabel1711.setText("dB");
			jLabel1711.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel15211 = new JPanel();
			jPanel15211.setLayout(null);
			jPanel15211.setBounds(new Rectangle(2, 6, 360, 52));
			jPanel15211.setBackground(SystemColor.info);
			jPanel15211.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel15211.add(getJTextField_gmDIVgds(), null);
			jPanel15211.add(getJTextField_rds(), null);
			jPanel15211.add(jLabel1711, null);
			jPanel15211.add(jLabel11211, null);
			jPanel15211.add(jLabel13211, null);
			jPanel15211.add(jLabel14211, null);
		}
		return jPanel15211;
	}
	/**
	 * This method initializes jTextField_gmDIVgds	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_gmDIVgds() {
		if (jTextField_gmDIVgds == null) {
			jTextField_gmDIVgds = new JTextField();
			jTextField_gmDIVgds.setBounds(new Rectangle(48, 14, 90, 27));
			jTextField_gmDIVgds.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_gmDIVgds.setEnabled(true);
			jTextField_gmDIVgds.setEditable(false);
			jTextField_gmDIVgds.setText("75.1696");
		}
		return jTextField_gmDIVgds;
	}
	/**
	 * This method initializes jTextField_rds	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_rds() {
		if (jTextField_rds == null) {
			jTextField_rds = new JTextField();
			jTextField_rds.setBounds(new Rectangle(240, 16, 90, 27));
			jTextField_rds.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_rds.setEnabled(true);
			jTextField_rds.setEditable(false);
			jTextField_rds.setText("26.9081");
		}
		return jTextField_rds;
	}
	/**
	 * This method initializes jPanel15112	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel15112() {
		if (jPanel15112 == null) {
			jLabel17111 = new JLabel();
			jLabel17111.setBounds(new Rectangle(61, 115, 15, 16));
			jLabel17111.setText("uS");
			jLabel17111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel132111 = new JLabel();
			jLabel132111.setBounds(new Rectangle(15, 91, 27, 16));
			jLabel132111.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel132111.setText("gm");
			jLabel132111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel32 = new JLabel();
			jLabel32.setBounds(new Rectangle(116, 7, 34, 16));
			jLabel32.setText("1000");
			jLabel32.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(113, 116, 12, 16));
			jLabel5.setText("0");
			jLabel5.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel15112 = new JPanel();
			jPanel15112.setLayout(null);
			jPanel15112.setBounds(new Rectangle(24, 63, 149, 137));
			jPanel15112.setBackground(SystemColor.info);
			jPanel15112.add(getFloatJSlider_gm(), null);
			jPanel15112.add(jLabel5, null);
			jPanel15112.add(jLabel32, null);
			jPanel15112.add(getJTextField_gm(), null);
			jPanel15112.add(jLabel132111, null);
			jPanel15112.add(jLabel17111, null);
		}
		return jPanel15112;
	}
	/**
	 * This method initializes FloatJSlider_gm	
	 * 	
	 * @return ic.poshtkohi.gui.FloatJSlider	
	 */
	private FloatJSlider getFloatJSlider_gm() {
		if (FloatJSlider_gm == null) {
			FloatJSlider_gm = new FloatJSlider(0, 1000, 1);
			FloatJSlider_gm.setBounds(new Rectangle(79, 5, 34, 125));
			FloatJSlider_gm.setToolTipText("");
			FloatJSlider_gm.setExtent(0);
			FloatJSlider_gm.setMajorTickSpacing(1000000);
			FloatJSlider_gm.setOrientation(JSlider.VERTICAL);
			FloatJSlider_gm.setPaintLabels(false);
			FloatJSlider_gm.setPaintTicks(true);
			FloatJSlider_gm.setSnapToTicks(false);
			FloatJSlider_gm.setFloatValue(1.83f);
			FloatJSlider_gm.setEnabled(false);
			FloatJSlider_gm.setBackground(SystemColor.info);
		}
		return FloatJSlider_gm;
	}
	/**
	 * This method initializes jTextField_gm	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_gm() {
		if (jTextField_gm == null) {
			jTextField_gm = new JTextField();
			jTextField_gm.setBounds(new Rectangle(3, 113, 56, 20));
			jTextField_gm.setText("213.107");
			jTextField_gm.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_gm.setEditable(false);
			jTextField_gm.setEnabled(true);
		}
		return jTextField_gm;
	}
	/**
	 * This method initializes jPanel151121	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel151121() {
		if (jPanel151121 == null) {
			jLabel171111 = new JLabel();
			jLabel171111.setBounds(new Rectangle(61, 115, 15, 16));
			jLabel171111.setText("nS");
			jLabel171111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1321111 = new JLabel();
			jLabel1321111.setBounds(new Rectangle(15, 91, 27, 16));
			jLabel1321111.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel1321111.setText("gds");
			jLabel1321111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel321 = new JLabel();
			jLabel321.setBounds(new Rectangle(116, 7, 34, 16));
			jLabel321.setText("100");
			jLabel321.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel51 = new JLabel();
			jLabel51.setBounds(new Rectangle(113, 116, 12, 16));
			jLabel51.setText("0");
			jLabel51.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel151121 = new JPanel();
			jPanel151121.setLayout(null);
			jPanel151121.setBounds(new Rectangle(191, 63, 149, 137));
			jPanel151121.setBackground(SystemColor.info);
			jPanel151121.add(getFloatJSlider_gds(), null);
			jPanel151121.add(jLabel51, null);
			jPanel151121.add(jLabel321, null);
			jPanel151121.add(getJTextField_gds(), null);
			jPanel151121.add(jLabel1321111, null);
			jPanel151121.add(jLabel171111, null);
		}
		return jPanel151121;
	}
	/**
	 * This method initializes FloatJSlider_gds	
	 * 	
	 * @return ic.poshtkohi.gui.FloatJSlider	
	 */
	private FloatJSlider getFloatJSlider_gds() {
		if (FloatJSlider_gds == null) {
			FloatJSlider_gds = new FloatJSlider(0, 100, 1);
			FloatJSlider_gds.setBounds(new Rectangle(79, 5, 34, 125));
			FloatJSlider_gds.setEnabled(false);
			FloatJSlider_gds.setToolTipText("");
			FloatJSlider_gds.setExtent(0);
			FloatJSlider_gds.setMajorTickSpacing(100000);
			FloatJSlider_gds.setOrientation(JSlider.VERTICAL);
			FloatJSlider_gds.setPaintLabels(false);
			FloatJSlider_gds.setPaintTicks(true);
			FloatJSlider_gds.setSnapToTicks(false);
			FloatJSlider_gds.setFloatValue(1.83f);
			FloatJSlider_gds.setBackground(SystemColor.info);
		}
		return FloatJSlider_gds;
	}
	/**
	 * This method initializes jTextField_gds	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_gds() {
		if (jTextField_gds == null) {
			jTextField_gds = new JTextField();
			jTextField_gds.setBounds(new Rectangle(3, 113, 56, 20));
			jTextField_gds.setText("37.1636");
			jTextField_gds.setEditable(false);
			jTextField_gds.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_gds.setEnabled(true);
		}
		return jTextField_gds;
	}
	/**
	 * This method initializes jTextField_gmbs	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_gmbs() {
		if (jTextField_gmbs == null) {
			jTextField_gmbs = new JTextField();
			jTextField_gmbs.setBounds(new Rectangle(70, 232, 58, 20));
			jTextField_gmbs.setText("72.2874");
			jTextField_gmbs.setEditable(false);
			jTextField_gmbs.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_gmbs.setEnabled(true);
		}
		return jTextField_gmbs;
	}
	/**
	 * This method initializes jPanel1511211	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1511211() {
		if (jPanel1511211 == null) {
			jLabel13211111 = new JLabel();
			jLabel13211111.setBounds(new Rectangle(88, 28, 21, 16));
			jLabel13211111.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel13211111.setText("if");
			jLabel13211111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel1511211 = new JPanel();
			jPanel1511211.setLayout(null);
			jPanel1511211.setBackground(SystemColor.info);
			jPanel1511211.setBounds(new Rectangle(216, 202, 124, 75));
			jPanel1511211.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel1511211.add(getJTextField_if(), null);
			jPanel1511211.add(jLabel13211111, null);
			jPanel1511211.add(getPictureBox_strong_inversion(), null);
			jPanel1511211.add(getPictureBox_moderate_inversion(), null);
			jPanel1511211.add(getPictureBox_weak_inversion(), null);
		}
		return jPanel1511211;
	}
	/**
	 * This method initializes jTextField_if	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_if() {
		if (jTextField_if == null) {
			jTextField_if = new JTextField();
			jTextField_if.setBounds(new Rectangle(62, 51, 49, 20));
			jTextField_if.setText("28.4707");
			jTextField_if.setEditable(false);
			jTextField_if.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_if.setEnabled(true);
		}
		return jTextField_if;
	}
	/**
	 * This method initializes PictureBox_strong_inversion	
	 * 	
	 * @return ic.poshtkohi.gui.PictureBox	
	 */
	private PictureBox getPictureBox_strong_inversion() {
		if (PictureBox_strong_inversion == null) {
			PictureBox_strong_inversion = new PictureBox(getClass().getResource(
					"/images/nmos/strong_inversion.png"));
			PictureBox_strong_inversion.setLayout(new GridBagLayout());
			PictureBox_strong_inversion.setBounds(new Rectangle(15, 13, 33, 36));
		}
		return PictureBox_strong_inversion;
	}
	/**
	 * This method initializes PictureBox_weak_inversion	
	 * 	
	 * @return ic.poshtkohi.gui.PictureBox	
	 */
	private PictureBox getPictureBox_weak_inversion() {
		if (PictureBox_weak_inversion == null) {
			PictureBox_weak_inversion = new PictureBox(getClass().getResource(
					"/images/nmos/weak_inversion.png"));
			PictureBox_weak_inversion.setLayout(new GridBagLayout());
			PictureBox_weak_inversion.setBounds(new Rectangle(15, 13, 30, 34));
			PictureBox_weak_inversion.setVisible(false);
		}
		return PictureBox_weak_inversion;
	}
	/**
	 * This method initializes PictureBox_moderate_inversion	
	 * 	
	 * @return ic.poshtkohi.gui.PictureBox	
	 */
	private PictureBox getPictureBox_moderate_inversion() {
		if (PictureBox_moderate_inversion == null) {
			PictureBox_moderate_inversion = new PictureBox(getClass().getResource(
					"/images/nmos/moderate_inversion.png").getFile().replace("%20",
					" "));
			PictureBox_moderate_inversion.setLayout(new GridBagLayout());
			PictureBox_moderate_inversion.setBounds(new Rectangle(15, 13, 33, 37));
			PictureBox_moderate_inversion.setVisible(false);
		}
		return PictureBox_moderate_inversion;
	}
	/**
	 * This method initializes jPanel15113	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel15113() {
		if (jPanel15113 == null) {
			jLabel1211115 = new JLabel();
			jLabel1211115.setBounds(new Rectangle(150, 135, 10, 16));
			jLabel1211115.setText("F");
			jLabel1211115.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1211114 = new JLabel();
			jLabel1211114.setBounds(new Rectangle(151, 76, 10, 16));
			jLabel1211114.setText("F");
			jLabel1211114.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1211113 = new JLabel();
			jLabel1211113.setBounds(new Rectangle(150, 45, 10, 16));
			jLabel1211113.setText("F");
			jLabel1211113.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1211111 = new JLabel();
			jLabel1211111.setBounds(new Rectangle(151, 15, 10, 16));
			jLabel1211111.setText("F");
			jLabel1211111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1511112 = new JLabel();
			jLabel1511112.setBounds(new Rectangle(15, 135, 47, 16));
			jLabel1511112.setText("Cdb");
			jLabel1511112.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel121111 = new JLabel();
			jLabel121111.setBounds(new Rectangle(150, 104, 15, 16));
			jLabel121111.setText("F");
			jLabel121111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel151112 = new JLabel();
			jLabel151112.setBounds(new Rectangle(15, 104, 40, 16));
			jLabel151112.setText("Csb");
			jLabel151112.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel15121 = new JLabel();
			jLabel15121.setBounds(new Rectangle(15, 75, 46, 16));
			jLabel15121.setText("Cgb");
			jLabel15121.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel14112 = new JLabel();
			jLabel14112.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel14112.setText("Cgd");
			jLabel14112.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1311 = new JLabel();
			jLabel1311.setBounds(new Rectangle(15, 15, 46, 16));
			jLabel1311.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel1311.setText("Cgs");
			jLabel1311.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel15113 = new JPanel();
			jPanel15113.setLayout(null);
			jPanel15113.setBounds(new Rectangle(3, 64, 177, 178));
			jPanel15113.setBackground(SystemColor.info);
			jPanel15113.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel15113.add(getJTextField_Cgs(), null);
			jPanel15113.add(getJTextField_Cgd(), null);
			jPanel15113.add(getJTextField_Cgb(), null);
			jPanel15113.add(jLabel1311, null);
			jPanel15113.add(jLabel14112, null);
			jPanel15113.add(jLabel15121, null);
			jPanel15113.add(getJTextField_Csb(), null);
			jPanel15113.add(jLabel151112, null);
			jPanel15113.add(jLabel121111, null);
			jPanel15113.add(getJTextField_Cdb(), null);
			jPanel15113.add(jLabel1511112, null);
			jPanel15113.add(jLabel1211111, null);
			jPanel15113.add(jLabel1211113, null);
			jPanel15113.add(jLabel1211114, null);
			jPanel15113.add(jLabel1211115, null);
		}
		return jPanel15113;
	}
	/**
	 * This method initializes jTextField_Cgs	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Cgs() {
		if (jTextField_Cgs == null) {
			jTextField_Cgs = new JTextField();
			jTextField_Cgs.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_Cgs.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Cgs.setText("1.01348e-012");
		}
		return jTextField_Cgs;
	}
	/**
	 * This method initializes jTextField_Cgd	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Cgd() {
		if (jTextField_Cgd == null) {
			jTextField_Cgd = new JTextField();
			jTextField_Cgd.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_Cgd.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Cgd.setText("4.07398e-025");
		}
		return jTextField_Cgd;
	}
	/**
	 * This method initializes jTextField_Cgb	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Cgb() {
		if (jTextField_Cgb == null) {
			jTextField_Cgb = new JTextField();
			jTextField_Cgb.setBounds(new Rectangle(60, 75, 90, 27));
			jTextField_Cgb.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Cgb.setText("1.71154e-013");
		}
		return jTextField_Cgb;
	}
	/**
	 * This method initializes jTextField_Csb	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Csb() {
		if (jTextField_Csb == null) {
			jTextField_Csb = new JTextField();
			jTextField_Csb.setBounds(new Rectangle(60, 105, 90, 27));
			jTextField_Csb.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Csb.setText("3.43955e-013");
		}
		return jTextField_Csb;
	}
	/**
	 * This method initializes jTextField_Cdb	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Cdb() {
		if (jTextField_Cdb == null) {
			jTextField_Cdb = new JTextField();
			jTextField_Cdb.setBounds(new Rectangle(60, 135, 90, 27));
			jTextField_Cdb.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Cdb.setText("1.38263e-025");
		}
		return jTextField_Cdb;
	}
	/**
	 * This method initializes jPanel151131	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel151131() {
		if (jPanel151131 == null) {
			jLabel12111133 = new JLabel();
			jLabel12111133.setBounds(new Rectangle(153, 75, 10, 16));
			jLabel12111133.setText("F");
			jLabel12111133.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel12111132 = new JLabel();
			jLabel12111132.setBounds(new Rectangle(151, 45, 10, 16));
			jLabel12111132.setText("F");
			jLabel12111132.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel12111131 = new JLabel();
			jLabel12111131.setBounds(new Rectangle(149, 15, 10, 16));
			jLabel12111131.setText("F");
			jLabel12111131.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel15111121 = new JLabel();
			jLabel15111121.setBounds(new Rectangle(30, 135, 32, 16));
			jLabel15111121.setText("ft");
			jLabel15111121.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel12111111 = new JLabel();
			jLabel12111111.setBounds(new Rectangle(150, 135, 25, 16));
			jLabel12111111.setText("MHz");
			jLabel12111111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel151211 = new JLabel();
			jLabel151211.setBounds(new Rectangle(15, 75, 46, 16));
			jLabel151211.setText("Cgbov");
			jLabel151211.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel141121 = new JLabel();
			jLabel141121.setBounds(new Rectangle(15, 45, 46, 16));
			jLabel141121.setText("Cgdov");
			jLabel141121.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel13111 = new JLabel();
			jLabel13111.setBounds(new Rectangle(17, 15, 44, 16));
			jLabel13111.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel13111.setText("Cgsov");
			jLabel13111.setFont(new Font("Dialog", Font.PLAIN, 12));
			jPanel151131 = new JPanel();
			jPanel151131.setLayout(null);
			jPanel151131.setBounds(new Rectangle(182, 64, 177, 178));
			jPanel151131.setBackground(SystemColor.info);
			jPanel151131.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel151131.add(getJTextField_Cgsov(), null);
			jPanel151131.add(getJTextField_Cgdov(), null);
			jPanel151131.add(getJTextField_Cgbov(), null);
			jPanel151131.add(jLabel13111, null);
			jPanel151131.add(jLabel141121, null);
			jPanel151131.add(jLabel151211, null);
			jPanel151131.add(getJTextField_ft(), null);
			jPanel151131.add(jLabel12111111, null);
			jPanel151131.add(jLabel15111121, null);
			jPanel151131.add(jLabel12111131, null);
			jPanel151131.add(jLabel12111132, null);
			jPanel151131.add(jLabel12111133, null);
		}
		return jPanel151131;
	}
	/**
	 * This method initializes jTextField_Cgsov	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Cgsov() {
		if (jTextField_Cgsov == null) {
			jTextField_Cgsov = new JTextField();
			jTextField_Cgsov.setBounds(new Rectangle(60, 15, 90, 27));
			jTextField_Cgsov.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Cgsov.setText("6.90345e-015");
		}
		return jTextField_Cgsov;
	}
	/**
	 * This method initializes jTextField_Cgdov	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Cgdov() {
		if (jTextField_Cgdov == null) {
			jTextField_Cgdov = new JTextField();
			jTextField_Cgdov.setBounds(new Rectangle(60, 45, 90, 27));
			jTextField_Cgdov.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Cgdov.setText("6.90345e-015");
		}
		return jTextField_Cgdov;
	}
	/**
	 * This method initializes jTextField_Cgbov	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Cgbov() {
		if (jTextField_Cgbov == null) {
			jTextField_Cgbov = new JTextField();
			jTextField_Cgbov.setBounds(new Rectangle(60, 75, 90, 27));
			jTextField_Cgbov.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_Cgbov.setText("3.42585e-015");
		}
		return jTextField_Cgbov;
	}
	/**
	 * This method initializes jTextField_ft	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_ft() {
		if (jTextField_ft == null) {
			jTextField_ft = new JTextField();
			jTextField_ft.setBounds(new Rectangle(60, 135, 90, 27));
			jTextField_ft.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_ft.setText("28.2204");
		}
		return jTextField_ft;
	}
	/**
	 * This method initializes jTextField_Vp	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Vp() {
		if (jTextField_Vp == null) {
			jTextField_Vp = new JTextField();
			jTextField_Vp.setBounds(new Rectangle(63, 6, 136, 20));
		}
		return jTextField_Vp;
	}
	/**
	 * This method initializes jTextField_Vg2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField_Vg2() {
		if (jTextField_Vg2 == null) {
			jTextField_Vg2 = new JTextField();
			jTextField_Vg2.setBounds(new Rectangle(84, 172, 122, 20));
		}
		return jTextField_Vg2;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
