package com.learnautomation.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.ExcelData;
import com.learnautomation.utility.Helper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class BaseClass {

	public WebDriver driver;
	public ExcelData excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuite() {
		Reporter.log("Setting up reports and test is ready",true);
		
		excel=new ExcelData();
		config=new ConfigDataProvider();
		 ExtentSparkReporter extent=new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/Reports/Amazon_"+Helper.getCurrentDateTime()+".html"));
		report=new ExtentReports();
		report.attachReporter(extent);
		Reporter.log("Setting done-Test Can be started",true);
		
	}
	@BeforeClass
	public void setUp()
	{
		Reporter.log("Trying to start browser and getting url",true);
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getUrl());
		Reporter.log("launched browser and url running succesfully",true);
		
	}	
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
		report.flush();
		
	}
}
