#Author: Proservices
Feature: homepage xiaomi

  Scenario: selectionner un menu de la page dacceuil
    Given utilsateur est sur la page dacceuil
    When utlisateur survole la souris sur le menu "Smart Home " et clique sur le submenu "Maison connectée"
    Then utilisateur est derige vers la page "Maison Connectée"
