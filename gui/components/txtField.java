package gui.components;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;



public class txtField extends JLabel{

	
	public JTextField tf;
	
	public JTextField txtField(Dimension xy, Boolean size, String txt){
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		JLabel spacer = new JLabel(txt, SwingConstants.CENTER);
		
	    tf = new JTextField();
	    tf.setPreferredSize(xy);
		
		
		if (size){
			spacer.setPreferredSize(xy);
			//spacer.setBorder(blackline);
		} else {
			
		}
		
		return tf;

	}

	
}
