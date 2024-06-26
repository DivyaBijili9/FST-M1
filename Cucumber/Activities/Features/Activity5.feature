@activity5
Feature: Data driven test with Example

  Scenario Outline: Testing with Data from Scenario
    Given User is on Login Home page
    When User enters "<Usernames>" and "<Passwords>"
    Then Read page title and confirmation
    And Close a Browser

    Examples:
      | Usernames | Passwords |
      | admin     | password  |
      | adminUser | Password  |