package gui;

import java.awt.Dimension;

import javax.swing.JButton;

public class jBtn extends JButton{
	
	public JButton jBtn(Dimension xy, Boolean size, String txt){
		
		JButton JB = new JButton();
		
		JB.setText(txt);
		
		if(size){
			
			
			JB.setPreferredSize(xy);
			
		}
		
		
		return JB;
		
	}
	
	

}
