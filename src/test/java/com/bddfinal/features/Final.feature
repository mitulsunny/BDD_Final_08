Feature: Osa login with email and  password

 # Background: 

  @InvalidUser
  Scenario: As a guest of osa trying to login
  Given I enter the osa url "https://osaconsultingtech.com/"
    And I click on forum button
    And I enter Invalid email
    And I enter Invalid Password
    When I click on login button
    Then I see invalid username and password

  @validUsername
  Scenario: As a student of osa trying to login
    And I enter valid email
    And I enter valid Password
    When I click on login button
    Then I verify the student page
    
    @validUsernameTwoline
  Scenario: As a student of osa trying to login
    And I enter valid emailParameter "abcd@gmail.com"
    And I enter valid PasswordParameter "1234567"
    When I click on login button
    Then I verify the student page

  @validUsernameParameter
  Scenario Outline: As a student of osa trying to login
    And I enter valid email <username>
    And I enter valid Password <password>
    When I click on login button
    Then I verify the student page

    Examples: 
      | username | password      |
      | "fhfhfh" | "hgfhggd+gjg" |
      | "hgjg"   | "ghhfhf"      |
      
     @validUsernameOneLineParm
  Scenario: As a student of osa trying to login
    And I enter the email and password
    |abcd@gmail.com|1234567|
    When I click on login button
    Then I verify the student page 
      
      
      
      
      
      
      
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
