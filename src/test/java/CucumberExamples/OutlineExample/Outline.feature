Feature: Create a Scenario outline example

  Scenario Outline: Login functionaltiy of the-internet.herokuapp
    Given user navigates to herokuapp
    When I enter username as "<username>" and Password as "<password>"
    Then login should be unsuccessful

    Examples:
    |username|password|
    |username1|password1|
    |username2|password2|