package com.movies22.cashcraft.tc.dynmap;

import org.bukkit.plugin.java.JavaPlugin;
import org.dynmap.DynmapAPI;

import com.movies22.cashcraft.tc.TrainCarts;



public class Main extends JavaPlugin {

	public TrainCarts traincarts;
	
	public DynmapAPI dynmapAPI;
	
	@Override
	public void onEnable() {
		dynmapAPI = (DynmapAPI) getServer().getPluginManager().getPlugin("dynmap");
		traincarts = (TrainCarts) getServer().getPluginManager().getPlugin("TrainCarts2"); 
	}
	
	@Override
	public void onDisable() {
		
	}
}
