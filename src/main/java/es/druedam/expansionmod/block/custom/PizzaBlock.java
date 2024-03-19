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
 * Esta clase crea un item especial,
 * hereda directamente de la clase tarta de minecraft
 * un objeto que en vez de comer directamente de la mano
 * se pone en el suelo y varios pueden comer de ahi
 * lo primero que hacemos es cambiar las dimensiones para dar
 * un aspecto de pizza y hacer la masa fina y sobreescribir
 * los getters para que lea el nuevo valor
 * Para crear las fases de la pizza siendo comida se crean varios json
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
