@file:Suppress("unused", "nothing_to_inline")
package io.github.slimeymc

import godot.CanvasItem
import godot.CanvasItemMaterial
import godot.ShaderMaterial
import godot.core.Color

inline fun visible(visible: Boolean) = "visible" to visible

inline fun modulate(color: Color) = "modulate" to color

inline fun selfModulate(color: Color) = "self_modulate" to color

inline fun showBehindParent(show: Boolean) = "show_behind_parent" to show

inline fun topLevel(topLevel: Boolean) = "top_level" to topLevel

inline fun clipChildren(mode: CanvasItem.ClipChildrenMode) = "clip_children" to mode

inline fun lightMask(layer: Int) = "light_mask" to layer

inline fun visibilityLayer(layer: Int) = "visibility_layer" to layer


inline fun zIndex(index: Int) = "z_index" to index

inline fun yAsRelative(relative: Boolean) = "y_as_relative" to relative

inline fun ySortEnabled(sort: Boolean) = "y_sort_enabled" to sort


inline fun textureFilter(mode: CanvasItem.TextureFilter) = "texture_filter" to mode

inline fun textureRepeat(mode: CanvasItem.TextureRepeat) = "texture_repeat" to mode


inline fun material(material: CanvasItemMaterial) = "material" to material
inline fun material(material: ShaderMaterial) = "material" to material

inline fun useParentMaterial(use: Boolean) = "user_parent_material" to use
