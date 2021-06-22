// This Class was created by xMonsterKing


package net.pixelplays.elemental.registry;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.pixelplays.elemental.registry.modstuff.ElementalItems;

public class RubyMaterial implements ToolMaterial {

    @Override
    public int getDurability() {
        return 508;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }

    @Override
    public float getAttackDamage() {
        return 1.0F;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 16;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ElementalItems.RUBY);
    }
}
