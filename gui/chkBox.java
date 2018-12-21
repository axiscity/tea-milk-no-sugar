package gui;

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

import engine.Params;
import engine.Utils;

public class chkBox extends Component {

	public JCheckBox chkBox(Dimension xy, Boolean size, String chkValue, String chkToolTip, Params params, int i) {
		// TODO Auto-generated constructor stub
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		JLabel spacer = new JLabel(chkValue, SwingConstants.CENTER);
		
	    JCheckBox cb = new JCheckBox();
	    cb.setPreferredSize(xy);
		cb.setText(chkValue);
		
		
		
		
		ItemListener listener = new ItemListener()
		{
		    public void itemStateChanged(ItemEvent event)
		    {
		        JCheckBox checkBox = (JCheckBox)event.getSource();	       
		        System.out.println(checkBox.getText() + i);
		        
		        String options = "";
		        
		        if(cb.isSelected()){
		        params.chkvalueArray[i] = cb.getText();
		        } else {
		        	
		        params.chkvalueArray[i] = "";	
		        }
		        for (int i=0; i<params.chkvalueArray.length ; i++){
		     

		        	
		        	options = options + params.chkvalueArray[i];
		        	
		        	if(i<=params.chkvalueArray.length){
		        		
		        		params.optionstring = options;
		        		System.out.println(params.optionstring);
		        	}

		        }
		        
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
	

