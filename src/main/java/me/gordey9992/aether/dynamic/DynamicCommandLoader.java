package me.gordey9992.aether.dynamic;

import me.gordey9992.aether.Aether;
import java.io.File;

public class DynamicCommandLoader {
    private final Aether plugin;
    
    public DynamicCommandLoader(Aether plugin) {
        this.plugin = plugin;
    }
    
    public void loadCommands() {
        File scriptsFolder = new File(plugin.getDataFolder().getParentFile().getParentFile(), "scripts");
        if (!scriptsFolder.exists()) scriptsFolder.mkdirs();
        plugin.getLogger().info("Dynamic commands loaded from " + scriptsFolder.getPath());
    }
}
