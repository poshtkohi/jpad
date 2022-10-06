/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.gui.nmos;

import ic.poshtkohi.common.*;

public class JInternalFrame_design2_W_toVgIdsatConst extends NewtonRaphson
{
	private EkvMosParameters ekv;
	private double Vp;
	private int m = 2;
	private double Vs;
	private double Idsat;
	public double Vt;
	private double PHI0;
	private double W;	
	//--------------------------------------------------------------------------------------
	public JInternalFrame_design2_W_toVgIdsatConst(EkvMosParameters ekv)
	{
		this.ekv = ekv;
		this.Vt = Common.VtCompute(ekv.T);
		this.PHI0 = ekv.PHI + m * Vt;
	}
	//--------------------------------------------------------------------------------------
	protected double f(double Vp)
	{
		  return 0.2e1 * ekv.KP / (ekv.L / 0.1000000e7 + ekv.DL) * Vt * Vt * (0.1e1 + ekv.GAMMA * Math.pow(ekv.PHI + m * Vt + Vp, -0.1e1 / 0.2e1) / 0.2e1) * Math.pow(Math.log(0.1e1 + (Vp - Vs) / Vt / 0.2e1), 0.2e1) - Idsat / (W / 0.1000000e7 + ekv.DW) / 0.1000000e7;
	}
	//--------------------------------------------------------------------------------------
	protected double df(double Vp)
	{
		  return(-ekv.KP / (ekv.L / 0.1000000e7 + ekv.DL) * Vt * Vt * ekv.GAMMA * Math.pow(Math.sqrt(PHI0 + Vp), -0.3e1) * Math.pow(Math.log(0.1e1 + (Vp - Vs) / Vt / 0.2e1), 0.2e1) / 0.2e1 + 0.2e1 * ekv.KP / (ekv.L / 0.1000000e7 + ekv.DL) * Vt * (0.1e1 + ekv.GAMMA / Math.sqrt(PHI0 + Vp) / 0.2e1) * Math.log(0.1e1 + (Vp - Vs) / Vt / 0.2e1) / (0.1e1 + (Vp - Vs) / Vt / 0.2e1));
	}
	//--------------------------------------------------------------------------------------
	public double get_Vp(double Vs, double Idsat, double W)
	{
		this.Vs = Vs;
		this.Idsat = Idsat;
		this.W = W;
		double iniX = 0;
		if(iniX == this.Vs)
		{
			iniX = this.Vs + 0.001;
			return this.Compute(iniX);
		}
		
		iniX = 1;
		
		if(iniX <= this.Vs)
			iniX = this.Vs + 0.001;
		
		return this.Compute(iniX);		
		
			
	}
	//--------------------------------------------------------------------------------------
	/*public double get_Vp(double Vg)
	{
		return (ekv.Vg - ekv.VTO - ekv.GAMMA * (Math.sqrt(ekv.Vg - ekv.VTO + Math.pow(Math.sqrt(ekv.PHI + m * Vt) + ekv.GAMMA / 0.2e1, 0.2e1)) - Math.sqrt(ekv.PHI + m * Vt) - ekv.GAMMA / 0.2e1));
	}*/	
	//--------------------------------------------------------------------------------------
	public double[] get_Vg(double Vp)
	{
		double[] cg = new double[2];
		cg[0] = ekv.GAMMA * (ekv.GAMMA + 0.2e1 * Math.sqrt(PHI0 + Vp)) / 0.2e1 + ekv.VTO - ekv.GAMMA * Math.sqrt(PHI0) - Math.pow(ekv.GAMMA, 0.2e1) / 0.2e1 + Vp;
		cg[1] = ekv.GAMMA * (ekv.GAMMA - 0.2e1 * Math.sqrt(PHI0 + Vp)) / 0.2e1 + ekv.VTO - ekv.GAMMA * Math.sqrt(PHI0) - Math.pow(ekv.GAMMA, 0.2e1) / 0.2e1 + Vp;
		return cg;
	}
	//--------------------------------------------------------------------------------------
}
