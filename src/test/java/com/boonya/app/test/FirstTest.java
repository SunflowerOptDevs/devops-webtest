package com.boonya.app.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FirstTest {
	@Test
	public void a() {
		System.out.println("FirstTest a method....sucess!");
	}

	@Test
	public void b() {
		System.out.println("FirstTest b method....sucess!");
	}

	@Test
	public void c() {
		System.out.println("FirstTest c method....sucess!");
	}

	@Test
	public void d() {
		System.out.println("FirstTest d method....sucess!");
	}

	@Test
	public void e() {
		System.out.println("FirstTest e method....sucess!");
	}

	@Test
	public void f() {
		System.out.println("FirstTest f method....sucess!");
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

}
