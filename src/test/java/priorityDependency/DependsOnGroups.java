package priorityDependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {

	@Test (groups = { "positive" })
	public void firstmethod() {
		System.out.println("First Method");
	}
	
	@Test (dependsOnGroups = { "positive" })
	public void secondmethod() {
		System.out.println("Second Method");
	}
	
	@Test (groups = { "positive" })
	public void thirdmethod() {
		System.out.println("Third Method");
		Assert.assertTrue(true);
	}
	
	@Test
	public void fourthmethod() {
		System.out.println("Fourth Method");
	}
}
