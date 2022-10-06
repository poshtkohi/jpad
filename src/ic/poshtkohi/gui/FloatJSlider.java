/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.gui;

import javax.swing.JSlider;

public class FloatJSlider extends JSlider {
	 static final float FLOAT_MINIMUM = 0.0f;
	  static final float FLOAT_MAXIMUM = 10000f;
	  static final float FLOAT_MIDDLE = 50.0f;
	  static final int PRECISION_MULTIPLIER  = 10000;
	  /**
	   * Constructor - initializes with 0.0,100.0,50.0
	   */
	  public FloatJSlider(){
	    super();
	    setFloatMinimum(FLOAT_MINIMUM);
	    setFloatMaximum(FLOAT_MAXIMUM);
	    setFloatValue(FLOAT_MIDDLE);
	  }

	  /**
	   * Constructor
	   */
	  public FloatJSlider(float min, float max, float val){
	    super();
	    setFloatMinimum(min);
	    setFloatMaximum(max);
	    setFloatValue(val);
	  }

	  /**
	   * returns Maximum in float precision
	   */
	  public float getFloatMaximum() {
	    return( getMaximum()/FLOAT_MAXIMUM );
	  }

	  /**
	   * returns Minimum in float precision
	   */
	  public float getFloatMinimum() {
	    return( getMinimum()/FLOAT_MAXIMUM );
	  }

	  /**
	   * returns Value in float precision
	   */
	  public float getFloatValue() {
	    return( getValue()/FLOAT_MAXIMUM );
	  }

	  /**
	   * sets Maximum in float precision
	   */
	  public void setFloatMaximum(float max) {
	    setMaximum((int)(max*PRECISION_MULTIPLIER));
	  }

	  /**
	   * sets Minimum in float precision
	   */
	  public void setFloatMinimum(float min) {
	    setMinimum((int)(min*PRECISION_MULTIPLIER));
	  }

	  /**
	   * sets Value in float precision
	   */
	  public void setFloatValue(float val) {
	    setValue((int)(val*PRECISION_MULTIPLIER));
	    setToolTipText(Float.toString(val));
	  }

}
