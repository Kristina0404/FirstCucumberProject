Feature: Rent a car

  @rentCar
  Scenario: input a car to rent
    Given User launches ChromeBrowser
    When User opens ilcarro Home Page
    And User clicks on Let the car work in link
    And User enters location and car details
    And User add photo the car
    And User clicks on Submit button
    Then Car adding in message displayed
    And User quites browser

    #Stuttgart,Germany
  # Manufacture: Mercedes
  # Model : C-Class
  #Year : 2019
  # Fuel : Diesel
  #Seats: 5
  #Car Class : C
  #Car registration number : S-DL2007
  #Price: 300



