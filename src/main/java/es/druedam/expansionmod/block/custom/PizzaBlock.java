package es.druedam.expansionmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * @author David Rueda
 * <p>
 *     La clase Pizza block funciona igual que una tarta de minecraft.
 *     la tarta de minecraft es un tipo de comida que puede ser colocado
 *     como parte de un bloque del mundo, en el cual todos los jugadores pueden
 *     comer de ella y alimentarse. El funcionamiento de la pizza es el mismo,
 *     lo unico que es modificado es su textura y su tamaño, al heredar de CakeBlock
 *     su comportamiento es el mismo.
 * </p>
 * @see CakeBlock
 */
public class PizzaBlock extends CakeBlock
{
    public static final VoxelShape SHAPE = Block.box(0,0,0,15,2,15);

    public PizzaBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }
}
