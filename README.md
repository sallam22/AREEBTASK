# Automation task:
# Short Description
## I used the basic technique for this task If you want me to apply the page object model will discuss it in the interview

1. I used selunium webdriver with java using Testng
2.  I used the happy scenario only for login to the website then adding orders and making checkout
   # steps to run the project
   1. You can download the repo code
   2. From src/main/java
   3. Check the AdingItems.java
   4. Run the AdingItems.java

# Manual Task:

  A) Write only one or two full scenarios with steps (BDD) and the other scenarios title only
    The answer to A :
   Feature: New Subscription
  Scenario: Verify when the user enters valid (First Name-Last Name-Mobile-Email-Birthdate-Address-Gender) and then able to make a subscription
    Given User login to the app 
    And Open the Accounting
    And from the bottom navigation bar click on User Profile
    When click on add new subscription
    And user enters valid (First Name-Last Name-Mobile-Email-Birthdate-Address-Gender)
    Then Subscribe Done
    
    
    Scenario: Verify when the user enters a first name less 5 letters then a message error appears for validation
    Scenario: Verify when the user enters a first name greater than 15 letters then a message error appears for validation
    Scenario: Verify when the user enters letters between 5 to 15 and then is able to add the first name successfully
    Scenario: Verify when the user adds first with special characters and spaces then a message error appears for validation
    Scenario: Verify when the user enters numbers only for the first name then a message error appears for validation
    Scenario: Verify when the user adds the birth future date then a message error appears for validation
    Scenario: Verify when the user does not fill in the (First Name-Last Name-Mobile-Email) then a message error appears to tell the user those fields are mandatory
    Scenario: Verify when the user adds empty data for all fields then a message error appears to tell the user for mandatory fields

B) If we have a bug in the first name field that accepts less than 5 letters, report a bug
 The answer to B :
    [Subscription]-The first name field accepts less than 5 letters
    Steps to reproduce:
       1. login to the app
       2. From accounting click on the user profile
       3. Click on add a new subscription
       4. Fill the first name with less than 5 letters
           ex >> first name= ahm
      5. File other fields and save
      6. Check the scenario from the attached image or video
      
Expected Results: The first name should  not accept  less than 5 letters
Actual Results: The first name field accepts less than 5 letters
Note app version app is v11.5
       
    
        
      

