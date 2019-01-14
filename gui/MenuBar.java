package gui;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import what.MenuListener;

public class MenuBar extends JFrame{
	
	private JMenuBar menBar = new JMenuBar();
	private JMenu menu1 = new JMenu("File");
	private JMenu menu2 = new JMenu("About");
	
	private JMenuItem menuItem1 = new JMenuItem("Save Settings", KeyEvent.VK_T);
	private JMenuItem menuItem2 = new JMenuItem("Load Settings", KeyEvent.VK_T);

	
	public MenuBar(JFrame _frame) {
		
		
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem1.getAccessibleContext().setAccessibleDescription("Save batch settings");
		new MenuListener(menuItem1);
		
		
		menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuItem2.getAccessibleContext().setAccessibleDescription("Load batch settings");
		new MenuListener(menuItem2);
		
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		
		menBar.add(menu1);
		menBar.add(menu2);
		_frame.setJMenuBar(menBar);
		
		
		//a group of JMenuItems

		
		
		
		
	}
	
	

}
