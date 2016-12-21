package com.seleniumwork.component;

import org.openqa.selenium.WebDriver;

import com.seleniumwork.page.DHlogin2;
import com.seleniumwork.util.DriverFactory;

public class DHcomplement {

	public DHcomplement() {
		String LocatorReposityName="\\page-locator-repository.xml";
		WebDriver driver2 = DriverFactory.getIEDriver();
	    driver2.get("http://www.cqdehua.cn/mgr/login.html");//访问地址，这个环节以后可以封装到 page 类中
		String xmllocation = DriverFactory.getDataSourcePath(LocatorReposityName);
		DHlogin2 dHlogin2 = new DHlogin2(xmllocation, "com.hpe.page.LoginPage", driver2);
		//DHlogin2 dHlogin23 = new DHlogin2(xmllocation, "com.hpe.page.MainPage", driver2);
	}

}
