package me.sowhatsminecraft.KitPvP.kits;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import me.sowhatsminecraft.KitPvP.main.Main;

public class Angel implements CommandExecutor {
	
	private Main plugin;
	public Angel (Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("angel").setExecutor(this);
	}
	
	
	
	@Override
	public boolean onCommand (CommandSender sender, Command cmd, String label, String []args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
			return true;
	}
	Player p = (Player) sender;
	if (p.hasPermission("kit.use")) {
		sender.sendMessage("Here's your kit");
		ItemStack helm = new ItemStack(Material.GOLDEN_HELMET, 1);
		ItemStack chest = new ItemStack(Material.ELYTRA, 1);
		ItemStack legs = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
		ItemStack boots = new ItemStack(Material.GOLDEN_BOOTS, 1);
		ItemStack fireworks = new ItemStack(Material.FIREWORK_ROCKET, 128);
		p.getInventory().addItem(helm);
		p.getInventory().addItem(chest);
		p.getInventory().addItem(legs);
		p.getInventory().addItem(boots);
		p.getInventory().addItem(fireworks);
		ItemStack bow = new ItemStack(Material.BOW, 1);
		bow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
		bow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 13);
		ItemMeta item = bow.getItemMeta();
		item.setDisplayName("Angel's Bow");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Each shot cleanses the earth");
		item.setLore(lore);
		bow.setItemMeta(item);
		p.getInventory().addItem(bow);
		p.getInventory().addItem(new ItemStack(Material.ARROW, 1));
		p.addPotionEffect((new PotionEffect(PotionEffectType.JUMP, 150000, 5)));
		p.getInventory().addItem(new ItemStack(Material.WATER_BUCKET, 3));		
		return true;
	} else {
		sender.sendMessage("You do not have permission to use this command!");
	} return false;
	}
	

}
		



