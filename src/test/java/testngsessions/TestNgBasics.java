package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@Test
	public void searchTest() {
		System.out.println("search test");
		Assert.assertEquals(1000, 1001);
		
	}
	

}
