package com.learnautomation.testcase;


import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.Search_Page;
import com.learnautomation.utility.Helper;

import org.testng.annotations.*;

public class Search_TestCase extends BaseClass{

	@Test
	public void SearchFor() {
		
		logger=report.createTest("Searching for product");
		logger.info("Searching for using data product");
		Search_Page searchpage=PageFactory.initElements(driver,Search_Page.class);
		
		try {
			searchpage.SearchProject(excel.getStringData("Product",0,0));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		Reporter.log("Entering Product Name",true);
		logger.info("Product Searched Succesfully");
		searchpage.button.click();
		searchpage.mobile.click();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		Helper.getWindowHandel(driver);
		searchpage.AddtoCart.click();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		Helper.captureScreenshot(driver);
		logger.pass("Success");
		
	}

}
