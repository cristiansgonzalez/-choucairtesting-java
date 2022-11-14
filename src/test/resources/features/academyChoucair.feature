# Autor: Christian Saul Gonzalez Santos
@stories
Feature: Prueba tecnica Choucair
  As a user, I am going to create a user on the Utest page
  @scenario1
  Scenario: Create user
    Given you want to create an user in Utest page
    Then go to the botton join today
    When enters your personal information
    | fistName | lastName | email                        | day | moth | year | spoken  |
    | Cristian | Gonzalez | cristian-saul-66@hotmail.com | 13  | 6    | 1991 | Spanish |
    And enter your personal location
    | city   | state  | postalCode | country  |
    | Ibague | Tolima | 730001     | Colombia |
    And enter yours personal divices
    | sOComputer | version   | languague | mobile | modelo            | sysOp         |
    | Windows    | Windows 10| Spanish   | Apple  | iPhone 14 Pro Max | iOS 16.1 Beta |
    And create your password
    | password  |
    | utomatico |
    And agree with terms and conditions
    Then your user will be create
    