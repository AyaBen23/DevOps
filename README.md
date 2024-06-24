### Étapes pour construire le projet :

1. Cloner le dépôt
2. Exécuter la commande suivante dans le répertoire racine du projet :
docker-compose up

3. Le projet sera construit et le serveur démarré par défaut sur le port 7000. Pour accéder au serveur, allez à `http://localhost:7000` dans votre navigateur.

## À propos du Projet

Ce projet contient 3 services :

1. **Service Backend** : Gestion de la logique backend de l'application avec Springboot et Java. Gestion des requêtes API et interaction avec la base de données.
2. **Service de Base de Données** : Gestion des opérations de la base de données avec PostgreSQL.
3. **Service de Proxy Inverse** : Routage des requêtes vers le service approprié avec le serveur Apache.

## Questions TPS

1.Why should we run the container with a flag -e to give the environment variables?
    Nous devons utiliser le drapeau -e pour passer les variables d'environnement au conteneur, car elles configurent le conteneur à l'exécution, permettant d'utiliser les paramètres corrects pour l'application.
    
    
2.When we talk about /docker-entrypoint-initdb.d it means inside the container, so you have to copy your directory's content and the container’s directory.    
    docker-entrypoint-initdb.d est utilisé pour initialiser la base de données au démarrage du conteneur. Les scripts dans ce répertoire sont exécutés pour créer le schéma de la base de données et la remplir de données.

3.Why do we need a volume to be attached to our postgres container?

Nous attachons un volume au conteneur PostgreSQL pour persister les données. Cela permet de stocker les données sur la machine hôte, même si le conteneur est arrêté ou supprimé.
    
4.Why do we need a multistage build?    
    Une construction multi-étapes permet de réduire la taille de l'image finale. Nous utilisons plusieurs étapes pour construire l'application, et nous ne copions que les fichiers nécessaires des étapes précédentes à l'étape finale.
    
5.Why do we need a reverse proxy?    
    Un proxy inverse route les requêtes vers le service approprié, équilibre la charge entre plusieurs instances de service, et offre des fonctionnalités de sécurité supplémentaires telles que la limitation de débit, le filtrage des requêtes et l'authentification.
    
6.Why is docker-compose so important?    
le code Docker-compose permet de définir et d'exécuter des applications multi-conteneurs Docker. Il permet de définir les services, réseaux et volumes pour notre application dans un seul fichier et de gérer facilement l'application avec la commande docker-compose.
    
7.What ```mvn clean verify```is it supposed to do?    

mvn clean verify est une commande Maven qui nettoie le projet, compile le code source, exécute les tests et empaquette l'application. Elle est utilisée pour construire et tester l'application avant le déploiement en production.
8. Unit tests? Component tests? Integration tests? 
    Les tests unitaires vérifient les unités individuelles de l'application. Les tests de composants vérifient les interactions entre plusieurs unités. Les tests d'intégration vérifient l'intégration de l'application avec des systèmes ou services externes, testant la fonctionnalité de bout en bout.
        
9. What are testcontainers?    
Testcontainers est une bibliothèque Java qui fournit des instances légères et éphémères de conteneurs Docker pour les tests. Elle permet de créer et de gérer facilement des conteneurs Docker dans les tests, offrant un moyen cohérent de tester les applications en environnement similaire à la production.

10. Secured Variables in Github, why?

Sécuriser les variables dans GitHub empêche l'exposition d'informations sensibles telles que les clés API, les mots de passe ou les jetons d'accès, assurant ainsi la sécurité de l'application.

## Documentation

Chaque fichier du projet est documenté avec des commentaires pour expliquer le but du fichier et du code. 
