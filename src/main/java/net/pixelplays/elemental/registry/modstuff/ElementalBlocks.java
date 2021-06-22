// This Class was created by xMonsterKing


package net.pixelplays.elemental.registry.modstuff;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pixelplays.elemental.Elemental;
import net.pixelplays.elemental.registry.RubyOreBlock;

public class ElementalBlocks {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(4.5F, 25.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block RUBY_ORE = new RubyOreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(4.5F, 25.0F));

    public static final Block DEEPSLATE_RUBY_ORE = new RubyOreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(4.5F, 25.0F));

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(Elemental.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Elemental.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Elemental.MOD_ID, "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);

    }

}
