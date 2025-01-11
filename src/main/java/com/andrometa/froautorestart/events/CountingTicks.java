package com.andrometa.froautorestart.events;

// Minecraft Imports
import net.minecraft.network.chat.Component;

// Forge Imports
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class CountingTicks {
    private static int ticksSinceRestart = 0;
    private static ServerPlayer playerFound;

    public static int getTicksSinceRestart() {
        return ticksSinceRestart;
    }
    public static void incrementTicks() {
       ticksSinceRestart ++;
    }
// another option is we could just simply get the value directly from the tickevent class, check debugger for more info.
   // Create the event necessary for counting the ticks.
    @SubscribeEvent
    public static void countTick(TickEvent.ServerTickEvent tickEvent) {
        incrementTicks();

        // index first player in the server and then troll them by ticking
        if (playerFound == null) {
            if (tickEvent.getServer().getPlayerList().getPlayerByName("Dev") != null) {
                playerFound = tickEvent.getServer().getPlayerList().getPlayerByName("Dev");
            }
        } else {
           playerFound.sendSystemMessage(Component.literal(String.valueOf(getTicksSinceRestart())));
        }
    }
}
