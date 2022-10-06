/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.gui;

import java.net.URL;
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


public class PictureBox extends JPanel 
{
  private Image img;
  //private Graphics _g = null;
  public PictureBox (String imgPath) 
  { 
	  this.img = java.awt.Toolkit.getDefaultToolkit().createImage(imgPath);
		/*this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentMoved(java.awt.event.ComponentEvent e) {
				_g = _g.create();
				//paintComponent(_g);
				_repaint();
			}
		});*/
  }
  
  public PictureBox (URL imgPath) 
  { 
	  this.img = java.awt.Toolkit.getDefaultToolkit().createImage(imgPath);
		/*this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentMoved(java.awt.event.ComponentEvent e) {
				_g = _g.create();
				//paintComponent(_g);
				_repaint();
			}
		});*/
  } 
  /*private void _repaint()
  {
	  //this.repaint();
	  this.doLayout();
  }*/
  public void paintComponent (Graphics g)
  { 
	  /*if(this._g == null )
		  this._g = g;
	  else
		  this.repaint();*/
	   super.paintComponent (g); 
	
	   // Use the image width & height to find the starting point
	   //int imgX = getSize ().width/2 - img.getWidth (this); 
	   //int imgY = getSize ().height/2 - img.getHeight (this);
	
	   //Draw image centered in the middle of the panel
	   g.drawImage (img, 0, 0, this); 
	   //this.setSize(g.getClipRect().width, g.getClipRect().height);
	   //this.setBounds(this.getBounds().x, this.getBounds().y,g.getClipRect().width, g.getClipRect().height);
  } // paintComponent

} // DrawingPanel 