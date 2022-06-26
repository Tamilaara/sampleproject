package com.windowhandling.SampleProject;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.get("httpa://www.amazon.com");
		String titlename = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println(titlename);
		System.out.println(url);
		
	}

}
