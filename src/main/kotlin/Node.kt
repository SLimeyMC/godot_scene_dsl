@file:Suppress("unused", "nothing_to_inline")
package io.github.slimeymc

import godot.Node
import godot.Script


inline fun Node(vararg attributes: Pair<String, Any> = emptyArray(), script: String? = null, noinline children: () -> List<Node> = { emptyList() })
        = createNode(Node::class.java, emptyList(), *attributes, script = script, children = children)


inline fun processMode(mode: Node.ProcessMode) = "process_mode" to mode

inline fun processPriority(priority: Int) = "process_priority" to priority

inline fun processPhysicsPriority(priority: Int) = "process_physics_mode" to priority


inline fun processThreadGroup(group: Node.ProcessThreadGroup) = "process_thread_group" to group


inline fun script(script: Script) = "script" to script