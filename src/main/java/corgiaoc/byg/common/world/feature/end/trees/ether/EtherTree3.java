package corgiaoc.byg.common.world.feature.end.trees.ether;

import com.mojang.serialization.Codec;
import corgiaoc.byg.common.world.feature.config.BYGTreeFeatureConfig;
import corgiaoc.byg.common.world.feature.overworld.trees.util.BYGAbstractTreeFeature;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;

import java.util.Random;
import java.util.Set;

public class EtherTree3 extends BYGAbstractTreeFeature<BYGTreeFeatureConfig> {

    public EtherTree3(Codec<BYGTreeFeatureConfig> configIn) {
        super(configIn);
    }

    protected boolean generate(Set<BlockPos> changedBlocks, ISeedReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling, BYGTreeFeatureConfig config) {

        int randTreeHeight = config.getMinHeight() + rand.nextInt(config.getMaxPossibleHeight());
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().setPos(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getHeight()) {
            if (!isDesiredGroundwEndTags(worldIn, pos.down(), config)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 7, 5, 5, isSapling)) {
                return false;
            } else {
                placeTrunk(config, rand,changedBlocks, worldIn, mainmutable.add(0, 0, 0), boundsIn);
                placeTrunk(config, rand,changedBlocks, worldIn, mainmutable.add(0, 1, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(1, 1, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(1, 1, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(1, 2, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(0, 3, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(1, 3, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(0, 4, -2), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(0, 4, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 5, -2), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(0, 5, -2), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-5, 6, -4), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 6, -4), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 6, -3), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 6, -3), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(0, 6, -2), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(1, 6, -2), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 7, -3), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 7, -3), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 7, -2), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 7, -5), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 7, -4), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 7, -3), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 7, -4), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(1, 7, -2), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(1, 7, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(1, 8, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(2, 8, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 9, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 9, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(1, 9, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(1, 9, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(1, 9, 1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(3, 9, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(3, 9, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 10, 1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(0, 10, 1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(0, 10, 2), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(1, 10, 1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(2, 10, -3), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(3, 10, -4), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(3, 10, -3), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(3, 10, -2), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(4, 10, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-5, 5, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-5, 5, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 5, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 5, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 5, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 5, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 5, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-6, 6, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-5, 6, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-5, 6, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-5, 6, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 6, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 6, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 6, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 6, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 6, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 6, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 6, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 6, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 6, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 6, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 6, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 6, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 6, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 6, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 6, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-6, 7, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-6, 7, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-5, 7, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-5, 7, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-5, 7, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-5, 7, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 7, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 7, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 7, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 7, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 7, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 7, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 7, -7), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 7, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 7, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 7, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 7, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 7, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 7, -7), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 7, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 7, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 7, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 7, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 7, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 7, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 7, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 7, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 7, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 7, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 7, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 7, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 7, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-5, 8, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 8, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 8, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 8, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 8, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 8, -7), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 8, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 8, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 8, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 8, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 8, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 8, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, -7), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 8, -7), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 8, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 8, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 8, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 8, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 8, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 8, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 8, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 8, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 8, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 8, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 8, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 8, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 8, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 8, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 8, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 8, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(5, 8, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 9, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 9, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 9, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 9, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 9, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 9, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 9, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 9, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 9, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 9, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 9, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 9, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 9, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 9, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 9, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 9, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 9, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 9, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 9, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 9, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 9, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 9, 3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 9, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 9, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 9, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 9, 3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 9, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 9, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 9, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 9, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 9, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 9, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 9, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 9, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 9, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 9, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 9, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 9, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(5, 9, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(5, 9, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 10, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 10, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 10, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 10, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 10, 3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 10, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 10, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 10, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 10, 3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 10, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 10, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 10, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 10, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 10, 3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 10, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 10, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 10, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 10, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 10, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 10, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 10, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 10, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 10, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 10, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 10, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 10, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 10, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 10, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 10, -6), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 10, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 10, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 10, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 10, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 10, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 10, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 10, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 10, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 10, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 10, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 10, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(5, 10, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(5, 10, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(5, 10, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(6, 10, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 11, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 11, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 11, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 11, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 11, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 11, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 11, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 11, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 11, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 11, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 11, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 11, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 11, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 11, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 11, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 11, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 11, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 11, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 11, -5), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 11, -4), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 11, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 11, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 11, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(3, 11, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 11, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 11, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(4, 11, 0), boundsIn);
            }
        }
        return true;
    }
}