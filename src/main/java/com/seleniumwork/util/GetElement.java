package com.seleniumwork.util;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class GetElement {
	WebElement e;
	public GetElement() {
		
	}
	public WebElement getElement(WebDriver driver,Locator locator) {
		//WebElement e;
		Log log	= new Log(this.getClass());
		switch (locator.getBy()) {
		case xpath:
			log.debug("find element By xpath");
			e = driver.findElement(By.xpath(locator.getElement()));
			break;
		case id:
			log.debug("find element By id");
			e = driver.findElement(By.id(locator.getElement()));
			break;
		case name:
			log.debug("find element By name");
			e = driver.findElement(By.name(locator.getElement()));
			break;
		case cssSelector:
			log.debug("find element By cssSelector");
			e = driver.findElement(By.cssSelector(locator.getElement()));
			break;
		case className:
			log.debug("find element By className");
			e = driver.findElement(By.className(locator.getElement()));
			break;
		case tagName:
			log.debug("find element By tagName");
			e = driver.findElement(By.tagName(locator.getElement()));
			break;
		case linkText:
			log.debug("find element By linkText");
			e = driver.findElement(By.linkText(locator.getElement()));
			break;
		case partialLinkText:
			log.debug("find element By partialLinkText");
			e = driver.findElement(By.partialLinkText(locator.getElement()));
			break;
		default:
			e = driver.findElement(By.id(locator.getElement()));
		}
		return e;
	}
	
	

}
