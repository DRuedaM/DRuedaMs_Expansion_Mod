package es.druedam.expansionmod.worldgen;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

/**
 * @author David Rueda
 * <p>
 *     Clase que define metodos para colocar
 *     ores en distintos niveles de altura del mundo
 * </p>
 */
public class ModOrePlacement
{
    public static List<PlacementModifier> orePlacement(PlacementModifier pCountPlacement, PlacementModifier pHeightRange) {
        return List.of(pCountPlacement, InSquarePlacement.spread(), pHeightRange, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }
}
