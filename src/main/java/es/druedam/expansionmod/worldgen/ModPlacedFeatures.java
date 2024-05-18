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

/**
 * @author David Rueda
 * <p>
 *     Clase donde indicamos que objetos
 *     queremos agregar al mundo para la generacion
 *     automatica del mismo
 * </p>
 */
public class ModPlacedFeatures
{
    public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_SEVEN_KEY = registerKey("fluorite_ore_placed_seven");

    public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_FIVE_KEY = registerKey("fluorite_ore_placed_five");

    public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_TWO_KEY = registerKey("fluorite_ore_placed_two");
    public static void bootstrap(BootstapContext<PlacedFeature> context)
    {
        HolderGetter<ConfiguredFeature<?,?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, FLUORITE_ORE_PLACED_SEVEN_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_FLUORITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7
                        , HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(80))));

        register(context, FLUORITE_ORE_PLACED_FIVE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_DEEPSLATE_FLUORITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5
                        , HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(80))));

        register(context, FLUORITE_ORE_PLACED_TWO_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_DEEPSLATE_FLUORITE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(2,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(80))));

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
