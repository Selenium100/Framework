package com.hubspot.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	
	
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	By userName=By.id("email");
	By passWord=By.id("pass");
	By Login=By.name("login");
	
	
	public String getLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public Page doLogin(String user,String pwd) {
		
		doSendKeys(userName, user);
		doSendKeys(passWord, pwd);
		doClick(Login);
		
		return new HomePage(driver, wait);
		
	}

}
