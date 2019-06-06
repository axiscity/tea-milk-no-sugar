package busi;

public class record implements LoadSaveUpdate {
	
	@Override
	public
	 void makeRecord() {
		System.out.print("Make Record");
		
	}
	
	@Override
	public
	 void updateRecord() {
		
		System.out.print("Update Record");
		
	}
	
	public
	@Override
	void loadRecord() {
		
		System.out.print("Load Record");
		
		
	}

}
