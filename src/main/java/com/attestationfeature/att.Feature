Feature: Mumbai Attestation

  @login
  Scenario: Login Page
    Given browser should be open
    And user should be on Login Page
    When user Enter email address and password
    Then user click on login button
