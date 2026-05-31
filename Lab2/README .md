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