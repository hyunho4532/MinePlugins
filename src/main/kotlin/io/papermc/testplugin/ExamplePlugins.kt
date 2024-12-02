package io.papermc.testplugin

import net.kyori.adventure.text.Component
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class ExamplePlugins : JavaPlugin(), Listener {
    override fun onEnable() {

    }

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        event.player.sendMessage(Component.text("Hello, " + event.player.name + "!"));
    }
}