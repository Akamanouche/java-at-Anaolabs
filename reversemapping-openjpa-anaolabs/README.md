
Un peu d'infos sur ce sous-module "openjpa"
===

### Contenu
* Liens
* Des Profiles Maven pour plusieurs exec-maven-plugin
* Commandes Maven à lancer
* Limitations des tools de OPenJPA


### Liens
* OpenJPA Tools
> http://openjpa.apache.org/builds/1.2.3/apache-openjpa/docs/ref_guide_pc_reverse.html
> http://openjpa.apache.org/builds/1.2.3/apache-openjpa/docs/ref_guide_schema_schematool.html
> https://www.esup-portail.org/wiki/display/PROJCOMMONS/3.3.7+Reverse-engineering

* exec-maven-plugin
> http://stackoverflow.com/questions/8252107/is-it-possible-to-execute-two-different-maven-exec-maven-plugin-in-a-single-pom


### Diffréents Profiles Maven pour différents "exec-maven-plugin"

Les différents tools OPenJPA sont lancés par différents blocs "exec-maven-plugin" dans le POM.

Pour les distinguer, j'ai choisi de me baser sur la définition de plusieurs Profiles Maven.

Profiles Maven :
- reverse-schema
- reverse-entities

### Commandes Maven à lancer

Les commandes Maven à lancer sont donc :

	mvn -X -Preverse-schema exec:java
	mvn -X -Preverse-entities exec:java

### Limitations des tools de OPenJPA

###### 1) Le paramètre `-schemas` n'accepte pas de wildcard avec '\*', du genre `ET_DWH.*`.

On est donc obligé de tout spécifier de manière exhaustive :

	<argument>-schemas</argument>
	<argument>ET_DWH.CLIENT,ET_DWH.ORGANISATION</argument>
