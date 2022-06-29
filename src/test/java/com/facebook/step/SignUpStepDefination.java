package com.facebook.step;

import com.facebook.pages.SignUpPage;

import io.cucumber.java.en.When;

public class SignUpStepDefination {

	 SignUpPage signUp=new SignUpPage();
	 
	@When("^user enter firstname (.*)$")
	public void user_enter_firstname_bali(String firstName) {
		signUp.firstName(firstName);
	}

	@When("^user enter lastname (.*)$")
	public void user_enter_lastname_raj(String lastName) {
	   signUp.lastName(lastName);
	}
}
