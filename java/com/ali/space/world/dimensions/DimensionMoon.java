package com.ali.space.world.dimensions;

import com.ali.space.init.BiomeInit;
import com.ali.space.init.DimensionInit;
import com.ali.space.world.generation.chunks.ChunkGeneratorMoon;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionMoon extends WorldProvider {

    private static final double MOON_GRAVITY = 5.16;

    public DimensionMoon() {
        this.biomeProvider = new BiomeProviderSingle(BiomeInit.MOON_GROUND);
        this.hasSkyLight = false;
    }

    @Override
    public DimensionType getDimensionType() {
        return DimensionInit.MOON;
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new ChunkGeneratorMoon(world, true, world.getSeed(), null);
    }

    @Override
    public boolean canRespawnHere() {
        return false;
    }

    @Override
    public boolean isSurfaceWorld() {
        return false;
    }

    @Override
    public boolean canCoordinateBeSpawn(int x, int z) {
        return false;
    }

    @Override
    public BlockPos getRandomizedSpawnPoint() {
        BlockPos spawnPoint = super.getRandomizedSpawnPoint();
        return new BlockPos(spawnPoint.getX(), 100, spawnPoint.getZ());
    }

    @Override
    public float calculateCelestialAngle(long worldTime, float partialTicks) {
        return 0.5F;
    }

    @Override
    public Vec3d getFogColor(float celestialAngle, float partialTicks) {
        // Set the fog color for your moon dimension
        return new Vec3d(0.0, 0.0, 0.0);
    }

    @Override
    public Vec3d getSkyColor(Entity cameraEntity, float partialTicks) {
        // Set the sky color for your moon dimension
        return new Vec3d(0.0, 0.0, 0.0);
    }

    // Apply the moon's gravity to entity motion
    public Vec3d getGravity() {
        return new Vec3d(0.0, -MOON_GRAVITY, 0.0);
    }

    // Apply the moon's gravity to fall damage
    public float getFallDamageModifier() {
        return (float) MOON_GRAVITY;
    }

    // Apply the moon's gravity to movement factor
    @Override
    public double getMovementFactor() {
        return 0.16;
    }

    // Apply the moon's gravity to horizon level
    @Override
    public double getHorizon() {
        return 0.0D;
    }
}
