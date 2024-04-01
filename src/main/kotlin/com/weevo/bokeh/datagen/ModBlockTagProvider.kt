package com.weevo.bokeh.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.registry.HolderLookup
import net.minecraft.registry.tag.BlockTags
import java.util.concurrent.CompletableFuture

class ModBlockTagProvider(
    output: FabricDataOutput?,
    registriesFuture: CompletableFuture<HolderLookup.Provider>?
) : FabricTagProvider.BlockTagProvider(output, registriesFuture) {
    
    override fun configure(arg: HolderLookup.Provider?) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            //.add()
    }
    
}
