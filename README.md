Application Web JEE – Gestion des Patients
📌 Présentation du projet
Ce projet consiste en la création d'une application Web JEE de gestion des patients, développée avec les technologies Spring Boot, Spring MVC, Thymeleaf et Spring Data JPA.
Le but principal est de manipuler une base de données de patients en utilisant une interface simple et intuitive.

🛠️ Technologies utilisées
Java

Spring Boot

Spring MVC

Spring Data JPA

Thymeleaf (moteur de templates)

H2 Database (en mémoire, pour le développement)

Maven

✅ Fonctionnalités implémentées
Affichage de la liste des patients

Suppression d’un patient

Insertion automatique de quelques patients au démarrage de l’application

🖼️ Résultat (Interface utilisateur)
L’image suivante montre l’interface actuelle de l’application, qui affiche la liste des patients sous forme de tableau. Chaque patient peut être supprimé via un bouton d’action :

![Liste des patients](screenshots/partie1.PNG)


📌 Explication du fonctionnement
L'application repose sur l'architecture MVC (Modèle-Vue-Contrôleur) :

Modèle : représente les entités métier (patients) et la gestion des données avec JPA.

Vue : pages HTML générées avec Thymeleaf, permettant l’affichage dynamique des patients.

Contrôleur : traite les requêtes utilisateur (affichage, suppression) et fournit les données à la vue.

Une fois lancée, l’application insère automatiquement quelques patients dans la base de données, puis les affiche sur une page accessible à l’adresse /index.

