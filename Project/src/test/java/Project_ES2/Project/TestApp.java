package Project_ES2.Project;


import org.junit.Test;

import junit.framework.TestCase;


public class TestApp extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	@Test
	public final void testMax() {
		App p = new App();
		assertEquals(4, p.max(3, 4));
	}
	
	@Test
	public final void testMin() {
		App p = new App();
		assertEquals(3, p.min(3, 4));
	}
	
	@Test
	public final void testAverage() {
		App p = new App();
		assertEquals(3.5, p.average(3, 4));
	}
}
