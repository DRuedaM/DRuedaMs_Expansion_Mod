package es.druedam.expansionmod.block.custom;

import es.druedam.expansionmod.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

/**
 * Clase que hereda de bloque de culitvo
 * para crear uno de tomate
 */
public class TomatoCropBlock extends CropBlock
{
    public static final int MAX_AGE = 4;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_4;


    public TomatoCropBlock(Properties pProperties)
    {
        super(pProperties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.TOMATO_SEEDS.get();
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
}
