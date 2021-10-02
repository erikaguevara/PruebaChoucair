#Erika Guevara
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay al the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given Erika Desea Registrarse En Utest
    | strName    | strLastName |  strEMail |
    | Erika | Burgos | ergb22@hotmail.com  |
    When Ella desea ingresar a la plataforma para registrarse
      | strName    | strLastName |  strEMail |
      | Erika | Burgos | ergb22@hotmail.com  |
    Then Ella termino de registrarse
      | strName    | strLastName |  strEMail |
      | Erika | Burgos | ergb22@hotmail.com  |
