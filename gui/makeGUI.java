package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import engine.Params;
import what.BrowseButtonListener;
import what.ButtonListener;
import what.CheckBoxListener;
import what.DoWorkBTN;
import what.SaveUserTXTFile;
import what.TextAreaListener;
import what.jcmBoListener;
import layout.GridLayout2;


public class makeGUI extends JFrame

{
	
private static final int WIDTH = 700;
private static final int HEIGHT = 400;

private JCheckBox FolderMode, BadCharSearch, SetPDF, SetSource, NameSearchCHBX, SearchDropDownListCHBX, ReplaceDropDownListCHBX;
public JTextField FolderPath_Field, OutPutPath, FileNameSearch_Field, BackupLocation_Field, BatchFileLocation_Field, FolderLocation_Field;
private JButton BackupLocation_btn, Go_btn, BatchFileLocation_btn, FolderLocation_btn, Replace_btn, Scrape_btn;
public JComboBox<?> SaveSearches, SaveReplaced, SurroundWith;

private JLabel OutPath_Field;
private JPanel UpperPanel = new JPanel();	
private JPanel LowerPanel = new JPanel();	

public Params BPs = new Params();


public makeGUI()

{
   
	Dimension Upanel_sz = new Dimension(700, 600);
	Dimension Lpanel_sz = new Dimension(700, 50);
	
	Dimension col0 = new Dimension(10, 10);
	Dimension col1 = new Dimension(115, 10);
	Dimension col2 = new Dimension(425, 10);
	Dimension col3 = new Dimension(135, 10);
	Dimension col4 = new Dimension(10, 10);
	
    setTitle("BBFB - Backup Batch File Builder");
    setSize(WIDTH, HEIGHT);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    
    this.setLayout(new GridLayout2(0, 1));

    
    new MenuBar(this);
    
    JComponent[] c = new JComponent[45];
    
	c[0] = new Spacer().Spacer(col0, this, true, "1");
	c[1] = new Spacer().Spacer(col1, this, true, "1");
	c[2] = new Title().Title(col2, true, "", "Creates batch files for repeat tasks quickly & easily");
	c[3] = new Spacer().Spacer(col3, this, true, "1");
	c[4] = new Spacer().Spacer(col4, this, true, "1");
	
	c[5] = new Spacer().Spacer(col0, this, true, "1");
	c[6] = new Title().Title(col1, true, "R", "Folder to back up:");
	c[7] = FolderLocation_Field = new txtField().txtField(col2, true, "1");
	c[8] = FolderLocation_btn = new jBtn().jBtn(col3, true, "Set Location");
	c[9] = new Spacer().Spacer(col4, this, true, "1");
	
	c[10] = new Spacer().Spacer(col0, this, true, "1");
	c[11] = new Title().Title(col1, true, "R", "Backup Location:");
	c[12] = BackupLocation_Field = new txtField().txtField(col2, true, "1");
	c[13] = BackupLocation_btn = new jBtn().jBtn(col3, true, "Backup Location");
	c[14] = new Spacer().Spacer(col4, this, true, "1");
	
	c[15] = new Spacer().Spacer(col0, this, true, "1");
	c[16] = new Title().Title(col1, true, "R", "Set Batch file path:");
	c[17] = BatchFileLocation_Field = new txtField().txtField(col2, true, "1");
	c[18] = BatchFileLocation_btn = new jBtn().jBtn(col3, true, "Save Batch File");
	c[19] = new Spacer().Spacer(col4, this, true, "1");
	
	
	c[20] = new Spacer().Spacer(col0, this, true, "1");
	c[21] = new Title().Title(col1, true, "R", "Find in name(s):");
	c[22] = FileNameSearch_Field = new txtField().txtField(col2, true, "1");
	c[23] = NameSearchCHBX = new jchkBox().jchkBox(col3, true, "File Name Search");
	c[24] = new Spacer().Spacer(col4, this, true, "1");
	
	
	c[25] = new Spacer().Spacer(col0, this, true, "1");
	c[26] = new Title().Title(col1, true, "R", "Batch message:");
	c[27] = SaveReplaced = new dropDown().dropDown(col2, "Settings\\savedReplaced.xml");
	c[28] = new Spacer().Spacer(col3, this, true, "1");
	c[29] = new Spacer().Spacer(col4, this, true, "1");
	
	
	c[30] = new Spacer().Spacer(col0, this, true, "1");
	c[31] = new Title().Title(col1, true, "R", "Surround With:");
	c[32] = SurroundWith = new dropDown().dropDown(col2, "Settings\\surroundWith.xml");
	c[33] = new Spacer().Spacer(col3, this, true, "1");
	c[34] = new Spacer().Spacer(col4, this, true, "1");
	
	
	c[35] = new Spacer().Spacer(col0, this, true, "1");
	c[36] = new Title().Title(col1, true, "R", "Folder to backup:");
	c[37] = SaveSearches = new dropDown().dropDown(col2, "Settings\\savedSearches.xml");
	c[38] = FolderMode = new jchkBox().jchkBox(col3, true, "Search Folder");
	c[39] = new Spacer().Spacer(col4, this, true, "1");
	
	c[40] = new Spacer().Spacer(col0, this, true, "1");
	c[41] = new Title().Title(col1, true, "R", "Output:");
	c[42] = OutPath_Field = new Title().Title(col2, true, "", "\\Results\\");
	c[43] = Go_btn = new jBtn().jBtn(col3, true, "Save .BAT");
	c[44] = new Spacer().Spacer(col4, this, true, "1");
	
	
	//FindThis_Field.setName("FindField");
	
	//this.add(SaveSearches);
	
	//FileNameSearch_Field.setEnabled(false);
	//FileNameSearch_Field.setBackground(new Color(240,240,240));
	
	
	new SaveUserTXTFile(BatchFileLocation_btn, "Save Batch File", BPs);
	BPs.BatchFileLocation_Field = BatchFileLocation_Field;
	BPs.BatchFileLocation_btn = BatchFileLocation_btn;
	
	BPs.FolderLocation_Field = FolderLocation_Field; 
	BPs.FolderLocation_btn = FolderLocation_btn;
	new BrowseButtonListener(FolderLocation_btn, "Folder to backup", BPs);
	
	BPs.BackupLocation_btn  = BackupLocation_btn;
	BPs.BackupLocation_Field = BackupLocation_Field;
	new BrowseButtonListener(BackupLocation_btn, "Backup to here", BPs);
	
	new DoWorkBTN(Go_btn, BPs, null);
	BPs.Go_btn = Go_btn;
	
	
	//SPs.SurroundWith = SurroundWith;
	//SurroundWith.setName("SurroundWith");
	
	//SPs.FindThis_Field = FindThis_Field;
	
	//SaveSearches.setName("FindSave");
	//SPs.SaveSearches = SaveSearches;
	
	//SPs.ReplaceWithThis_Field = Replace_Field;
	
	//SaveReplaced.setName("ReplaceSave");
	//SPs.SaveReplaced = SaveReplaced;
	
	//SPs.FileNameSearch_Field = FileNameSearch_Field;
	//SPs.InputPath_Field = InputPath_Field;
	//SPs.OutPath_Field = OutPath_Field;
	//SPs.Go_btn = Go_btn;
	
	//SPs.NameSearchCHBX = NameSearchCHBX;
	//SPs.FolderSearchCHB = FolderMode;
	
	/// Build Interface
	
    int j = 0;
    
    for (int i = 0; i < c.length; i++) {
    	
    	UpperPanel.add(c[i]);
    	j = j + 1;
    	
	}

    /// Set Layout
    UpperPanel.setSize(Upanel_sz);
    UpperPanel.setMaximumSize(Upanel_sz);
    UpperPanel.setLayout(new GridLayout2(9, 5, 5, 5));
    this.add(UpperPanel);

   
   
    LowerPanel.setSize(Lpanel_sz);
    LowerPanel.setMaximumSize(Lpanel_sz);
    LowerPanel.setLayout(new GridLayout2(2, 5, 5, 5));
    new XMLpanel(LowerPanel, new Dimension(10, 10), BPs);
    this.add(LowerPanel);
    
    /// Add Listeners
    
    //CheckBoxListener chbox = 
    
    //SearchDropDownListCHBX.setName("SDD");
    //ReplaceDropDownListCHBX.setName("RDD");
    
    //new CheckBoxListener(SearchDropDownListCHBX, SPs, this, SaveSearches, FindThis_Field);
    //new CheckBoxListener(ReplaceDropDownListCHBX, SPs, this, SaveReplaced, Replace_Field);
    
   // new TextAreaListener(FileNameSearch_Field, BPs, "Blah");
    
/*    new CheckBoxListener(NameSearchCHBX, SPs, this, null, null);
    new CheckBoxListener(FolderMode, SPs, this, null, null);
    
   
    new BrowseButtonListener(BrowseNewPath, "Browse for file(s)", SPs);
    
    new ButtonListener(SaveSettings_btn, SPs, this);
    new ButtonListener(Go_btn, SPs, this);
    
    new jcmBoListener(SaveSearches, SPs);
    new jcmBoListener(SaveReplaced, SPs);
    new jcmBoListener(SurroundWith, SPs);*/
    
 
    
    //Go_btn.setEnabled(false);
    
    
}

}



