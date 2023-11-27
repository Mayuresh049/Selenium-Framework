package com.learnautomation.utility;



import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory{


		// TODO Auto-generated method stub
		

		public static WebDriver startApplication(WebDriver driver,String browserName,String appUrl) {
			
			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
				driver= new ChromeDriver();
			}
			else if(browserName.equals("Firefox")){
				
			}
			else if(browserName.equals("IE")){
				
			}
			else {
				System.out.println("System does not support this browser");
			}
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get(appUrl);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
		}
		public static void quitBrowser(WebDriver driver) {
			driver.quit();
			
			
		}

	}


