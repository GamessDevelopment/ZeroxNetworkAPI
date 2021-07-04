package zerox.network.api.data.player;

import java.util.List;
import java.util.Set;

import org.bukkit.plugin.IllegalPluginAccessException;

import zerox.network.api.data.punishments.Punishment;
import zerox.network.api.data.punishments.PunishmentType;

public class PunishData {
	
	public Set<Punishment> getPunishments() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isBanned() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isIPBanned() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isBlacklisted() {
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
	
	public List<Punishment> getPunishments(PunishmentType type) {
        throw new IllegalPluginAccessException("API is not registered");
    }

}
