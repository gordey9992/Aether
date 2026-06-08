package me.gordey9992.aether.commands.essentials;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player p = (Player) sender;
        p.setAllowFlight(!p.getAllowFlight());
        p.sendMessage("§aРежим полёта " + (p.getAllowFlight() ? "§aвключён" : "§cвыключен"));
        return true;
    }
}
