package com.boonya.app.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ThirdTest {
	@Test
	public void a() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ThirdTest a method....sucess!");
	}

	@Test
	public void b() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ThirdTest b method....sucess!");
	}

	@Test
	public void c() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ThirdTest c method....sucess!");
	}

	@Test
	public void d() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ThirdTest d method....sucess!");
	}

	@Test
	public void e() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ThirdTest e method....sucess!");
	}

	@Test
	public void f() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ThirdTest f method....sucess!");
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
