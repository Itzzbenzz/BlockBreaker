package com.benzimmer123.blockbreaker;

import org.bukkit.plugin.java.JavaPlugin;

public class BlockBreaker extends JavaPlugin {

	private static final BlockBreaker instance = new BlockBreaker();
	private static final BlockBreaker blockBreakerManager = new BlockBreaker();

	public static BlockBreaker getInstance() {
		return instance;
	}

	public BlockBreaker getBlockBreakerManager() {
		return blockBreakerManager;
	}
}
