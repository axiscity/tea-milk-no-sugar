package what;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import parsers.SaveXML;
import engine.FindReplace;
import engine.FolderFindAndReplace;
import engine.Params;
import gui.dropDown;
import gui.makeGUI;

public class ButtonListener {

	String BTN_Type = "";
	String LoadPath_str = "";
	String SavePath_str = "";
	String FindThis_str = "";
	String ReplaceWithThis_str = "";
	Params params = null;
	JFrame gui = null;
	public JButton btn = null;

	public ButtonListener(JButton button_btn, Params sPs, JFrame guid) {
		// TODO Auto-generated constructor stub

		params = sPs;

		gui = guid;
		btn = button_btn;

		params.setFindThis(params.getFindThis_Field());
		params.setReplaceWithThis(params.getReplaceWithThis_Field());

		button_btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println("Get Path" + button_btn.getText());

				try {
					BTN_Type = button_btn.getText();

					// LoadPath_str = LoadPath.getText(); SavePath_str = SavePath.getText() ;
					// FindThis_str = FindThis.getText(); ReplaceWithThis_str =
					// ReplaceWithThis.getText();

					if (BTN_Type == "Browse..") {

						ButtonPressed(params);
					}

					if (BTN_Type == "Replace") {

						// ButtonPressed(params);
						System.out.println("BTN_Type");
						replaceStuff(params);
					}

					if (BTN_Type == "Save Search") {

						System.out.println("BTN_Type" + params.getFindThis() + params.getReplaceWithThis());

						params.setFindThis(params.getFindThis_Field());
						params.setReplaceWithThis(params.getReplaceWithThis_Field());

						new SaveXML("savedSearches.xml", params);
						new SaveXML("savedReplaced.xml", params);

						params.getSaveSearches().addItem(params.getFindThis());
						params.getSaveReplaced().addItem(params.getReplaceWithThis());

					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

	}

	protected void ButtonPressed(Params params) throws IOException {

		System.out.println("Replace This: " + params.getFindThis() + "  With This: " + params.getReplaceWithThis());
		// System.out.println("Load:" + LoadPath_str);

		// new FindReplace(params);
		// System.out.println("Save:" + params2.getText());

		// params.SaveReplaced

		// System.out.println(btn.getParent().getComponentCount());
		// Ccutter cc = (Ccutter) gui.getParent();
		// cc.main(null);

	}

	void replaceStuff(Params params) {

		try {

			params.setFindThis(params.getFindThis());
			params.setReplaceWithThis(params.getReplaceWithThis());

			if (params.getFolderSearch()) {

				new FolderFindAndReplace().folderSearch(params);

			}

			if (params.getFolderSearch() != true) {

				new FindReplace(params);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
