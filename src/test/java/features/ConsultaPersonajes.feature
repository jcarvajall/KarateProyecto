Feature: Consulta de personajes en Rick and Morty API

  Background:
    * url 'https://rickandmortyapi.com/api'

  Scenario: Consultar personajes en la página 1
    Given path 'character'
    And param page = 1
    When method get
    Then status 200
    And match response.results[0].name == 'Rick Sanchez'
    And match response.results[0].status == 'Alive'
