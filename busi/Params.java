package busi;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import common.XMLvar;
import gui.components.chkBox;

public class Params {

	


	private String localpathA = new XMLvar().XMLvar("appsettings.xml", this, "app_path", 0);
	
	//private String localpathB = "C:\\Users\\Geoff\\Documents\\Seats\\";
	
	public static JCheckBoxMenuItem menu2Item1;
	public static JCheckBoxMenuItem menu2Item2;
	

	//private JTextField OutPathField;

	private JLabel ConsoleMessages_Label;
	
	private JButton button_btn;
	public JButton Go_btn;
	
	public static ArrayList<JCheckBox> chkBoxesArray = new ArrayList<JCheckBox>(10);
	
	public static JTextField LoadPath_Field;
	private JTextField SavePath_Field;
	private JTextField FindThis_Field; 
	private JTextField ReplaceWithThis_Field; 
	
	private JTextField OutPath_Field;
	
	
	private JComboBox SaveSearches;
	private JComboBox SaveReplaced;
	private JComboBox SurroundWith;
	
	private String FindThis;
	private String ReplaceWithThis = "-";
	private String InputPath = "Not Set";
	private String OutputPath = "Not Set";
	private String OutputFolder = "Not Set";
	private String Folder = "_RESULTS_\\";
	private String ConsoleMessages ="";
	private String ConsoleMessagesTitle ="          MESSAGES> ";
	
	public Boolean FolderSearch = false;
	private Boolean FileNameSearch = false;
	private Boolean CharacterSearch = false;
	private Boolean PDFpath = false;
	private Boolean sourceFolder = false;


	private JCheckBox NameSearchCHBX;
	public JCheckBox FolderSearchCHB;


	
	private String app = "robocopy";
	private String quotes = "\"";
	private String gap = " ";
	private String NewLine = "\n\r";
	private String subDir = "/e";
	private String monitorMins = "/MOT:";
	
	public static JTextField BatchFileLocation_Field;
	public static JTextField BackupLocation_Field;
	public static JTextField FolderLocation_Field;
	public static JTextField FileNameSearch_Field;
	
	public JButton BatchFileLocation_btn;
	public JButton BackupLocation_btn;
	public JButton FolderLocation_btn;


	private String optionstring;


	public String getLocalpathA() {
		return localpathA;
	}


	public void setLocalpathA(String localpathA) {
		this.localpathA = localpathA;
	}


	public JCheckBoxMenuItem getMenu2Item1() {
		return menu2Item1;
	}


	public void setMenu2Item1(JCheckBoxMenuItem menu2Item1) {
		this.menu2Item1 = menu2Item1;
	}


	public JCheckBoxMenuItem getMenu2Item2() {
		return menu2Item2;
	}


	public void setMenu2Item2(JCheckBoxMenuItem menu2Item2) {
		this.menu2Item2 = menu2Item2;
	}


	public String getConsoleMessages_Label() {
		return ConsoleMessages_Label.getText();
	}


	public void setConsoleMessages_Label(String string) {
		ConsoleMessages_Label.setText(string);
	}


	public JButton getButton_btn() {
		return button_btn;
	}


	public void setButton_btn(JButton button_btn) {
		this.button_btn = button_btn;
	}


	public JButton getGo_btn() {
		return Go_btn;
	}


	public void setGo_btn(JButton go_btn) {
		Go_btn = go_btn;
	}


	public ArrayList<JCheckBox> getchkBoxesArray() {
		
		return (ArrayList<JCheckBox>) chkBoxesArray;
	}


	public void setchkBoxesArray(JCheckBox chk, int i) {
		
		Params.chkBoxesArray.set(i, chk);
	}


	public String getLoadPath_Field() {
		return LoadPath_Field.getText();
	}


	public void setLoadPath_Field(String text) {
		LoadPath_Field.setText(text); 	}


	public String getSavePath_Field() {
		return SavePath_Field.getText();
	}


	public void setSavePath_Field(String text) {
		SavePath_Field.setText(text);
	}


	public String getFindThis_Field() {
		return FindThis_Field.getText();
	}


	public void setFindThis_Field(String text) {
		FindThis_Field.setText(text);
	}


	public String getReplaceWithThis_Field() {
		return ReplaceWithThis_Field.getText();
	}


	public void setReplaceWithThis_Field(String string) {
		ReplaceWithThis_Field.setText(string);
	}


	public JTextField getFileNameSearch_Field() {
		return FileNameSearch_Field;
	}


	public void setFileNameSearch_Field(String string) {
		FileNameSearch_Field.setText(string);
	}


	public String getOutPath_Field() {
		return OutPath_Field.getText();
	}


	public void setOutPath_Field(String string) {
		OutPath_Field.setText(string);
	}


	public JComboBox getSaveSearches() {
		return SaveSearches;
	}


	public void setSaveSearches(JComboBox saveSearches) {
		SaveSearches = saveSearches;
	}


	public JComboBox getSaveReplaced() {
		return SaveReplaced;
	}


	public void setSaveReplaced(JComboBox saveReplaced) {
		SaveReplaced = saveReplaced;
	}


	public JComboBox getSurroundWith() {
		return SurroundWith;
	}


	public void setSurroundWith(JComboBox surroundWith) {
		SurroundWith = surroundWith;
	}


	public String getFindThis() {
		return FindThis;
	}


	public void setFindThis(String findThis) {
		FindThis = findThis;
	}


	public String getReplaceWithThis() {
		return ReplaceWithThis;
	}


	public void setReplaceWithThis(String replaceWithThis) {
		ReplaceWithThis = replaceWithThis;
	}


	public String getInputPath() {
		return InputPath;
	}


	public void setInputPath(String inputPath) {
		InputPath = inputPath;
	}


	public String getOutputPath() {
		return OutputPath;
	}


	public void setOutputPath(String outputPath) {
		OutputPath = outputPath;
	}


	public String getOutputFolder() {
		return OutputFolder;
	}


	public void setOutputFolder(String outputFolder) {
		OutputFolder = outputFolder;
	}


	public String getFolder() {
		return Folder;
	}


	public void setFolder(String folder) {
		Folder = folder;
	}


	public String getConsoleMessages() {
		return ConsoleMessages;
	}


	public void setConsoleMessages(String consoleMessages) {
		ConsoleMessages = consoleMessages;
	}


	public String getConsoleMessagesTitle() {
		return ConsoleMessagesTitle;
	}


	public void setConsoleMessagesTitle(String consoleMessagesTitle) {
		ConsoleMessagesTitle = consoleMessagesTitle;
	}


	public Boolean getFolderSearch() {
		return FolderSearch;
	}


	public void setFolderSearch(Boolean folderSearch) {
		FolderSearch = folderSearch;
	}


	public Boolean getFileNameSearch() {
		return FileNameSearch;
	}


	public void setFileNameSearch(Boolean fileNameSearch) {
		FileNameSearch = fileNameSearch;
	}


	public Boolean getCharacterSearch() {
		return CharacterSearch;
	}


	public void setCharacterSearch(Boolean characterSearch) {
		CharacterSearch = characterSearch;
	}


	public Boolean getPDFpath() {
		return PDFpath;
	}


	public void setPDFpath(Boolean pDFpath) {
		PDFpath = pDFpath;
	}


	public Boolean getSourceFolder() {
		return sourceFolder;
	}


	public void setSourceFolder(Boolean sourceFolder) {
		this.sourceFolder = sourceFolder;
	}


	public JCheckBox getNameSearchCHBX() {
		return NameSearchCHBX;
	}


	public void setNameSearchCHBX(JCheckBox nameSearchCHBX) {
		NameSearchCHBX = nameSearchCHBX;
	}


	public JCheckBox getFolderSearchCHB() {
		return FolderSearchCHB;
	}


	public void setFolderSearchCHB(JCheckBox folderSearchCHB) {
		FolderSearchCHB = folderSearchCHB;
	}


	public String getApp() {
		return app;
	}


	public void setApp(String app) {
		this.app = app;
	}


	public String getQuotes() {
		return quotes;
	}


	public void setQuotes(String quotes) {
		this.quotes = quotes;
	}


	public String getGap() {
		return gap;
	}


	public void setGap(String gap) {
		this.gap = gap;
	}


	public String getNewLine() {
		return NewLine;
	}


	public void setNewLine(String newLine) {
		NewLine = newLine;
	}


	public String getSubDir() {
		return subDir;
	}


	public void setSubDir(String subDir) {
		this.subDir = subDir;
	}


	public String getMonitorMins() {
		return monitorMins;
	}


	public void setMonitorMins(String monitorMins) {
		this.monitorMins = monitorMins;
	}


	public String getBatchFileLocation_Field() {
		return BatchFileLocation_Field.getText();
	}


	public void setBatchFileLocation_Field(String string) {
		BatchFileLocation_Field.setText(string);
	}


	public String getBackupLocation_Field() {
		return BackupLocation_Field.getText();
	}


	public void setBackupLocation_Field(String string) {
		BackupLocation_Field.setText(string); 
	}


	public JTextField getFolderLocation_Field() {
		return FolderLocation_Field;
	}


	public void setFolderLocation_Field(String string) {
		FolderLocation_Field.setText(string);}


	public JButton getBatchFileLocation_btn() {
		return BatchFileLocation_btn;
	}


	public void setBatchFileLocation_btn(JButton batchFileLocation_btn) {
		BatchFileLocation_btn = batchFileLocation_btn;
	}


	public JButton getBackupLocation_btn() {
		return BackupLocation_btn;
	}


	public void setBackupLocation_btn(JButton backupLocation_btn) {
		BackupLocation_btn = backupLocation_btn;
	}


	public JButton getFolderLocation_btn() {
		return FolderLocation_btn;
	}


	public void setFolderLocation_btn(JButton folderLocation_btn) {
		FolderLocation_btn = folderLocation_btn;
	}


	public String getOptionstring() {
		return optionstring;
	}


	public void setOptionstring(String optionstring) {
		this.optionstring = optionstring;
	}
	
	


	


	


	
	

	
}
