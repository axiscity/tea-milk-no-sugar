package busi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;




public class BuildOutput implements Runnable{

	
	
	public static Params params;
	
	static Thread go = new Thread();
	
	
	
	  public BuildOutput(Params params) {
	  
		 go.start();
	  System.out.println("Building Thread Running::" + Thread.currentThread().getStackTrace()); 
	  String line1 ="";
	  System.out.println("Batch FIle:" + params.getBatchFileLocation_Field());
	  
	  String options = "";
	  
      for (int x = 0; x <= Params.chkBoxesArray.size() - 1; x++) {
    	    
    	  if(Params.chkvalueArray[x]!=null)
    		  {options = options + Params.chkvalueArray[x] + " ";}
    	  
      }

          
	  try {
	  
	  line1 = params.getApp() + " " + params.getQuotes() +
	  params.getFolderLocation_Field().getText() + params.getQuotes() + " " + params.getQuotes() +
	  params.getBackupLocation_Field() + params.getQuotes() + " ";
	  

	  
	  
	  
	  } catch (Exception e) {
	  
	  System.out.println(e);
	  
	  }
	  
	  //System.out.print("\"Hello\"");

	  //File file1 = null;
	  PrintWriter writer;
		
		  try { 
		
		File file1 = new File("D:\\Test.bat");	  
			  
		//String filePath = ;
		//System.out.print(filePath);
		//file1.createNewFile();
		//file1 = new File(filePath);
		
		
		  try {
			file1.createNewFile();
			  writer = new PrintWriter(file1);
			  writer.write("echo Created by Batch Builder\r\n\r\n:" +
			  "www.persuasive-images.net/bb" + "\r\n\r\n" +  
			  ":"+ params.getBatchFileLocation_Field() + "\r\n\r\n"); 
			  writer.write(line1 + options + "\r\n\r\n"); 
			  writer.write("@pause\r\n\r\n"); 
			  writer.close();
			  

			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(file1.getPath());
			System.out.println("Check you can write to the Batch file location");
			
		} 
		  
		  } catch (NullPointerException e) {
		  
			  e.printStackTrace(); }

		 //go = null;
		  
		   // TODO Auto-generated catch block
		  
		  
		  System.out.println("THREAD::" + go + "::" + Thread.currentThread().getStackTrace());
		 
	  
	  
	  
	  }
	 


	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Running");
		  System.out.println("THREAD::" + go );
		  (go = new Thread(new BuildOutput(params))).start();
		
	}
	
    public static void main(String args[]) {
    	if(params!=null) {
       
    	}
    }





}
