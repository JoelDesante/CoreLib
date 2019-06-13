package com.yooogle.corelib.region;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;

import com.yooogle.corelib.utils.Utils;

public class ZoneRegion extends Region {
	
	private Location[] markers = new Location[2];

	@Override
	public boolean isInside(Location location) {
		
		World world = markers[0].getWorld();
		
		if(world.equals(location.getWorld())) {
			
			double x = location.getBlockX();
			double y = location.getBlockY();
			double z = location.getBlockZ();
			
			if(Utils.isBetween(x, markers[0].getX(), markers[1].getX())) {
				if(Utils.isBetween(y, markers[0].getY(), markers[1].getY())) {
					if(Utils.isBetween(z, markers[0].getZ(), markers[1].getZ())) {
						return true;
					}
				}
			}
		}
		
		return false;
	}

	@Override
	public Block[] getInterior() {
		List<Block> temp = Collections.synchronizedList(new ArrayList<Block>());
		
		Location pos1 = markers[0];
		Location pos2 = markers[1];
		World world = pos1.getWorld();
		
		if(!world.equals(pos2.getWorld())) {
			return null;
		}
		
		double lower_x = Utils.getLower(pos1.getX(), pos2.getX());
		double upper_x = Utils.getUpper(pos1.getX(), pos2.getX());
		
		double lower_y = Utils.getLower(pos1.getY(), pos2.getY());
		double upper_y = Utils.getUpper(pos1.getY(), pos2.getY());
		
		double lower_z = Utils.getLower(pos1.getZ(), pos2.getZ());
		double upper_z = Utils.getUpper(pos1.getZ(), pos2.getZ());
		
		for(double x = lower_x; x <= upper_x; x++) {
			for(double y = lower_y; y <= upper_y; y++) {
				for(double z = lower_z; z <= upper_z; z++) {
					temp.add(world.getBlockAt(new Location(world, x, y, z)));
				}
			}
		}
		
		return temp.toArray(new Block[temp.size()]);
	}
	
	public void setPosition(int id, Location location) {
		markers[id] = location;
	}
	
	public Location[] getMarkers() {
		return markers;
	}

}
