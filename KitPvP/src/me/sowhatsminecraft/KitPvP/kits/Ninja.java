package me.sowhatsminecraft.KitPvP.kits;

import org.bukkit.command.CommandExecutor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import me.sowhatsminecraft.KitPvP.main.Main;
import org.bukkit.event.EventHandler;


public class Ninja implements CommandExecutor {
	
	private Main plugin;
	public Ninja(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("ninja").setExecutor(this);
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
			ItemStack item1 = new ItemStack(Material.IRON_SWORD, 1);
	        item1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
	        p.getInventory().addItem(item1);
	        ItemStack helm = new ItemStack(Material.CHAINMAIL_HELMET, 1);
	   	 	ItemStack chest = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
	   	 	ItemStack legs = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
	   	 	ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
	        helm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	        chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	        legs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	        boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	        p.getInventory().addItem(helm);
			p.getInventory().addItem(chest);
			p.getInventory().addItem(legs);
			p.getInventory().addItem(boots);
	        p.addPotionEffect((new PotionEffect(PotionEffectType.SPEED, 150000, 2)));
	        
	        return true;
			
		} else {
			p.sendMessage("You do not have permission!");
		}
		return false;
	}
	
	
}
