package com.boonya.app.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void c() {
		WebDriver driver;
		driver = new SafariDriver();
		driver.get("http://www.baidu.com");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void d() {
		WebDriver driver;
		driver = new OperaDriver();
		driver.get("http://www.baidu.com");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void e() {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void f() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		System.out.println(driver.getCurrentUrl());
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println(".......................beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println(".......................afterClass");
	}
}
