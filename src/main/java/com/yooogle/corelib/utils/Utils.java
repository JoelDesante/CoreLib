package com.yooogle.corelib.utils;

import net.md_5.bungee.api.ChatColor;

public class Utils {
	
	// --------------------------------------------------------------------------------
	// getUpper Method start
	/**
	 * 
	 * @param first - The first value you would like to test.
	 * @param second - The second value you would like to test.
	 * @return The highest of the two values given.
	 */
	public static double getUpper(double first, double second) {
		
		if(first > second) {
			return first;
		}
		
		return second;
	}
	
	/**
	 * 
	 * @param first - The first value you would like to test.
	 * @param second - The second value you would like to test.
	 * @return The highest of the two values given.
	 */
	public static float getUpper(float first, float second) {
		
		if(first > second) {
			return first;
		}
		
		return second;
	}
	
	/**
	 * 
	 * @param first - The first value you would like to test.
	 * @param second - The second value you would like to test.
	 * @return The highest of the two values given.
	 */
	public static int getUpper(int first, int second) {
		
		if(first > second) {
			return first;
		}
		
		return second;
	}
	
	/**
	 * 
	 * @param first - The first value you would like to test.
	 * @param second - The second value you would like to test.
	 * @return The highest of the two values given.
	 */
	public static long getUpper(long first, long second) {
		
		if(first > second) {
			return first;
		}
		
		return second;
	}
	
	/**
	 * 
	 * @param first - The first value you would like to test.
	 * @param second - The second value you would like to test.
	 * @return The highest of the two values given.
	 */
	public static short getUpper(short first, short second) {
		
		if(first > second) {
			return first;
		}
		
		return second;
	}
	
	// --------------------------------------------------------------------------------
	// getLower() Method start
	/**
	 * 
	 * @param first - The first value you would like to test.
	 * @param second - The second value you would like to test.
	 * @return The lowest of the two values given.
	 */
	public static double getLower(double first, double second) {
		if(first < second) {
			return first;
		}
		
		return second;
	}
	
	/**
	 * 
	 * @param first - The first value you would like to test.
	 * @param second - The second value you would like to test.
	 * @return The lowest of the two values given.
	 */
	public static float getLower(float first, float second) {
		if(first < second) {
			return first;
		}
		
		return second;
	}
	
	/**
	 * 
	 * @param first - The first value you would like to test.
	 * @param second - The second value you would like to test.
	 * @return The lowest of the two values given.
	 */
	public static int getLower(int first, int second) {
		if(first < second) {
			return first;
		}
		
		return second;
	}
	
	/**
	 * 
	 * @param first - The first value you would like to test.
	 * @param second - The second value you would like to test.
	 * @return The lowest of the two values given.
	 */
	public static long getLower(long first, long second) {
		if(first < second) {
			return first;
		}
		
		return second;
	}
	
	/**
	 * 
	 * @param first - The first value you would like to test.
	 * @param second - The second value you would like to test.
	 * @return The lowest of the two values given.
	 */
	public static short getLower(short first, short second) {
		if(first < second) {
			return first;
		}
		
		return second;
	}
	
	// --------------------------------------------------------------------------------
	/**
	 * 
	 * @param number - The value in which you would like to test.
	 * @param first - The lowest value in the range you would like to test.
	 * @param second - The highest value in the range you would like to test. 
	 * @return Whether the value given is within the range. 
	 */
	public static boolean isBetween(double value, double first, double second) {
		
		if (Utils.getLower(first, second) <= value && Utils.getUpper(first, second) >= value) {
			return true;
		}
		
		return false;
		
	}
	
	/**
	 * 
	 * @param number - The value in which you would like to test.
	 * @param first - The lowest value in the range you would like to test.
	 * @param second - The highest value in the range you would like to test. 
	 * @return Whether the value given is within the range. 
	 */
	public static boolean isBetween(float value, float first, float second) {
		
		if (Utils.getLower(first, second) <= value && Utils.getUpper(first, second) >= value) {
			return true;
		}
		
		return false;
		
	}
	
	/**
	 * 
	 * @param number - The value in which you would like to test.
	 * @param first - The lowest value in the range you would like to test.
	 * @param second - The highest value in the range you would like to test. 
	 * @return Whether the value given is within the range. 
	 */
	public static boolean isBetween(int value, int first, int second) {
		
		if (Utils.getLower(first, second) <= value && Utils.getUpper(first, second) >= value) {
			return true;
		}
		
		return false;
		
	}
	
	/**
	 * 
	 * @param number - The value in which you would like to test.
	 * @param first - The lowest value in the range you would like to test.
	 * @param second - The highest value in the range you would like to test. 
	 * @return Whether the value given is within the range. 
	 */
	public static boolean isBetween(long value, long first, long second) {
		
		if (Utils.getLower(first, second) <= value && Utils.getUpper(first, second) >= value) {
			return true;
		}
		
		return false;
		
	}
	
	/**
	 * 
	 * @param number - The value in which you would like to test.
	 * @param first - The lowest value in the range you would like to test.
	 * @param second - The highest value in the range you would like to test. 
	 * @return Whether the value given is within the range. 
	 */
	public static boolean isBetween(short value, short first, short second) {
		
		if (Utils.getLower(first, second) <= value && Utils.getUpper(first, second) >= value) {
			return true;
		}
		
		return false;
		
	}
	
	/**
	 * 
	 * @param string - The string you want to colorize.
	 * @return Colorized string.
	 */
	public static String color(String string) {
		return ChatColor.translateAlternateColorCodes('&', string);
	}

}
