package fr.marcjus.blood;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Particles implements Listener {
	
	@EventHandler
	public void onDamage(EntityDamageByEntityEvent e){
		
		Entity ent = e.getEntity();
		Location loc = ent.getLocation();
		
		if(ent.getType() != EntityType.ITEM_FRAME || ent.getType() != EntityType.ARMOR_STAND){
			ent.getWorld().playEffect(loc, Effect.STEP_SOUND, Material.REDSTONE_BLOCK);
		}
		
	}

}
