package gui.listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import busi.Params;

import javax.swing.FocusManager;





public class TextAreaListener {

	public String TXTvalue = "";
	
	public TextAreaListener(JTextField TF, Params searchparams, String TFname) {
		super();
	
		
		TF.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {

	        	
	        	searchparams.setFindThis(TF.getText());
	        	System.out.println("TF" + TF.getText());
	        	
	        	
	        }
	        
	        public void mouseExited(MouseEvent e)
	        {

	        	
	            
                if(TFname == "FindField") {
                	
                	System.out.println("THIS:" + TF.getText());
                	
                	searchparams.setFindThis(TF.getText());
                	searchparams.setFindThis_Field(TF.getText());
                	
                } else if (TFname == "Replace") {
                	
                	searchparams.setReplaceWithThis(TF.getText());
                	searchparams.setReplaceWithThis_Field(TF.getText());
                }
	            
	            
	        }
	        
	        
	        
	        
	        
	        
	    });
	

		}
		   
	}