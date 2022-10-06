/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.gui.nmos;

import  ic.poshtkohi.common.*;
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

public class JInternalFrame_design2_events
{
	//--------------------------------------------------------------------------------------
	public static void W_variaition(boolean fromFloatJSlider)
	{
		// For 
		// to Vg, Idsat const	=>	W		Section
		// to Vg, Idsat const	=>	L		Section
		// to Vg, L const		=>	W/L		Section
		// to Vg				=>  Idsat	Section
		if(fromFloatJSlider)
		{
			float _W = JInternalFrame_design2.FloatJSlider_W.getFloatValue();
			float _L = JInternalFrame_design2.FloatJSlider_L.getFloatValue();
			float _WdivL = _W / _L;
			//		W
			JInternalFrame_design2.jTextField_W.setText(Float.toString(JInternalFrame_design2.FloatJSlider_W.getFloatValue()));
			//		W/L
			JInternalFrame_design2.FloatJSlider_WdivL.setFloatValue(_WdivL);
			JInternalFrame_design2.jTextField_WdivL.setText(Float.toString(_WdivL));
			
			//JInternalFrame_design2.jTextField_test.setText(Double.toString(JInternalFrame_design2.ekv.W));
			
			ic.poshtkohi.gui.nmos.JInternalFrame_design2_W_toVgIdsatConst _JInternalFrame_design2_W_toVgIdsatConst = new ic.poshtkohi.gui.nmos.JInternalFrame_design2_W_toVgIdsatConst(ic.poshtkohi.gui.nmos.JInternalFrame_design2.ekv);
			double Vst = Double.valueOf(JInternalFrame_design2.jTextField_Vs.getText());
			double Vbt = Double.valueOf(JInternalFrame_design2.jTextField_Vb.getText());
			double Idsat = Double.valueOf(JInternalFrame_design2.jTextField_Idsat.getText());
			double W = Double.valueOf(JInternalFrame_design2.jTextField_W.getText());
			double Vp = _JInternalFrame_design2_W_toVgIdsatConst.get_Vp(VoltageConversion.getEkvVs(Vst, Vbt), Idsat, W);
			
			JInternalFrame_design2.jTextField_Vp.setText(Double.toString(Vp));
			
			double[] Vg = _JInternalFrame_design2_W_toVgIdsatConst.get_Vg(Vp);
			JInternalFrame_design2.jTextField_Vg.setText(Double.toString(Vg[0]));
			JInternalFrame_design2.jTextField_Vg2.setText(Double.toString(Vg[1]));
			/*ic.poshtkohi.gui.nmos.JInternalFrame_design2_W_toVgIdsatConst _JInternalFrame_design2_W_toVgIdsatConst = new ic.poshtkohi.gui.nmos.JInternalFrame_design2_W_toVgIdsatConst(ic.poshtkohi.gui.nmos.JInternalFrame_design2.ekv);
			double Vgt = Double.valueOf(JInternalFrame_design2.jTextField_Vs.getText());
			double Vbt = Double.valueOf(JInternalFrame_design2.jTextField_Vb.getText());
			double Vst = Double.valueOf(JInternalFrame_design2.jTextField_Vs.getText());
			double Vdt = Double.valueOf(JInternalFrame_design2.jTextField_Vd.getText());
			double Vp = _JInternalFrame_design2_W_toVgIdsatConst.get_Vp(VoltageConversion.getEkvVg(Vgt, Vbt));
			double IF = Common.IFCompute(Vp, VoltageConversion.getEkvVg(Vst, Vbt), _JInternalFrame_design2_W_toVgIdsatConst.Vt);
			JInternalFrame_design2.jTextField_test.setText(Double.toString(IF));*/

		}
		else
		{
		}
	}
	public static void L_variaition(boolean fromFloatJSlider)
	{
		// For 
		// to Vg, Idsat const	=>	W		Section
		// to Vg, Idsat const	=>	L		Section
		// to Vg, L const		=>	W/L		Section
		// to Vg				=>  Idsat	Section
		if(fromFloatJSlider)
		{
			float _W = JInternalFrame_design2.FloatJSlider_W.getFloatValue();
			float _L = JInternalFrame_design2.FloatJSlider_L.getFloatValue();
			float _WdivL = _W / _L;
			//		L
			JInternalFrame_design2.jTextField_L.setText(Float.toString(JInternalFrame_design2.FloatJSlider_L.getFloatValue()));
			//		W/L
			JInternalFrame_design2.FloatJSlider_WdivL.setFloatValue(_WdivL);
			JInternalFrame_design2.jTextField_WdivL.setText(Float.toString(_WdivL));
		}
		else
		{
		}
	}
	//--------------------------------------------------------------------------------------
	public static void WdivL_variaition(boolean fromFloatJSlider)
	{
		// For 
		// to Vg, Idsat const	=>	W		Section
		// to Vg, Idsat const	=>	L		Section
		// to Vg, L const		=>	W/L		Section
		// to Vg				=>  Idsat	Section
		if(fromFloatJSlider)
		{
			float _L = JInternalFrame_design2.FloatJSlider_L.getFloatValue();
			float _WdivL = JInternalFrame_design2.FloatJSlider_WdivL.getFloatValue();
			float _W = _L * _WdivL;
			//		L
			JInternalFrame_design2.jTextField_W.setText(Float.toString(_W));
			JInternalFrame_design2.FloatJSlider_W.setFloatValue(_W);
			//		W/L
			JInternalFrame_design2.jTextField_WdivL.setText(Float.toString(_WdivL));
		}
		else
		{
		}
	}
	//--------------------------------------------------------------------------------------
}
