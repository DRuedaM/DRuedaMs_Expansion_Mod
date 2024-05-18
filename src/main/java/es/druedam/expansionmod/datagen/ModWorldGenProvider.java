package es.druedam.expansionmod.datagen;

import es.druedam.expansionmod.ExpansionModMain;
import es.druedam.expansionmod.worldgen.ModBiomeModifiers;
import es.druedam.expansionmod.worldgen.ModConfiguredFeatures;
import es.druedam.expansionmod.worldgen.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

/**
 * @author David Rueda
 * <p>
 *     Clase encargada de generar ficheros JSON
 *     automaticamente, en este caso se crean
 *     las configuraciones necesarias para modificar el biomas
 *     del minecraft
 * </p>
 * @see DatapackBuiltinEntriesProvider
 */
public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider
{
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries, BUILDER, Set.of(ExpansionModMain.MOD_ID));
    }
}
