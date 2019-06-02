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
		        //params.chkvalueArray[i] = cb.getText();
		        
		        params.setChkvalueArray(cb.getText(), i);
		        
		        } else {
		        params.setChkvalueArray("", i);
		        }
		        
		        
		        
		        for (int i=0; i< params.getChkvalueArray().length ; i++){
		     

		        	
		        	options = options + params.getChkvalueArray()[i];
		        	
		        	if(i<=params.getChkvalueArray().length){
		        		
		        		params.setOptionstring(options);
		        		System.out.println(params.getOptionstring());
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
	

