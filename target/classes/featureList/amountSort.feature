Feature: As a customer verify the sort Functionality available in dashboard
  #customer  name mr Jack
  Background:
    Given Jack is on the login page
  @selenium
  Scenario: As customer Jack wants to sort dashboard table in ascending order of amounts
    And enter username "username" in username field
    And enter password "password" in password field
    And clicks on login button
    And clicks on amount tab
    Then amounts are in ascending order

  @applitools
  Scenario: As customer Jack wants to sort dashboard table in ascending order of amounts
    And enter username "username" in username field
    And enter password "password" in password field
    And clicks on login button
    And clicks on amount tab
    Then compare sorted data using applittols
