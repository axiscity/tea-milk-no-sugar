package busi;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import org.w3c.dom.NodeList;

import common.BBuilderConstants;
import common.SaveFile;
import common.SaveSettings;
import common.XMLoader;

public class record implements LoadSaveUpdate {
	
	@Override
	public
	 void makeRecord() {
		System.out.print("Make Record");
		
		
		
		ArrayList<String> outPutArray = new ArrayList<String>(10);
		
		outPutArray.add("<!-- \r\n" + 
				"BBFB Settings file\r\n" + 
				"www.persuasive-images.net/BBFB\r\n" + 
				" -->\n<bbfb>");
		
		String Line ="<setting type=\"mode\">";

		if(Params.menu2Item1.getState() == true) {
			Line = Line + "Xcopy";
		} else {
			Line = Line + "Robocopy";
		}
		Line = Line + "</setting>";
		outPutArray.add(Line);
		outPutArray.add("<setting type=\"title\">None</setting>");
		outPutArray.add("<setting type=\"target\">" + Params.FolderLocation_Field.getText() + "</setting>");
		outPutArray.add("<setting type=\"destination\">" + Params.BackupLocation_Field.getText() + "</setting>");
		outPutArray.add("<setting type=\"batchfile\">" + Params.BatchFileLocation_Field.getText() + "</setting>");
		
		String flags = "";
		
		for(int j = 0; j < Params.chkBoxesArray.size(); j++) {
			
			if (Params.chkBoxesArray.get(j).isSelected()) {
				flags = flags + Params.chkBoxesArray.get(j).getName();
				
				int chbxasize = Params.chkBoxesArray.size();
				
				//System.out.println("chbxasize:" + Params.chkBoxesArray.size() + "::j:" + j);
				
			}
			
			if(j == Params.chkBoxesArray.size() -1) {
				outPutArray.add("<setting type=\"flag\">" + flags + "</setting>");
			//	System.out.println("Adding Flags");
			}
			//System.out.println("Flags:" + flags + "::" + j + ":" + Params.chkBoxesArray.size() );			
		}

		outPutArray.add("</bbfb>");

		
		String outPuttxt = "";
		
		for(int i = 0; i < outPutArray.size(); i++) {
			
			//System.out.print("Output Array:" + i + outPutArray.size());
			
			outPuttxt = outPuttxt + outPutArray.get(i) + "\n";
			if(i == outPutArray.size() -1) {
				new SaveSettings(BBuilderConstants.saveFile, outPuttxt);
			}
		}
		
		
	}
	
	
	@Override
	public
	 void updateRecord() {
		
		System.out.print("Update Record");
		
	}
	
	@Override
	public void loadRecord() {
		// TODO Auto-generated method stub
		String varType;
		System.out.println("LOAD");
		NodeList LoadedRecords = new XMLoader().XMLoader(BBuilderConstants.loadFile, null, "setting");
		
		for (int i = 0; i < LoadedRecords.getLength(); i++) {
			
			varType = LoadedRecords.item(i).getAttributes().getNamedItem("type").getTextContent();
			
			
			if(varType.equalsIgnoreCase("mode")) {
				System.out.print("Mode" + LoadedRecords.item(i).getTextContent());
				String mode = LoadedRecords.item(i).getTextContent();
				if(mode.contains("Xcopy")) {
					Params.menu2Item1.setState(false);
					Params.menu2Item2.setState(true);
				} else {
					Params.menu2Item1.setState(true);
					Params.menu2Item2.setState(false);
				}
				//Params.FolderLocation_Field.setText(LoadedRecords.item(i).getTextContent());				
			}
			
			
			if(varType.equalsIgnoreCase("flag")) {
				
				String flags = LoadedRecords.item(i).getTextContent();
				String chkboxName = "";
				//if(flags.contains(s))
				//System.out.println(Params.chkBoxesArray.toString());
				
				for(int j = 0; j < Params.chkBoxesArray.size(); j++) {
					chkboxName = Params.chkBoxesArray.get(j).getName();
					//System.out.println("ChkBOX" + chkboxName);
					if(flags.contains(chkboxName)) {
						Params.chkBoxesArray.get(j).setSelected(true);
					} else {
						Params.chkBoxesArray.get(j).setSelected(false);
					}
				}
				
				//System.out.print("Batch file save path" + LoadedRecords.item(i).getTextContent());
				//Params.FileNameSearch_Field.setText(LoadedRecords.item(i).getTextContent());
			}
			
			
			if(varType.equalsIgnoreCase("target")) {
				System.out.print("Target to backup" + LoadedRecords.item(i).getTextContent());
				Params.FolderLocation_Field.setText(LoadedRecords.item(i).getTextContent());				
			}
			
			if(varType.equalsIgnoreCase("destination")) {
				System.out.print("Backup location" + LoadedRecords.item(i).getTextContent());
				Params.BackupLocation_Field.setText(LoadedRecords.item(i).getTextContent());
			}
			
			if(varType.equalsIgnoreCase("batchfile")) {
				System.out.print("Batch file save path" + LoadedRecords.item(i).getTextContent());
				Params.BatchFileLocation_Field.setText(LoadedRecords.item(i).getTextContent());
			}
			
			if(varType.equalsIgnoreCase("keyword")) {
				System.out.print("Batch file save path" + LoadedRecords.item(i).getTextContent());
				Params.FileNameSearch_Field.setText(LoadedRecords.item(i).getTextContent());
			}
			
			System.out.println(LoadedRecords.item(i).getAttributes().getNamedItem("type").getTextContent());
			
		}
		
		
	}
}
