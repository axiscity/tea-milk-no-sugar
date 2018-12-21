package engine;

import java.util.List;
import java.util.Arrays;

public class Utils {

	String path = "";
	
	public String PathSplitter(Params params){
		path = params.InputPath;
		
		path = path.replace("\\","@");
		String str = path;
		List<String> folders = Arrays.asList(str.split("@"));
		System.out.println("HEllo" + folders.size());
		
		/// Create path without file name
		
		path ="";
		
		for(int i = 0; i < folders.size() -1 ; i++)
		{		
			path = path + folders.get(i) + "\\";
		}
		
		System.out.println("Folder" + path);
		return path;
		
	}
	
	public String OuputPathMake(Params params) {
		
		path = params.InputPath;
		String extension = path.substring(path.length() - 4, path.length()); /// Get existing file extension
		String fileNoExtension = path.substring(0, path.length() -4); /// Get file without extension
		path = fileNoExtension + "_Result" + extension;
		
		return path;
		
	}

	
	
    public String RemoveBadCharactersString (String toclean) {
		
    	    return toclean.replaceAll("[^\\u0009\\u000a\\u000d\\u0020-\\uD7FF\\uE000-\\uFFFD]", "");

    }
	
}
