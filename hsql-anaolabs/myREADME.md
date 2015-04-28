
### Quel plugin pour l'automatisation du démarrage/chargement d'une base HSQLDB ?
j'ai dû testé plusieurs plugins pour automatiser un lancement d'une database HSQLDB (in memory)

- sql-maven-plugin
- hsqldb-maven-plugin
- exec-maven-plugin
- inmemdb-maven-plugin

... en essayant de les faire fonctionner avec le "maven-failsafe-plugin" qui permet de faire des Tests d'Integration
(avec ses phases "pre-integration-test" et "post-integration-test")


### Résultats
And the winner is...
- sql-maven-plugin !


### Le plugin "sql-maven-plugin"
* http://mojo.codehaus.org/sql-maven-plugin/index.html
* http://mojo.codehaus.org/sql-maven-plugin/execute-mojo.html


### Commandes Maven à lancer :

Il faut lancer la phase de Tests d'Integration au moins ("integration-test"):
	> mvn clean integration-test
	> mvn clean verify

Dans la log en console, on constate que :
- le goal "execute" du sql-maven-plugin est bien lancé et les fichiers SQL chargés
- le Test d'Intégration est bien lancé


#### TO FIX

1) Le lancement de test (par "maven-failsafe-plugin") basé sur les Categories JUnit ne fonctionne pas encore !...
- voir : http://maven.apache.org/surefire/maven-failsafe-plugin/examples/junit.html


#### TODOs

1) Bien intégrer le plugin "sql-maven-plugin" :
- voir tous les paramètres  ici : http://mojo.codehaus.org/sql-maven-plugin/execute-mojo.html)

2) Définir un Profile Maven dédié qui mappe la phase de Tests d'Integration
