package bytebloom.Week3


// An INTERFACE defines a "can-do" relationship.
interface Lootable {
    fun calculateLoot(): String // No implementation, just the rule.
}

// An ABSTRACT CLASS defines an "is-a" relationship but cannot be instantiated on its own.
abstract class Characterss(val name: String, var health: Int) {

    abstract fun attack(target: Characterss)

    fun checkStatus() {
        println("Status for $name: $health HP")
    }
}

class Playersssss(name: String, health: Int) : Characterss(name, health) {

    override fun attack(target: Characterss) {
        println("$name swings their axe at ${target.name}!")
        target.health -= 20
    }
}

class Monsterss(name: String, health: Int, val lootable: String) : Characterss(name, health), Lootable {

    override fun attack(target: Characterss) {
        println("$name bits ${target.name}!")
        target.health -= 10
    }

    override fun calculateLoot(): String {
        return "You found: $lootable"
    }
}


fun main() {
    println("--- Lesson 3.06: Interface vs Abstract Class ---")

    val player = Playersssss("Gimli", 120)
    val goblin = Monsterss("Snaggler", 30, "A Rusty Dagger")

    player.attack(goblin)
    goblin.checkStatus()

    if (goblin.health <= 0) {
        println("Goblin defeated!")
        // Because the goblin is 'Lootable', we can call this function.
        val loot = goblin.calculateLoot()
        println(loot)
    }
}