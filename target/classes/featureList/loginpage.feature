Feature: As an existing customer verify the UI and Functionality of the login page
#customer  name mr Jack
  Background:
    Given Jack is on the login page

  @selenium
  Scenario: As an existing customer Mr John is at login page
    Then header "Login Form" is present in the page
    Then header image Blue and white circles are present in the page
    Then "Username" username field header is present
    Then username image is present
    Then username field is present
    Then "Password" password field header is present
    Then password image is present
    Then password field is present
    Then "Log In" login button is present
    Then "Remember Me" check box is present
    Then all social media icons are present

  @applitools
  Scenario: As an existing customer Mr John is at login page
    Then login page screenshot is in align with applitools baseline

  @selenium
  Scenario: As an existing user verify the functionality of login page elements
    And clicks on login button
    Then password and username empty "Both Username and Password must be present" error is shown
    And enter username "username" in username field
    And clicks on login button
    Then password is mandatory "Password must be present" error is shown
    And clear username field
    And enter password "password" in password field
    And clicks on login button
    Then username is mandatory "Username must be present" error is shown
    And enter username "username" in username field
    And enter password "password" in password field
    And clicks on login button
    Then Jack is on website dashboard

  @applitools
  Scenario: Login page functionality using applitools
    And clicks on login button
    Then compare password and username empty screenshot.
    And enter username "username" in username field
    And clicks on login button
    Then compare password is mandatory screenshot
    And clear username field
    And enter password "password" in password field
    And clicks on login button
    Then compare username is mandatory screenshot
    And enter username "username" in username field
    And enter password "password" in password field
    And clicks on login button
    Then user is logged in by comparing dashboard layout








