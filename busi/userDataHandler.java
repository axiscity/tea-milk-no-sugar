package busi;

import common.BBuilderConstants;
import common.XMLoader;

public class userDataHandler implements LoadSaveUpdate{

	public userDataHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeRecord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRecord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadRecord() {
		// TODO Auto-generated method stub
		System.out.println("LOAD");
		new XMLoader().XMLoader(BBuilderConstants.loadFile, null, "setting");
		
		
	}

}
