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
		        params.FolderSearch = checkBox.isSelected();
	        
		        if(checkBox.getText() == "Search Folder"){
		        	params.FolderSearch = checkBox.isSelected();
		        	
		        	if(params.FolderSearch) {
		        		
		        		System.out.println("Trim:" + params.OutputPath);
		        		params.OutputPath = new Utils().PathSplitter(params);
		        		params.OutPath_Field.setText(params.OutputPath + params.Folder);
		        	}
		        	
		        }
		        
		        
		        
		        
		        
		        
		        
		        
		        if(checkBox.getText() == "File Name Search"){
		        	
		        	
		        	if(checkBox.isSelected()){

		        	params.FileNameSearch = true;
		        	params.FileNameSearch_Field.setEnabled(true);
		        	params.FileNameSearch_Field.setBackground(new Color(255,255,255));
		        	params.FolderSearchCHB.setSelected(true);
		        	params.FolderSearch = true;
		 
		        	
		        	} else {
		        		
		        		params.FileNameSearch = false;
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
		        	params.CharacterSearch = checkBox.isSelected();
		        }
		        

		        
		        
		    }
		    
		    
		};
		
		
		checkBox.addItemListener(listener);
		
		
	}
	

	
	
}




