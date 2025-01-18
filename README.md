# Fro's Automatic Server Restarting Mod

## DISCLAIMER: THIS MOD DOES NOT WORK RIGHT NOW. NONE OF THE RESTARTING CODE HAS BEEN WRITTEN AND THERE IS MOSTLY BOILERPLATE AND TESTING, AS THIS IS MY FIRST TIME DEVELOPING A MOD.

This is a Forge mod made for 1.20.1 and Forge Mod Loader 47 -> 48 (non-inclusive on the 48.)
As a server restarting mod, this only works on servers.

It's intent is to allow for one to automatically restart servers on a specific time interval (specified on the config, may be changed later to be based off of actual clock times).

## Installation Instructions
If you are building from source, then simply download the zip file, navigate to the mod's directory (after extracting), and run "./gradlew build" (for Unix systems), or ".\gradlew.bat build" (for Windows systems)
Once you do this, the jar file should be found within /build/libs with the current mod name and version.
Afterwards, you are now able to drag and drop it into your Minecraft Forge 1.20.1 mods folder.

If you are not building from source and opt to take an already-made jar file, then you can simply drop it into your Minecraft Forge 1.20.1 mods folder.
[You can download Forge by clicking here](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.20.1.html)

### Tested Versions
Forge 47.3.0 1.20.1.

### Where is the documentation? (Post-installation manual)
Click here to get started: [Documentation](./docs/tutorial.md)

### Where is the config?
After running the mod, you will find a .toml file titled frosautorestart-server.toml. This file is located within the config folder.
In that file, you are able to change the restart time. The format is specified within that file.

