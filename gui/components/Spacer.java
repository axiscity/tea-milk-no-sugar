package gui.components;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import gui.makeGUI;



public class Spacer extends JLabel{

	public JLabel Spacer(Dimension xy, makeGUI makeGUI, boolean size, String txt) {
		// TODO Auto-generated constructor stub
		
		txt ="";
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		JLabel spacer = new JLabel(txt, SwingConstants.CENTER);
		
		if (size){
			spacer.setPreferredSize(xy);
			//spacer.setBorder(blackline);
			//makeGUI.add(spacer);
		
			//System.out.println("Hello");
			
			
		} else {
			
		}
		return spacer;
		
		
	}



		
		
		
	}
	
