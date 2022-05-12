package com.atom596.titanium;

import com.atom596.titanium.toolResources.CustomAxeItem;
import com.atom596.titanium.toolResources.CustomHoeItem;
import com.atom596.titanium.toolResources.CustomPickaxeItem;
import com.atom596.titanium.toolResources.TitaniumMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TitaniumItems {

    //Basic Titanium Items
    public static final Item RAW_TITANIUM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item TITANIUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    //BlockItems
    public static final Item TITANIUM_BLOCK_ITEM = new BlockItem(TitaniumBlocks.TITANIUM_BLOCK, new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item RAW_TITANIUM_BLOCK_ITEM = new BlockItem(TitaniumBlocks.RAW_TITANIUM_BLOCK, new FabricItemSettings().group(ItemGroup.MISC));

    //Tools
    public static ToolItem TITANIUM_SWORD = new SwordItem(TitaniumMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem TITANIUM_PICKAXE = new CustomPickaxeItem(TitaniumMaterial.INSTANCE, 15, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TITANIUM_SHOVEL = new ShovelItem(TitaniumMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TITANIUM_AXE = new CustomAxeItem(TitaniumMaterial.INSTANCE, 3F, -2.4F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TITANIUM_HOE = new CustomHoeItem(TitaniumMaterial.INSTANCE, 1, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("titanium", "raw_titanium"), RAW_TITANIUM);
        Registry.register(Registry.ITEM, new Identifier("titanium", "titanium_ingot"), TITANIUM_INGOT);

        Registry.register(Registry.ITEM, new Identifier("titanium", "titanium_sword"), TITANIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier("titanium", "titanium_pickaxe"), TITANIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("titanium", "titanium_shovel"), TITANIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("titanium", "titanium_axe"), TITANIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier("titanium", "titanium_hoe"), TITANIUM_HOE);
    }

    public static void registerBlockItems() {
        Registry.register(Registry.ITEM, new Identifier("titanium", "titanium_block"), TITANIUM_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier("titanium", "raw_titanium_block"), RAW_TITANIUM_BLOCK_ITEM);
    }
}
