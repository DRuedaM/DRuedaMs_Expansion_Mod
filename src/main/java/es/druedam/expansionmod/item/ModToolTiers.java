package es.druedam.expansionmod.item;

import es.druedam.expansionmod.ExpansionModMain;
import es.druedam.expansionmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

/**
 * @author David Rueda
 * <p>
 *     Clase que define tiers para el juego y lo registra
 * </p>
 * @see Tier
 */
public class ModToolTiers
{
    public static final Tier FLUORITE = TierSortingRegistry.registerTier(
            new ForgeTier(5,200,6.0f,2.0f,14,
            ModTags.Blocks.NEEDS_FLUORITE, () -> Ingredient.of(ModItems.FLUORITE_INGOT.get())),
            new ResourceLocation(ExpansionModMain.MOD_ID, "fluorite"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}
