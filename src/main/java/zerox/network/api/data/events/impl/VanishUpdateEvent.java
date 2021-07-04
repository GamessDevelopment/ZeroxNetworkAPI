package zerox.network.api.data.events.impl;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import zerox.network.api.data.events.ZeroxEvent;

public class VanishUpdateEvent extends ZeroxEvent {
	
	public Player getPlayer() {
		throw new IllegalPluginAccessException("API is not registered");
	}

}
