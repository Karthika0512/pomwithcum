package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.Base;

public class HomePage extends Base {
public HomePage() {
		PageFactory.initElements(d, this);
	
	}
	
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addCustomer;
	
	
	public WebElement getAddCustomer() {
		return addCustomer;
	}

	
		
	}
	


