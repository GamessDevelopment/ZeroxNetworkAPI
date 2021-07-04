package zerox.network.api.data;

import java.util.List;

import org.bukkit.plugin.IllegalPluginAccessException;
import zerox.network.api.data.player.GlobalPlayer;

public class ServerData {
	
	public String getServerName() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isWhitelisted() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isMaintenance() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public int getMaxPlayers() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public double[] getRecentTPS() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public List<GlobalPlayer> getOnlinePlayers() {
		throw new IllegalPluginAccessException("API is not registered");
	}

}
