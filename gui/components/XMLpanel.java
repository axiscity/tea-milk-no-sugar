package gui.components;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import org.w3c.dom.NodeList;

import busi.Params;
import common.XMLoader;


public class XMLpanel {	
	
	public XMLpanel(JPanel panel, Dimension dim, Params params){

		NodeList nList = new XMLoader().XMLoader("appsettings.xml", params, "sw");
		//ArrayList<JCheckBox> chkBoxesArray = new ArrayList<JCheckBox>(10);
		JCheckBox chk = new JCheckBox();
		
		
		for (int i = 0; i < nList.getLength(); i++) {
			System.out.println("DD" + nList.item(i).getTextContent() + i);
			
			String chkValue = nList.item(i).getTextContent();
			String chkToolTip = nList.item(i).getAttributes().getNamedItem("txt").getTextContent();
			//dd.addItem(nList.item(i).getTextContent());;
			chk = new chkBox().chkBox(dim, true, chkValue, chkToolTip, params, i);		
			panel.add(chk);
			//System.out.println("chkNAME:" + chk.getName());
			//chkBoxesArray.add(chk);
			//System.out.println("Blah:" + i);
			Params.chkBoxesArray.add(chk);
			
			
		}
	}
	

}
