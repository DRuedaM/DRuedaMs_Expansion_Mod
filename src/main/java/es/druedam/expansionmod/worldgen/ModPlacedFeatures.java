package es.druedam.expansionmod.worldgen;

import es.druedam.expansionmod.ExpansionModMain;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures
{
    public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_UPPER_KEY = registerKey("fluorite_ore_placed_upper");
    public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_MIDDLE_KEY = registerKey("fluorite_ore_placed_middle");
    public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_DOWN_KEY = registerKey("fluorite_ore_placed_down");
    public static void bootstrap(BootstapContext<PlacedFeature> context)
    {
        HolderGetter<ConfiguredFeature<?,?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, FLUORITE_ORE_PLACED_UPPER_KEY, configuredFeatures.getOrThrow(ModConfiguresFeatures.OVERWORLD_FLUORITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(90,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(384))));


        register(context, FLUORITE_ORE_PLACED_MIDDLE_KEY, configuredFeatures.getOrThrow(ModConfiguresFeatures.OVERWORLD_FLUORITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(56))));

        register(context, FLUORITE_ORE_PLACED_DOWN_KEY, configuredFeatures.getOrThrow(ModConfiguresFeatures.OVERWORLD_FLUORITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(70))));


    }



    private static ResourceKey<PlacedFeature> registerKey(String name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(ExpansionModMain.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?,?>> configuration,
                                 List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
