package es.druedam.expansionmod.block.custom;

import es.druedam.expansionmod.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

/**
 * @author David Rueda
 * <p>
 *      Esta clase crea un nuevo tipo de cultivo con parametros
 *      modificados, en este caso hacemos que tenga una edad elegida por
 *      nosotros, y al registrarlo en la clase ModBlocks, lo definimos como cultivo
 * </p>
 * @see TomatoCropBlock
 * @see CropBlock
 * @see es.druedam.expansionmod.block.ModBlocks
 */
public class StrawberryCropBlock extends CropBlock
{
    public static final int MAX_AGE = 7;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0 , 7);


    public StrawberryCropBlock(Properties pProperties)
    {
        super(pProperties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.STRAWBERRY_SEEDS.get();
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
