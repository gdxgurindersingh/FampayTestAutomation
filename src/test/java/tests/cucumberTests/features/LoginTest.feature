
@login
Feature: Verify login functionality on Fampay app

  Background: Create an instance of android or ios driver before each scenario
    Given User has Fampay "android" app

  Scenario: User should be able to login on app with correct credentials and initial set up should be shown
    Given user has "valid" mobile number
