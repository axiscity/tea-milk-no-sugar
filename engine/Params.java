package engine;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Params {

	




	public String localpath = "";
	

	//public JTextField OutPathField;

	public JLabel ConsoleMessages_Label;
	
	public JButton button_btn;
	public JButton Go_btn;
	
	public String[] chkvalueArray;
	
	public JTextField LoadPath_Field;
	public JTextField SavePath_Field;
	public JTextField FindThis_Field; 
	public JTextField ReplaceWithThis_Field; 
	public JTextField FileNameSearch_Field;
	public JTextField OutPath_Field;
	
	
	public JComboBox SaveSearches;
	public JComboBox SaveReplaced;
	public JComboBox SurroundWith;
	
	public String FindThis;
	public String ReplaceWithThis = "-";
	public String InputPath = "Not Set";
	public String OutputPath = "Not Set";
	public String OutputFolder = "Not Set";
	public String Folder = "_RESULTS_\\";
	public String ConsoleMessages ="";
	public String ConsoleMessagesTitle ="          MESSAGES> ";
	
	public Boolean FolderSearch = false;
	public Boolean FileNameSearch = false;
	public Boolean CharacterSearch = false;
	public Boolean PDFpath = false;
	public Boolean sourceFolder = false;


	public JCheckBox NameSearchCHBX;
	public JCheckBox FolderSearchCHB;


	
	public String app = "robocopy";
	public String quotes = "\"";
	public String gap = " ";
	public String NewLine = "\n\r";
	public String subDir = "/e";
	public String monitorMins = "/MOT:";
	
	public JTextField BatchFileLocation_Field;
	public JTextField BackupLocation_Field;
	public JTextField FolderLocation_Field;

	public JButton BatchFileLocation_btn;
	public JButton BackupLocation_btn;
	public JButton FolderLocation_btn;


	public String optionstring;


	


	


	
	

	
}
