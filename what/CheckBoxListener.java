package what;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import engine.Params;
import engine.Utils;



public class CheckBoxListener {

	public CheckBoxListener(JCheckBox checkBox, Params params, JFrame gui, Component comp1, Component comp2) {
		super();
		// TODO Auto-generated constructor stub
	
	
		
		ItemListener listener = new ItemListener()
		{
		    public void itemStateChanged(ItemEvent event)
		    {
		        JCheckBox checkBox = (JCheckBox)event.getSource();	       
		        System.out.println(checkBox.getText());
		        params.setFolderSearch(checkBox.isSelected());
	        
		        if(checkBox.getText() == "Search Folder"){
		        	params.setFolderSearch(checkBox.isSelected());
		        	
		        	if(params.getFolderSearch()) {
		        		
		        		System.out.println("Trim:" + params.getOutputPath());
		        		params.setOutputPath(new Utils().PathSplitter(params));
		        		params.setOutPath_Field(params.getOutputPath() + params.getFolder());
		        	}
		        	
		        }
		        
		        
		        
		        
		        
		        
		        
		        
		        if(checkBox.getText() == "File Name Search"){
		        	
		        	
		        	if(checkBox.isSelected()){

		        	params.setFileNameSearch(true);
		        	params.FileNameSearch_Field.setEnabled(true);
		        	params.FileNameSearch_Field.setBackground(new Color(255,255,255));
		        	params.FolderSearchCHB.setSelected(true);
		        	params.FolderSearch = true;
		 
		        	
		        	} else {
		        		
		        		params.setFileNameSearch(false);
		        		params.FileNameSearch_Field.setEnabled(false);
		        		params.FileNameSearch_Field.setBackground(new Color(240,240,240));
		        		params.FolderSearchCHB.setSelected(false);
		        		params.FolderSearch = false;
		        	}
		        
		        } 

		        
		        
	        	if (checkBox.getName() == "SDD") {
	        		
	        		if(checkBox.isSelected()){
	        			comp1.setEnabled(true);
	        			comp1.setBackground(new Color(255,255,255));
	        			comp2.setBackground(new Color(240,240,240));
	        			//comp2.setEnabled(false);
	        			
	        		} else {
	        			//comp1.setEnabled(false);
	        			comp1.setBackground(new Color(240,240,240));
	        			comp2.setEnabled(true);
	        			comp2.setBackground(new Color(255,255,255));
	        		}

	        	}
	        	
	        	
	        	
	        	
		        if (checkBox.getName() == "RDD") {
	        		
	        		if(checkBox.isSelected()){
	        			comp1.setEnabled(true);
	        			comp1.setBackground(new Color(255,255,255));
	        			comp2.setBackground(new Color(240,240,240));
	        			//comp2.setEnabled(false);
	        		} else {
	        			//comp1.setEnabled(false);
	        			comp1.setBackground(new Color(240,240,240));
	        			comp2.setEnabled(true);
	        			comp2.setBackground(new Color(255,255,255));
	        	}	
		        }
	        	
		        
		        
		        if(checkBox.getText() == "Bad Character Search"){
		        	params.setCharacterSearch(checkBox.isSelected());
		        }
		        

		        
		        
		    }
		    
		    
		};
		
		
		checkBox.addItemListener(listener);
		
		
	}
	

	
	
}




