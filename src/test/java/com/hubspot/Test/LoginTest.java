package com.hubspot.Test;

import org.testng.annotations.Test;

import com.hubspot.page.HomePage;
import com.hubspot.page.LoginPage;

public class LoginTest extends BaseTest {
	
	
	@Test(priority=1)
	public void VerifyTitle() {
		
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test(priority=2)
	public void Login() throws InterruptedException {
		
		page.getInstance(LoginPage.class).doLogin("7303709376", "NityaRinky100");
		
		page.getInstance(HomePage.class).postHappy("I am good");
		
	}

}
