Feature: Login Test

  Scenario: Go to amazon website and test login

    Given go to facebook website
    And enter e-mail
    And enter password
    When click submit button
    Then verify success message