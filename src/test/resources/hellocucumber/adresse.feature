Feature: adresse
  Change a subscriber's address

  Scenario Outline: Modification of the address of a subscriber residing in France with or without effect date
    Given Subscriber's main address "<active>"
    When Advisor connected to "<canal>" changes the subscriber's address
    Then the modified subscriber's address is recorded on all the subscriber's contracts "<FACE>"
    And and an address modification movement is created "<EC>"
    Examples:
      | active           | canal    | FACE     | EC       |
      | ancienne adresse | active   | inactive | active   |
      | ancienne adresse | inactive | inactive   | inactive |
      | adresse 1        | active   | inactive | active   |
      | adresse 1        | inactive | inactive   | inactive |