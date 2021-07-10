Feature: Login funtionality of adactin application

Scenario: User enters valid username and password
      Given User launch url of adactin application
      When User enters "vivek1002" username
      And User enters "Vivek@123" as password
      And User click login button 
      Then User validate the login button
      
 Scenario: To choose the hotel in search page of adactin application
    When User select the location of hotel available 
    Then User click search button to validate
    
  Scenario: To select the hotel name
  When User select the name of the hotel
  Then user click and validate the continue button
  
  Scenario: User fill the credentials to confirm booking
  When User enters First name
  And User enters Last name
  And User enters Address
  And user enters Credit Card Number 
  And user enters Credit Card Type
  And User enters Expiry Month And Year
  And User enters CVV number
  Then User clicks Book Now button to validate For Confirm booking
  
    
       