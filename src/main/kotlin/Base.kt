package io.github.slimeymc

import godot.Node
import godot.core.StringName
import godot.global.GD

fun <T: Node> CreateNode(
    type: Class<out T>,
    params: List<Any>,
    vararg attributes: Pair<String, Any> = emptyArray(),
    script: String? = null,
    children: () -> List<Node> = { emptyList() },
): T = type.getDeclaredConstructor().newInstance( *params.toTypedArray() ).also { node ->
    script?.let { node.setScript(GD.load(script)) }
    attributes.forEach { (key, value) -> node.set(StringName(key), value) }
    children().forEach { child -> node.addChild(child) }
}