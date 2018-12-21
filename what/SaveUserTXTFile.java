package what;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import engine.Params;

public class SaveUserTXTFile {


	public String FilePath;
	public String buttonName;
	private JButton btn = null;
	
	public SaveUserTXTFile(JButton BTN, String DiagTitle, Params params) {
		
		super();
		
		btn = BTN;

		buttonName = btn.getText();
		
		// TODO Auto-generated constructor stub

		
		//MouseListener click = new click();
		BTN.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {
		        System.out.println("Clicked!" + buttonName);
		        BTNclick(params.FolderSearch, DiagTitle, params);
		    }
		});
	
	}
	
	
	
	private void BTNclick(boolean folderMode, String DiagTitle, Params params) {
		
        //JFileChooser rfc = new JFileChooser(params.localpath);
        //rfc.setDialogTitle(DiagTitle);
        //rfc.showSaveDialog(rfc);

        
        JFileChooser fileChooser = new JFileChooser(params.localpath);
        fileChooser.setDialogTitle("Specify a file to save");   
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Batch File","bat");
        fileChooser.addChoosableFileFilter(filter);
        File file = fileChooser.getSelectedFile();
         
        int userSelection = fileChooser.showSaveDialog(btn.getParent());
         
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            //System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            params.BatchFileLocation_Field.setText(fileToSave.getAbsolutePath() + ".bat");
            

            
        }
        
        //rfc.showOpenDialog(btn.getParent());
		
	}
	
	
}


