package com.boonya.app.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
/**
 * Linux下测试Selenium浏览器行为测试
 * @packge com.boonya.app.test.selenium.LinuxSeleniumTest
 * @date   2017年8月20日  下午7:38:38
 * @author pengjunlin
 * @comment   
 * @update
 */
public class LinuxSeleniumTest {
	
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
		System.setProperty("webdriver.gecko.driver", "./geckodriver/linux/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		System.out.println(driver.getCurrentUrl());
	}

}
