package zerox.network.api.data.tags;

import org.bukkit.ChatColor;
import org.bukkit.plugin.IllegalPluginAccessException;

public class Tag {
	
	public String getName() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public String getPrefix() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public ChatColor getColor() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public int getWeight() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public String getFormat() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	

}
