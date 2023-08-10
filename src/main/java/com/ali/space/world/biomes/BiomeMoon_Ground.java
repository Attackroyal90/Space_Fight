package com.ali.space.world.biomes;

import com.ali.space.init.BlockInit;

import net.minecraft.world.biome.Biome;

public class BiomeMoon_Ground extends Biome {
	public BiomeMoon_Ground() {
		super(new BiomeProperties("Moon_Ground").setRainDisabled().setTemperature(0f).setHeightVariation(0.1f));
		
		topBlock = BlockInit.MOON_ROCK.getDefaultState();
		fillerBlock = BlockInit.MOON_ROCK.getDefaultState();
		
		this.decorator = null;
		this.decorator.treesPerChunk = 0;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
	}
}
