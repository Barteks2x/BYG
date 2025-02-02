package corgiaoc.byg.common.world.feature.overworld.river;

import corgiaoc.byg.util.noise.fastnoise.FastNoise;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;

import java.util.*;
import java.util.function.Predicate;

/**
 * Used to dynamically create a randomly generated path from 1 object to another.
 */
public class RiverGenerator {
    private final List<Node> nodes;
    private final Map<ChunkPos, List<Node>> fastNodes;

    public RiverGenerator(FastNoise noise, ISeedReader world, BlockPos startPos, ChunkGenerator generator, Predicate<BlockPos> isInvalid, Predicate<BlockPos> isValid, int maxDistance) {
        List<Node> nodes = new ArrayList<>();
        Map<ChunkPos, List<Node>> fastNodes = new HashMap<>();


        nodes.add(new Node(startPos, 0));
        int distanceInNodes = maxDistance / 5;

        int startY = startPos.getY();

        for (int i = 1; i < distanceInNodes; i++) {
            Node prevNode = nodes.get(i - 1);
            float angle = noise.GetNoise(prevNode.getPos().getX(), 0, prevNode.getPos().getZ());

            Vector2f dAngle = get2DAngle(angle * 5, 5);
            BlockPos previousNodePos = prevNode.getPos();
            Vector3i vecAngle = new Vector3i(dAngle.x, 0, dAngle.y);

            BlockPos addedPos = previousNodePos.offset(vecAngle);
            RegistryKey<Biome> biomeRegistryKey = world.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY).getResourceKey(generator.getBiomeSource().getNoiseBiome(addedPos.getX() >> 2, addedPos.getY() >> 2, addedPos.getZ() >> 2)).get();
            int newY = /*biomeRegistryKey == BYGBiomes.CANYON_KEY ? 218 :*/ generator.getFirstFreeHeight(addedPos.getX(), addedPos.getZ(), Heightmap.Type.OCEAN_FLOOR_WG);

            if (newY > previousNodePos.getY()) {
                newY = previousNodePos.getY();
            }

            if (newY < generator.getSeaLevel() + 1) {
                newY = generator.getSeaLevel() + 1;
            }

//            double slide = newY / ((float) startY + generator.getSeaLevel());
//            newY = (int) MathHelper.clampedLerp(generator.getSeaLevel(), startY, slide);

            BlockPos pos = new BlockPos(addedPos.getX(), newY, addedPos.getZ());


            Node nextNode = new Node(pos, i);

            if (isInvalid.test(nextNode.getPos())) {
                break;
            }
            ChunkPos key = new ChunkPos(nextNode.getPos());

            if (isValid.test(nextNode.getPos())) {
                nodes.add(nextNode);
                fastNodes.computeIfAbsent(key, key2 -> new ArrayList<>()).add(nextNode);

                this.nodes = nodes;
                this.fastNodes = fastNodes;
                return;

            }
            nodes.add(nextNode);
            fastNodes.computeIfAbsent(key, key2 -> new ArrayList<>()).add(nextNode);
        }
        this.nodes = null;
        this.fastNodes = null;
    }

    public boolean exists() {
        return nodes != null;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Node> getNodesForChunk(ChunkPos pos) {
        return this.fastNodes.get(pos);
    }

    public Set<ChunkPos> getNodeChunkPositions() {
        return this.fastNodes.keySet();
    }

    public BlockPos getFinalPosition() {
        return this.nodes.get(this.nodes.size() - 1).getPos();
    }

    public int getTotalNumberOfNodes() {
        return this.nodes.size();
    }

    public BlockPos getStartPos() {
        return this.nodes.get(0).getPos();
    }

    public static Vector2f get2DAngle(float angle, float length) {
        float x = (float) (Math.sin(angle) * length);
        float y = (float) (Math.cos(angle) * length);

        return new Vector2f(x, y);
    }


    static class Node {

        private final int idx;
        private BlockPos pos;

        private Node(BlockPos pos, int idx) {
            this.pos = pos;
            this.idx = idx;
        }

        public BlockPos getPos() {
            return pos;
        }

        public void upgradeY(int y) {
            this.pos = new BlockPos(pos.getX(), y, pos.getZ());
        }

        public int getIdx() {
            return idx;
        }
    }
}
