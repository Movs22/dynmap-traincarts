package com.movies22.cashcraft.tc.dynmap;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;
import org.dynmap.DynmapAPI;

import com.movies22.cashcraft.tc.TrainCarts;
import com.movies22.cashcraft.tc.api.MetroLines.MetroLine;



public class Main extends JavaPlugin {

	public TrainCarts traincarts;
	
	public DynmapAPI dynmapAPI;
	
	@Override
	public void onEnable() {
		dynmapAPI = (DynmapAPI) getServer().getPluginManager().getPlugin("dynmap");
		traincarts = (TrainCarts) getServer().getPluginManager().getPlugin("TrainCarts2");
		MetroLine l = traincarts.lines.createLine("TEST", "#ff0000");
		getServer().getLogger().log(Level.INFO, "Created " + l);
	}
	
	@Override
	public void onDisable() {
		
	}
}
