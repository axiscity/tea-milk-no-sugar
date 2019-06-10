package gui.components;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class dropDown extends JComboBox{
	
	JComboBox dd = new JComboBox();
	
	public JComboBox dropDown(Dimension xy, String filename){
		
		
		dd.setPreferredSize(xy);
		//dd.setEnabled(false);
		
		dd.addItem("Saved Searches");
		
		File file = new File(filename);
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = null;
		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document document = null;
		try {
			document = documentBuilder.parse(file);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		NodeList nList = document.getElementsByTagName("search");

		
		int length = nList.getLength() - 1;
		
		
		
		for (int i = length; i > -1; i--) {
			//System.out.println("DD" + length);
			dd.addItem(nList.item(i).getTextContent());;
			
		}
		
		//String usr = document.getElementsByTagName("user").item(0).getTextContent();
		//String pwd = document.getElementsByTagName("password").item(0).getTextContent();

		return dd;
		
	}
	

}
