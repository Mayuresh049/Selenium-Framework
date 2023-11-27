package com.learnautomation.utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import java.util.Date;
import java.util.Set;

public class Helper {

	public static String captureScreenshot (WebDriver driver) {

	File src =((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE);

	String screenshotpath= System.getProperty("User.dir")+"/ScreenShot/Amazon_"+getCurrentDateTime()+".png";

	try {

	

	FileHandler.copy(src, new File("./ScreenShot/Amazon_"+getCurrentDateTime()+".png")); 

	}catch(Exception e){System.out.println("Unable to capture screenshot"+e.getMessage());
	}
	 return screenshotpath;
	}
	

	

	 

	

	

	public static String getCurrentDateTime() {

	DateFormat customformat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	Date currentDate=new Date();
	return customformat.format(currentDate);
	}
	static String currentUrl;
	public static String getWindowHandel(WebDriver driver) {
		
		Set<String>Windows1=driver.getWindowHandles();
		for(String str:Windows1)
		{
			driver.switchTo().window(str);
			currentUrl=driver.getCurrentUrl();
			System.out.println(currentUrl);
		}
		return currentUrl;
	}
	

		
	}

