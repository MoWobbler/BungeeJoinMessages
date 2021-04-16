package net.simpvp.BungeeJoinMessages;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class DisconnectEvent implements Listener {

	
	@EventHandler
	public void ServerDisconnectedEvent(PlayerDisconnectEvent event) {
		String name = event.getPlayer().getDisplayName();
		ProxyServer.getInstance().broadcast(new ComponentBuilder(ChatColor.YELLOW + name + " left the game").create());
	}
	
}
