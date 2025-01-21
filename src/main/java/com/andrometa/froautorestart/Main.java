// TODO (had to write it here), consider fusing tutorial.md and README.md, and finish up your source_reference.md
// then finish up the mod.

package com.andrometa.froautorestart;

import com.andrometa.froautorestart.events.CommandRegister;
import com.andrometa.froautorestart.events.CountingTicks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "frosautorestart";

    public Main()
    {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(CommandRegister.class);
        MinecraftForge.EVENT_BUS.register(CountingTicks.class);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SPEC);
    }
}
