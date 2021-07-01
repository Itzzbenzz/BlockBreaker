package com.benzimmer123.blockbreaker.api.objects;

import org.bukkit.Location;

public interface BlockBreakerLocation {

	void setSpawnLocation(Location loc);

	void setLobbyLocation(Location loc);

	String getLobbyWorld();

	String getSpawnWorld();
	
	Location getLobbyLocation();

	Location getSpawnPoint();

	void setFloorLocation(int floorLocation);

	int getFloorLocation();

	Location getLocation1();

	Location getLocation2();

}