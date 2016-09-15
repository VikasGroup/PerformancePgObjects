package com.wp.pgobjects;

import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hana.core.BasicPageObject;
import com.hana.helpers.PgObjctModel;



public class LandingPgObject extends BasicPageObject {
	//Web elements
	public  WebElement voBtn = driver.findElement(By.xpath(".//*[@id='form1']/div[3]/div/div[1]/div[1]/a[1]"));
	
	final  Logger logger = Logger.getLogger(LandingPgObject.class);
	public  String PAGE_TITLE = "Landing Page";
	public  LoginPgObject loginPgObject;

	public LandingPgObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void verifyPgLod(){
		logger.info(driver.getCurrentUrl());
		PgObjctModel.checkPageIsReady(driver, PAGE_TITLE);
	}
	public LoginPgObject voBtnCliclk(){
		voBtn.click();
		
		if(PgObjctModel.checkPageIsReady(driver, "Login Page")){
			loginPgObject = new LoginPgObject(driver);
			return loginPgObject;
		}
		
		else
			return null;
	}

}
