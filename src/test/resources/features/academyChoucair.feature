#Erika Guevara
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay al the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Rose want to learn automation at the Academy Choucair
    | strUser    | strPassword   |
    | 1057584314 | Choucair2021* |
    When she search for the course on the Choucair Academy platform
    | strCourse                              |
    | Cursos Y Certificaciones    |
    Then she finds the course called
    | strCourse                              |
    | FOUNDATION LEVEL ONLINE 2018   |
