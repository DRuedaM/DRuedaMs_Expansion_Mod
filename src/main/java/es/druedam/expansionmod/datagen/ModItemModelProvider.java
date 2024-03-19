package es.druedam.expansionmod.datagen;

import es.druedam.expansionmod.ExpansionModMain;
import es.druedam.expansionmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider
{

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExpansionModMain.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        simpleItem(ModItems.BOCATA_LOMO_QUESO);
        simpleItem(ModItems.CAMPURRIANA);
        simpleItem(ModItems.CHEESE);
        simpleItem(ModItems.CHOCOLATE_MILKSHAKE);
        simpleItem(ModItems.CHOCOLATE_TABLE);
        simpleItem(ModItems.CROQUETTE);
        simpleItem(ModItems.PEPSI);
        simpleItem(ModItems.RAW_FRIED_CHICKEN);
        simpleItem(ModItems.FRIED_CHICKEN);
        simpleItem(ModItems.STRAWBERRY);
        simpleItem(ModItems.FRIED_CHICKEN);
        simpleItem(ModItems.TOMATO);
        simpleItem(ModItems.DURUM);
        simpleItem(ModItems.BURGER);
        simpleItem(ModItems.FOOD_COMBINED);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item)
    {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExpansionModMain.MOD_ID, "item/" + item.getId().getPath()));
    }
}
