package com.selenium.page.factory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageObjectModel {

	public SeleniumPageObjectModel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver = new ChromeDriver();
	
	@FindBy (xpath = "//*[text()='Laptops']")
	private WebElement laptopButton;
	
	@FindBy (xpath = "//*[@class='col-lg-9']//h4")
	private List<WebElement> productName;
	
	@FindBy (xpath = "//*[@class='col-lg-9']//h5")
	private List<WebElement> productPrice;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLaptopButton() {
		return laptopButton;
	}

	public List<WebElement> getProductName() {
		return productName;
	}

	public List<WebElement> getProductPrice() {
		return productPrice;
	}
}
