#Actor: Bibiana

@Tag0
  Feature: User register on webside utest.com

    @Tag1
    Scenario: Bibiana can register on the page with utest
      Given She is on the webside
      When she fills in the data of the first form
        | strName   | strLastName | strEmail            | strDateBirthmouth | strDateBirthday| strDateBirthyear |
        | Bibiana   | Giraldo     | bigiraldo@gmail.com | June              |             18 |             1989 |
      And she fills in the data of the second form
        | strCityfield | strZiporPostalCodefield | strCountry  |
        | Medellín     | 050043                  | Colombia    |
      And she fills in the data of the third form
        | strComputer | strVersionfield | strLanguagefield |
        | Windows     | 10              | Spanish          |
      And she fills in the data of the fourth form
        | strPassword        | strConfirmPassword   |
        | 123456789Bibiana   | 123456789Bibiana     |
      Then Bibiana will see this successful registration message Welcome to the world's largest community of freelance software testers!
