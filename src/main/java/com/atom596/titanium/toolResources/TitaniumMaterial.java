package com.atom596.titanium.toolResources;

import com.atom596.titanium.TitaniumItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TitaniumMaterial implements ToolMaterial {

    public static final TitaniumMaterial INSTANCE = new TitaniumMaterial();

    @Override
    public int getDurability() {
        return 512;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0.0F;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(TitaniumItems.TITANIUM_INGOT);
    }
}
