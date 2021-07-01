package com.benzimmer123.blockbreaker.api.objects;

import java.util.List;

import org.bukkit.entity.Player;

import com.benzimmer123.blockbreaker.api.enums.GameState;

public interface BlockBreakerArena {

	void removePlayer(BlockBreakerPlayer p);
	void wonGame(BlockBreakerPlayer p);
	List<BlockBreakerPlayer> getExemptPlayers();
	
	/**
	 * Method to set the arena name
	 * 
	 * @param String name
	 * 
	 */
	void setName(String name);

	/**
	 * Method to get the arena name
	 * 
	 * @return String
	 * 
	 */
	String getName();
	
	/**
	 * Method to add a player to the arena list
	 * 
	 * @param Player player
	 * 
	 */
	void addPlayer(Player player);
	
	/**
	 * Method to add a player to the arena match
	 * 
	 * @param Player player
	 * 
	 */
	void join(Player player);

	/**
	 * Method to check if arena is joinable
	 * 
	 * @return boolean
	 * 
	 */
	boolean isJoinable();

	
	/**
	 * Method to set the GameState
	 * 
	 * @param GameState gameState
	 * 
	 */
	void setState(GameState gameState);
	
	/**
	 * Method to get the GameState
	 * 
	 * @return GameState
	 * 
	 */
	GameState getState();
	
	/**
	 * Method to get all players in this arena
	 * 
	 * @return List of BlockBreakerPlayers
	 * 
	 */
	List<BlockBreakerPlayer> getPlayers();
	
	/**
	 * Method to get the BlockBreakerLocation data
	 * 
	 * @return BlockBreakerLocation
	 * 
	 */
	BlockBreakerLocation getBlockBreakerLocation();

	/**
	 * Method to get the BlockBreakerScheduler data
	 * 
	 * @return BlockBreakerScheduler
	 * 
	 */
	BlockBreakerScheduler getBlockBreakerScheduler();
	
	/**
	 * Method to call task to run
	 */
	void call();

	/**
	 * Method to start the queue for players to join
	 */
	void startCountdown();
	
	/**
	 * Method to start a new blockbreaker game
	 */
	void startGame();
	
	/**
	 * Method to end the blockbreaker match
	 */
	void end();
	
	/**
	 * Method to serialize the arena
	 */
	void save();
	
}