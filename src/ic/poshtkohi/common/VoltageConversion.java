/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.common;

import java.lang.Math;

public class VoltageConversion
{
	//----------------------------------------------------------
	public static double getEkvVg(double Vgt, double Vbt)
	{
		return Math.abs(Vgt - Vbt);
	}
	//----------------------------------------------------------	
	public static double getEkvVs(double Vst, double Vbt)
	{
		return Math.abs(Vst - Vbt);
	}
	//----------------------------------------------------------
	public static double getEkvVd(double Vdt, double Vbt)
	{
		return Math.abs(Vdt - Vbt);
	}
	//----------------------------------------------------------
	public static double getVgt(double ekvVg, double Vbt)
	{
		return Math.abs(ekvVg + Vbt);
	}
	//----------------------------------------------------------
	public static double getVst(double ekvVs, double Vbt)
	{
		return Math.abs(ekvVs + Vbt);
	}
	//----------------------------------------------------------
	public static double getVdt(double ekvVd, double Vbt)
	{
		return Math.abs(ekvVd + Vbt);
	}
	//----------------------------------------------------------
}