package es.druedam.expansionmod.item;

import es.druedam.expansionmod.ExpansionModMain;
import es.druedam.expansionmod.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * La clase ModItems permite la creacion de items
 * y la capacidad de insertarlos automaticamente al juego
 * con distintas propiedades de los mismos
 * Principalmente se utiliza la clase Deferred register para registrar los objetos
 * y Registry object para crear y almacenar en una variable uno por uno los objetos
 */
public class ModItems
{
    /**
     La clase Deferred Register es una utility class que nos permite manejar la entrada de nuevos objetos al juego
     en este caso la utilizaremos para agregar los items al juego base
     */
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExpansionModMain.MOD_ID);

    public static final RegistryObject<Item> FRIED_CHICKEN = ITEMS.register("fried_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.FRIED_CHICKEN)));

    public static final RegistryObject<Item> RAW_FRIED_CHICKEN = ITEMS.register("raw_fried_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_FRIED_CHICKEN)));

    public static final RegistryObject<Item> PEPSI = ITEMS.register("pepsi",
            () -> new Item(new Item.Properties().food(ModFoods.PEPSI)));

    public static final RegistryObject<Item> CAMPURRIANA = ITEMS.register("campurriana",
            () -> new Item(new Item.Properties().food(ModFoods.CAMPURRIANA)));

    public static final RegistryObject<Item> CROQUETTE = ITEMS.register("croqueta",
            () -> new Item(new Item.Properties().food(ModFoods.CROQUETTE)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE)));

    public static final RegistryObject<Item> CHOCOLATE_TABLE = ITEMS.register("chocolate_table",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_TABLE)));

    public static final RegistryObject<Item> CHOCOLATE_MILKSHAKE = ITEMS.register("chocolate_milkshake",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_MILKSHAKE)));

    public static final RegistryObject<Item> BOCATA_LOMO_QUESO = ITEMS.register("pork_cheese_sandwich",
            () -> new Item(new Item.Properties().food(ModFoods.BOCATA_LOMO_QUESO)));


    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO)));

    public static final RegistryObject<Item> DURUM = ITEMS.register("durum",
            () -> new Item(new Item.Properties().food(ModFoods.DURUM)));

    public static final RegistryObject<Item> BURGER = ITEMS.register("burger",
            () -> new Item(new Item.Properties().food(ModFoods.BURGER)));

    public static final RegistryObject<Item> FOOD_COMBINED = ITEMS.register("food_combined",
            () -> new Item(new Item.Properties().food(ModFoods.FOOD_COMBINED).stacksTo(1)));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TOMATO_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_CROP.get(), new Item.Properties()));


    //Metodo para registrar en el bus principal del juego todos los items de la clase
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
