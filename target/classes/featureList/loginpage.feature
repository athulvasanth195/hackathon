Feature: Customer login

  Background:
    Given the user is on the login page
    Then the user is at login page

  @Login @Regression
  Scenario: Make sure all UI components are present in the page
    And check whether header "Login Form" is present in the page
    And check whether header image Blue and white circles are present in the page
    And check whether "Username" username field header is present
    And checks whether username image is present
    And checks whether username field is present
    And check whether "Password" password field header is present
    And checks whether password image is present
    And checks whether password field is present
    And checks whether "Log In" login button is present
    And checks whether "Remember Me" check box is present
    And checks whether all social media icons are present


