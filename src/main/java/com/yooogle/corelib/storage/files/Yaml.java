package com.yooogle.corelib.storage.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class Yaml implements FlatFile {
	
	private File yaml_file;
	private Plugin plugin;
	
	/**
	 * Creates a YAML flat file. 
	 * 
	 * @param path - The folder in which the file will reside in.
	 * @param file_name - The name of the file excluding the ".yml" extension.
	 * @param plugin
	 */
	public Yaml(String path, String file_name, Plugin plugin) {
		this.yaml_file = new File(path + "/" + file_name + ".yml");
		this.plugin = plugin;
	}
	
	/**
	 * Creates a YAML flat file inside of the default plugin folder 
	 * 
	 * @param file_name - The name of the file excluding the ".yml" extension.
	 * @param plugin
	 */
	public Yaml(String file_name, Plugin plugin) {
		this.yaml_file = new File(plugin.getDataFolder() + "/" + file_name + ".yml");
		this.plugin = plugin;
	}

	public boolean generate() {	
		YamlConfiguration yml = YamlConfiguration.loadConfiguration(this.yaml_file);
		
		try {
			yml.save(this.yaml_file);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Saves the current flat file to disk.
	 * <br>
	 * Wrapper for {@link Yaml#generate()}
	 * 
	 * @return True if the file was saved successfully.
	 */
	public boolean save() {
		return generate();
	}
 	
}
