/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.common;

public class Common 
{
    public static double VtCompute(double T)
    {
 	   double k = 0.1381e-22;
 	   double q = 0.1609e-18;
 	   double Vt = (k * T ) / q ;
 	   return Vt;
    }
    public static double IFCompute(double Vp, double Vs,double Vt)
    {
    	return Math.pow(Math.log(0.1e1 + Math.exp((Vp - Vs) / Vt / 0.2e1)), 0.2e1);
    }
}
