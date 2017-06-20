package com.starg09.simplybark;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;


@Mod(modid = SimplyBark.MODID, name = SimplyBark.NAME, version = SimplyBark.VERSION)
public class SimplyBark {
    public static final String MODID = "simplybark";
    public static final String NAME = "Simply Bark";
    public static final String VERSION = "0.0.1";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}