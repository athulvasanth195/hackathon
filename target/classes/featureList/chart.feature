Feature: As customer verify the Chart Functionality available in dashboard
  #customer  name mr Jack
  Background:
    Given Jack is on the login page
@applitools
Scenario: As customer Jack wants to see expense charts for year 2018 and 2019
And enter username "username" in username field
And enter password "password" in password field
And clicks on login button
And click on show expense chart link
Then compare chart data using applittols
And click on show data for next year button
Then assert new chart data shown using applittols