@file:Suppress("unused", "nothing_to_inline")
package io.github.slimeymc

import godot.Control
import godot.Node
import godot.core.StringName
import godot.core.Vector2
import godot.global.GD
import godot.util.RealT

//inline fun Control(vararg attributes: Pair<String, Any> = emptyArray(), script: String? = null, noinline children: () -> List<Node> = { emptyList() })
//        = createNode(Control::class.java, emptyList(), *attributes, script = script, children = children)


inline fun Control(vararg attributes: Pair<String, Any> = emptyArray(), script: String? = null, crossinline children: () -> List<Node> = { emptyList() })
= Control().also {
    script?.let { script -> it.setScript(GD.load(script)) }
    attributes.forEach { (key, value) -> it.set(StringName(key), value) }
    children().forEach { child -> it.addChild(child) }
}


inline fun clipContent(clip: Boolean) = "clip_content" to clip

inline fun customMinimumSize(size: Vector2) = "custom_minimum_size" to size
inline fun customMinimumSize(x: RealT = 0.0, y: RealT = 0.0) = "custom_minimum_size" to Vector2(x, y)

inline fun layoutDirection(direction: Control.LayoutDirection) = "layout_direction" to direction

inline fun layoutMode(mode: Control.LayoutPresetMode) = "layout_mode" to mode

inline fun anchorsPreset(preset: Control.LayoutPreset) = "anchors_preset" to preset


inline fun size(size: Vector2) = "size" to size
inline fun size(x: RealT = 0.0, y: RealT = 0.0) = "size" to Vector2(x, y)

inline fun position(position: Vector2) = "position" to position
inline fun position(x: RealT = 0.0, y: RealT = 0.0) = "position" to Vector2(x, y)

inline fun rotation(angle: RotationAngle) = "rotation" to
        when(angle) { is RotationAngle.Radian -> angle.value; is RotationAngle.Degree -> GD.degToRad(angle.value) }

inline fun scale(scale: Vector2) = "scale" to scale
inline fun scale(x: RealT = 0.0, y: RealT = 0.0) = "scale" to Vector2(x, y)

inline fun pivotOffset(offset: Vector2) = "scale" to offset
inline fun pivotOffset(x: RealT = 0.0, y: RealT = 0.0) = "scale" to Vector2(x, y)


inline fun sizeFlagsHorizontal(sizeFlags: Control.SizeFlags) = "size_flags_horizontal" to sizeFlags

inline fun sizeFlagsVertical(sizeFlags: Control.SizeFlags) = "size_flags_vertical" to sizeFlags


inline fun anchorLeft(anchor: RealT) = "anchor_left" to anchor

inline fun anchorTop(anchor: RealT) = "anchor_top" to anchor

inline fun anchorRight(anchor: RealT) = "anchor_right" to anchor

inline fun anchorBottom(anchor: RealT) = "anchor_bottom" to anchor


inline fun offsetLeft(offset: RealT) = "offset_left" to offset

inline fun offsetTop(offset: RealT) = "offset_top" to offset

inline fun offsetRight(offset: RealT) = "offset_right" to offset

inline fun offsetBottom(offset: RealT) = "offset_bottom" to offset


inline fun growHorizontal(direction: Control.GrowDirection) = "grow_horizontal" to direction

inline fun growVertical(direction: Control.GrowDirection) = "grow_vertical" to direction