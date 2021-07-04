package zerox.network.api.data.player.alt;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.plugin.IllegalPluginAccessException;

public class Alt {
	
	public String getName() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public UUID getUniqueId() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public String getDisplayName() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public ChatColor getNameColor() {
		throw new IllegalPluginAccessException("API is not registered");
	}

}
