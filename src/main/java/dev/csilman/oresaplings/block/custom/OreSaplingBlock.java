package dev.csilman.oresaplings.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;

public class OreSaplingBlock extends SaplingBlock {

    private Block block;

    public OreSaplingBlock(TreeGrower treeGrower, Properties properties, Block block) {
        super(treeGrower, properties);
        this.block = block;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(block);
    }
}
