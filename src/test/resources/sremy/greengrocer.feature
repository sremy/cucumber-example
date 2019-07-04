Feature: Compute addition of fruits and vegetables

  Scenario: Several fruits and vegetables
    Given the following products price per kilo:
      | name        | price_cts     |
      | apple       | 250           |
      | strawberry  | 690           |
      | peach       | 250           |
      | abricot     | 400           |
      | grape       | 300           |
      | banana      | 180           |
    When I buy the following products in the following weight:
#      | name        | weight_g      |
      | apple       | 450           |
      | strawberry  | 150           |
      | peach       | 200           |
      | abricot     | 250           |
    Then The greengrocer bill should be 1
