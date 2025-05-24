# 🏥 Application Web JEE – Gestion des Patients

## Introduction

Ce projet vise à développer une application Web pour la gestion des patients, réalisée dans le cadre d’un TP avec les technologies **Spring Boot**, **Spring MVC**, **Thymeleaf** et **Spring Data JPA**.  
L’objectif principal est de créer une interface web simple, permettant de gérer facilement une liste de patients en effectuant des opérations basiques telles que l’affichage, la suppression, la recherche et la pagination.

---

## Technologies utilisées

Pour réaliser ce projet, plusieurs technologies et frameworks ont été mobilisés :

- **Java** : langage principal de développement.
- **Spring Boot** : pour la configuration et le lancement rapide de l’application.
- **Spring MVC** : pour gérer la logique des requêtes et la navigation.
- **Spring Data JPA** : pour l’interaction avec la base de données relationnelle.
- **Thymeleaf** : moteur de template pour construire des vues HTML dynamiques.
- **Base de données H2** (en mémoire) : utilisée pour simplifier le développement.

---

## Fonctionnalités implémentées

Dans cette première version, les fonctionnalités suivantes ont été développées et testées avec succès :

- **Affichage des patients** : la liste complète des patients est récupérée depuis la base de données et affichée sous forme de tableau.
- **Suppression d’un patient** : chaque patient peut être supprimé via un bouton dédié dans la liste.
- **Insertion automatique des données** : au démarrage de l’application, quelques patients sont insérés automatiquement pour permettre les tests.

Ces fonctionnalités constituent le socle minimal demandé dans l’énoncé du TP, avec une application fonctionnelle et stable.

---

## Résultat visuel

L’image ci-dessous illustre le résultat obtenu : une page web présentant la liste des patients dans un tableau clair et organisé.  
Chaque ligne correspond à un patient avec ses informations, ainsi qu’un bouton permettant de le supprimer.

![Résultat console](screenshots/résultat.PNG)


---

## Description technique

L’architecture du projet repose sur le modèle **MVC (Modèle-Vue-Contrôleur)** :

- **Modèle** : la classe `Patient` représente l’entité métier. Elle est mappée à la table `PATIENTS` dans la base de données grâce à JPA.
- **Vue** : réalisée avec Thymeleaf, elle affiche dynamiquement la liste des patients fournie par le contrôleur.
- **Contrôleur** : la classe `PatientController` gère les requêtes HTTP, notamment l’affichage de la liste des patients et la suppression.

Lors du démarrage, la méthode `CommandLineRunner` insère plusieurs patients dans la base de données pour rendre l’application immédiatement exploitable.

---

## Comment lancer l’application

Pour exécuter le projet :

1. Ouvrir un terminal dans le dossier du projet.
2. Lancer la commande Maven suivante :

   ```bash
   mvn spring-boot:run
