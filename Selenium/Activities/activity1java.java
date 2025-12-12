package com.example.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity1java {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/");
		System.out.println("Title is:"+driver.getTitle());
		driver.findElement(By.linkText("About Us")).click();
		System.out.println("Title is:"+driver.getTitle());
		driver.quit();
	}
		

}
