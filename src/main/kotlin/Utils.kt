package io.github.slimeymc

sealed class RotationAngle {
    data class Radian(val value: Double) : RotationAngle()
    data class Degree(val value: Double) : RotationAngle()
}