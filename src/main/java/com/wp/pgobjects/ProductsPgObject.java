package com.wp.pgobjects;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;

import com.hana.core.BasicPageObject;
import com.hana.helpers.PgObjctModel;



public class ProductsPgObject extends BasicPageObject{

	final  Logger logger = Logger.getLogger(HomePgObject.class);
	public String PAGE_TITLE = "Products Page";
	public ProductsPgObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void verifyPgLod(){
		logger.info(driver.getCurrentUrl());
		PgObjctModel.checkPageIsReady(driver, PAGE_TITLE);
	}

}
