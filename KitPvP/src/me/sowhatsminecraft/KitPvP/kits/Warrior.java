package me.sowhatsminecraft.KitPvP.kits;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import me.sowhatsminecraft.KitPvP.main.Main;

public class Warrior implements CommandExecutor {
	
	private Main plugin;
	public Warrior(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("warrior").setExecutor(this);
	}
	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String []args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
			return true;
	}
	Player p = (Player) sender;
	if (p.hasPermission("kit.use")) {
		sender.sendMessage("Here's your kit");
		ItemStack helm = new ItemStack(Material.IRON_HELMET, 1);
		ItemStack chest = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemStack legs = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemStack boots = new ItemStack(Material.IRON_BOOTS, 1);
		ItemStack shield = new ItemStack(Material.SHIELD, 1);
		p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1));
		p.getInventory().addItem(new ItemStack(Material.IRON_AXE, 1));
		p.getInventory().addItem(new ItemStack(Material.BOW, 1));
		p.getInventory().addItem(new ItemStack(Material.BOW, 1));
		p.getInventory().addItem(new ItemStack(Material.ARROW, 32));
		p.getInventory().addItem(helm);
		p.getInventory().addItem(chest);
		p.getInventory().addItem(legs);
		p.getInventory().addItem(boots);
		p.getInventory().addItem(shield);
	} else {
		p.sendMessage("You do not permission");
	} return false;
	}
	
	

}
