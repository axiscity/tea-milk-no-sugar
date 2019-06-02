package common;

import org.w3c.dom.NodeList;

import busi.Params;

public class XMLvar {

	private static final String[] ArrayResult = null;

	public String XMLvar(String xmlPath, Params params, String TagName, int i) {
		// TODO Auto-generated constructor stub
		
		NodeList nList = null;
		String result = null;
		
		nList = new XMLoader().XMLoader(xmlPath, params, TagName, ArrayResult);
		result = nList.item(i).getTextContent();
		
		
		
		result = result.replaceAll("\\\\", "\\\\\\\\");
		
		String[] split = result.split("_");
		StringBuilder sb = new StringBuilder();
		
		System.out.println("RESULT::" + result + ":::" + nList.getLength() + nList.toString());
		
		return result;
		
	}

}
