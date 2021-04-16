package net.simpvp.BungeeJoinMessages;

import net.md_5.bungee.api.plugin.Plugin;

public class BungeeJoinMessages extends Plugin{

	
	
	@Override
	public void onEnable() {
		getProxy().getPluginManager().registerListener(this, new ConnectEvent());
		getProxy().getPluginManager().registerListener(this, new DisconnectEvent());
	}
	
	
}
