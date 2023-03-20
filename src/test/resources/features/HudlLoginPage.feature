Feature: As a user of Hudl application I want to be able to enter my credentials so I can use the Hudl application for testing

  Scenario: Check Login with valid Email address and Password
    Given I am on the Hudl Home page
    When I click on the Login button
    And I click on the Hudl button
    When I enter my email and password into the text fields
    When I click on the Login button
    Then I should login successfully into the application and the Explore text should be displayed
