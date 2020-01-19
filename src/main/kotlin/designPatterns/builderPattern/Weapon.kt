package designPatterns.builderPattern

enum class WeaponType {
    SWORD, AXE, SPEAR,
    WAND, STAFF, DAGGER,
    BOW, CROSSBOW
}

class Weapon(
    val type: Enum<WeaponType>?,
    val name: String?
) {
    data class Builder(
        var type: Enum<WeaponType>? = randomWeaponType(),
        var name: String? = null
    ) {
        fun type(type: Enum<WeaponType>?) = apply { this.type = type }
        fun name(name: String?) = apply { this.name = name }
        fun build() = Weapon(type, name)
    }
}

fun randomWeaponType() = WeaponType.values().toList().shuffled().first()

