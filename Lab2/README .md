# SEG3503 Lab 02

## Exercice 1 - Exécution des tests par classes d'équivalence

Dans cet exercice, j’ai exécuté manuellement plusieurs tests sur l’application d’enregistrement des utilisateurs.  
Pour chaque cas de test, j’ai indiqué le résultat escompté, le résultat actuel obtenu après l’exécution, ainsi que le verdict.

| Cas de test | Résultats escomptés | Résultats actuels | Verdict |
|---|---|---|---|
| 1 | Wrong UserName format | L’application refuse le formulaire parce que le nom d’utilisateur `000000` contient uniquement des chiffres. Le message affiché est `Wrong UserName format`. <br><br><img src="testImages/1.png" width="500"> | Succès |
| 2 | Wrong UserName format | L’application affiche `Wrong UserName format` pour le nom d’utilisateur `Aaaa7hart`, probablement parce qu’il contient une lettre majuscule. <br><br><img src="testImages/cas2.png" width="500"> | Succès |
| 2 - Validation | Accepted | Après la soumission, l’application accepte le formulaire et affiche le message : `Congratulations A Bob The great! You are now a member of our site.` <br><br><img src="testImages/cas2validation.png" width="500"> | Non-concluant |
| 3 | Wrong Postal Code format | L’application refuse le code postal `Y02 0Z0` et affiche le message `Wrong Postal Code format`. <br><br><img src="testImages/cas3.png" width="500"> | Succès |
| 4 | Accepted | L’application accepte un formulaire valide avec un nom d’utilisateur, un courriel, un âge, une ville et un code postal valides. <br><br><img src="testImages/cas4.png" width="500"><br><br><img src="testImages/cas4-verif.png" width="500"> | Succès |
| 5 | Size of UserName must be between 6 and 12 | L’application refuse un nom d’utilisateur contenant moins de 6 caractères. <br><br><img src="testImages/cas5.png" width="500"><br><br><img src="testImages/cas5-verfi.png" width="500"> | Succès |
| 6 | Size of UserName must be between 6 and 12 | L’application refuse un nom d’utilisateur contenant plus de 12 caractères. <br><br><img src="testImages/cas6.png" width="500"><br><br><img src="testImages/cas6-verif.png" width="500"> | Succès |
| 7 | Wrong UserName format | L’application refuse un nom d’utilisateur contenant des caractères spéciaux non valides. <br><br><img src="testImages/cas7.png" width="500"><br><br><img src="testImages/cas7-verif.png" width="500"> | Succès |
| 8 | Accepted | L’application accepte un nom d’utilisateur valide contenant exactement 6 caractères. <br><br><img src="testImages/cas8.png" width="500"><br><br><img src="testImages/cas8-verif.png" width="500"> | Succès |
| 9 | Accepted | L’application accepte un nom d’utilisateur valide contenant exactement 12 caractères. <br><br><img src="testImages/cas9.png" width="500"><br><br><img src="testImages/cas9-verif.png" width="500"> | Succès |
| 10 | Invalid email format | L’application refuse une adresse courriel qui ne contient pas le caractère `@`. <br><br><img src="testImages/cas10.png" width="500"><br><br><img src="testImages/cas10-verif.png" width="500"> | Succès |
| 11 | Invalid email format | L’application refuse une adresse courriel qui ne contient pas de domaine valide. <br><br><img src="testImages/cas11.png" width="500"><br><br><img src="testImages/cas11-verif.png" width="500"> | Succès |
| 12 | Age error | L’application refuse le formulaire lorsque la valeur de l’âge est invalide. <br><br><img src="testImages/cas12.png" width="500"><br><br><img src="testImages/cas12-verif.png" width="500"> | Succès |
| 13 | Age error | L’application refuse une valeur d’âge négative. <br><br><img src="testImages/cas13.png" width="500"><br><br><img src="testImages/cas13-verif.png" width="500"> | Succès |
| 14 | Wrong Postal Code format | L’application refuse un code postal contenant uniquement des chiffres. <br><br><img src="testImages/cas14.png" width="500"><br><br><img src="testImages/cas14-verif.png" width="500"> | Succès |
| 15 | Wrong Postal Code format | L’application refuse un code postal trop court ou ne respectant pas le format attendu. <br><br><img src="testImages/cas15.png" width="500"><br><br><img src="testImages/cas15-verif.png" width="500"> | Succès |
| 16 | Multiple errors | L’application affiche plusieurs erreurs de validation lorsque plusieurs champs sont invalides en même temps. <br><br><img src="testImages/cas16.png" width="500"><br><br><img src="testImages/cas16-verif.png" width="500"> | Succès |


## Exercice 2 - Tests JUnit pour la méthode nextDate

Dans cet exercice, j’ai travaillé sur la méthode nextDate de la classe Date.  
Cette méthode permet de retourner la date du lendemain à partir d’une date donnée.  
Les tests doivent vérifier plusieurs situations : les dates normales, les fins de mois, les années bissextiles, les changements d’année, ainsi que les dates invalides qui doivent produire une exception.

L’énoncé demandait de fournir une implémentation explicite avec JUnit 5, puis deux suites de tests paramétrés : une pour les cas valides et une autre pour les cas qui génèrent une exception.

### Exécution des tests fournis

Avant d’ajouter les tests pour la classe Date, j’ai d’abord vérifié que les tests déjà fournis dans le projet ecs fonctionnaient correctement.  
Les tests de la classe Bit ont été exécutés avec succès. Cette partie permet aussi de vérifier que l’environnement JUnit fonctionne bien.

![Résultat des tests fournis](testImages/date-tests1.png)

### Tests explicites avec JUnit 5

J’ai ensuite créé le fichier DateTest.java.  
Ce fichier contient les 20 cas de test fournis dans l’énoncé. Chaque cas est écrit séparément avec une méthode de test différente.

Les 15 premiers cas vérifient que la méthode nextDate retourne correctement la date du lendemain.  
Les 5 derniers cas vérifient que les dates invalides produisent bien une IllegalArgumentException.

![Tests explicites JUnit 5](testImages/date-test-explicit.png)

### Tests paramétrés pour les dates valides

J’ai aussi créé le fichier DateNextDateOkTest.java.  
Ce fichier contient les cas de test valides sous forme paramétrée.  
Chaque ligne de données contient une date d’entrée et la date attendue après l’appel de la méthode nextDate.

Cette approche évite de répéter plusieurs méthodes de test presque identiques. Elle permet aussi de regrouper clairement les cas valides dans une seule suite de tests.

![Tests paramétrés valides](testImages/DateNextDateOkTest.png)

### Tests paramétrés pour les exceptions

Pour les dates invalides, j’ai créé le fichier DateNextDateExceptionTest.java.  
Ce fichier regroupe les cas où la date donnée ne respecte pas les règles imposées, par exemple :

 un jour invalide pour février ;

 une date du 29 février dans une année non bissextile ;

une année négative ;

un mois invalide ;

un jour négatif.

Dans ces cas, le comportement attendu est le lancement d’une IllegalArgumentException.

![Tests paramétrés avec exceptions](testImages/date-next-exception.png)

### Résultat final de l’exécution

Après avoir complété les trois fichiers de test, j’ai exécuté la commande suivante dans le dossier ecs :

    bin/test

L’exécution finale montre que tous les tests ont réussi.

![Résultat final des tests](testImages/date-tests2.png)

Le résultat obtenu est le suivant :

    58 tests found
    58 tests started
    58 tests successful
    0 tests failed

Cela confirme que les tests explicites, les tests paramétrés pour les cas valides, les tests paramétrés pour les exceptions, ainsi que les tests fournis pour la classe Bit fonctionnent correctement.