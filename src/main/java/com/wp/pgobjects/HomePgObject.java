package com.wp.pgobjects;

import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hana.core.BasicPageObject;
import com.hana.helpers.PgObjctModel;





public class HomePgObject extends BasicPageObject {
	//Web elements
	public  WebElement irLoginBtn = driver.findElement(By.id("ctl00_ctl11_hlLogin"));
	
	final static Logger logger = Logger.getLogger(HomePgObject.class);
	public static String PAGE_TITLE = "Home Page";
	public static LandingPgObject landingPgObject;
	
	public HomePgObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void verifyPgLod(){
		logger.info(driver.getCurrentUrl());
		PgObjctModel.checkPageIsReady(driver, PAGE_TITLE);
	}
	
	public LandingPgObject clickIRLoginBtn(){
		irLoginBtn.click();
		landingPgObject = new LandingPgObject(driver);
		return landingPgObject;
	}

}
