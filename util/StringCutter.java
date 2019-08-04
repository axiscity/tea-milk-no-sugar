package util;

public class StringCutter {

	static String KeyWord = "Asset";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String toedit = "Blah,grub,blub,jub,<Keep1>,Asset,Asset,Asset,<Keep1>,magic,<keep2>,Asset,Asset,<keep2>,yawn,everything assumed,bad bad,<keep3>,Asset,Asset,<keep3B>";
		System.out.println("To_edit:!!" + toedit + "<Blah");
		String Edited = "";
		
		Edited = removeCells(toedit);
		
		//System.out.println("edit>" + Edited + "<Blah");

	}

	private static String removeCells(String toedit) {

		// Loops through the string depending on the length of the Skip array
		// If you have multiple hits of the same keyword but with a different
		// number of cells to remove after it you set the skip array amount. 
		// If you need to loop through the string multiple times e.g take out a 
		// number of hits with the same config set the hit amount e.g 2 hits called
		// blah and you need to remove 2 cells after it the skip amount would be 2
		// and the hit amount would be 2. This would delete 2 blahs and 4 cells 
		// (2 after each)
		// Make sure you order the searches correctly as the first hit is the first to 
		// be removed/edited 
		
		String edit1 = toedit;
		int SkipArray[] = {2, 1, 1}; // The number of cells to remove after the keyword
		int hitAmount[] = {1, 1, 1}; // How many times to loop through the string array
		int occur[] = {2, 1, 1}; // Which occurrence of the keyword to hit
		boolean removeKey[] = {true, true, true};

		//Send string to be edited
		for (int i=0; i < SkipArray.length; i++) 
		{ 
			int INT = SkipArray[i];
				//System.out.println("I:" + i + "ED!!:" + i + "|" + edit1 + "|Blah");
				edit1 = removeBit(edit1, INT, hitAmount[i], removeKey[i]); // build string
				//System.out.println("I:" + i + "EDIT:" + i + "|" + edit1 + "|Blah");	
		}
		return edit1;
	}
	
	

	private static String removeBit(String toedit, int skip, int hittimes, boolean removeKey) {
		
		// toedit is the string
		// skip is the amount of cells to delete after the keyword
		// hittimes is how many times to search the string 
		
		System.out.println("skip:" + skip + "hittimes:" + hittimes);
		
		int hit = 0;
		String StringArray[] = toedit.split(","); // Explode string to array
		String edit2 = "";		

		for (int i=0; i< StringArray.length ; i++) 
		{ 	

		// Find keyword x hits 
		if(StringArray[i].contains(KeyWord) && hit < hittimes) {
			
			
			// Edit the key to be removed
			if(removeKey) {
			StringArray[i] = "<remove" + hit + "key>"; 
			i++;//i = i + skip;
			} else {
				i++;
			}
			
			
			// Skip / edit the cells you don't want  
			for(int p= 0; p < skip; p++) {
				StringArray[i + p] = "<remove>p:" + p;
			}
			
			hit = hit + 1;
			
			//break;
		   }; 
		   
		}	
		
		
		// Debug checking the right cells are being edited
		String BeforeRemove = "";
				
		for (int i=0; i< StringArray.length ; i++) 
		{ 
			BeforeRemove = BeforeRemove + StringArray[i] + ",";	// With Remove Tag	
		}
		
		System.out.println("With Tag" + BeforeRemove + "<Blah");

		for (int i=0; i< StringArray.length ; i++) 
		{ 

			if(StringArray[i].contains("remove")){
				
			} else {
			edit2 = edit2 + StringArray[i] + ",";	// Cells you want to keep	
			}
			
		}
		
		System.out.println("With Tag" + BeforeRemove + "<Blah");
		
		return edit2;
	}

}
