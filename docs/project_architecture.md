# Project Architecture

### How is this project organized?
For this project, we use a Main.java script in order to initialize all of the event buses and those event buses are handled in other scripts.

* Main.java
* Config.java
* commands (Contains a Java script that handles the Restart command.)
* events (Contains events that are registered by Main.java, such as CommandRegistry, or counting Server Ticks.)

You can read more about the actual functions of each of those scripts in [Source Reference](./source_reference.md).
