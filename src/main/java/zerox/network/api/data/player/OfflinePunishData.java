package zerox.network.api.data.player;

import java.util.List;

import org.bukkit.plugin.IllegalPluginAccessException;

import zerox.network.api.data.player.alt.Alt;
import zerox.network.api.data.punishments.Punishment;

public class OfflinePunishData {
	
	public OfflinePunishData() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public List<Punishment> getPunishments() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public List<Alt> getAlts() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public int getPunishPriority() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public OfflinePunishData load() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public OfflinePunishData load(boolean activeOnly) {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public Alt getAlt() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public OfflinePunishData loadAlts() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isBanned() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isIPBanned() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isBlackklisted() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isWarned() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isMuted() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public Punishment getActiveBan() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public Punishment getActiveMute() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public Punishment getActiveBlacklist() {
		throw new IllegalPluginAccessException("API is not registered");
	}

}
