#Author: Proservice
Feature: maison connecte

  Scenario: effectuer le tri et cliquer sur un produit
    Given utilisateur est sur la page maison connecte
    When utilisateur effectue le tri "Tri par popularité" et clique sur le produit "Mi Camera 2K Magnetic Mount"
    Then utilisateur est derige vers la page du produit "Mi Camera 2K Magnetic Mount"
