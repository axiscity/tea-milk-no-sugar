package parsers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import engine.Params;
import engine.Utils;

public class SaveFile {

	public static void SaveFile(String Fname, String Contents, Params params) throws IOException {
		
		
		System.out.println("MKDIR:" + Fname);
		
		System.out.println(params.getOutputFolder());
		
		
		
		
		File Folder = new File(params.getOutputPath() + params.getFolder());
		Folder.mkdirs();
		
		
		//System.out.print("OUTPUT PATH:" + new Utils().PathSplitter(searchparams));
		
		
		//Folder.canWrite();
		
		if (Folder.exists()){
			
			File file = new File(Fname);
			
			boolean createNewFile = file.createNewFile();

			PrintWriter out = new PrintWriter(file); // Filename
			out.println(Contents); // text to write
			out.close(); // Close File
			
		}
		


	}
	
}
