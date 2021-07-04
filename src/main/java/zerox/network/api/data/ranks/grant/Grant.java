package zerox.network.api.data.ranks.grant;

import org.bukkit.plugin.IllegalPluginAccessException;

import zerox.network.api.data.ranks.RankData;

public class Grant {
	
	public boolean hasExpired() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isActiveSomewhere() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isPermanent() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public String getServer() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public String getNiceDuration() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public String getNiceExpire() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public RankData getRank() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	

}
