package me.gordey9992.aether;

import org.bukkit.plugin.java.JavaPlugin;

public class Aether extends JavaPlugin {
    private static Aether instance;
    
    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("§aAether §fплагин §aзагружен§f!");
        getLogger().info("§6Авторы: gordey9992 & DeepSeek");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("§cAether §fплагин §cвыгружен§f!");
    }
    
    public static Aether getInstance() { return instance; }
}
