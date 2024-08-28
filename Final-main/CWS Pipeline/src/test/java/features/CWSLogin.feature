@CWS
Feature: Login Validation

Background:
  Given I enter the URL using <"edge">

  Scenario: Perform successful login
    When I enter the username and password and click on login
    Then I am successfully logged in

  Scenario Outline: CRN numbers and availability in bloodbank
    When I enter the username and password and click on login
    And I enter the "<CRN>" number in homepage
    And click on Blood bank button
    Then Check the Blood bank details are available for the entered crn number
    Examples:
      | CRN|
      | 999367 |
      | 999368 |
