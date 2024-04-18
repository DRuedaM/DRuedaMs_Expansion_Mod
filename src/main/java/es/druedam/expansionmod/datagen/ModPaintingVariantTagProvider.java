package es.druedam.expansionmod.datagen;

import es.druedam.expansionmod.ExpansionModMain;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PaintingVariantTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModPaintingVariantTagProvider extends PaintingVariantTagsProvider
{

    public ModPaintingVariantTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,  @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, ExpansionModMain.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(PaintingVariantTags.PLACEABLE)
                .addOptional(new ResourceLocation(ExpansionModMain.MOD_ID, "mouse"))
                .addOptional(new ResourceLocation(ExpansionModMain.MOD_ID, "sad_mouse"))
                .addOptional(new ResourceLocation(ExpansionModMain.MOD_ID, "ultrakill"))
                .addOptional(new ResourceLocation(ExpansionModMain.MOD_ID, "rodrick"))
                .addOptional(new ResourceLocation(ExpansionModMain.MOD_ID, "spain_flag"))
                .addOptional(new ResourceLocation(ExpansionModMain.MOD_ID, "brocoli"));
    }
}