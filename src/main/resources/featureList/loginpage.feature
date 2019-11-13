Feature: Customer login

  Background:
    Given the user is on the login page
    Then the user is at login page

  @selenium
  Scenario: Make sure all UI components are present in the page ordinary
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

  @applitools
  Scenario: Make sure all UI components are present in the page using applitools
  And compare login page UI using applitools

  @selenium
  Scenario: Login page functionality
    And clicks on login button
    Then password and username empty "Both Username and Password must be present" error is shown
    And enter username "username" in username feild
    And clicks on login button
    Then password is mandatory "Password must be present" error is shown
    And enter password "password" in password field
    And clicks on login button
    Then username is mandatory "Username must be present" error is shown
    And enter username "username" in username feild
    And enter password "password" in password field
    And clicks on login button
    Then user is logged in

  @applitools
  Scenario: Login page functionality using applitools
    And clicks on login button
    Then compare password and username empty screenshot.
    And enter username "username" in username feild
    And clicks on login button
    Then compare password is mandatory screenshot
    And enter password "password" in password field
    And clicks on login button
    Then compare usename is mandatory screenshot
    And enter username "username" in username feild
    And enter password "password" in password field
    Then user is logged in by comparing dashboard layout






