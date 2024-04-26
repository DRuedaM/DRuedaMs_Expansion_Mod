package es.druedam.expansionmod.datagen.loot;

import es.druedam.expansionmod.block.ModBlocks;
import es.druedam.expansionmod.block.custom.StrawberryCropBlock;
import es.druedam.expansionmod.block.custom.TomatoCropBlock;
import es.druedam.expansionmod.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

/**
 * @author David Rueda
 * <p>
 *     Esta clase indica las condiciones
 *     para que los bloques que queramos que dropeen
 *     algo cuando sean destruidos
 * </p>
 * @see BlockLootSubProvider
 */
public class ModBlockLootTables extends BlockLootSubProvider
{

    public ModBlockLootTables()
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate()
    {
        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.TOMATO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(TomatoCropBlock.AGE, 4));

        this.add(ModBlocks.TOMATO_CROP.get(),
                this.applyExplosionDecay(ModBlocks.TOMATO_CROP.get(),
                        LootTable.lootTable()
                                .withPool(LootPool.lootPool()
                                        .add(LootItem.lootTableItem(ModItems.TOMATO_SEEDS.get())))
                                .withPool(LootPool.lootPool()
                                        .when(lootitemcondition$builder)
                                        .add(LootItem.lootTableItem(ModItems.TOMATO_SEEDS.get())
                                                .apply(SetItemCountFunction
                                                        .setCount(UniformGenerator.between(1,2)))))
                                .withPool(LootPool.lootPool()
                                        .when(lootitemcondition$builder)
                                        .add(LootItem.lootTableItem(ModItems.TOMATO.get())
                                                .apply(SetItemCountFunction
                                                        .setCount(UniformGenerator.between(2,3)))))));



        LootItemCondition.Builder lootitemcondition$builder_strawberry = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.STRAWBERRY_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(StrawberryCropBlock.AGE, 7));

        this.add(ModBlocks.STRAWBERRY_CROP.get(),
                this.applyExplosionDecay(ModBlocks.STRAWBERRY_CROP.get(),
                        LootTable.lootTable()
                                .withPool(LootPool.lootPool()
                                        .add(LootItem.lootTableItem(ModItems.STRAWBERRY_SEEDS.get())))
                                .withPool(LootPool.lootPool()
                                        .when(lootitemcondition$builder_strawberry)
                                        .add(LootItem.lootTableItem(ModItems.STRAWBERRY_SEEDS.get())
                                                .apply(SetItemCountFunction
                                                        .setCount(UniformGenerator.between(1,2)))))
                                .withPool(LootPool.lootPool()
                                        .when(lootitemcondition$builder_strawberry)
                                        .add(LootItem.lootTableItem(ModItems.STRAWBERRY.get())
                                                .apply(SetItemCountFunction
                                                        .setCount(UniformGenerator.between(2,3)))))));


        this.add(ModBlocks.ORE_FLUORITE.get(),
                block -> createOreDrop(ModBlocks.ORE_FLUORITE.get(), ModItems.FLUORITE_INGOT.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F))));

        this.add(ModBlocks.DEEPSLATE_FLUORITE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_FLUORITE.get(), ModItems.FLUORITE_INGOT.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
