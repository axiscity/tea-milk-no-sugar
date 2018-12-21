package what;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Utils.BuildOutput;
import engine.Params;

public class DoWorkBTN {

	public DoWorkBTN(JButton button_btn, Params params, JFrame guid){
		
		
		button_btn.addActionListener(new ActionListener() { 
			
			
			
			  public void actionPerformed(ActionEvent e) { 
				  
				  
				  System.out.println("Get Path" + button_btn.getText());
				  new BuildOutput(params);
				  
			  }
		
		
	}
	);
	
}
}
