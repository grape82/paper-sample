package io.github.grape82.sample.plugin

import net.minecraft.server.level.ServerPlayer
import net.minecraft.world.entity.Entity
import org.bukkit.plugin.java.JavaPlugin

class SamplePlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("Hello world!")
    }

    override fun onDisable() {
        logger.info("Bye world!")
    }
}
