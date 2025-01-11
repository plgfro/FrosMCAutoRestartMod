package com.andrometa.froautorestart.events;

import com.andrometa.froautorestart.commands.Restart;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CommandRegister {
    @SubscribeEvent
    public static void registeringCommands(RegisterCommandsEvent event) {
       Restart.register(event.getDispatcher());
    }
}
