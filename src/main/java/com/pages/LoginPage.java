package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	public By userNameTextBox=By.xpath("//input[@type='email']");
	By passwordTextBox=By.xpath("//input[@name='pass']");
	By loginButton=By.xpath("//input[@value='Log In']");
	
	public void enterUserName(String userName){
		driver.findElement(userNameTextBox).sendKeys(userName);
		System.out.println("UserName is found and entered text as.." + userName);
		
	}
	public void enterTextPassword(String passWord){
		driver.findElement(passwordTextBox).sendKeys(passWord);
		System.out.println("Password is found and entered text as.." + passWord);
		}
	public void clickLoginButton() throws InterruptedException{
		driver.findElement(loginButton).click();
		System.out.println("LogonButton is Found.. and Click is succesfull..");
		
		}
}
