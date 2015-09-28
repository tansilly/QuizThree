package Main;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	Triangle newTri;
	
	// creating an account with $20000 in it 
	@Before
	public void setUp() throws Exception {
		newTri = new Triangle(5.6 , 7.9,6.7);
	}

	@After
	public void tearDown() throws Exception {
		newTri = null;
	}
	
	//testing getArea() 
	@Test
	public final void testGetArea() {
			 newTri.getArea();
	}

	// testing getPerimeter()
	@Test
	public final void testGetPerimeter() {
			newTri.getPerimeter();
	}
}
