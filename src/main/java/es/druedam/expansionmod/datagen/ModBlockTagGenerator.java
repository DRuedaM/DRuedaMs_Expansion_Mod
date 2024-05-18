package es.druedam.expansionmod.datagen;

import es.druedam.expansionmod.ExpansionModMain;
import es.druedam.expansionmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

/**
 * @author David Rueda
 * <p>
 *     Clase para automatizar la creacion de ficheros
 *     JSON donde se indican los tags a los items y bloques del mod
 * </p>
 * @see BlockTagsProvider
 */
public class ModBlockTagGenerator extends BlockTagsProvider
{
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ExpansionModMain.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ORE_FLUORITE.get())
                .add(ModBlocks.DEEPSLATE_FLUORITE.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ORE_FLUORITE.get())
                .add(ModBlocks.DEEPSLATE_FLUORITE.get());
    }
}
