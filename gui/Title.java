package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;



public class Title extends JLabel{

	public JLabel Title(Dimension xy, boolean size, String justify, String txt) {
		// TODO Auto-generated constructor stub

		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		JLabel Title = new JLabel(txt, SwingConstants.CENTER);
		
		if (justify == "R"){
			
			Title.setHorizontalAlignment(SwingConstants.RIGHT);
			
		}
		
		
		if (size){
			 Title.setPreferredSize(xy);
			 //Title.setBorder(blackline);
		} else {
			
		}
		
		return Title;
		
	}
	
}
