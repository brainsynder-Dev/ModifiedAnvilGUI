<div align="center">
    <img src="https://www.codefactor.io/repository/github/brainsynder-dev/modifiedanvilgui/badge" alt="CodeFactor">
</div>

# ModifiedAnvilGUI
The name says it all, it is a modified version of WesJDs AnvilGUI repo
The major change is how the NMS modules are structured and setup

It is set up to make it easy to update to new NMS versions.

## Using in your own project

```xml
<repository>
    <id>bs-repo</id>
    <url>https://repo.pluginwiki.us/repository/maven-releases/</url>
</repository>

<dependency>
    <groupId>anvil.brainsynder</groupId>
    <artifactId>anvilgui</artifactId>
    <version>1.6.0-CUSTOM</version>
</dependency>
```

## Remember to shade and relocate the dependency

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-shade-plugin</artifactId>
    <version>3.3.0-SNAPSHOT</version>
    <configuration>
        <minimizeJar>true</minimizeJar>
        <createDependencyReducedPom>false</createDependencyReducedPom>
    </configuration>
    <executions>
        <execution>
            <phase>package</phase>
            <goals>
                <goal>shade</goal>
            </goals>
            <configuration>
                <relocations>
                    <relocation>
                        <pattern>anvil.brainsynder</pattern>
                        <shadedPattern>${groupId}.internal.anvil</shadedPattern>
                    </relocation>
                </relocations>
            </configuration>
        </execution>
    </executions>
</plugin>

<!-- And due to the dependency using Java 16/17 you need to add this to your pom.xml file -->
<pluginRepositories>
    <pluginRepository>
        <id>apache.snapshots</id>
        <url>https://repository.apache.org/snapshots/</url>
    </pluginRepository>
</pluginRepositories>
```
