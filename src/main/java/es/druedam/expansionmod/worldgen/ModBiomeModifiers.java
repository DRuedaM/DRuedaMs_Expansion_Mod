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

/**
 * @author David Rueda
 * <p>
 *     Clase encargada de registrar modificadores
 *     de bioma, agregar nuevos elementos o modificar
 *     ya existentes, para generar en el mundo objetos o entidades
 * </p>
 */
public class ModBiomeModifiers
{
    public static final ResourceKey<BiomeModifier> ADD_FLUORITE_SEVEN_ORE = registerKey("add_fluorite_seven_ore");
    public static final ResourceKey<BiomeModifier> ADD_FLUORITE_FIVE_ORE = registerKey("add_fluorite_five_ore");
    public static final ResourceKey<BiomeModifier> ADD_FLUORITE_TWO_ORE = registerKey("add_fluorite_two_ore");

    public static void bootstrap(BootstapContext<BiomeModifier> context)
    {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_FLUORITE_SEVEN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.FLUORITE_ORE_PLACED_SEVEN_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_FLUORITE_FIVE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.FLUORITE_ORE_PLACED_FIVE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_FLUORITE_TWO_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.FLUORITE_ORE_PLACED_TWO_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

    }
    private static ResourceKey<BiomeModifier> registerKey(String name)
    {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(ExpansionModMain.MOD_ID, name));
    }
}
