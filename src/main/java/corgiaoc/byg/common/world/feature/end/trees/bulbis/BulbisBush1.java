package corgiaoc.byg.common.world.feature.end.trees.bulbis;

import com.mojang.serialization.Codec;
import corgiaoc.byg.common.properties.EtherBulbsBlock;
import corgiaoc.byg.common.world.feature.config.BYGMushroomConfig;
import corgiaoc.byg.common.world.feature.overworld.mushrooms.util.BYGAbstractMushroomFeature;
import corgiaoc.byg.core.BYGBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;

import java.util.Random;
import java.util.Set;

public class BulbisBush1 extends BYGAbstractMushroomFeature<BYGMushroomConfig> {

    public BulbisBush1(Codec<BYGMushroomConfig> configIn) {
        super(configIn);
    }

    protected boolean placeMushroom(ISeedReader worldIn, Random rand, BlockPos pos, boolean isMushroom, BYGMushroomConfig config) {
        BlockState STEM = config.getStemProvider().getBlockState(rand, pos);
        BlockState MUSHROOM = config.getMushroomProvider().getBlockState(rand, pos);
        BlockState MUSHROOM2 = config.getMushroom2Provider().getBlockState(rand, pos);
        BlockState MUSHROOM3 = config.getMushroom3Provider().getBlockState(rand, pos);
        BlockState POLLEN = config.getPollenProvider().getBlockState(rand, pos);
        int randTreeHeight = 8 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().setPos(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getHeight()) {
            if (!isDesiredGroundwEndTags(config, worldIn, pos.down(), BYGBlocks.IVIS_PHYLIUM)) {
                return false;
            } else if (!this.isAnotherMushroomLikeThisNearby(worldIn, pos, randTreeHeight, 0, STEM.getBlock(), MUSHROOM.getBlock(), isMushroom)) {
                return false;
            } else if (!this.doesMushroomHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isMushroom)) {
                return false;
            } else {
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(0, 0, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(0, 0, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(0, 0, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(1, 0, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(1, 0, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(1, 0, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(1, 0, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(2, 0, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(2, 0, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-2, 1, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-1, 1, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-1, 1, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-1, 1, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(0, 1, -1));
                this.shroomlight(worldIn, mainmutable.setPos(pos).move(0, 1, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(0, 1, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(0, 1, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(1, 1, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(1, 1, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(1, 1, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(2, 1, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-1, 2, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-1, 2, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-1, 2, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(0, 2, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(0, 2, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(0, 2, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(1, 2, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(1, 2, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(1, 2, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(0, 3, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-2, 0, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-2, 0, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-1, 0, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-1, 0, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-1, 0, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(-1, 0, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(0, 0, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.setPos(pos).move(0, 0, -1));
            }
        }
        return true;
    }
    private void shroomlight(ISeedReader reader, BlockPos pos) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(reader, pos, BYGBlocks.PURPLE_SHROOMLIGHT.getDefaultState());
        }
    }
}