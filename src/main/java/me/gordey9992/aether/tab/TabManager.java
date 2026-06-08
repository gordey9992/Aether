package me.gordey9992.aether.tab;

import me.gordey9992.aether.Aether;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class TabManager {
    private final Aether plugin;
    private final MiniMessage miniMessage;
    
    public TabManager(Aether plugin) {
        this.plugin = plugin;
        this.miniMessage = MiniMessage.miniMessage();
        startUpdater();
    }
    
    private void startUpdater() {
        new BukkitRunnable() {
            @Override
            public void run() {
                updateAllTabs();
            }
        }.runTaskTimer(plugin, 0L, 20L);
    }
    
    public void updateAllTabs() {
        Component header = miniMessage.deserialize("<gradient:#FFFFFF:#00BFFF>Aether Server</gradient>");
        Component footer = miniMessage.deserialize("<gray>Online: <gold>" + Bukkit.getOnlinePlayers().size() + "</gold></gray>");
        
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendPlayerListHeaderAndFooter(header, footer);
        }
    }
    
    public void reload() {
        updateAllTabs();
    }
}
