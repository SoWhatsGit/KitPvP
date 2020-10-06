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


public class Chieftain implements CommandExecutor {
	
	private Main plugin;
	public Chieftain(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("chieftain").setExecutor(this);
	}
	
	ItemStack helm = new ItemStack(Material.DIAMOND_HELMET, 1);
	ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
	ItemStack legs = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
	ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);
	ItemStack crossbow = new ItemStack(Material.CROSSBOW, 1);
	
	
		
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String []args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
			return true;
		}
		Player p = (Player) sender;
		if (p.hasPermission("kit.use")) {
			sender.sendMessage("Here's your kit");
			ItemStack helm = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemStack legs = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);
			ItemStack crossbow = new ItemStack(Material.CROSSBOW, 1);
			ItemStack item1 = new ItemStack(Material.NETHERITE_AXE, 1);
			item1.addEnchantment(Enchantment.DAMAGE_ALL, 5);
			p.getInventory().addItem(item1);
			crossbow.addEnchantment(Enchantment.QUICK_CHARGE, 3);
			p.getInventory().addItem(new ItemStack(Material.ARROW, 64));
			p.getInventory().addItem(helm);
			p.getInventory().addItem(chest);
			p.getInventory().addItem(legs);
			p.getInventory().addItem(boots);
			p.getInventory().addItem(crossbow);
			
		} else {
			p.sendMessage("You do not have permission!");
		}
		return false;
	}
	
}