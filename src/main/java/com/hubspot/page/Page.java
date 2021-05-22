package com.hubspot.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	public Page(WebDriver driver,WebDriverWait wait) {
		
		this.driver=driver;
		this.wait=wait;
	}
	
	public <Tpage extends BasePage> Tpage getInstance(Class<Tpage> pageclass) {
		
		try {
		return pageclass.getDeclaredConstructor(WebDriver.class,WebDriverWait.class).newInstance(this.driver,this.wait);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
		
		}

}
