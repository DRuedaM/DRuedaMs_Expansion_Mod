package es.druedam.expansionmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
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
    private final boolean spawnParticles = true;


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

    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, RandomSource pRandom) {

            if (this.spawnParticles && pRandom.nextInt(5) == 0) {
                for(int i = 0; i < pRandom.nextInt(1) + 1; ++i) {
                    pLevel.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (double)pPos.getX() + 0D + pRandom.nextDouble() + 0.2D, (double)pPos.getY() + 0.5D, (double)pPos.getZ() + 0D + pRandom.nextDouble() + 0.2D, 0, 0.01, 0);
                }
            }


    }


}
