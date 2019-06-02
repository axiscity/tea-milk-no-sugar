package starter;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class BbuilderTest {

	@Test
	public void testGUIexists() {
	    try {
	        Class.forName("gui.makeGUI");
	    } catch (ClassNotFoundException e) {
	        Assert.fail("should have a class called Car");
	    }
		
		
	}

}
