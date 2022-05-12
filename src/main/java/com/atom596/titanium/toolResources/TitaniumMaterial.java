package com.atom596.titanium.toolResources;

import com.atom596.titanium.TitaniumItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TitaniumMaterial implements ToolMaterial {

    public static final TitaniumMaterial INSTANCE = new TitaniumMaterial();

    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }

    @Override
    public float getAttackDamage() {
        return 3.0F;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(TitaniumItems.TITANIUM_INGOT);
    }
}
