package common;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import busi.Params;
import gui.components.chkBox;

public class XMLoader {

	
	public NodeList XMLoader(String filename, Params params, String tagName){
		
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
		
		NodeList nList = document.getElementsByTagName(tagName);
		
		//strngArray = new String[nList.getLength()];

        for (int i=0; i < nList.getLength() ; i++){

        	//strngArray[i] = "";
        	BBuilderConstants.settings.add(nList.item(i).getNodeValue());
        	//System.out.print(nList.item(i).getNodeValue());
        	
        	}

        
		
		
		return nList;
		
		
	}

	
	
	
}
