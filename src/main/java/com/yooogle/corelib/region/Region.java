package com.yooogle.corelib.region;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;

import com.yooogle.corelib.events.region.RegionEnterEvent;
import com.yooogle.corelib.events.region.RegionLeaveEvent;

public abstract class Region {
	
	private static List<Region> regions = Collections.synchronizedList(new ArrayList<Region>());
	private List<Entity> entities_within = Collections.synchronizedList(new ArrayList<Entity>());
	
	public Region() {
		regions.add(this);
	}
	
	/**
	 * 
	 * @param location - The location you would like to test.
	 * @return Whether or not the location given is inside of the region or not.  
	 */
	public abstract boolean isInside(Location location);
	
	/**
	 * 
	 * @return Array of all the Blocks that reside within the Region. 
	 */
	public abstract Block[] getInterior();
	
	/**
	 * 
	 * @param entity - The entity you would like to check.
	 * @return True if the entity is inside of the region.
	 */
	protected boolean isWithin(Entity entity) {
		return entities_within.contains(entity);
	}
	
	/**
	 * 
	 * @param entity - The entity you would like to add.
	 * @return True if the entity was added within successfully.
	 */
	protected boolean addWithin(Entity entity) {
		RegionEnterEvent ree = new RegionEnterEvent(this, entity);
		Bukkit.getPluginManager().callEvent(ree);
		return entities_within.add(entity);
	}
	
	/**
	 * 
	 * @param entity - The entity you would like to remove.
	 * @return True if the entity existed in the listed and was removed.
	 */
	protected boolean removeWithin(Entity entity) {
		RegionLeaveEvent rle = new RegionLeaveEvent(this, entity);
		Bukkit.getPluginManager().callEvent(rle);
		return entities_within.remove(entity);
	}
	
	/**
	 * 
	 * @return An array of regions that exist on the server.
	 */
	public static Region[] getRegions() {
		return regions.toArray(new Region[regions.size()]);
	}
	
}
