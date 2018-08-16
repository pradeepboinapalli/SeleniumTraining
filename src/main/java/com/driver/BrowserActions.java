package com.driver;

import org.openqa.selenium.WebDriver;

public class BrowserActions {
	WebDriver driver;
	public BrowserActions(WebDriver driver){
		driver=this.driver;
	}

	public void launchApplication(String url){
		driver.get(url);
	}
	public void minimizeBrowser(){
		driver.manage().window().maximize();
		System.out.println("Window is Maximized...");
		
	}
	
	public void browserBackButton(){
		driver.navigate().back();
		System.out.println("Back button Pressed on browser");
		
	}
	
	public void browserForwardButton(){
		driver.navigate().forward();
		System.out.println("Forward Button Pressed on Browser");
	}
	
	public void refreshButton(){
		driver.navigate().refresh();
		System.out.println("Refresh Command initiated on Browser");
		
	}
	
	public void getCurrentURL(){
		driver.getCurrentUrl();
	}
	
	public void closeBrowser(){
		driver.close();
	
	}
	

}
