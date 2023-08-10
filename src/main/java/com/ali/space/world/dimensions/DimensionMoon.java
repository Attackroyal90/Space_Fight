package com.ali.space.world.dimensions;

import com.ali.space.init.BiomeInit;
import com.ali.space.init.DimensionInit;
import com.ali.space.world.generation.chunks.ChunkGeneratorMoon;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionMoon extends WorldProvider{
	
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
		// TODO Auto-generated method stub
		return new ChunkGeneratorMoon(world, true, world.getSeed());
	}
	
	@Override
	public boolean canRespawnHere() {
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() {
		return false;
	}
}
