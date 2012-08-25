package net.zxq.rastrosgonegriefing.commands;

import net.zxq.rastrosgonegriefing.blockit.BlockIt;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class CheckExecutor implements CommandExecutor{
private BlockIt plugin;
	
	public CheckExecutor(BlockIt plugin)
	{
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		FileConfiguration config = plugin.getConfig();
		
		if(sender instanceof Player)
		{
			if(!permCheck((Player)sender, "blockit.check"))
			{
				sender.sendMessage(ChatColor.RED + "You do not have permission to do this command.");
				return true;
			}
		}
		
		if(args.length != 1)
		{
			sender.sendMessage(ChatColor.RED + "Usage: /bcheck <block>");
			return true;
		}
		
		boolean b = config.getBoolean("Blocks." + args[0]);
		if(b == true)
		{
			sender.sendMessage(ChatColor.RED + args[0] + " is disabled.");
			return true;
		}else if(b == false) {
			sender.sendMessage(ChatColor.GREEN + args[0] + " is enabled.");
			return true;
		}
		
		return true;
	}
	
	private boolean permCheck(Player player, String permission)
	{
		if(player.isOp() || player.hasPermission(permission)) return true;
		return false;
	}
}
