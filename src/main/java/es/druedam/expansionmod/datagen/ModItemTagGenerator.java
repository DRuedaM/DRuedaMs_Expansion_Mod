package es.druedam.expansionmod.datagen;

import es.druedam.expansionmod.ExpansionModMain;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

/**
 * @author David Rueda
 * <p>
 *     Clase que genera ficheros JSON
 *     automaticamente con los tags de los items
 *     que indiquemos del mod
 * </p>
 * @see ItemTagsProvider
 */
public class ModItemTagGenerator extends ItemTagsProvider
{
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, ExpansionModMain.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}
