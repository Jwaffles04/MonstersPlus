package me.coolade.monstersplus.monsters;

import org.bukkit.block.Biome;

public class BiomeSets {
	public static Biome[] COLD = new Biome[] { Biome.COLD_OCEAN, Biome.SNOWY_TAIGA, Biome.SNOWY_TAIGA_HILLS,
			/*Biome.MUTATED_TAIGA_COLD,*/ Biome.FROZEN_OCEAN, Biome.WOODED_HILLS, Biome.FROZEN_RIVER, Biome.SNOWY_TUNDRA,
			Biome.SNOWY_MOUNTAINS/*, Biome.MUTATED_ICE_FLATS*/ };
	public static Biome[] DESERT = new Biome[] { Biome.DESERT, Biome.DESERT_HILLS/*, Biome.MUTATED_DESERT,*/ };
	public static Biome[] HOT = new Biome[] { Biome.DESERT, Biome.DESERT_HILLS, /*Biome.MUTATED_DESERT,*/ Biome.NETHER_WASTES };
	public static Biome[] HELL = new Biome[] { Biome.NETHER_WASTES };
	public static Biome[] SWAMP = new Biome[] { Biome.SWAMP/*, Biome.MUTATED_SWAMPLAND*/ };
	public static Biome[] EXTREME_HILLS = new Biome[] { Biome.MOUNTAINS, Biome.WOODED_MOUNTAINS,
			/*Biome.MUTATED_EXTREME_HILLS, Biome.MUTATED_EXTREME_HILLS_WITH_TREES,*/ Biome.MOUNTAIN_EDGE };
	public static Biome[] RIVER = new Biome[] { Biome.RIVER };
	public static Biome[] WATERFRONT = new Biome[] { Biome.RIVER, Biome.BEACH, Biome.DEEP_OCEAN, Biome.OCEAN };

	private BiomeSets() {
	}
}
