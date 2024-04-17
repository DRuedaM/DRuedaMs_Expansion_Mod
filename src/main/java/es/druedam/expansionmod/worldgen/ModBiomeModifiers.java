package es.druedam.expansionmod.worldgen;

import es.druedam.expansionmod.ExpansionModMain;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers
{
    public static final ResourceKey<BiomeModifier> ADD_FLUORITE_UPPER_ORE = registerKey("add_fluorite_upper_ore");
    public static final ResourceKey<BiomeModifier> ADD_FLUORITE_MIDDLE_ORE = registerKey("add_fluorite_middle_ore");
    public static final ResourceKey<BiomeModifier> ADD_FLUORITE_DOWN_ORE = registerKey("add_fluorite_down_ore");


    public static void bootstrap(BootstapContext<BiomeModifier> context)
    {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_FLUORITE_UPPER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.FLUORITE_ORE_PLACED_UPPER_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_FLUORITE_MIDDLE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.FLUORITE_ORE_PLACED_MIDDLE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_FLUORITE_DOWN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.FLUORITE_ORE_PLACED_DOWN_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name)
    {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(ExpansionModMain.MOD_ID, name));
    }
}
