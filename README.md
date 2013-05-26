Java meet Spock
===============
Sample Maven Project with Java and Spock tests
---------------------------------------

Sample project configuration with Maven for Java project with readable tests written in [Groovy 2](http://groovy.codehaus.org/)
with [Spock Specification Framework](https://code.google.com/p/spock/)


Simple project configuration
----------------------------

### Project structure

    src/
       main/
           java/
               *.java       (java source code)
       test/
           groovy/
               *Test.groovy (spock code)
    pom.xml


### Maven configuration - pom.xml

    <project xmlns="http://maven.apache.org/POM/4.0.0"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
        <modelVersion>4.0.0</modelVersion>

        ...

        <build>
            <plugins>
                <plugin>
                    <groupId>org.codehaus.gmaven</groupId>
                    <artifactId>gmaven-plugin</artifactId>
                    <version>1.5</version>
                    <configuration>
                        <providerSelection>2.0</providerSelection>
                        <source/>
                    </configuration>
                    <executions>
                        <execution>
                            <goals>
                                <goal>testCompile</goal>
                            </goals>
                        </execution>
                    </executions>
                </plugin>

            </plugins>
        </build>

        <dependencies>
            <dependency>
                <groupId>org.spockframework</groupId>
                <artifactId>spock-core</artifactId>
                <version>0.7-groovy-2.0</version>
                <scope>test</scope>
            </dependency>
        </dependencies>

     </project>

IntelliJ Idea
=============

This project works out of the box in [IntelliJ Idea](http://www.jetbrains.com/idea/download/) 12.1.4 (129.549). Default label look need some changes to look better.

Go to **Settings -> Editor -> Colors & Fonts -> Groovy**, create new Schema (Save as) and change **Label** (last attribute)

* Font type: **Bold**
* Foreground: **0000FF**


After this Spock Tests (Spec) looks in IntelliJ Idea like this:

![sample spec](https://github.com/mariuszs/java-spock-test-sample/raw/master/spec.png "Sample Spec")

PS. Idea can autoformat Spock data tables :)
