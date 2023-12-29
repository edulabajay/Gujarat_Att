package com.attestationstepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AttestationTest {
	WebDriver driver=null;
	


@Given("^browser should be open$")
public void browser_should_be_open()  {
    throw new PendingException();
}

@Given("^user should be on Login Page$")
public void user_should_be_on_Login_Page()  {
	System.setProperty("webdriver.chrome.driver", "C:/Selenium Driver/chromedriver_win32 (3)/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS );
	driver.manage().window().maximize();
}

@When("^user Enter email address and password$")
public void user_Enter_email_address_and_password()  {
	driver.get("https://mu.etranscript.in/app/#/auth/login");

}

@Then("^user click on login button$")
public void user_click_on_login_button()  {
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("rrr@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();

}




}
