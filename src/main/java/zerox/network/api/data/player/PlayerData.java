package zerox.network.api.data.player;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import lombok.NonNull;
import zerox.network.api.data.ranks.RankData;
import zerox.network.api.data.ranks.grant.Grant;
import zerox.network.api.data.tags.Tag;

public class PlayerData {
	
	public boolean hasPermission(String permission) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean hasDefaultGrant() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void loadAttachments(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public List<Grant> getActiveGrants() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean hasRank(RankData rankData) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @NonNull
    public RankData getHighestRank() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getLastSeenAgo() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getNameColor() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public Tag getTag() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public int getCoins() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setCoins(int amount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void addCoins(int amount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void removeCoins(int amount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getTagColor() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public ChatColor getChatColor() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isNameTag() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setNameTag(boolean value) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isVanished() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isInStaffMode() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public PunishData getPunishData() {
        throw new IllegalPluginAccessException("API is not registered");
    }
	

}
