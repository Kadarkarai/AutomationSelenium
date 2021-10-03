package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider (name = "LoginData")
	public Object [] [] logindata(){
		Object [] [] usercredentials = new Object [3] [2];
		usercredentials [0] [0] = "test@tekvey.com";  usercredentials [0] [1] = "pass_112";    
		usercredentials [1] [0] = "info@tekvey.com";  usercredentials [1] [1] = "valid_pass"; 
		usercredentials [2] [0] = "abcd@tekvey.com";  usercredentials [2] [1] = "InvalidPassword";  		
		return usercredentials;
	}
	
	@DataProvider (name = "ProductData")
	public Object [] productdata(){
		Object [] productinfo = new Object [5];
		productinfo [0] = "test@tekvey.com";    
		productinfo [1] = "info@tekvey.com";
		productinfo [2] = "abcd@tekvey.com";
		productinfo [3] = "abcd@tekvey.com";
		productinfo [4] = "abcd@tekvey.com";
		return productinfo;
	}

}
