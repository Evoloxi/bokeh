package com.weevo.bokeh

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

internal class Bokeh: ModInitializer {

    override fun onInitialize(mod: ModContainer) {
        Logger = LoggerFactory.getLogger(mod.metadata()!!.name())

        Logger.info("Hello World!ooo")
        Registry.register()
        
    }
    
    companion object {
        internal var Logger: Logger = LoggerFactory.getLogger("Bokeh")
            private set
        const val ID = "bokeh"
        
    }
}
