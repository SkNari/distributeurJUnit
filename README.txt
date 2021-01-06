# distributeurJUnit

You need to install maven in order to compile and run the project.

To install maven on ubuntu just use the command below :

sudo apt install maven


## Project structure

src/main/java/com/mycompany/app:
you can find the source of the project

rsc: 
it contains the ressources of the project, you can find the report file of the project inside
and the result of the tests inside

test/java/com/mycompany/app:
Junit test source folder

## Build
mvn install

## Run
mvn exec:java

## Clean
mvn clean

## run Junit test
mvn test


## Generate javadoc
mvn javadoc:javadoc