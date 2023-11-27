package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Page extends BaseClass{
	WebDriver driver;
	public Search_Page(WebDriver mdriver) {
		
		this.driver=mdriver;	
	}
@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
public WebElement Search;


@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]" )public WebElement button;

@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")public WebElement mobile;
@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")public WebElement AddtoCart;

@FindBy(xpath="//*[@id=\"nav-cart\"]")public WebElement Cart;

 public void SearchProject(String ProductName) {
	 
	 Search.sendKeys(ProductName);
	
 }}