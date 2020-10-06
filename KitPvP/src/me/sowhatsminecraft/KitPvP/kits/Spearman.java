package me.sowhatsminecraft.KitPvP.kits;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import me.sowhatsminecraft.KitPvP.main.Main;

public class Spearman implements CommandExecutor {
	
	private Main plugin;
	public Spearman(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("spearman").setExecutor(this);
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
			ItemStack item1 = new ItemStack(Material.TRIDENT, 3);
			item1.addUnsafeEnchantment(Enchantment.LOYALTY, 3);
	        p.getInventory().addItem(item1);
	        ItemStack helm = new ItemStack(Material.NETHERITE_HELMET, 1);
	    	ItemStack chest = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
	    	ItemStack legs = new ItemStack(Material.NETHERITE_LEGGINGS, 1);
	    	ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS, 1);
	    	ItemStack shield = new ItemStack(Material.SHIELD, 1);
	        p.getInventory().addItem(helm);
	        p.getInventory().addItem(chest);
	        p.getInventory().addItem(legs);
	        p.getInventory().addItem(boots);
	        p.getInventory().addItem(shield);
	        
		} else {
			p.sendMessage("You do not have permission!");
		} return false;
	}
	
	
	
}
