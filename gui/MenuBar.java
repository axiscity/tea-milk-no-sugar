package gui;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import engine.Params;
import what.MenuListener;

public class MenuBar extends JFrame{
	
	private JMenuBar menBar = new JMenuBar();
	private JMenu menu1 = new JMenu("File");
	private JMenu menu2 = new JMenu("Mode");
	private JMenu menu3 = new JMenu("Help");
	
	private JMenuItem menu1Item1 = new JMenuItem("Save Settings", KeyEvent.VK_T);
	private JMenuItem menu1Item2 = new JMenuItem("Load Settings", KeyEvent.VK_T);
	private JMenuItem menu1Item3 = new JMenuItem("Export Batch File", KeyEvent.VK_T);
	private JCheckBoxMenuItem menu2Item1 = new JCheckBoxMenuItem("Robocopy", true);
	private JCheckBoxMenuItem menu2Item2 = new JCheckBoxMenuItem("Xcopy", false);
	private JMenuItem menu3Item1 = new JMenuItem("Help", KeyEvent.VK_T);
	private JMenuItem menu3Item2 = new JMenuItem("About", KeyEvent.VK_T);
	
	
	public MenuBar(Params params, JFrame _frame) {
		
		params.menu2Item1 = menu2Item1;
		params.menu2Item2 = menu2Item2;
		
		
		menu1Item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menu1Item1.getAccessibleContext().setAccessibleDescription("Save batch settings");
		new MenuListener(params, menu1Item1);
		
		
		menu1Item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menu1Item2.getAccessibleContext().setAccessibleDescription("Load batch settings");
		new MenuListener(params, menu1Item2);
		
		
		menu1Item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menu1Item3.getAccessibleContext().setAccessibleDescription("Export Batch File");
		new MenuListener(params, menu1Item3);
		
		
		menu1.add(menu1Item1);
		menu1.add(menu1Item2);
		menu1.add(menu1Item3);
		

		menu2Item1.getAccessibleContext().setAccessibleDescription("Xcopy");
		new MenuListener(params, menu2Item1);
		
		menu2Item2.getAccessibleContext().setAccessibleDescription("RoboCopy");
		new MenuListener(params, menu2Item2);
		
		menu2.add(menu2Item1);
		menu2.add(menu2Item2);

		menu3Item1.getAccessibleContext().setAccessibleDescription("About");
		new MenuListener(params, menu3Item1);
		
		menu3Item2.getAccessibleContext().setAccessibleDescription("Help");
		new MenuListener(params, menu3Item2);
		
		menu3.add(menu3Item1);
		menu3.add(menu3Item2);
		
		
		menBar.add(menu1);
		menBar.add(menu2);
		menBar.add(menu3);
		_frame.setJMenuBar(menBar);
		
		
		//a group of JMenuItems

		
		
		
		
	}
	
	

}
