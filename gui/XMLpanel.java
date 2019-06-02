package gui;

import java.awt.Dimension;
import engine.Params;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import org.w3c.dom.NodeList;
import parsers.XMLoader;


public class XMLpanel {	
	
	XMLpanel(JPanel panel, Dimension dim, Params params){

		NodeList nList = new XMLoader().XMLoader("appsettings.xml", params, "sw", params.getChkvalueArray());
	
		for (int i = 0; i < nList.getLength(); i++) {
			System.out.println("DD" + nList.item(i).getTextContent() + i);
			
			String chkValue = nList.item(i).getTextContent();
			String chkToolTip = nList.item(i).getAttributes().getNamedItem("txt").getTextContent();
			//dd.addItem(nList.item(i).getTextContent());;
		
			JCheckBox chk = new chkBox().chkBox(dim, true, chkValue, chkToolTip, params, i);
			
			panel.add(chk);
			
		}
	}
	

}
