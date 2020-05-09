package wr4ith5.paper;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

class OnJoinEventListener implements Listener{
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        Location spawnLocation = player.getWorld().getSpawnLocation();

        player.teleport(spawnLocation);
    }
}

public final class ForceSpawn extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OnJoinEventListener(), this);
    }
}
