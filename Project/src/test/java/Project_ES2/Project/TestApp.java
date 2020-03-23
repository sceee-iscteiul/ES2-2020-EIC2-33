package Project_ES2.Project;

import junit.framework.TestCase;

public class TestApp extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public final void testMax() {
		App p = new App();
		assertEquals(4, p.max(3, 4));
	}

}
