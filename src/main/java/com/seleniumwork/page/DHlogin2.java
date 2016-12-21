package com.seleniumwork.page;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import com.seleniumwork.util.DataEngine;
import com.seleniumwork.util.DriverFactory;
import com.seleniumwork.util.GetElement;
import com.seleniumwork.util.Locator;
import com.seleniumwork.util.xmlUtils;

public class DHlogin2 {
	static String xmllocation;
	static String page;
	static WebDriver driver;
	Locator logname; 
	Locator logpass ; 
	Locator logbtn ;
	String testdatafilename="/login.xls";
	static GetElement gete = new GetElement();
	public DHlogin2(String xmllocation,String page,WebDriver driver) {
		this.xmllocation = xmllocation;
		this.page =page;
		this.driver = driver;
	}

	public void  init() {
		HashMap<String,Locator> maps = null;
		try {
			maps = xmlUtils.readXMLDocument(xmllocation, page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logname = maps.get("logname"); 
		logpass = maps.get("logpass"); 
		logbtn = maps.get("logbtn"); 
		
//        DataEngin dataengin =  new DataEngin();
        System.out.println("username："+DataEngine.getValueByRowID(DriverFactory.getDataSourcePath(testdatafilename), "username", 1));
        System.out.println("password："+DataEngine.getValueByRowID(DriverFactory.getDataSourcePath(testdatafilename), "password", 1));
		gete.getElement(driver, logname).sendKeys(DataEngine.getValueByRowID(DriverFactory.getDataSourcePath(testdatafilename), "username", 1) );
		gete.getElement(driver, logpass).sendKeys(DataEngine.getValueByRowID(DriverFactory.getDataSourcePath(testdatafilename), "password", 1) );
	}
	public void login(){
		GetElement gete = new GetElement();
		gete.getElement(driver, logbtn).click();
	}

}
