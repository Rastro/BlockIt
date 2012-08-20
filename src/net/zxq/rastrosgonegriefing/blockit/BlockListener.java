package net.zxq.rastrosgonegriefing.blockit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.material.LongGrass;

public class BlockListener implements Listener {
	private BlockIt plugin;
	public static Material[] stone = { Material.STONE };
	public static Material[] grass = { Material.GRASS };
	public static Material[] dirt = { Material.DIRT };
	public static Material[] cobble = { Material.COBBLESTONE };
	public static Material[] planks = { Material.WOOD };
	public static Material[] sapling = { Material.SAPLING };
	public static Material[] bedrock = { Material.BEDROCK };
	public static Material[] water = { Material.WATER };
	public static Material[] lava = { Material.LAVA };
	public static Material[] sand = { Material.SAND };
	public static Material[] gravel = { Material.GRAVEL };
	public static Material[] goldOre = { Material.GOLD_ORE };
	public static Material[] ironOre = { Material.IRON_ORE };
	public static Material[] coalOre = { Material.COAL_ORE };
	public static Material[] wood = { Material.LOG };
	public static Material[] leaves = { Material.LEAVES };
	public static Material[] sponge = { Material.SPONGE };
	public static Material[] glass = { Material.GLASS };
	public static Material[] lapisOre = { Material.LAPIS_ORE };
	public static Material[] lapisBlock = { Material.LAPIS_BLOCK };
	public static Material[] dispenser = { Material.DISPENSER };
	public static Material[] sandStone = { Material.SANDSTONE };
	public static Material[] noteBlock = { Material.NOTE_BLOCK };
	public static Material[] bed = { Material.BED_BLOCK };
	public static Material[] poweredRail = { Material.POWERED_RAIL };
	public static Material[] detectorRail = { Material.DETECTOR_RAIL };
	public static Material[] stickyPiston = { Material.PISTON_STICKY_BASE };
	public static Material[] web = { Material.WEB };
	public static Material[] shrub = { Material.DEAD_BUSH };
	public static Material[] tallGrass = { Material.LONG_GRASS };
	public static Material[] liveShrub = { Material.LONG_GRASS };
	public static Material[] piston = { Material.PISTON_BASE };
	public static Material[] wool = { Material.WOOL };
	public static Material[] dandelion = { Material.YELLOW_FLOWER };
	public static Material[] rose = { Material.RED_ROSE };
	public static Material[] brownMushroom = { Material.BROWN_MUSHROOM };
	public static Material[] redMushroom = { Material.RED_MUSHROOM };
	public static Material[] goldBlock = { Material.GOLD_BLOCK };
	public static Material[] ironBlock = { Material.IRON_BLOCK };
	public static Material[] doubleStoneSlab = { Material.DOUBLE_STEP };
	public static Material[] doubleSandStoneSlab = { Material.DOUBLE_STEP };
	public static Material[] doubleWoodenSlab = { Material.WOOD_DOUBLE_STEP };
	public static Material[] doubleCobbleSlab = { Material.COBBLESTONE };
	public static Material[] doubleBrickSlab = { Material.BRICK };
	
	public static Material[] tnt = { Material.TNT };

	public BlockListener(BlockIt plugin) {
		this.plugin = plugin;
	}

	@EventHandler()
	public void onBlockPlace(BlockPlaceEvent event) {
		Material block1 = event.getBlock().getType();
		Block block = event.getBlock();
		Player player = event.getPlayer();

		if (plugin.getConfig().getString("Blocks.STONE") == "true") {
			for (Material blocked : stone) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.stone")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing" + ChatColor.RED
										+ " STONE " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.GRASS") == "true") {
			for (Material blocked : grass) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.grass")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing" + ChatColor.RED
										+ " GRASS " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.DIRT") == "true") {
			for (Material blocked : dirt) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.dirt")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing" + ChatColor.RED
										+ " DIRT " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.COBBLE") == "true") {
			for (Material blocked : cobble) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.cobble")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing" + ChatColor.RED
										+ " COBBLESTONE " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.PLANKS") == "true") {
			for (Material blocked : planks) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.planks")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " WOODEN PLANK " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.SAPLINGS") == "true") {
			for (Material blocked : sapling) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.saplings")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " SAPLING " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.BEDROCK") == "true") {
			for (Material blocked : bedrock) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.bedrock")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing" + ChatColor.RED
										+ " BEDROCK " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.WATER(not bukkit)") == "true") {
			for (Material blocked : water) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.water")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing" + ChatColor.RED
										+ " WATER BLOCK " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.LAVA(not bukkit)") == "true") {
			for (Material blocked : lava) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.lava")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing" + ChatColor.RED
										+ " LAVA BLOCK " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.SAND") == "true") {
			for (Material blocked : sand) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.sand")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing" + ChatColor.RED
										+ " SAND " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.GRAVEL") == "true") {
			for (Material blocked : gravel) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.gravel")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing" + ChatColor.RED
										+ " GRAVEL " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.GOLDORE") == "true") {
			for (Material blocked : goldOre) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.goldore")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " GOLD-ORE-BLOCK " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.IRONORE") == "true") {
			for (Material blocked : ironOre) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.ironore")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " IRON-ORE-BLOCK " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.COALORE") == "true") {
			for (Material blocked : coalOre) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.coalore")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " COAL-ORE-BLOCK " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.LOG") == "true") {
			for (Material blocked : wood) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.wood")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " LOG " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.LEAVES") == "true") {
			for (Material blocked : leaves) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.leaves")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " LEAVE BLOCK " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.SPONGE") == "true") {
			for (Material blocked : sponge) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.sponge")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " SPONGE " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.GLASS") == "true") {
			for (Material blocked : glass) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.glass")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " GLASS BLOCK " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.LAPISORE") == "true") {
			for (Material blocked : lapisOre) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.lapisore")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " LAPIS-ORE-BLOCK " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.LAPISBLOCK") == "true") {
			for (Material blocked : lapisBlock) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.lapisblock")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " LAPIS-BLOCK " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.DISPENSER") == "true") {
			for (Material blocked : dispenser) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.dispenser")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " DISPENSER " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.SANDSTONE") == "true") {
			for (Material blocked : sandStone) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.sandstone")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " SANDSTONE BLOCK" + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.NOTEBLOCK") == "true") {
			for (Material blocked : noteBlock) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.noteblock")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " NOTEBLOCK " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.BED") == "true") {
			for (Material blocked : bed) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.bed")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " BED " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.POWEREDRAIL") == "true") {
			for (Material blocked : poweredRail) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.poweredrail")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " POWERED RAIL " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.DETECTORRAIL") == "true") {
			for (Material blocked : detectorRail) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.detectorrail")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " DETECTOR RAIL " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.STICKYPISTON") == "true") {
			for (Material blocked : stickyPiston) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.stickypiston")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " STICKY PISTON " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.WEB") == "true") {
			for (Material blocked : web) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.web")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " WEB " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("DEADSHRUB") == "true") {
			for (Material blocked : shrub) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.shrub")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " SHRUB " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("TALLGRASS") == "true") {
			for (Material blocked : tallGrass) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.tallgrass")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing" + ChatColor.RED
										+ " TALLGRASS " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.PISTON") == "true") {
			for (Material blocked : piston) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.piston")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " PISTON " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.WOOL") == "true") {
			for (Material blocked : wool) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.wool")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " WOOL BLOCK " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.DANDELION(Yellow Flower)") == "true") {
			for (Material blocked : dandelion) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.dandelion")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " DANDELION " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.ROSE(Red Flower)") == "true") {
			for (Material blocked : rose) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.rose")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " ROSE " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}

		if (plugin.getConfig().getString("Blocks.BROWNMUSHROOM") == "true") {
			for (Material blocked : brownMushroom) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.brownmushroom")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " BROWN MUSHROOM " + ChatColor.WHITE
										+ "at " + "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}
		
		if (plugin.getConfig().getString("Blocks.REDMUSHROOM") == "true") {
			for (Material blocked : tnt) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.redmushroom")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " RED MUSHROOM " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}
		
		if (plugin.getConfig().getString("Blocks.GOLDBLOCK") == "true") {
			for (Material blocked : tnt) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.goldblock")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " GOLD BLOCK " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}
		
		if (plugin.getConfig().getString("Blocks.IRONBLOCK") == "true") {
			for (Material blocked : tnt) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.ironblock")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " IRON BLOCK " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}
		
		if (plugin.getConfig().getString("Blocks.DOUBLESTONESLAB") == "true") {
			for (Material blocked : tnt) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.doublestoneslab")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " DOUBLE STONE SLAB " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}
		
		if (plugin.getConfig().getString("Blocks.DOUBLESANDSTONESLAB") == "true") {
			for (Material blocked : tnt) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.redmushroom")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing a" + ChatColor.RED
										+ " DOUBLE SANDSTONE SLAB " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}
		
		if (plugin.getConfig().getString("Blocks.TNT") == "true") {
			for (Material blocked : tnt) {
				if (blocked == block1) {
					if (player.hasPermission("blockit.use.tnt")) {

					} else {
						event.getBlock().setType(Material.AIR);
						plugin.getServer().broadcastMessage(
								event.getPlayer().getDisplayName()
										+ " tried placing" + ChatColor.RED
										+ " TNT " + ChatColor.WHITE + "at "
										+ "X:" + block.getX() + " Y:"
										+ block.getY() + " Z:" + block.getZ());
					}
				}
			}
		}
	}

	private boolean permCheck(Player player, String permission) {
		if (player.isOp() || player.hasPermission(permission))
			return true;
		return false;
	}
}