package es.druedam.expansionmod.util;

import es.druedam.expansionmod.ExpansionModMain;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * @author David Rueda
 * <p>
 *     Clase donde se definen los tags
 *     necesarios para implementarlos en el juego,
 *     se pueden indicar tags para los items y para los bloques
 *     y su funcionamiento
 * </p>
 */
public class ModTags
{
    public static class Items
    {
        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(new ResourceLocation(ExpansionModMain.MOD_ID, name));
        }
        private static TagKey<Item> forgeTag(String name)
        {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks
    {
        public static final TagKey<Block> NEEDS_FLUORITE = tag("needs_fluorite_tool");

        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(new ResourceLocation(ExpansionModMain.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name)
        {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
