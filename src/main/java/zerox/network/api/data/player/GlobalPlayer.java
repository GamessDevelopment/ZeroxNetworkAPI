package zerox.network.api.data.player;

import org.bukkit.plugin.IllegalPluginAccessException;
import java.util.List;

public class GlobalPlayer {
	
	public String getName() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public String getAddress() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public List<String> getPermissions() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public int getRankWeight() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public int getPunishPriority() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public int getVanishPriority() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isStaffChatAlerts() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isOp() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean hasPermission() {
		throw new IllegalPluginAccessException("API is not registered");
	}
	
	public boolean isAdminChatAlerts() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isHelpopAlerts() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isReportAlerts() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isNameMCVerified() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getRankName() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getLastServer() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getDisplayName() {
        throw new IllegalPluginAccessException("API is not registered");
    }
    
    public void sendMessage() {
    	throw new IllegalPluginAccessException("API is not registered");
    }
    
    public void sendClickableMessage() {
    	throw new IllegalPluginAccessException("API is not registered");
    }
    
    public void playSound() {
    	throw new IllegalPluginAccessException("API is not registered");
    }

}
