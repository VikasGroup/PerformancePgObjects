package com.wp.pgobjects;

import java.util.Iterator;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hana.core.BasicPageObject;
import com.hana.helpers.PgObjctModel;


public class PopUpPgObject extends BasicPageObject{

	//Web elements
		public  WebElement closeBtn = driver.findElement(By.xpath(".//*[@id='ctl00_objHTML']/body/div[3]/div/div/a"));
		
		final  Logger logger = Logger.getLogger(HomePgObject.class);
		public String PAGE_TITLE = "Popup Page";
		public QnetLtdPgObject qnetLtdPgObject;
	public PopUpPgObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void verifyPgLod(){
		logger.info(driver.getCurrentUrl());
		PgObjctModel.checkPageIsReady(driver, PAGE_TITLE);
	}
	public QnetLtdPgObject closeBtnClick() throws InterruptedException{
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler);
		//Thread.sleep(4000);
		closeBtn.click();
		Thread.sleep(4000);
		System.out.println("tttttttttttttttttttttttttt");
		driver.switchTo().window(parentWindowHandler);
		
		//driver.switchTo().window(BasicPgObjects.getParentWndw(driver));
		qnetLtdPgObject = new QnetLtdPgObject(driver);
		return qnetLtdPgObject;
	}
	
	
	

}
