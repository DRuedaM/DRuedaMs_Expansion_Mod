package es.druedam.expansionmod.item;

import es.druedam.expansionmod.ExpansionModMain;
import es.druedam.expansionmod.block.ModBlocks;
import net.minecraft.world.item.*;
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
            () -> new AppendTextItem(new Item.Properties().food(ModFoods.FRIED_CHICKEN), "tooltip.expansion.fried_chicken"));

    public static final RegistryObject<Item> RAW_FRIED_CHICKEN = ITEMS.register("raw_fried_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_FRIED_CHICKEN)));

    public static final RegistryObject<Item> PEPSI = ITEMS.register("pepsi",
            () -> new Item(new Item.Properties().food(ModFoods.PEPSI)));

    public static final RegistryObject<Item> CAMPURRIANA = ITEMS.register("campurriana",
            () -> new AppendTextItem(new Item.Properties().food(ModFoods.CAMPURRIANA), "tooltip.expansion.campurriana"));

    public static final RegistryObject<Item> CROQUETTE = ITEMS.register("croqueta",
            () -> new Item(new Item.Properties().food(ModFoods.CROQUETTE)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new AppendTextItem(new Item.Properties().food(ModFoods.STRAWBERRY), "tooltip.expansion.strawberry"));

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
            () -> new AppendTextItem(new Item.Properties().food(ModFoods.DURUM), "tooltip.expansion.durum"));

    public static final RegistryObject<Item> BURGER = ITEMS.register("burger",
            () -> new AppendTextItem(new Item.Properties().food(ModFoods.BURGER), "tooltip.expansion.burger"));

    public static final RegistryObject<Item> FOOD_COMBINED = ITEMS.register("food_combined",
            () -> new Item(new Item.Properties().food(ModFoods.FOOD_COMBINED).stacksTo(1)));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TOMATO_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> FLUORITE_INGOT = ITEMS.register("fluorite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLUORITE_SWORD = ITEMS.register("fluorite_sword",
            () -> new SwordItem(ModToolTiers.FLUORITE, 3,-1.5f,new Item.Properties()));

    public static final RegistryObject<Item> FLUORITE_SHOVEL = ITEMS.register("fluorite_shovel",
            () -> new ShovelItem(ModToolTiers.FLUORITE, 1,-2.5f,new Item.Properties()));

    public static final RegistryObject<Item> FLUORITE_PICKAXE = ITEMS.register("fluorite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FLUORITE, 2,-3f,new Item.Properties()));

    public static final RegistryObject<Item> FLUORITE_AXE = ITEMS.register("fluorite_axe",
            () -> new AxeItem(ModToolTiers.FLUORITE, 3.5f,-2.5f ,new Item.Properties()));

    public static final RegistryObject<Item> FLUORITE_HOE = ITEMS.register("fluorite_hoe",
            () -> new HoeItem(ModToolTiers.FLUORITE, 1,-2.5f ,new Item.Properties()));

    public static final RegistryObject<Item> FLUORITE_HELMET = ITEMS.register("fluorite_helmet",
            () -> new ArmorItem(ModArmorMaterials.FLUORITE, ArmorItem.Type.HELMET ,new Item.Properties()));

    public static final RegistryObject<Item> FLUORITE_CHESTPLATE = ITEMS.register("fluorite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.FLUORITE, ArmorItem.Type.CHESTPLATE ,new Item.Properties()));

    public static final RegistryObject<Item> FLUORITE_LEGGINGS = ITEMS.register("fluorite_leggings",
            () -> new ArmorItem(ModArmorMaterials.FLUORITE, ArmorItem.Type.LEGGINGS ,new Item.Properties()));

    public static final RegistryObject<Item> FLUORITE_BOOTS = ITEMS.register("fluorite_boots",
            () -> new ArmorItem(ModArmorMaterials.FLUORITE, ArmorItem.Type.BOOTS ,new Item.Properties()));


    public static final RegistryObject<Item> WOOD_HELMET = ITEMS.register("wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.WOOD, ArmorItem.Type.HELMET ,new Item.Properties()));

    public static final RegistryObject<Item> WOOD_CHESTPLATE = ITEMS.register("wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE ,new Item.Properties()));

    public static final RegistryObject<Item> WOOD_LEGGINGS = ITEMS.register("wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS ,new Item.Properties()));

    public static final RegistryObject<Item> WOOD_BOOTS = ITEMS.register("wood_boots",
            () -> new ArmorItem(ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS ,new Item.Properties()));


    //Metodo para registrar en el bus principal del juego todos los items de la clase
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
