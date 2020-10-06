package me.sowhatsminecraft.KitPvP.kits;

import org.bukkit.command.CommandExecutor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import me.sowhatsminecraft.KitPvP.main.Main;

public class Samurai implements CommandExecutor {
	
	private Main plugin;
	public Samurai(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("samurai").setExecutor(this);
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
			ItemStack item1 = new ItemStack(Material.DIAMOND_SWORD, 1);
			item1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
			ItemStack helm = new ItemStack(Material.IRON_HELMET, 1);
			ItemStack chest = new ItemStack(Material.IRON_CHESTPLATE, 1);
			ItemStack legs = new ItemStack(Material.IRON_LEGGINGS, 1);
			ItemStack boots = new ItemStack(Material.IRON_BOOTS, 1);
			helm.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			legs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			p.getInventory().addItem(item1);
			p.getInventory().addItem(helm);
			p.getInventory().addItem(chest);
			p.getInventory().addItem(legs);
			p.getInventory().addItem(boots);
			return true;
			
		} else {
			p.sendMessage("You do not have permission!");
		}
		return false;
	}
	


}
