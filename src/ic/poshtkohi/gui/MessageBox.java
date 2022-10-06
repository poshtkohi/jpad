/*
	All rights reserved to Alireza Poshtkohi (c) 1999-2022.
	Email: arp@poshtkohi.info
	Website: http://www.poshtkohi.info
*/

package ic.poshtkohi.gui;
import java.awt.*;
import java.awt.event.*;


import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;

public class MessageBox extends JDialog implements ActionListener {
    private JButton ok,can;
    public boolean isOk = false;

    /*
     * @param frame   parent frame 
     * @param msg     message to be displayed
     * @param okcan   true : ok cancel buttons, false : ok button only 
     */
    public MessageBox(JDesktopPane frame, String msg, boolean okcan){
        //super(frame, "Message", true);
        setLayout(new BorderLayout());
        add("Center",new Label(msg));
        addOKCancelPanel(okcan);
        createFrame();
        pack();
        setVisible(true);
    }
    
    public MessageBox(JDesktopPane frame, String msg){
        this(frame, msg, false);
    }
    
    void addOKCancelPanel( boolean okcan ) {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        createOKButton( p );
        if (okcan == true)
            createCancelButton( p );
        add("South",p);
    }

    void createOKButton(JPanel p) {
        p.add(ok = new JButton("OK"));
        ok.addActionListener(this); 
    }

    void createCancelButton(JPanel p) {
        p.add(can = new JButton("Cancel"));
        can.addActionListener(this);
    }

    void createFrame() {
        Dimension d = getToolkit().getScreenSize();
        setLocation(d.width/3,d.height/3);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == ok) {
            isOk = true;
            setVisible(false);
        }
        else if(ae.getSource() == can) {
            setVisible(false);
        }
    }
    
 
}
