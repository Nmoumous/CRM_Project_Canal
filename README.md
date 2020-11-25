# CRM_Project_Canal

Ce projet a pu but de réaliser un cas de test dans le cadre de l'utilisation d'un outil de gestion de relation client (aussi connu sous l'acronyme CRM, Customer Relationship Management). 

Dans le cas présent, il est étudié le cas suivant :

Fonctionnalité: Modifier l'adresse d'un abonné
Plan du scénario: Modification de l'adresse d'un abonné résidant en France sans ou avec date d'effet
Etant donné un abonné avec une adresse principale <active> en France
Lorsque le conseiller connecté à <canal> modifie l'adresse de l'abonné
Alors l'adresse de l'abonné modifiée est enregistrée sur l'ensemble des contrats de l'abonné Et un mouvement de modification d'adresse est créé 



Le scénario est implémenté dans le fichier adresse.features. Les StepDéfinitions permettant de faire le build du scénario. 
Pour vérifier que le build se fait bien il suffit dans le terminal d'IntellJ IDEA et se placer dans le dossier heloocucumber du projet. 
taper => mvn test 
Le résultat attendu est  le suivant :


Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.373 sec

Results :

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------


Afin d'automatiser les tests, serenity bdd est le logiciel utilisé. 
Pour ce faire les dependances et le plugin nécessaire sont insérées dans le fichier pom.xml. 



