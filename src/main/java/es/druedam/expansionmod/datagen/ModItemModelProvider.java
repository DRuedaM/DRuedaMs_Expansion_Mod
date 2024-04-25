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

/**
 * @author David Rueda
 * <p>
 *     Esta clase es la encargada de registrar
 *     los items para su posterior generacion de ficheros JSON
 * </p>
 * @see DataGenerators
 */
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
        simpleItem(ModItems.TOMATO_SEEDS);
        simpleItem(ModItems.STRAWBERRY_SEEDS);
        simpleItem(ModItems.FLUORITE_INGOT);

        handheldItem(ModItems.FLUORITE_PICKAXE);
        handheldItem(ModItems.FLUORITE_AXE);
        handheldItem(ModItems.FLUORITE_SWORD);
        handheldItem(ModItems.FLUORITE_HOE);
        handheldItem(ModItems.FLUORITE_SHOVEL);

        simpleItem(ModItems.FLUORITE_HELMET);
        simpleItem(ModItems.FLUORITE_CHESTPLATE);
        simpleItem(ModItems.FLUORITE_LEGGINGS);
        simpleItem(ModItems.FLUORITE_BOOTS);

        simpleItem(ModItems.WOOD_HELMET);
        simpleItem(ModItems.WOOD_CHESTPLATE);
        simpleItem(ModItems.WOOD_LEGGINGS);
        simpleItem(ModItems.WOOD_BOOTS);


    }

    /**
     * <p>
     *     Funcion que registra items comunes con la estructura de JSON
     *     necesaria
     * </p>
     * @param item
     * @return ItemModelBuilder
     */
    private ItemModelBuilder simpleItem(RegistryObject<Item> item)
    {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExpansionModMain.MOD_ID, "item/" + item.getId().getPath()));
    }

    /**
     * <p>
     *     Funcion que registra items handheld (herramientas) con las estrucutra de JSON
     *     necesaria
     * </p>
     * @param item
     * @return ItemModelBuilder
     */
    private ItemModelBuilder handheldItem(RegistryObject<Item> item)
    {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ExpansionModMain.MOD_ID, "item/" + item.getId().getPath()));
    }


}
