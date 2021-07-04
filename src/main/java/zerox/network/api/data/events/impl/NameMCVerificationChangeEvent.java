package zerox.network.api.data.events.impl;

import org.bukkit.plugin.IllegalPluginAccessException;

import zerox.network.api.data.player.PlayerData;

public class NameMCVerificationChangeEvent {
	
	private PlayerData playerData;
	private boolean finalLiked;
	
	public PlayerData getPlayerData() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isFinalLiked() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	

}
