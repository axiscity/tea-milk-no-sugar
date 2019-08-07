package gui.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import busi.Params;
import busi.Utils;

public class chkBox extends JCheckBox {

	public JCheckBox chkBox(Dimension xy, Boolean size, String chkValue, String chkToolTip, Params params, int i) {
		// TODO Auto-generated constructor stub
		
		//System.out.println(xy + ":" + size + ":" + chkValue + ":" + chkToolTip + ":" + i);
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		JLabel spacer = new JLabel(chkValue, SwingConstants.CENTER);
		
	    JCheckBox cb = new JCheckBox();
	    cb.setPreferredSize(xy);
		cb.setText(chkValue);
		cb.setName(chkValue);
		
		
		
		
		ItemListener listener = new ItemListener()
		{
		    public void itemStateChanged(ItemEvent event)
		    {
		        JCheckBox checkBox = (JCheckBox)event.getSource();	       
		        System.out.println(checkBox.getText() + i);
		        
		        String chkBoxVal = "" + checkBox.getText();
		        System.out.println(chkBoxVal + i);
		        String options = "";
		        
		        if(checkBox.isSelected()){
		        params.chkvalueArray[i] = chkBoxVal;
		        //params.setChkvalueArray(cb.getText(), i);
		        
		        } else {
		        params.setChkvalueArray(null, i);
		        }
		        
		        for (int i=0; i< params.chkvalueArray.length ; i++) {
		        	
		        	System.out.println(params.chkvalueArray[i] + i);
		        	
		        }
		        
		        
				/*
				 * for (int i=0; i< params.getChkvalueArray().size() ; i++){ options = options +
				 * params.getChkvalueArray().get(i);
				 * 
				 * if(i<=params.getChkvalueArray().size()){
				 * 
				 * params.setOptionstring(options);
				 * System.out.println(params.getOptionstring()); }
				 * 
				 * }
				 */
		        
		        };	
		        
		}
		    
		;  
		
		
		cb.addItemListener(listener);
		
		if (size){
			spacer.setPreferredSize(xy);
			spacer.setBorder(blackline);
		} else {
			
		}

		return cb;
		
		
	}

}
	

