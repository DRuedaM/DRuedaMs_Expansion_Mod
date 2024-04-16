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

public class ModToolTiers
{
    public static final Tier FLUORITE = TierSortingRegistry.registerTier(
            new ForgeTier(5,115,1f,1f,5,
            ModTags.Blocks.NEEDS_FLUORITE, () -> Ingredient.of(ModItems.FLUORITE_INGOT.get())),
            new ResourceLocation(ExpansionModMain.MOD_ID, "fluorite"), List.of(Tiers.NETHERITE), List.of());
}
