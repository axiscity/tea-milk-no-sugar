package engine;

import java.io.File;
import java.io.IOException;

import javax.swing.JComponent;

import parsers.LoadFile;
import parsers.SaveFile;

public class FolderFindAndReplace {

	public String LoadedtextToSearch;
	int x = 0;
	File thisfile = null;

	String path = null;
	
public void folderSearch(Params params) throws IOException {
		
		
		if(params.FolderSearch=!true){
	
		String output = new Utils().PathSplitter(params);
		
		System.out.println("BLAH" + output);
		
		int numberoffiles = new File(output).listFiles().length;
		
		//File folder = new File(params.InputPath);
		File[] listOfFiles = new File(output).listFiles();
		File[] filescontaingName = new File[listOfFiles.length];
		
		//System.out.println("Folder Search" + numberoffiles + "  " + params.InputPath);
		
		
		for(int i = 0; i < numberoffiles; i++)
		{
						
			String path = listOfFiles[i].getAbsolutePath();
			doWork(params, path);
				
		}
		} else {
			
			folderNameSearch(params);
			System.out.println("Passing Search");
			
		}


}
	
	
	
	public void folderNameSearch(Params params) throws IOException {
		
		
		String output = new Utils().PathSplitter(params);
		
		System.out.println("BLAH" + output);
		
		int numberoffiles = new File(output).listFiles().length;
		
		//File folder = new File(params.InputPath);
		File[] listOfFiles = new File(output).listFiles();
		File[] filescontaingName = new File[listOfFiles.length];
		
		System.out.println("Folder Search" + numberoffiles + "" + params.InputPath);
		
		for(int i = 0; i < numberoffiles; i++)
		{
			
			
			String path = listOfFiles[i].getAbsolutePath();
			
			System.out.println(params.OutPath_Field.getText());

				
				filescontaingName[x] = listOfFiles[i];
				x++;
				
				//System.out.println("Found: " + x  + ":" + params.FileNameSearch_Field.getText() + listOfFiles[i].getPath());
				
				if(i == listOfFiles.length - 1){
					
					System.out.println("Herereeeeeeeeeeeeeeeeeeeeeeeeee");
					for(int j = 0; j < listOfFiles.length; j++){
						
						
						path = listOfFiles[j].getAbsolutePath();
						
						if(path.contains(params.FileNameSearch_Field.getText())){
						doWork(params, path);
						
						System.out.println("Found One");
						
						}
						
					}
					
					//break;
					
				}

				

		}
		


}






public void doWork(Params params, String path)
{
	
	thisfile = new File(path);
	boolean isFile = thisfile.isFile(); 
	int q = 0;
	
	if(isFile) {
		
		
		//System.out.println("Its a file:" + thisfile.getPath());
		
		params.InputPath = thisfile.getAbsolutePath();
		
		
		params.FindThis.replace("\\", "\\\\");
		params.ReplaceWithThis.replace("\\", "\\\\");
		
		try {
			LoadedtextToSearch = new LoadFile().LoadFile(params.InputPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//LoadedtextToSearch = LoadedtextToSearch.replaceAll("\\\\", "/");
		
		System.out.println("Replace With" + params.ReplaceWithThis);
		
		String replaceResults = LoadedtextToSearch.replace(params.FindThis, params.ReplaceWithThis);
		
		if(params.CharacterSearch)
		{ 
			
		replaceResults = new Utils().RemoveBadCharactersString(replaceResults);}
		
		else {
			
			
		}

		
		replaceResults = new Utils().RemoveBadCharactersString(replaceResults);
		
		/// Save file if there is a change
		
		if(LoadedtextToSearch != replaceResults) {
			
			q++;
			
			try {
				new SaveFile().SaveFile(params.OutputPath + params.Folder + thisfile.getName(), replaceResults, params);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			params.ConsoleMessages = params.ConsoleMessagesTitle + "Replaced " + q + " Instances of:<" + params.FindThis + "> With:<" + params.ReplaceWithThis + ">";
			params.OutPath_Field.setText(params.ConsoleMessages);
			
		} else {
			
			System.out.println(params.CharacterSearch);
			
			if(params.CharacterSearch) {
				q++;
				try {
					
					
					new SaveFile().SaveFile(params.OutputPath + params.Folder + thisfile.getName(), replaceResults, params);
					//new SaveFile().SaveFile(params.OutputPath + params.Folder + file.getName(), replaceResults, params);
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				params.ConsoleMessages = params.ConsoleMessagesTitle + "Invalid Characters Replaced";
			} else {
				
				params.ConsoleMessages = params.ConsoleMessagesTitle + "No instances found no files saved";
				params.OutPath_Field.setText(q + " " + params.ConsoleMessages);	
				
			}
			

			
		}
	
	}

}

}
