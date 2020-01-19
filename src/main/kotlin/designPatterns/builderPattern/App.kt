package designPatterns.builderPattern

private fun printWeapons(weaponList: List<Weapon>) {
    weaponList.forEach {
        println("${it.type.toString()} of ${it.name}")
    }
}

fun main() {
    val weapons = CreateWeaponCache()
    val weaponList = weapons.createLotsOfWeapons(10)
    printWeapons(weaponList)
}
