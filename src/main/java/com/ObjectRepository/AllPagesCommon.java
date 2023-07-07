package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AllPagesCommon {

	WebDriver driver;
	
	public AllPagesCommon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
