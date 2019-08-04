package busi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;




public class BuildOutput implements Runnable{

	
	
	public static Params params;
	
	static Thread go = new Thread();
	
	
	
	  public BuildOutput(Params params) {
	  
		 go.start();
	  System.out.println("Building Thread Running::" + Thread.currentThread().getStackTrace()); 
	  String line1 ="";
	  
	 
	  
	  try {
	  
	  line1 = params.getApp() + " " + params.getQuotes() +
	  params.getFolderLocation_Field() + params.getQuotes() +
	  params.getGap() + params.getQuotes() +
	  params.getBackupLocation_Field() + params.getQuotes();
	  

	  
	  } catch (Exception e) {
	  
	  System.out.println(e);
	  
	  }
	  
	  //System.out.print("\"Hello\"");
	  
	  String options = " /E";
	  File file1 = null;
	  FileWriter writer;
		
		  try { 
			  
		String filePath = params.getBatchFileLocation_Field(); 
		file1 = new File(filePath);
		
		
		  try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("Check you can write to the Batch file location");
			
		} 
		  
		  } catch (NullPointerException e) {
		  
			  e.printStackTrace(); }
		  
		  
		  
		  
		  try {
			  writer = new FileWriter(file1);
			  writer.write("echo Created by Batch Builder\r\n\r\n:" +
			  "www.persuasive-images.net/bb" + "\r\n\r\n" +  
			  ":"+ params.getBatchFileLocation_Field() + "\r\n\r\n"); 
			  writer.write(":" + line1 + options + "\r\n\r\n"); 
			  writer.write("@pause\r\n\r\n"); 
			  writer.close();
			  
			  System.out.println("THREAD::" + go );
			  
			  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  
		 //go = null;
		  
		   // TODO Auto-generated catch block
		  
		  
		  System.out.println("THREAD::" + go + "::" + Thread.currentThread().getStackTrace());
		 
	  
	  
	  
	  }
	 


	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Running");
		
	}
	
    public static void main(String args[]) {
        (go = new Thread(new BuildOutput(params))).start();
    }





}
