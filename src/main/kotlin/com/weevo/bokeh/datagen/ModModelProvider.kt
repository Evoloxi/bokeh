package com.weevo.bokeh.datagen

import com.weevo.bokeh.Bokeh
import com.weevo.bokeh.Registry
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.block.Block
import net.minecraft.client.model.Model
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.RenderLayers
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.model.BlockStateModelGenerator
import net.minecraft.data.client.model.Models
import net.minecraft.data.client.model.TexturedModel
import net.minecraft.util.Identifier
import java.util.*

class ModModelProvider(output: FabricDataOutput?) : FabricModelProvider(output) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockStateModelGenerator) {
        // slate: pillar (sides: slate, top: slate_top)
        blockStateModelGenerator.registerAxisRotated(Registry.SLATE, TexturedModel.CUBE_TOP)
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator) {
        itemModelGenerator.register(Registry.SLATE_ITEM, net.minecraft.data.client.model.Model(
            Optional.of(Identifier("minecraft", "block/cube_column")),
            Optional.of("slate"),
            
        ))
    }
}
