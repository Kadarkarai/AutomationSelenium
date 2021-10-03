package priorityDependency;

import org.testng.annotations.Test;

public class WithandWithoutPriority {

	@Test (priority = 4)
	public void firstmethod() {
		System.out.println("First Method");
	}
	
	@Test 
	public void secondmethod() {
		System.out.println("Second Method");
	}
	
	@Test (priority = 7)
	public void thirdmethod() {
		System.out.println("Third Method");
	}
	
	@Test 
	public void fourthmethod() {
		System.out.println("Fourth Method");
	}
	
	@Test (priority = 2)
	public void fifthmethod() {
		System.out.println("Fifth Method");
	}
}
