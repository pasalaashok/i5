Feature: Verify saucedemo e2e flow

  @tag1SurenKalyani
  Scenario: verify saucdemo e2e flow with valid data
  Given user is on saucedemo login screen suren
  When user login to the aplication suren
  Then user navigates to cart screen upon adding a product suren
  And user checkout the product
  Then user fills the form navigate to order confirmation screen
  And user places order and navigate back to home
  Then user logout from the application
    