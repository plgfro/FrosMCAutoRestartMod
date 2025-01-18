# High-level Source Code Explanation

This will briefly describe at a higher level (with references to the source reference sheet) the individual aspects of the source code and file structure.

## Overview
Within the mod folder, we have 2 files and 2 folders:

### Commands
This folder contains various commands, registered by the [CommandRegister.java](/src/main/java/com/andrometa/froautorestart/events/CommandRegister.java) file.
Specifics commands are referenced in the [source_reference.md](./source_reference.md#commands) file.
### Events
This folder contains events that are registered by the Main class. Specifics about each source file are referenced in [source_reference.md](source_reference.md)

### Main.java

This is the primary script and loads the mod's Event Buses in.

If you do not know what a Forge Event Bus is, it essentially is a way for the mod to intercept Vanilla Minecraft events and insert their own code.

You can read more about Forge event buses here: [Event Buses](https://docs.minecraftforge.net/en/1.20.x/concepts/events/)

Furthermore, it also loads the configuration event, which is specified in Config.java.
### Config.java

This simply loads the configuration files. 

To understand more about configuration files in Forge, reference this: [Forge Config](https://docs.minecraftforge.net/en/1.20.x/misc/config/)
