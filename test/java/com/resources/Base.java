package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver d;
	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uer\\eclipse-workspace---Karthi1234\\PomwithCucum\\Driver\\chromedriver.exe");
		d=new ChromeDriver();
		d.get(url);
			} 
	
public static void type(WebElement e,String value) {
		
		e.sendKeys(value);
	}
	
	public static void button(WebElement e) {
		
		e.click();

	}


}
