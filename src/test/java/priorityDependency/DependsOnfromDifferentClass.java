package priorityDependency;

import org.testng.annotations.Test;

public class DependsOnfromDifferentClass extends DependsonSinglemethod{
	
	@Test (dependsOnMethods = {"secondmethod"})
	public void loginwithvalidvalues() {
		System.out.println("Child class method depends on parent class method : secondmethod");
	}

}
