package engine;
import java.io.File;
import java.io.IOException;

import parsers.LoadFile;
import parsers.SaveFile;
import starter.Bbuilder;

public class FindReplace extends Bbuilder{

	public String LoadedtextToSearch;
	public FindReplace(Params searchparams) throws IOException {
		// TODO Auto-generated constructor stub
		LoadedtextToSearch = new LoadFile().LoadFile(searchparams.InputPath);
		
		
		System.out.println(searchparams.FindThis);
		System.out.println(searchparams.ReplaceWithThis);
		
		searchparams.FindThis.replace("\\", "\\\\");
		searchparams.ReplaceWithThis.replace("\\", "\\\\");
		
		
		String replaceResults = LoadedtextToSearch.replace(searchparams.FindThis, searchparams.ReplaceWithThis);

		
		if(searchparams.CharacterSearch)
		{ 
			
		replaceResults = new Utils().RemoveBadCharactersString(replaceResults);}
		
		else {
			
			
		}
		
		
		if(searchparams.FolderSearch){
			
			//System.out.println("FOLDER SEARCH" + searchparams.FolderSearch);
			//System.out.println(searchparams.OutputPath);
			
			//searchparams.Folder = new Utils().PathSplitter(searchparams.InputPath);
			new FolderFindAndReplace().folderSearch(searchparams);
			
			
			
		
		} else {
			
			File file = new File(searchparams.InputPath);
			
			
			
			
			new SaveFile().SaveFile(searchparams.OutputPath + searchparams.Folder + file.getName(), replaceResults, searchparams);
			
			//new SaveFile().SaveFile(searchparams.OutputPath, replaceResults, searchparams);;
			//System.out.println(searchparams.FolderSearch);
			System.out.println(searchparams.OutputPath + searchparams.Folder + file.getName());

			
			
			
		}
		
		
	}

	public String getTextToSearch() {
		

		return LoadedtextToSearch;
	}

	public void setTextToSearch(String textToSearch) {
		this.LoadedtextToSearch = textToSearch;
	}

	
}
