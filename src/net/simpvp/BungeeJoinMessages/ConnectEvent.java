package net.simpvp.BungeeJoinMessages;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class ConnectEvent implements Listener {

	@EventHandler
	public void ServerConnectedEvent(PostLoginEvent event) {
		String name = event.getPlayer().getDisplayName();
		ProxyServer.getInstance().broadcast(new ComponentBuilder(ChatColor.YELLOW + name + " joined the game").create());
	}


	

}
