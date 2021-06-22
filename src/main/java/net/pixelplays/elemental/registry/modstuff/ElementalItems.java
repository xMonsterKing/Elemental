// This Class was created by xMonsterKing


package net.pixelplays.elemental.registry.modstuff;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pixelplays.elemental.Elemental;
import net.pixelplays.elemental.registry.*;
import net.pixelplays.elemental.registry.bases.*;

public class ElementalItems {

    //Items
    public static final Item RUBY = new Item(new Item.Settings().group(Elemental.ITEM_GROUP));

    //Tools & Combat Items

    //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ElementalBlocks.RUBY_BLOCK, new Item.Settings().group(Elemental.ITEM_GROUP));
    public static final BlockItem RUBY_ORE = new BlockItem(ElementalBlocks.RUBY_ORE, new Item.Settings().group(Elemental.ITEM_GROUP));
    public static final BlockItem DEEPSLATE_RUBY_ORE = new BlockItem(ElementalBlocks.DEEPSLATE_RUBY_ORE, new Item.Settings().group(Elemental.ITEM_GROUP));

    public static void registerItems() {

        //Items
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "ruby"), RUBY);

        //Tools & Combat Items
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "ruby_pickaxe"), new PickAxeBase(new RubyMaterial()));
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "ruby_axe"), new AxeBase(new RubyMaterial()));
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "ruby_shovel"), new ShovelBase(new RubyMaterial()));
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "ruby_hoe"), new HoeBase(new RubyMaterial()));
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "ruby_sword"), new SwordBase(new RubyMaterial()));

        //Block Items
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Elemental.MOD_ID, "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);
    }

}
