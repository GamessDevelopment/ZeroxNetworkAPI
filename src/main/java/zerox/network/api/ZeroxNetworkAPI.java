package zerox.network.api;

import java.util.List;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import zerox.network.api.data.ServerData;
import zerox.network.api.data.player.GlobalPlayer;
import zerox.network.api.data.player.PlayerData;
import zerox.network.api.data.ranks.RankData;
import zerox.network.api.data.ranks.grant.Grant;
import zerox.network.api.data.tags.Tag;

public class ZeroxNetworkAPI {
	
	public static ZeroxNetworkAPI INSTANCE;
	
    public static boolean isRegistered() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public PlayerData getPlayerData(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public ChatColor getPlayerNameColor(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public RankData getPlayerRank(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public RankData getRankByName(String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public List<Grant> getActiveGrants(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public List<Grant> getAllGrants(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public Tag getTag(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public ServerData getServerData(String server) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean hasTag(Player player, Tag tag) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getTagFormat(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void vanishPlayer(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void vanishPlayerFor(Player player, Player target) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public GlobalPlayer getGlobalPlayer(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public GlobalPlayer getGlobalPlayer(String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public int getVanishPriority(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void enableStaffMode(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void disableStaffMode(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isStaffChat(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isAdminChat(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
