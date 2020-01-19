package designPatterns.builderPattern

// Builder Pattern is used to create complex objects with multiple parameters step-by-step

class BuilderPattern private constructor(
    val bread: String?,
    val condiments: String?,
    val meat: String?,
    val fish: String?
){
    data class Builder(
        var bread: String? = null,
        var condiments: String? = null,
        var meat: String? = null,
        var fish: String? = null
    ) {
        fun bread(bread: String) = apply { this.bread = bread }
        fun condiments(condiments: String) = apply { this.condiments = condiments }
        fun meat(meat: String) = apply { this.meat = meat }
        fun fish(fish: String) = apply { this.fish = fish }
        fun build() = BuilderPattern(bread, condiments, meat, fish)
    }
}

fun main() {
    val food = BuilderPattern.Builder().build()
}
