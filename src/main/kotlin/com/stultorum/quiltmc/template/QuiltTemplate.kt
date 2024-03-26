package com.stultorum.quiltmc.template

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

internal class QuiltTemplate: ModInitializer {

    override fun onInitialize(mod: ModContainer) {
        Logger = LoggerFactory.getLogger(mod.metadata()!!.name())

        Logger.info("Hello World!")
    }
    
    companion object {
        internal var Logger: Logger = LoggerFactory.getLogger("???")
            private set
    }
}
