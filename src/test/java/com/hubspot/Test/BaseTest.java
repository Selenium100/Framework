package com.hubspot.Test;

import java.util.logging.FileHandler;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.hubspot.page.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito","--start-maximized");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		driver=new ChromeDriver(options);
		wait=new WebDriverWait(driver, 30);
		page=new Page(driver, wait);
		driver.get("https://www.facebook.com/");
		
		
			
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		//driver.quit();
		
	}

}
