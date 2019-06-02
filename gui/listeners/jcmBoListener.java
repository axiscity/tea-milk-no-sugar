package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import busi.Params;



public class jcmBoListener{
	
	JComboBox combo = null;
	
	public jcmBoListener(JComboBox combo, Params params){
		
		combo = combo;
		
		combo.addActionListener(
				
				 new ActionListener(){
				        public void actionPerformed(ActionEvent e){
				            JComboBox combo = (JComboBox)e.getSource();
				            
				            
				            System.out.println(combo.getName());
				            
				            if(combo.getName() == "FindSave"){
				            	
				            	 params.setFindThis_Field(combo.getSelectedItem().toString());
				            	
				            }
				            
				            if(combo.getName() == "ReplaceSave"){
				            	
				            	 params.setReplaceWithThis_Field(combo.getSelectedItem().toString());
				            	
				            }
				            
				            
				            if(combo.getName() == "SurroundWith"){
				            	
				            	System.out.println("SurroundWith");
				            	
				            	String text = params.getReplaceWithThis_Field();
				            	
				            	String surround = combo.getSelectedItem().toString();
				            	
				            	String left = surround.substring(0, surround.length() - 1);
				            	String right = surround.substring(surround.length() - 1);

				            	
				            	params.setReplaceWithThis_Field(left + text + right);
				            	params.setReplaceWithThis(left + text + right);
				            	
				            }
				            
				            
				        	};		
				 }
				 );
}
}
