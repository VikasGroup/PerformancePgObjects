package com.wp.pgobjects;

import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hana.core.BasicPageObject;
import com.hana.helpers.PgObjctModel;



public class QnetLtdPgObject extends BasicPageObject {

	//Web elements
			public  WebElement shopBtn = driver.findElement(By.xpath(".//*[@id='ctl00_TabMenu1_lbnShopNow']"));
			public  WebElement signOutBtn = driver.findElement(By.xpath(".//*[@id='ctl00_header1_lbnSignOut']"));
			final  Logger logger = Logger.getLogger(HomePgObject.class);
			public  String PAGE_TITLE = "QNet ltd Page";
			public  ProductsPgObject productsPgObject;
	public QnetLtdPgObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void verifyPgLod(){
		logger.info(driver.getCurrentUrl());
		PgObjctModel.checkPageIsReady(driver, PAGE_TITLE);
	}
	public ProductsPgObject sopbtnClick(){
		shopBtn.click();
		productsPgObject = new ProductsPgObject(driver);
		return productsPgObject;	
	}
	public void signOutBtnClick(){
		signOutBtn.click();
		
		
	}

}
