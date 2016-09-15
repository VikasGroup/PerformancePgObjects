package com.wp.pgobjects;

import java.util.Iterator;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hana.core.BasicPageObject;
import com.hana.helpers.PgObjctModel;



public class LoginPgObject extends BasicPageObject{

	//Web elements
		public  WebElement userNameTf = driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_txtTCO']"));
		public  WebElement passwordTf = driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_txtPassword']"));
		public  WebElement loginBtn = driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_btnLogin']"));
		
		final  Logger logger = Logger.getLogger(LoginPgObject.class);
		public String PAGE_TITLE = "Loging Page";
		public PopUpPgObject popUpPgObject;
	public LoginPgObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void verifyPgLod(){
		logger.info(driver.getCurrentUrl());
		PgObjctModel.checkPageIsReady(driver, PAGE_TITLE);
	}
	public PopUpPgObject login(String userName,String password) throws InterruptedException{
		userNameTf.sendKeys(userName);
		passwordTf.sendKeys(password);
		loginBtn.click();
		driver.switchTo().window(BasicPageObject.getSubWindow(driver));
		popUpPgObject = new PopUpPgObject(driver);
		return popUpPgObject;
	}

}
