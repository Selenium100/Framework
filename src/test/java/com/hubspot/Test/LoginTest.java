package com.hubspot.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hubspot.page.HomePage;
import com.hubspot.page.LoginPage;

public class LoginTest extends BaseTest {
	
	
	@Test(priority=1)
	public void VerifyTitle() {
		
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test(priority=2,dataProvider="LoginData")
	public void Login(String user,String pass) throws InterruptedException {
		
		page.getInstance(LoginPage.class).doLogin(user, pass);
		
		page.getInstance(HomePage.class).postHappy();
		
	}
	
	
	@DataProvider(name="LoginData")
	public Object [][] getData(){
		
		Object[][] data= {
				
				{"7303709376", "NityaRinky100"}	,
				{"7303709376", "NityaRinky"},
				{"7303709376", "Nitya"}
				
				
		};
		return data;
		
	}

}
