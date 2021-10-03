package priorityDependency;

import org.testng.annotations.Test;

public class DefaultExecutionFlow {

	@Test
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
	}
}
