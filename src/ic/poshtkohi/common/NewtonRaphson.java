/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.common;

public abstract class NewtonRaphson
{
	//------------------------------------------
	protected abstract double f(double x);
	protected abstract double df(double x);
	//------------------------------------------
	public double Compute(double iniX)
	{
		int nmax=500;
		double tolerance=1.0e-15,x=iniX;
		double fx,dfx;
		for(int i=0;i<nmax;i++)
		{
			fx=f(x);
			dfx=df(x);
			x-=fx/dfx;
			if(Math.abs(fx)<tolerance)
			{
				return x;
			}
		}
		return x;
	}
	//------------------------------------------
}
