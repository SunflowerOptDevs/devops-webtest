package com.boonya.app.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
/**
 * Windows下测试Selenium浏览器行为测试
 * @packge com.boonya.app.test.WindowsSeleniumTest
 * @date   2017年8月20日  下午7:30:49
 * @author pengjunlin
 * @comment   
 * @update
 */
public class WindowsSeleniumTest {
	
	/**
	 * Please read:https://github.com/mozilla/geckodriver
	 * Download geckodriver:https://github.com/mozilla/geckodriver/releases
	 * @MethodName: firefox 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void firefox() {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "geckodriver/windows/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		System.out.println(driver.getCurrentUrl());
	}

}
