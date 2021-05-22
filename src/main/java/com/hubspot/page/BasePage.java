package com.hubspot.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page{

	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}
	
	//Util Libraries
	
	public void doClick(By locator){
		
		/*
		 * wait=new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.elementToBeClickable(locator));
		 */
		driver.findElement(locator).click();
	}
	
	public void doSendKeys(By locator,String value) {
		
		/*
		 * wait=new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 */
		driver.findElement(locator).sendKeys(value);
	}
	
	public String doGetText(By locator) {
		
		/*
		 * wait=new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		 */
		return driver.findElement(locator).getText();
		
	}

}
