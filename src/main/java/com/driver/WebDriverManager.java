package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.constants.Constant;
import com.environment.ReadPropertiesFile;

public class WebDriverManager {
	
	static WebDriver driver;
	
	
	public WebDriver invokeInstance() throws InterruptedException{
		ReadPropertiesFile readPropertiesFile=new ReadPropertiesFile();
		readPropertiesFile.environmentFileRead();
		String browserType=Constant.environmentVariable.get("browser");
		BrowserActions browserActions= new BrowserActions(driver);
		if(browserType.equals("chromeBrowser")){
			
			System.out.println("BrowserType is entered as...." + browserType + "..Hence Chrome Browser is Invoked");
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumInventory\\chromedriver.exe");
			driver=new ChromeDriver();
			Thread.sleep(6000);
			browserActions.launchApplication("https://www.facebook.com/");
			//browserActions.launchApplication("https://www.facebook.com/");
			
						
		}
		else{
			System.out.println("BrowserType is entered as...." + browserType+ "..Hence IE Browser is Invoked");
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

			capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
			//capabilities.setCapability("initialBrowserUrl", "http://facebook.com");
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);

			System.setProperty("webdriver.ie.driver", "E:\\SeleniumInventory\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			Thread.sleep(10000);
			browserActions.launchApplication("https://www.facebook.com/");
			
		}
		return driver;
	}

}
