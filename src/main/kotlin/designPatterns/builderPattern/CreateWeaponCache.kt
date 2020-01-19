package designPatterns.builderPattern

import io.github.serpro69.kfaker.Faker
import kotlin.random.Random
import kotlin.random.nextInt

class CreateWeaponCache {

    private fun createWeapon(type: Enum<WeaponType>? = null, name: String? = null) = Weapon.Builder().type(type).name(name).build()
    fun createLotsOfWeapons(amount: Int): List<Weapon>{
        val weapons = mutableListOf<Weapon>()
        for (i in  1..amount) {
            val name = generateFakeName()
            val weaponType = randomWeaponType()
            val weapon = createWeapon(weaponType, name)
            weapons.add(weapon)
        }
        return weapons
    }

    private fun generateFakeName(): String {
        val randNum = Random.nextInt(1..30)
        return when {
            randNum < 10 -> Faker().lovecraft.deity()
            randNum in 11..19 -> Faker().ancient.primordial()
            else -> Faker().elderScrolls.firstName()
        }
    }
}
