package me.lxct.bestviewdistance.event;

import me.lxct.bestviewdistance.BestViewDistance;
import me.lxct.bestviewdistance.functions.async.LoginDataLoad;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class OnJoin implements Listener {
    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Bukkit.getScheduler().runTaskAsynchronously(BestViewDistance.plugin, new LoginDataLoad(player)); // Load Data with Async Method
    }
}