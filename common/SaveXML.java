package common;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import busi.Params;

public class SaveXML {
	
	public SaveXML(String FileName, Params SPs) {
		
		
		
		File file = new File(FileName);
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
		        .newInstance();
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

		

		Node saveNode = null;

	    saveNode = document.createElement("search");
	    
	    if(FileName=="savedSearches.xml"){
	    	
	    	saveNode.setTextContent(SPs.getFindThis());
	    	System.out.println("Save Search > FindThis:" + SPs.getFindThis());
	    	
	    } else { if (FileName=="savedReplaced.xml")
	    {
	    	
	    	saveNode.setTextContent(SPs.getReplaceWithThis());
	    
	    }
	    	
	    	
	    }
	    

		document.getFirstChild().appendChild(saveNode);

		
        StreamResult console = new StreamResult(System.out);
        StreamResult file1 = new StreamResult(new File(FileName));

        //write data
        
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
		try {
			transformer = transformerFactory.newTransformer();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //for pretty print
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(document);
        
        
        try {
			transformer.transform(source, console);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			transformer.transform(source, file1);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("DONE");

		
		
	}
	

}
