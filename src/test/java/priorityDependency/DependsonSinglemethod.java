package priorityDependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonSinglemethod {

	@Test (dependsOnMethods = {"thirdmethod"})
	public void firstmethod() {
		System.out.println("First Method");
	}
	
	@Test 
	public void secondmethod() {
		System.out.println("Second Method");
	}
	
	@Test
	public void thirdmethod() {
		Assert.fail();
	}
	
}
