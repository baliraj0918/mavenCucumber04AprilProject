package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	WebDriver driver;
	
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Software\\chromedriver_win32\\chromedriver.exe");	
		driver=new ChromeDriver();				
		//launch web application
		driver.get("https://www.facebook.com/");
		//maximize the facebook window
		driver.manage().window().maximize();
	}
	
	public void userName(String uName) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uName);
	}
	
	public void passWord(String pass) {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	}
	
	public void loginButton() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	public void verifyLogin() {
		System.out.println("Login Successfuly");
	}
	
	public void createAccount() throws Exception {
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
	}
	
	public void verifySignUp() {
		System.out.println("SignUp Successfuly");
	}
}
