package es.druedam.expansionmod.datagen;

import es.druedam.expansionmod.ExpansionModMain;
import es.druedam.expansionmod.item.ModItems;
import es.druedam.expansionmod.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

/**
 * Clase encargada de crear dentro del videojuego
 * spawn aleatorio de los objetos que nosotros queramos
 * y donde queramos
 */
public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider
{

    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, ExpansionModMain.MOD_ID);
    }

    @Override
    protected void start()
    {

        //Hacemos que aparezcan semillas de tomate de la hierba cuando sea destruida con una probabilidad de 35%
        add("tomato_seeds_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, ModItems.TOMATO_SEEDS.get()));

        //Hacemos que aparezcan semilllas de fresa de la hierba cuando sea destruida con una probabilidad de 35%
        add("strawberry_seeds_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build()
        },ModItems.STRAWBERRY_SEEDS.get()));

        add("pepsi_from_zombie", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()
        }, ModItems.PEPSI.get()));

        add("tomato_seeds_from_village_mason", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_cartographer")).build()
        }, ModItems.TOMATO_SEEDS.get()));

        add("raw_fried_chicken_from_village_butcher", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_cartographer")).build()
        }, ModItems.RAW_FRIED_CHICKEN.get()));

        add("raw_fried_chicken_from_village_weaponsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_cartographer")).build()
        }, ModItems.RAW_FRIED_CHICKEN.get()));

        add("raw_fried_chicken_from_village_armorer", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_cartographer")).build()
        }, ModItems.RAW_FRIED_CHICKEN.get()));

    }

}
