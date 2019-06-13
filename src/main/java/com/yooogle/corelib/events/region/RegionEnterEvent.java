package com.yooogle.corelib.events.region;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.yooogle.corelib.region.Region;

public class RegionEnterEvent extends Event {

	private final Region region;
	private final Entity entity;
	
	public RegionEnterEvent(Region region, Entity entity) {
		this.region = region;
		this.entity = entity;
	}
	
	private static final HandlerList HANDLERS = new HandlerList();
	
	@Override
	public HandlerList getHandlers() {
		return HANDLERS;
	}
	
	public static HandlerList getHandlerList() {
		return HANDLERS;
	}
	
	public Entity getPlayer() {
		return this.entity;
	}
	
	public Region getRegion() {
		return this.region;
	}

}
