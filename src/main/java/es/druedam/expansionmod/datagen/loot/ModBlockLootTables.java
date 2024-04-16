package es.druedam.expansionmod.datagen.loot;

import es.druedam.expansionmod.block.ModBlocks;
import es.druedam.expansionmod.block.custom.StrawberryCropBlock;
import es.druedam.expansionmod.block.custom.TomatoCropBlock;
import es.druedam.expansionmod.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider
{

    public ModBlockLootTables()
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    //In this method we create the conditions to specific blocks to drop the things that we want
    @Override
    protected void generate()
    {
        //Condition to crop tomato drop the tomatoes
        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.TOMATO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(TomatoCropBlock.AGE, 4));

        this.add(ModBlocks.TOMATO_CROP.get(), createCropDrops(ModBlocks.TOMATO_CROP.get(), ModItems.TOMATO.get(),
                        ModItems.TOMATO_SEEDS.get(), lootitemcondition$builder));


        //Condition to crop strawberry drop the tomatoes
        LootItemCondition.Builder lootitemcondition$builder_strawberry = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.STRAWBERRY_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(StrawberryCropBlock.AGE, 7));

        this.add(ModBlocks.STRAWBERRY_CROP.get(), createCropDrops(ModBlocks.STRAWBERRY_CROP.get(), ModItems.STRAWBERRY.get(),
                ModItems.STRAWBERRY_SEEDS.get(), lootitemcondition$builder_strawberry));

        //Conditions to drop one or more minerals of fluorite
        this.add(ModBlocks.ORE_FLUORITE.get(),
                block -> createOreDrop(ModBlocks.ORE_FLUORITE.get(), ModItems.FLUORITE_INGOT.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}