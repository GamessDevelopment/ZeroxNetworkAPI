package zerox.network.api.data.events.impl;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.IllegalPluginAccessException;

import zerox.network.api.data.events.ZeroxEvent;
import zerox.network.api.data.player.PlayerData;
import zerox.network.api.data.ranks.grant.Grant;

public class PlayerGrantEvent extends ZeroxEvent {
	
	public Grant getGrant() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public PlayerData getTargetData() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public CommandSender getExecutor() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isCancelled() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean setCancelled(boolean value) {
		throw new IllegalPluginAccessException("API is not registered");
	}

}
