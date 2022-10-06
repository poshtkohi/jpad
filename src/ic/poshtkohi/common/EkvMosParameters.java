/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.common;

import ic.poshtkohi.gui.nmos.JInternalFrame_design1;

public class EkvMosParameters
{
	//-------------------------------------------
	public double Wmin;
	public double Lmin;
	public double step;
	public double VTO;
	public double GAMMA;
	public double PHI;
	public double KP;
	public double TCV;
	public double BEX;
	public double UCEX;
	public double Tnom;
	public double T;
	public double DW;
	public double DL;
	public double XJ;
	public double UCRIT;
	public double LAMBADA;
	public double LETA;
	public double WETA;
	public double COX;
	public double CGSO;
	public double CGDO;
	public double CGBO;
	public double Avt;
	public double Abeta;
	public double Vg;
	public double Vs;
	public double Vd;
	public double Vb;
	public double W;
	public double L;
	public double KF;
	public double AF;
	public double f;
	//-------------------------------------------
	public EkvMosParameters()
	{
		 Wmin = Double.valueOf(JInternalFrame_design1.jTextField_Wmin.getText());
		 Lmin = Double.valueOf(JInternalFrame_design1.jTextField_Lmin.getText());
		 step = Double.valueOf(JInternalFrame_design1.jTextField_step.getText());
		 VTO = Double.valueOf(JInternalFrame_design1.jTextField_VTO.getText());
		 GAMMA = Double.valueOf(JInternalFrame_design1.jTextField_GAMMA.getText());
		 PHI = Double.valueOf(JInternalFrame_design1.jTextField_PHI.getText());
		 KP = Double.valueOf(JInternalFrame_design1.jTextField_KP.getText());
		 TCV = Double.valueOf(JInternalFrame_design1.jTextField_TCV.getText());
		 BEX = Double.valueOf(JInternalFrame_design1.jTextField_BEX.getText());
		 UCEX = Double.valueOf(JInternalFrame_design1.jTextField_UCEX.getText());
		 Tnom = Double.valueOf(JInternalFrame_design1.jTextField_Tnom.getText());
		 T = Double.valueOf(JInternalFrame_design1.jTextField_T.getText());
		 DW = Double.valueOf(JInternalFrame_design1.jTextField_DW.getText());
		 DL = Double.valueOf(JInternalFrame_design1.jTextField_DL.getText());
		 XJ = Double.valueOf(JInternalFrame_design1.jTextField_XJ.getText());
		 UCRIT = Double.valueOf(JInternalFrame_design1.jTextField_UCRIT.getText());
		 LAMBADA = Double.valueOf(JInternalFrame_design1.jTextField_LAMBADA.getText());
		 LETA = Double.valueOf(JInternalFrame_design1.jTextField_LETA.getText());
		 WETA = Double.valueOf(JInternalFrame_design1.jTextField_WETA.getText());
		 COX = Double.valueOf(JInternalFrame_design1.jTextField_COX.getText());
		 CGSO = Double.valueOf(JInternalFrame_design1.jTextField_CGSO.getText());
		 CGDO = Double.valueOf(JInternalFrame_design1.jTextField_CGDO.getText());
		 CGBO = Double.valueOf(JInternalFrame_design1.jTextField_CGBO.getText());
		 Avt = Double.valueOf(JInternalFrame_design1.jTextField_Avt.getText());
		 Abeta = Double.valueOf(JInternalFrame_design1.jTextField_Abeta.getText());
		 Vg = Double.valueOf(JInternalFrame_design1.jTextField_Vg.getText());
		 Vs = Double.valueOf(JInternalFrame_design1.jTextField_Vs.getText());
		 Vd = Double.valueOf(JInternalFrame_design1.jTextField_Vd.getText());
		 Vb = Double.valueOf(JInternalFrame_design1.jTextField_Vb.getText());
		 W = Double.valueOf(JInternalFrame_design1.jTextField_W.getText());
		 L = Double.valueOf(JInternalFrame_design1.jTextField_L.getText());
		 KF = Double.valueOf(JInternalFrame_design1.jTextField_KF.getText());
		 AF = Double.valueOf(JInternalFrame_design1.jTextField_AF.getText());
		 f = Double.valueOf(JInternalFrame_design1.jTextField_f.getText());
	}
	//-------------------------------------------
}