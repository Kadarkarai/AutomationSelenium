package dataProvider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassing {

	@Parameters({"name","designation"})
	@Test(testName = "Verify login with valid credentials")
	public void T001(String name,String designation) {
		System.out.println("Testing parameter passed or not"+name);
		System.out.println(designation);
	}
	
}
