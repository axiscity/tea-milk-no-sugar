package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import busi.Params;
import common.BBuilderConstants;

public class MenuListener {

	public JFrame parent;
	
	public MenuListener(Params params, JMenuItem menuitem) {
		// TODO Auto-generated constructor stub
		
		parent = (JFrame) menuitem.getParent();

		
		menuitem.addActionListener(new ActionListener() {
		
		    public void actionPerformed(ActionEvent ev) {
	            
		    	String MenuText = menuitem.getText();
		    	
		    	System.out.println(MenuText);
		    	
		    	switch (MenuText) {
		    	
		    	case "Load Settings":
		    	
		    	LoadSettings(params);
		    		
		    	break;
		    		
		    	case "Save Settings":
		    		
		    	SaveSettings(params);	
		    		
		    	break;	
		    	
		    	case "Xcopy":
		    	
		    	params.menu2Item1.setState(false);
		    	params.menu2Item2.setState(true);
		    	
		    	
		    	break;
		    	
		    	case "Robocopy":
		    	
		    	params.menu2Item1.setState(true);
		    	params.menu2Item2.setState(false);
		    	
		    	
		    	break;
		    	
		    	
		    	case "About":
		    		
		    	JOptionPane.showMessageDialog(parent, "BBFB");
		    	
		    	break;
		    	
		    	case "Export Batch File":
		    		
		    	
		    	
		    	break;
		    	
		    	
		    	}
		    	


		    	
		}
		
		
	}
		
	);

}
	
	protected void Mode() {
		// TODO Auto-generated method stub
		
		
		
		
	}

	private void LoadSettings(Params params) {
		
		
		System.out.println("Load Some storage" + params.getLocalpathA() + "Hello");
		
		FileFilter filter = new FileNameExtensionFilter("BBFB","bbfb");
		
		File StartingDirA = new File(params.getLocalpathA());
		//File StartingDirB = new File(params.localpathB);
		
		//System.out.println("get Path" + StartingDirA.getPath() + " exists: " + StartingDirA.exists() );
		//System.out.println("get Path" + StartingDirB.getPath() + " exists: " + StartingDirB.exists() );
		
		final JFileChooser fc = new JFileChooser(StartingDirA);
		fc.setCurrentDirectory(StartingDirA);
		fc.addChoosableFileFilter(filter);
		fc.setDialogTitle("Load storage");
		
		int result = fc.showOpenDialog(parent);
		
	}
	
	
	private void SaveSettings(Params params) {
		
		
		System.out.println("Save Some storage");
		
		final JFileChooser fc = new JFileChooser(params.getLocalpathA());
		fc.setDialogTitle("Save Settings");
		int result = fc.showOpenDialog(parent);
		String chosenFile = fc.getSelectedFile().getAbsolutePath();
		System.out.print(chosenFile);
		BBuilderConstants.saveFile = chosenFile;
		
		
	}
	
	
}
