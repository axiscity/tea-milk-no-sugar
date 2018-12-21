package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JCheckBox;



public class jchkBox extends JCheckBox{

	
	public JCheckBox cb;
	
	public JCheckBox jchkBox(Dimension xy, Boolean size, String txt){
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		JLabel spacer = new JLabel(txt, SwingConstants.CENTER);
		
	    cb = new JCheckBox();
	    cb.setPreferredSize(xy);
		cb.setText(txt);
		
		if (size){
			spacer.setPreferredSize(xy);
			//spacer.setBorder(blackline);
		} else {
			
		}
		
		return cb;

	}

	
}