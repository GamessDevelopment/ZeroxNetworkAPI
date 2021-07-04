package zerox.network.api.data.events.impl;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import zerox.network.api.data.events.ZeroxEvent;
import zerox.network.api.data.player.GlobalPlayer;

public class PlayerReportEvent extends ZeroxEvent {

    public Player getPlayer() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public GlobalPlayer getHacker() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getReason() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isCancelled() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean setCancelled(boolean value) {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
