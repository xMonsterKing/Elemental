// This Class was created by xMonsterKing


package net.pixelplays.elemental.registry.modstuff;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pixelplays.elemental.Elemental;
import net.pixelplays.elemental.registry.CustomArmorMaterial;

public class ElementalArmor {

    public static final ArmorMaterial CUSTOM_ARMOR_MATERIAL = new CustomArmorMaterial();

    public static final Item RUBY_HELMET = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Elemental.ITEM_GROUP));
    public static final Item RUBY_CHESTPLATE = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Elemental.TOOLS_AND_COMBAT));
    public static final Item RUBY_LEGGINGS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.LEGS , new Item.Settings().group(Elemental.TOOLS_AND_COMBAT));
    public static final Item RUBY_BOOTS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Elemental.TOOLS_AND_COMBAT));

    public static void registerArmor() {
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "ruby_boots"), RUBY_BOOTS);
    }

}
