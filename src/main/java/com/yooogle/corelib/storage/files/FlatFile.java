package com.yooogle.corelib.storage.files;

public interface FlatFile {
	
	/**
	 * Generates the flat file as well as all the folders leading up to it.
	 * 
	 * @return True if the file was successfully created.
	 */
	boolean generate();
	
	/**
	 * Saves the current flat file to disk.
	 * 
	 * @return True if the save was successful.
	 */
	boolean save();
	
}
