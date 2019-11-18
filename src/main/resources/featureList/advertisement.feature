Feature: As a business user verify the presence of advertisements in dashboard
  #Business user  name mr Nick
  Background:
    Given Jack is on the advertisement dashboard
  @applitools
  Scenario: As business user Nick wants to assert the presence of advertisements in dashboard
    And enter username "username" in username field
    And enter password "password" in password field
    And clicks on login button
    Then advertisements are present
    And advertisement are the same
