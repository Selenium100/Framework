package com.hubspot.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	By feeling=By.xpath("//span[text()='Feeling/Activity']");
	By happy=By.xpath("//div[text()='happy']");
	By post=By.xpath("//span[text()='Post']");
	By postTextField=By.xpath("//div[@data-offset-key='faqlt-0-0']");
	
	
	public void clickFeeling() {
		doClick(feeling);
	}
	

	public void clickHappy() {
		doClick(happy);
	}
	
	public void clickPost() {
		doClick(post);
	}
	
	public void writePost(String value) {
		
		doSendKeys(postTextField, value);
	}
	
	public void postHappy(String value) {
		clickFeeling();
		try {
		Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		clickHappy();
		try {
			Thread.sleep(4000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		clickPost();
	}

}
