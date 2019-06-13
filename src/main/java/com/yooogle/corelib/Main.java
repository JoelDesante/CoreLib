package com.yooogle.corelib;

import org.bukkit.plugin.java.JavaPlugin;

import com.yooogle.corelib.region.PlayerRegionEventTrigger;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(new PlayerRegionEventTrigger(), this);
		
	}

}
