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
Pour vérifier que le build se fait bien il suffit d'ouvrir le terminal d'IntellJ IDEA et se placer dans le dossier hellocucumber du projet. 
taper => mvn test 
Le résultat attendu doit finir par :
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------< hellocucumber:hellocucumber >---------------------
[INFO] Building hellocucumber 1.0.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ hellocucumber ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\Moumous\IdeaProjects\CRM_Project\hellocucumber\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ hellocucumber ---
[INFO] No sources to compile
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ hellocucumber ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ hellocucumber ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ hellocucumber ---
[INFO] Surefire report directory: C:\Users\Moumous\IdeaProjects\CRM_Project\hellocucumber\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running hellocucumber.RunCucumberTest

Scenario Outline: Modification of the address of a subscriber residing in France with or without effect date # hellocucumber/adresse.feature:11
  Given Subscriber's main address "ancienne adresse"                                                         # hellocucumber.StepDefinitions.subscriber_s_main_address(
java.lang.String)
  When Advisor connected to "active" changes the subscriber's address                                        # hellocucumber.StepDefinitions.advisor_connected_to_chang
es_the_subscriber_s_address(java.lang.String)
  Then the modified subscriber's address is recorded on all the subscriber's contracts "inactive"            # hellocucumber.StepDefinitions.the_modified_subscriber_s_
address_is_recorded_on_all_the_subscriber_s_contracts(java.lang.String)
  And and an address modification movement is created "active"                                               # hellocucumber.StepDefinitions.and_an_address_modificatio
n_movement_is_created_active(java.lang.String)

Scenario Outline: Modification of the address of a subscriber residing in France with or without effect date # hellocucumber/adresse.feature:12
  Given Subscriber's main address "ancienne adresse"                                                         # hellocucumber.StepDefinitions.subscriber_s_main_address(
java.lang.String)
  When Advisor connected to "inactive" changes the subscriber's address                                      # hellocucumber.StepDefinitions.advisor_connected_to_chang
es_the_subscriber_s_address(java.lang.String)
  Then the modified subscriber's address is recorded on all the subscriber's contracts "inactive"            # hellocucumber.StepDefinitions.the_modified_subscriber_s_
address_is_recorded_on_all_the_subscriber_s_contracts(java.lang.String)
  And and an address modification movement is created "inactive"                                             # hellocucumber.StepDefinitions.and_an_address_modificatio
n_movement_is_created_active(java.lang.String)

Scenario Outline: Modification of the address of a subscriber residing in France with or without effect date # hellocucumber/adresse.feature:13
  Given Subscriber's main address "adresse 1"                                                                # hellocucumber.StepDefinitions.subscriber_s_main_address(
java.lang.String)
  When Advisor connected to "active" changes the subscriber's address                                        # hellocucumber.StepDefinitions.advisor_connected_to_chang
es_the_subscriber_s_address(java.lang.String)
  Then the modified subscriber's address is recorded on all the subscriber's contracts "inactive"            # hellocucumber.StepDefinitions.the_modified_subscriber_s_
address_is_recorded_on_all_the_subscriber_s_contracts(java.lang.String)
  And and an address modification movement is created "active"                                               # hellocucumber.StepDefinitions.and_an_address_modificatio
n_movement_is_created_active(java.lang.String)

Scenario Outline: Modification of the address of a subscriber residing in France with or without effect date # hellocucumber/adresse.feature:14
  Given Subscriber's main address "adresse 1"                                                                # hellocucumber.StepDefinitions.subscriber_s_main_address(
java.lang.String)
  When Advisor connected to "inactive" changes the subscriber's address                                      # hellocucumber.StepDefinitions.advisor_connected_to_chang
es_the_subscriber_s_address(java.lang.String)
  Then the modified subscriber's address is recorded on all the subscriber's contracts "inactive"            # hellocucumber.StepDefinitions.the_modified_subscriber_s_
address_is_recorded_on_all_the_subscriber_s_contracts(java.lang.String)
  And and an address modification movement is created "inactive"                                             # hellocucumber.StepDefinitions.and_an_address_modificatio
n_movement_is_created_active(java.lang.String)


Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.373 sec

Results :

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

Serenity BDD aide à écrire plus rapidement des tests d'acceptation et de régression automatisés plus propres et plus faciles à maintenir.
Serenity utilise les résultats des tests pour produire des rapports illustrés et narratifs qui documentent et décrivent ce que fait l'application.

Pour ce faire les dependances et le plugin nécessaire sont intégrés dans le fichier pom.xml. Ceici sont récupérés depuis le site https://mvnrepository.com/ . 

Les tests Serenity se font dans le fichier Serenitytest.java où l'on retrouve les tests sur les différentes étapes du scénario. 

A l'heure actuelle, la structure semble fonctionner car la page index.html s'affiche bien. Cependant, aucun tests n'est lancé pour le moment. 
