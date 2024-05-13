package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod(modid = NoBrightnessMod.MODID, name = NoBrightnessMod.NAME, version = NoBrightnessMod.VERSION)
public class NoBrightnessMod {
    public static final String MODID = "nobrightnessmod";
    public static final String NAME = "NoBrightnessMod";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        Minecraft.getMinecraft().gameSettings.gammaSetting = 0.0f;
        Minecraft.getMinecraft().gameSettings.enableVsync = true;
    }
}
