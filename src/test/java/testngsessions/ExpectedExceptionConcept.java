package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name;
	
	
	

	@Test(expectedExceptions = { ArithmeticException.class, NullPointerException.class })
	public void searchTest() {
		System.out.println("search test");
		int i = 8 / 0;
		
	ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
	obj.name = null;
	obj.name = "naveen";
		
		
		
		
		
	}

}
