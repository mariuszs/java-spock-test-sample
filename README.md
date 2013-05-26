Sample Maven Project: Java + Spock
---------------------------------------

Sample project configuration with Maven for Java project with readable tests written in [Spock](https://code.google.com/p/spock/) ([Groovy](http://groovy.codehaus.org/))


Simple project configuration
----------------------------

### Project structure

    src/
       main/
           java/
               (java source code)
       test/
           groovy/
               (spock code)
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


