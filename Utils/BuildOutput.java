package Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import engine.Params;

public class BuildOutput {

	
	public BuildOutput(Params params){
		
		Params settings = params; 
		String line1 = params.app + " " + params.quotes + params.FolderLocation_Field.getText() + params.quotes + params.gap + params.quotes + params.BackupLocation_Field.getText() + params.quotes;
		
		//System.out.print("\"Hello\"");
		
		String options = " /E";
		
        File file1 = new File(params.BatchFileLocation_Field.getText());


            try {
                file1.createNewFile();
                FileWriter writer;
               
               
    			writer = new FileWriter(file1);
    			writer.write("@pause\r\n\r\n");
    			writer.write(":Created by Batch Builder\r\n\r\n:" + params.BatchFileLocation_Field.getText() + "\r\n\r\n");
    			writer.write(line1 + options + "\r\n\r\n");
    			writer.write("@pause\r\n\r\n");
				writer.close();
				System.out.print("CLOSED");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println(line1);

	
	
}
}
