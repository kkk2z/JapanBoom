package com.github.tooooowa.tutorialplugin

import org.bukkit.plugin.java.JavaPlugin

class TutorialPlugin : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(EventListener, this)
        getCommand("debug")?.setExecutor(DebugCommand)
        getCommand("de1")?.setExecutor(de1 commands)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
