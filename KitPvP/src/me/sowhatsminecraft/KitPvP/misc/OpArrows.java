package me.sowhatsminecraft.KitPvP.misc;

import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.DragonFireball;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.projectiles.ProjectileSource;

public class OpArrows extends JavaPlugin implements Listener {
    private boolean clearBlocks = false;
 
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
 
    @EventHandler(priority=EventPriority.HIGHEST)
    public void onProjectileHit(ProjectileHitEvent event) {
        Entity entity = event.getEntity();
        if((entity instanceof Arrow)) {
            Arrow arrow = (Arrow) entity;
            ProjectileSource shooter = arrow.getShooter();
            if((shooter instanceof Player)) {
                noBlockExplosion(arrow.getLocation(), 5.0F);
                arrow.remove();
                Entity.spawnEntity(arrow.getLocation());
            }
        }
    }
 
    public void noBlockExplosion(Location location, float force) {
        clearBlocks = true;
        location.getWorld().createExplosion(location, force);
        clearBlocks = false;
    }
 
    @EventHandler(priority=EventPriority.HIGHEST)
    public void onEntityExplode(EntityExplodeEvent event) {
        if(clearBlocks) event.blockList().clear();
    }
    
    
}
