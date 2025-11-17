package projectjenkin;


import static org.junit.Assert.*;

import org.junit.Test;

public class Apptest {

	
		// TODO Auto-generated method stub
		 @Test
		    public void testAddNumbers() {
		        App app = new App();
		        int result = app.addNumbers(10, 20);
		        assertEquals(30, result);
	}

}
