package com.benzimmer123.blockbreaker.api.objects;

import org.bukkit.entity.Player;

import com.benzimmer123.blockbreaker.api.enums.PlayerState;

public interface BlockBreakerPlayer {

	/**
	 * Method to get the arena a player is currently editing
	 * 
	 * @return BlockBreakerArena
	 * 
	 */
	BlockBreakerArena getEditingArena();

	/**
	 * Method to set the end of combat as timestamp
	 * 
	 * @param long combatTime
	 * 
	 */
	void setCombatTime(long combatTime);

	/**
	 * Method to get check if a player is in combat
	 * 
	 * @return boolean
	 * 
	 */
	boolean inCombat();

	/**
	 * Method to get the end of combat as timestamp
	 * 
	 * @return long
	 * 
	 */
	long getCombatTime();

	/**
	 * Method to set the arena a player is currently editing
	 * 
	 * @param BlockBreakerArena editingArena
	 * 
	 */
	void setEditingArena(BlockBreakerArena editingArena);

	/**
	 * Method to set if a player is editing an arena floor
	 * 
	 * @param boolean isEditingFloor
	 * 
	 */
	void setEditingFloor(boolean isEditingFloor);

	/**
	 * Method to check if a player is editing an arena floor
	 * 
	 * @return boolean
	 * 
	 */
	boolean isEditingFloor();

	/**
	 * Method to set the arena the player is currently in
	 * 
	 * @param BlockBreakerArena blockBreaker
	 * 
	 */
	void setBlockBreaker(BlockBreakerArena blockBreaker);

	/**
	 * Method to get the players frozen time
	 * 
	 * @return int
	 * 
	 */
	int getFrozenTime();

	/**
	 * Method to set the players frozen time
	 * 
	 * @param int frozenTime
	 * 
	 */
	void setFrozenTime(int frozenTime);

	/**
	 * Method to set if a player is frozen
	 * 
	 * @param boolean frozen
	 * 
	 */
	void setFrozen(boolean frozen);

	/**
	 * Method to check if a player is frozen
	 * 
	 * @return boolean
	 * 
	 */
	boolean isFrozen();

	/**
	 * Method to get the arena the player is currently in
	 * 
	 * @return BlockBreakerArena
	 * 
	 */
	BlockBreakerArena getBlockBreaker();

	/**
	 * Method to get the bukkit player
	 * 
	 * @return Player
	 * 
	 */
	Player getPlayer();

	/**
	 * Method to get the players state
	 * 
	 * @return PlayerState
	 * 
	 */
	PlayerState getState();

	/**
	 * Method to set the players state
	 * 
	 * @param PlayerState state
	 * 
	 */
	void setState(PlayerState state);
}