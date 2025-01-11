package com.andrometa.froautorestart;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.IntValue RESTARTTIME = BUILDER
            .comment("Defines the amount of time (in seconds) from when the mod loads until the server will automatically restart itself.")
            .defineInRange("restartTime", 3600, 0, Integer.MAX_VALUE);
    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static int restartTime;
    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        restartTime = RESTARTTIME.get();
    }
}
