package net.zxq.rastrosgonegriefing.blockit;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockIt extends JavaPlugin {
	public Logger log = Logger.getLogger("Minecraft");

	@Override
	public void onEnable() {
		log("Enabled");

		/*
		getConfig()
				.options()
				.header("Write true to make the block un-useable. Write false to make the block use-able.");
		getConfig().options().copyHeader();
		getConfig().options().copyDefaults(true);
		saveConfig();
		*/

		String pluginFolder = this.getDataFolder().getAbsolutePath();
		(new File(pluginFolder)).mkdirs();

		getServer().getPluginManager().registerEvents(new BlockListener(this),
				this);
		
		//String[] listOne = { "one", "two", "four", "three" };
		List<String> listTwo = new ArrayList<String>();
		
		listTwo.add("Test Line");
		listTwo.add("Test Line 2");
		
		FileConfiguration config = getConfig();
		
		config.addDefault("Blocks.STONE", false);
		config.addDefault("Blocks.GRASS", false);
		config.addDefault("Blocks.DIRT", false);
		config.addDefault("Blocks.COBBLE", false);
		config.addDefault("Blocks.PLANKS", false);
		config.addDefault("Blocks.SAPLINGS", false);
		config.addDefault("Blocks.BEDROCK", false);
		config.addDefault("Blocks.WATER(not bukkit)", false);
		config.addDefault("Blocks.LAVA(not bukkit)", false);
		config.addDefault("Blocks.SAND", false);
		config.addDefault("Blocks.GRAVEL", false);
		config.addDefault("Blocks.GOLDORE", false);
		config.addDefault("Blocks.IRONORE", false);
		config.addDefault("Blocks.COALORE", false);
		config.addDefault("Blocks.LOG", false);
		config.addDefault("Blocks.LEAVES", false);
		config.addDefault("Blocks.SPONGE", false);
		config.addDefault("Blocks.GLASS", false);
		config.addDefault("Blocks.LAPISORE", false);
		config.addDefault("Blocks.LAPISBLOCK", false);
		config.addDefault("Blocks.DISPENSER", false);
		config.addDefault("Blocks.SANDSTONE", false);
		config.addDefault("Blocks.NOTEBLOCK", false);
		config.addDefault("Blocks.BED", false);
		config.addDefault("Blocks.POWEREDRAIL", false);
		config.addDefault("Blocks.DETECTORRAIL", false);
		config.addDefault("Blocks.STICKYPISTON", false);
		config.addDefault("Blocks.WEB", false);
		config.addDefault("Blocks.DEADSHRUB", false);
		config.addDefault("Blocks.TALLGRASS", false);
		config.addDefault("Blocks.PISTON", false);
		config.addDefault("Blocks.WOOL", false);
		config.addDefault("Blocks.DANDELION(Yellow Flower)", false);
		config.addDefault("Blocks.ROSE(Red Flower)", false);
		config.addDefault("Blocks.BROWNMUSHROOM", false);
		config.addDefault("Blocks.REDMUSHROOM", false);
		config.addDefault("Blocks.GOLDBLOCK", false);
		config.addDefault("Blocks.IRONBLOCK", false);
		config.addDefault("Blocks.DOUBLESTONESLAB", false);
		config.addDefault("Blocks.DOUBLESANDSTONESLAB", false);
		config.addDefault("Blocks.DOUBLEWOODENSLAB", false);
		config.addDefault("Blocks.DOUBLECOBBLESLAB", false);
		config.addDefault("Blocks.BRICKSLAB", false);
		config.addDefault("Blocks.TNT", false);
		
		config.options().copyDefaults(true);
		saveConfig();
	}

	@Override
	public void onDisable() {
		log("Disabled");
	}

	public void log(String msg) {
		this.log.info("[BlockIt] " + msg);
	}
}