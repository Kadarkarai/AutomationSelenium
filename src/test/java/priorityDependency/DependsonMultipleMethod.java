package priorityDependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMultipleMethod {

	@Test (dependsOnMethods = {"thirdmethod","secondmethod"})
	public void firstmethod() {
		System.out.println("First Method");
	}
	
	@Test 
	public void secondmethod() {
		System.out.println("Second Method");
	}
	
	@Test
	public void thirdmethod() {
		System.out.println("Third Method");
		Assert.assertTrue(true);
	}
	
}
