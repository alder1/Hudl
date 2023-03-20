package com.hudl.pages.tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.DriverInstance;
import pages.HudlHomePage;



public class HudlHomePageTest  extends DriverInstance {
    HudlHomePage HudlHomePage = new HudlHomePage(driver);

    @Given("^I am on the Hudl Home page$")
    public void i_am_on_the_Hudl_Home_page() throws Throwable {
        System.out.println("This should display the Home page");
    }

    @When("^I click on the Log in button$")
    public void i_click_on_the_Log_in_button() throws Throwable {
        HudlHomePage.clickLoginButton();
    }

    @When("^I click on the Hudl button$")
    public void i_click_on_the_Hudl_button() throws Throwable {
        HudlHomePage.clickHudlButton();
    }

    @Then("^The Login page should be displayed$")
    public void the_Login_page_should_be_displayed() throws Throwable {
        HudlHomePage.assertLoginPage();
    }
}