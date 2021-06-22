// This Class was created by xMonsterKing


package net.pixelplays.elemental.registry;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.pixelplays.elemental.registry.modstuff.ElementalItems;

public class CustomArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {
            9, 12, 13, 8
    };

    private static final int[] PROTECTION_VALUES = new int[] {
            2, 5, 7, 2
    };

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 29;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 16;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ElementalItems.RUBY);
    }

    @Override
    public String getName() {
        return "ruby ";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.3F;
    }
}
