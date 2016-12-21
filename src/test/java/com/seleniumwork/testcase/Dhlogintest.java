package com.seleniumwork.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.seleniumwork.page.DHlogin2;
import com.seleniumwork.util.DriverFactory;

public class Dhlogintest {
	@Test
	public void Dhlogintest() {
		WebDriver driver2 = DriverFactory.getIEDriver();
	    driver2.get("http://www.cqdehua.cn/mgr/login.html");//访问地址，这个环节以后可以封装到 page 类中
		//DHlogin2 d2 = new DHlogin2("C:\\Users\\zhanzhiq\\workspace\\maven-baseline\\src\\main\\resources\\page-locator-repository.xml", "com.hpe.page.LoginPage", driver2);
		DHlogin2 d2 = new DHlogin2(DriverFactory.getLocatorPath("\\page-locator-repository.xml"), "com.hpe.page.LoginPage", driver2);
		d2.init();
		d2.login();
	}
}
