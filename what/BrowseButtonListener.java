package what;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileFilter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import engine.Params;
import engine.Utils;


public class BrowseButtonListener {

	public String FilePath;
	public String buttonName;
	private JButton btn = null;
	
	public BrowseButtonListener(JButton BTN, String DiagTitle, Params params) {
		
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
		
		
        //System.out.println("Clicked!" + ChooserMode);
		
/*        JFileChooser rfc = new JFileChooser(params.localpath);
        rfc.setDialogTitle(DiagTitle);
        rfc.showOpenDialog(btn.getParent());
		
        String FilePath = rfc.getSelectedFile().getPath().toString();
		*/
        
        JFileChooser f = new JFileChooser(params.localpath);
        f.setDialogTitle(DiagTitle);
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        f.showSaveDialog(null);
		
		
		if(buttonName == "Set Location"){
			
	        System.out.println(f.getCurrentDirectory());
	        System.out.println(f.getSelectedFile());
	        params.FolderLocation_Field.setText(f.getSelectedFile().toString());

			
		} else if(buttonName == "Backup Location" ) { 
			
			params.BackupLocation_Field.setText(f.getSelectedFile().toString());
			System.out.println("Set Replace Text");
			
		}

		
		
		
	}
				
		
}