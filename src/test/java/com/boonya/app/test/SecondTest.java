package com.boonya.app.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Random;

import org.testng.annotations.AfterClass;

public class SecondTest {
	@Test
	public void a() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("SecondTest a method....sucess!");
	}

	@Test
	public void b() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("SecondTest b method....sucess!");
	}

	@Test
	public void c() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("SecondTest c method....sucess!");
	}

	@Test
	public void d() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("SecondTest d method....sucess!");
	}

	@Test
	public void e() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("SecondTest e method....sucess!");
	}

	@Test
	public void f() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("SecondTest f method....sucess!");
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
