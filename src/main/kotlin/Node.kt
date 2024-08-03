@file:Suppress("unused", "nothing_to_inline")
package io.github.slimeymc

import godot.Node
import godot.Script


inline fun Node(vararg attributes: Pair<String, Any> = emptyArray(), script: String? = null, noinline children: () -> List<Node> = { emptyList() })
        = CreateNode(Node::class.java, emptyList(), *attributes, script = script, children = children)


inline fun ProcessMode(mode: Node.ProcessMode) = "process_mode" to mode

inline fun ProcessPriority(priority: Int) = "process_priority" to priority

inline fun ProcessPhysicsPriority(priority: Int) = "process_physics_mode" to priority


inline fun ProcessThreadGroup(group: Node.ProcessThreadGroup) = "process_thread_group" to group


inline fun Script(script: Script) = "script" to script