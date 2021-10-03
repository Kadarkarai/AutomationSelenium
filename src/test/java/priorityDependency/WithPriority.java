package priorityDependency;

import org.testng.annotations.Test;

public class WithPriority {

	@Test (priority = 2)
	public void firstmethod() {
		System.out.println("First Method");
	}
	
	@Test (priority = 3)
	public void secondmethod() {
		System.out.println("Second Method");
	}
	
	@Test (priority = 1)
	public void thirdmethod() {
		System.out.println("Third Method");
	}
}
