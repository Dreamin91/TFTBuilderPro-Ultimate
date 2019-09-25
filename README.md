# TFT Builder Pro - Ultimate

## Procédure d'installation

* Mettre à jour les dépendances Maven

* Installation de la Base de Données

Utiliser la commande docker suivante :

```
docker run --name mariadb --rm -e MYSQL_ROOT_PASSWORD=toor -e MYSQL_DATABASE=defaultdb -p 3306:3306 -v "`pwd`/initdb:/docker-entrypoint-initdb.d" mariadb
```

Par défaut dans le ficher *application.properties*, la base de données se situe à l'adresse 192.168.99.100. 

En cas de problèmes de base de données vide après ajout de la base de données dans intelliJ, lancer manuellement les scripts SQL situés dans le dossier *initdb*.

* Lancer Application dans IntelliJ 

Par défaut la base de données ne contient aucune équipe déjà faite. Il faut donc en créer une sur le site.