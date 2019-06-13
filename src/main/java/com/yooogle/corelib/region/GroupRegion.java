package com.yooogle.corelib.region;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.block.Block;

public class GroupRegion extends Region {
	
	ArrayList<ZoneRegion> regions = new ArrayList<ZoneRegion>();
	
	@Override
	public boolean isInside(Location location) {
		if (regions.size() > 0) {
			for(ZoneRegion r : regions) {
				if(r.isInside(location)) {
					return true;
				}
			}
		}
		
		return false;
	}

	/**
	 * 
	 * @return An array of blocks.
	 */
	@Override
	public Block[] getInterior() {
		
		if(regions.size() > 0) {
			List<Block> blocks = Collections.synchronizedList(new ArrayList<Block>());
			
			for(ZoneRegion r : regions) {
				Block[] temp = r.getInterior();
				
				for(Block b : temp) {
					blocks.add(b);
				}
			}
			
			return blocks.toArray(new Block[blocks.size()]);
		}
		
		return new Block[0];
	}
	
	/**
	 * 
	 * @param zone - ZoneRegion that you would like to add to the group.
	 * @return True if the region was successfully added.
	 */
	public boolean add(ZoneRegion zone) {
		return regions.add(zone);
	}
	
	/**
	 * 
	 * @param zone - ZoneRegion that you would like to remove from the group
	 * @return True if the region being removed exists in the group.
	 */
	public boolean remove(ZoneRegion zone) {
		return regions.remove(zone);
	}

}
