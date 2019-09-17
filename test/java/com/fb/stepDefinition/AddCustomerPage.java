package com.fb.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.objectRepository.HomePage;
import com.resources.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerPage extends Base {
	@Given("User is on add customer page")
	public void user_is_on_add_customer_page() {
HomePage page=new HomePage();
		
		button(page.getAddCustomer());
		
	}

	@When("User enters login details")
	public void user_enters_login_details() {

		d.findElement(By.xpath("//label[@for='done']")).click();
		d.findElement(By.id("fname")).sendKeys("Karthika");
		d.findElement(By.id("lname")).sendKeys("R");
		d.findElement(By.id("email")).sendKeys("Karthi@gmail.com");
		d.findElement(By.name("addr")).sendKeys("chennai");
		d.findElement(By.id("telephoneno")).sendKeys("7894561235");
		
	}

	@Then("Verify url message")
	public void verify_url_message() {
		String s = d.getCurrentUrl();
		boolean b = s.contains("telecom");
		Assert.assertTrue(b);
	 
	}



}
