package zerox.network.api.data.events.impl;

import org.bukkit.plugin.IllegalPluginAccessException;

import zerox.network.api.data.events.ZeroxEvent;
import zerox.network.api.data.player.OfflinePunishData;
import zerox.network.api.data.punishments.Punishment;

public class PlayerUnPunishEvent extends ZeroxEvent {

    public OfflinePunishData getData() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public Punishment getPunishment() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isCancelled() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean setCancelled(boolean value) {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
