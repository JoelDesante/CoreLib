package com.yooogle.corelib.region;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerRegionEventTrigger implements Listener {
	
	@EventHandler
	public void onPlayerRegionEventTrigger(PlayerMoveEvent e) {
		
		Player player = e.getPlayer();
		
		for(Region r : Region.getRegions()) {
			if(r.isInside(player.getLocation())) {
				System.out.println(Region.getRegions().length);
				if(!r.isWithin(player)) {
					r.addWithin(player);
				}
			} else {
				if(r.isWithin(player)) {
					r.removeWithin(player);
				}
			}
		}
		
	}
	
}
