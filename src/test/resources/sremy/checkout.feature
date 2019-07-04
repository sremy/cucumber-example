Feature: Compute addition of prices

  Scenario: Several products
    Given the following products:
      | name | price_cts |
      | Toothbrush | 150 |
      | Butter | 090 |
      | Marmelade | 210 |
      | Cake | 300 |
      | Cake | 300 |
      | Beer | 250 |
    When I buy all products and ask the bill
    Then The total should be 1300                 

    
  Scenario: Several products with discount voucher
    Given the following products:
      | name          | price_cts    |
      | Toothbrush    | 150          |
      | Butter        | 090          |
      | Marmelade     | 210          |
      | Cake          | 300          |
      | Cake          | 300          |
      | Beer          | 250          |
    And the following discounts:
      | name          | discount_cts |
      | Beer          | 50           |
    When I ask the bill
    Then The total should be 1250
