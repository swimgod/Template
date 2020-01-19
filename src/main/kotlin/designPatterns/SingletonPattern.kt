package designPatterns

import designPatterns.DefaultStats.hp
import designPatterns.DefaultStats.mp
import designPatterns.DefaultStats.stam

// Singleton Pattern, lazily instantiated once.
// Can extend other classes and implement interfaces
object DefaultStats {
    var hp = 100L
    var mp = 100L
    var stam = 100L
}

fun main() {
    println("Default Stats:\n" +
            "HP: $hp\n" +
            "MP: $mp\n" +
            "STAM: $stam\n"
    )
}