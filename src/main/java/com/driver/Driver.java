package com.driver;

import org.openqa.selenium.WebDriver;

import com.business.BusinessKeywords;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager wedDriverManager=new WebDriverManager();
		driver=wedDriverManager.invokeInstance();
		BusinessKeywords businessKeywords=new BusinessKeywords(driver);
		businessKeywords.loginFunctionality("bvpradeep.venkata@gmail.com", "pandoo@10");
		

	}

}
