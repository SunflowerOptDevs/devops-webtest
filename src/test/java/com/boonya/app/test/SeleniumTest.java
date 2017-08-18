package com.boonya.app.test;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Parameters(name="driverPath")
	@Test
	public void b(String driverPath) {
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", driverPath); 
		driver = new InternetExplorerDriver();
		driver.get("http://www.baidu.com");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Parameters(name="driverPath")
	@Test
	public void c(String driverPath) {
		WebDriver driver;
		System.setProperty("webdriver.safari.bin", driverPath);
		driver = new SafariDriver();
		driver.get("http://www.baidu.com");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Parameters(name="driverPath")
	@Test
	public void d(String driverPath) {
		WebDriver driver;
		System.setProperty("webdriver.opera.bin", driverPath);
		driver = new OperaDriver();
		driver.get("http://www.baidu.com");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Parameters(name="driverPath")
	@Test
	public void e(String driverPath) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.bin", driverPath);
		driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		System.out.println(driver.getCurrentUrl());
	}

	@Parameters(name="driverPath")
	@Test
	public void f(String driverPath) {
		WebDriver driver;
		System.setProperty("webdriver.firefox.bin", driverPath);
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
