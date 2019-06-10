package common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveSettings {


		public SaveSettings(String Fname, String Contents) {
			
			
			System.out.println("Save Settings:" + Fname);
			
			
			
			System.out.print("Fname::" + Fname);
			
			
			//Folder.canWrite();
			
		
				
				File file = new File(Fname);
				
				
				try {
					boolean createNewFile = file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				PrintWriter out = null;
				try {
					out = new PrintWriter(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // Filename
				out.println(Contents); // text to write
				out.close(); // Close File
				

			


		}
		
	}
