package com.hudl.pages.tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.DriverInstance;
import gherkin.lexer.Hu;
import pages.HudlHomePage;
import pages.HudlLoginPage;

public class HudlLoginTest extends DriverInstance {
    HudlHomePage HudlHomePage = new HudlHomePage(driver);
    HudlLoginPage HudlLoginPage = new HudlLoginPage(driver);

    @Given("^I am on the Hudl Home page$")
    public void i_am_on_the_Hudl_Home_page() throws Throwable {
        System.out.println("This should display the Home page");
    }


    @When("^I click on the Login button$")
    public void i_click_on_the_Login_button() throws Throwable {
        HudlHomePage.clickLoginButton();
    }

    @When("^I enter my email and password into the text fields$")
    public void i_enter_my_email_and_password_into_the_text_fields() throws Throwable {
        HudlLoginPage.doLogin("alder1.amu@gmail.com", "Angel@!2010");
    }

    @Then("^I should login successfully into the application and the Explore text should be displayed$")
    public void i_should_login_successfully_into_the_application_and_the_Explore_text_should_be_displayed() throws Throwable {
        HudlLoginPage.assertTeamPage();
    }
}






