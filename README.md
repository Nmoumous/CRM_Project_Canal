# CRM_Project_Canal

Ce projet a pu but de réaliser un cas de test dans le cadre de l'utilisation d'un outil de gestion de relation client (aussi connu sous l'acronyme CRM, Customer Relationship Management). 

Dans le cas présent, il est étudié le cas suivant :

Fonctionnalité: Modifier l'adresse d'un abonné
Plan du scénario: Modification de l'adresse d'un abonné résidant en France sans ou avec date d'effet
Etant donné un abonné avec une adresse principale <active> en France
Lorsque le conseiller connecté à <canal> modifie l'adresse de l'abonné
Alors l'adresse de l'abonné modifiée est enregistrée sur l'ensemble des contrats de l'abonné Et un mouvement de modification d'adresse est créé 



Le scénario est implémenté dans le fichier adresse.features.
Dans cette feature, quatre variables sont définies. 
<active> représente l'adresse courante de l'abonné. 
<canal> représente le fait que le conseiller canal soit connecté ou pas (active or inactive). En effet, si la demande se fait en ligne, elle peut se faire à tout moment. Le conseiller qui doit valider la demande ne travaille pas forcément au moment de la demande 
<FACE> correspond au fait que l'adresse de l'abonné modifiée soit enregistrée sur l'ensemble des contrats de l'abonné. La modification de l'adresse est enregistré uniquement si le conseiller valide la modifcation.  
<EC> pour (effective Change) répresente le mouvement de modification d'adresse. Si le conseiller est inactive alors le mouvement ne peut être fait et donc la valeur de <EC> est inactive.  
  


Les définitions des étapes du scénario sont dans le fichier StepDefinitions.java.  
Pour vérifier que le build se fait bien il suffit dans le terminal d'IntellJ IDEA et se placer dans le dossier hellocucumber du projet. 
taper => mvn test 
Le résultat attendu doit finir par :


Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.373 sec

Results :

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

Serenity BDD aide à écrire plus rapidement des tests d'acceptation et de régression automatisés plus propres et plus faciles à maintenir.
Serenity utilise les résultats des tests pour produire des rapports illustrés et narratifs qui documentent et décrivent ce que fait l'application.

Pour ce faire les dependances et le plugin nécessaire sont insérées dans le fichier pom.xml. 

Les tests Serenity se font dans le fichier Serenitytest.java où l'on retrouve les tests sur les différentes étapes du scénario. 



