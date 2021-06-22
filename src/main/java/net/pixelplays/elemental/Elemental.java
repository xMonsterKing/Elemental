// This Class was created by xMonsterKing


package net.pixelplays.elemental;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.pixelplays.elemental.registry.RubyMaterial;
import net.pixelplays.elemental.registry.bases.PickAxeBase;
import net.pixelplays.elemental.registry.modstuff.ElementalArmor;
import net.pixelplays.elemental.registry.modstuff.ElementalBlocks;
import net.pixelplays.elemental.registry.modstuff.ElementalItems;

public class Elemental implements ModInitializer {

    public static final String MOD_ID = "elemental";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "blocksanditems"),
            () -> new ItemStack(ElementalItems.RUBY));

    public static final ItemGroup TOOLS_AND_COMBAT = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "toolsandcombat"),
            () -> new ItemStack(new PickAxeBase(new RubyMaterial())));

    private static ConfiguredFeature<?, ?> RUBY_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ElementalBlocks.RUBY_ORE.getDefaultState(), 5))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(8), YOffset.fixed(38))))).spreadHorizontally().repeat(4);

    private static ConfiguredFeature<?, ?> DEEPSLATE_RUBY_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ElementalBlocks.DEEPSLATE_RUBY_ORE.getDefaultState(), 5))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(15))))).spreadHorizontally().repeat(2);

    @Override
    public void onInitialize() {

        ElementalItems.registerItems();
        ElementalBlocks.registerBlocks();
        ElementalArmor.registerArmor();

        RegistryKey<ConfiguredFeature<?, ?>> rubyOreOverWorld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(Elemental.MOD_ID, "ruby_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rubyOreOverWorld.getValue(), RUBY_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, rubyOreOverWorld);

        RegistryKey<ConfiguredFeature<?, ?>> deepslateRubyOreOverWorld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(Elemental.MOD_ID, "deepslate_ruby_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, deepslateRubyOreOverWorld.getValue(), DEEPSLATE_RUBY_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, deepslateRubyOreOverWorld);

    }
}
