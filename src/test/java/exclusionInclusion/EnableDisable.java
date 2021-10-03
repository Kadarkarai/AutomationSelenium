package exclusionInclusion;

import org.testng.annotations.Test;

public class EnableDisable {
	
	@Test (enabled=true)
	public void enablethiscase() {
		System.out.println("Enabled test case");
	}
	
	@Test (enabled=false)
	public void disablethiscase() {
		System.out.println("Disabled test case");
	}
}
