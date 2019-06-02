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
		LoadedtextToSearch = new LoadFile().LoadFile(searchparams.getInputPath());
		
		
		System.out.println(searchparams.getFindThis());
		System.out.println(searchparams.getReplaceWithThis());
		
		searchparams.getFindThis().replace("\\", "\\\\");
		searchparams.getReplaceWithThis().replace("\\", "\\\\");
		
		
		String replaceResults = LoadedtextToSearch.replace(searchparams.getFindThis(), searchparams.getReplaceWithThis());

		
		if(searchparams.getCharacterSearch())
		{ 
			
		replaceResults = new Utils().RemoveBadCharactersString(replaceResults);}
		
		else {
			
			
		}
		
		
		if(searchparams.getFolderSearch()){
			
			//System.out.println("FOLDER SEARCH" + searchparams.FolderSearch);
			//System.out.println(searchparams.OutputPath);
			
			//searchparams.Folder = new Utils().PathSplitter(searchparams.InputPath);
			new FolderFindAndReplace().folderSearch(searchparams);
			
			
			
		
		} else {
			
			File file = new File(searchparams.getInputPath());
			
			
			
			
			new SaveFile().SaveFile(searchparams.getOutputPath() + searchparams.getFolder() + file.getName(), replaceResults, searchparams);
			
			//new SaveFile().SaveFile(searchparams.OutputPath, replaceResults, searchparams);;
			//System.out.println(searchparams.FolderSearch);
			System.out.println(searchparams.getOutputPath() + searchparams.getFolder() + file.getName());

			
			
			
		}
		
		
	}

	public String getTextToSearch() {
		

		return LoadedtextToSearch;
	}

	public void setTextToSearch(String textToSearch) {
		this.LoadedtextToSearch = textToSearch;
	}

	
}
