
package me.sowhatsminecraft.KitPvP.main;

import org.bukkit.plugin.java.JavaPlugin;

import me.sowhatsminecraft.KitPvP.kits.Chieftain;
import me.sowhatsminecraft.KitPvP.kits.Ninja;
import me.sowhatsminecraft.KitPvP.kits.Samurai;
import me.sowhatsminecraft.KitPvP.kits.Spearman;
import me.sowhatsminecraft.KitPvP.kits.Warrior;
import me.sowhatsminecraft.KitPvP.kits.Angel;




public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		new Ninja(this);
		
		new Samurai(this);
		
		new Spearman(this);
		
		new Warrior(this);
		
		new Chieftain(this);
		
		new Angel(this);
		
		
		} 
	

			
}