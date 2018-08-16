package com.business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.LoginPage;

public class BusinessKeywords {
	WebDriver driver;
	LoginPage loginPage;
	
	public BusinessKeywords(WebDriver driver){
		this.driver=driver;
		loginPage=new LoginPage(driver);
		
	}
	
	public void loginFunctionality(String userName, String passWord) throws InterruptedException{
		
		
		//WebDriverWait wait = new WebDriverWait(driver, 30000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.userNameTextBox));
		Thread.sleep(20000);
		loginPage.enterUserName(userName);
		loginPage.enterTextPassword(passWord);
		loginPage.clickLoginButton();
		
	}
	
	
	

}
