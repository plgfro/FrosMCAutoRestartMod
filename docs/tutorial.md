# Tutorial
This document is for those looking to quickly get started with this mod, with a small brief section on the bottom for mod developers/contributors.

After installing the mod into the server, you should have a server-config file.

This document will cover what you are able to configure.

## Configuration

To configure the restart time itself, you must edit the frosautorestart-server.toml file within your Minecraft config file.

The restart time variable will be specified as **restartTime = 3600**

That is the way it looks by default. It accepts only integer values above 0 and represents the time in seconds.

Example:
restartTime = 180 # Restarts the server every 180 seconds.

That is all for the config for now.

## What Else?
As of right now, unless you wish to take a peek at the source code - which you can do so by following the Source Table of Contents below, there is nothing else to explain within the configuration, due to the simple nature of the mod.

If you are not a mod developer or looking for source code reference, there is no need to take a look at the other sections for now.

# Source Table of Contents
These documents will be separated into 3 sections: 
* [Tutorial](tutorial.md)
* [High-level Source Code explanation](./source_overview.md)
* [Reference (Individual functions explained)](./source_reference.md)
* [Project Architecture (Organization of the project)](./project_architecture.md)
