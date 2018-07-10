Feature: Form automation
  As a user I want to login and purchase items


  Scenario Outline: eShop purchase
    Given user navigates to the app url
    When user fills username with value "<username>"
    And user fills password with value "<password>"
    And user click submit
    And user select category
    And user click blouse
    And user add to cart
    And user click proceed
    Then user verify address
    And user click checkout
    And user click continueOne
    And user click continueTwo
    And user click continueThree
    And user click continueFour
    And user click continueFive
    Then user verify price
    Then user verify message
    And user go back
    Then user verify orderPresence
    And user logout


    Examples:
      | username             | password  |
      | akifa@mailinator.com | Testing1! |




