package what;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuListener {

	public JFrame parent;
	
	public MenuListener(JMenuItem menuitem) {
		// TODO Auto-generated constructor stub
		
		parent = (JFrame) menuitem.getParent();
		
		menuitem.addActionListener(new ActionListener() {
		
		    public void actionPerformed(ActionEvent ev) {
	            
		    	String MenuText = menuitem.getText();
		    	
		    	
		    	
		    	switch (MenuText) {
		    	
		    	case "Load Settings":
		    	
		    	LoadSettings();
		    		
		    	break;
		    		
		    	case "Save Settings":
		    		
		    	SaveSettings();	
		    		
		    	break;	
		    	
		    	
		    	}
		    	
		    	
		    	
		    	

		}
		
		
	}
		
	);

}
	
	private void LoadSettings() {
		
		
		System.out.println("Load Some Settings");
		
		FileFilter filter = new FileNameExtensionFilter("BBFD","bbfd");
		
		final JFileChooser fc = new JFileChooser();
		fc.addChoosableFileFilter(filter);
		fc.setDialogTitle("Load Settings");
		int result = fc.showOpenDialog(parent);
		
	}
	
	
	private void SaveSettings() {
		
		
		System.out.println("Save Some Settings");
		
		final JFileChooser fc = new JFileChooser();
		fc.setDialogTitle("Save Settings");
		int result = fc.showOpenDialog(parent);
		
		
	}
	
	
}
