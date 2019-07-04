Feature: Compute sum of figures

  Scenario: Two figures
    Given a is 2
    And b is 5
    When I ask the addition
    Then I should be told 7


  Scenario: Many figures
    Given the following figures:
      | 1 |
      | 4 |
      | 2 |
      | 3 |
    When I ask the addition
    Then I should be told 10