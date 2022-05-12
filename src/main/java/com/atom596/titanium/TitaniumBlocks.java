package com.atom596.titanium;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TitaniumBlocks {

    //Basic Titanium Blocks
    public static final Block TITANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block RAW_TITANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    //Titanium Ore Blocks


    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("titanium", "titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("titanium", "raw_titanium_block"), RAW_TITANIUM_BLOCK);

        TitaniumItems.registerBlockItems();
    }
}
