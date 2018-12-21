package what;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.FocusManager;

import engine.Params;





public class TextAreaListener {

	public String TXTvalue = "";
	
	public TextAreaListener(JTextField TF, Params searchparams, String TFname) {
		super();
	
		
		TF.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {

	        	
	        	searchparams.FindThis = TF.getText();
	        	System.out.println("TF" + TF.getText());
	        	
	        	
	        }
	        
	        public void mouseExited(MouseEvent e)
	        {

	        	
	            
                if(TFname == "FindField") {
                	
                	System.out.println("THIS:" + TF.getText());
                	
                	searchparams.FindThis = TF.getText();
                	searchparams.FindThis_Field.setText(TF.getText());
                	
                } else if (TFname == "Replace") {
                	
                	searchparams.ReplaceWithThis = TF.getText();
                	searchparams.ReplaceWithThis_Field.setText(TF.getText());
                }
	            
	            
	        }
	        
	        
	        
	        
	        
	        
	    });
	

		}
		   
	}