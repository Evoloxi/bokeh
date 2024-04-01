@file:Suppress("MemberVisibilityCanBePrivate")

package com.weevo.bokeh

import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.block.PillarBlock
import net.minecraft.item.BlockItem
import net.minecraft.registry.Registries
import org.quiltmc.qkl.library.registry.registryScope
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings
import kotlin.reflect.KClass

object Registry {

    val SLATE = create(QuiltBlockSettings.copyOf(Blocks.DEEPSLATE).resistance(9f), "slate", PillarBlock::class)
    val SLATE_ITEM = createBlockItem(SLATE, "slate")

    private fun <T : Block> create(settings: QuiltBlockSettings, name: String, blockClass: KClass<T>): T {
        val block = blockClass.constructors.first().call(settings)
        registryScope(Bokeh.ID) {
            block withPath name toRegistry Registries.BLOCK
        }
        return block
    }
    
    private fun createBlockItem(block: Block, id: String): BlockItem {
        val item = BlockItem(block, QuiltItemSettings())
        
        registryScope(Bokeh.ID) {
            item withPath id toRegistry Registries.ITEM
        }
        return item
    }

    fun register() {}
}
