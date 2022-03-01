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
    <version>1.5.9-CUSTOM</version>
</dependency>

Make sure you Shade it!!!
```
