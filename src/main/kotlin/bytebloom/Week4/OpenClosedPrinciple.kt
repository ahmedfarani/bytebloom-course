package bytebloom.Week4

// STEP 1: Create an abstraction (an interface) that all weapons must follow.
interface Weapon {
    fun attack(target: String)
}

// STEP 2: Make our concrete classes implement the interface.
class Swords : Weapon {
    override fun attack(target: String) {
        println("Swings the sword at the $target for 10 damage!")
    }
}

// NEW WEAPON! We can add this without touching any existing code.
class Axe : Weapon {
    override fun attack(target: String) {
        println("Swings the mighty axe at the $target for 15 damage!")
    }
}

class Bow : Weapon {
    override fun attack(target: String) {
        println("shoot the arrow!")
    }
}

class Players(val name: String, val health: Int, private val weapon: Weapon) {
    fun attack(target: String) {
        weapon.attack(target)
    }
}

class Games {
    private val players = Players("Borin", 150, Bow())

    fun start() {
        println("Games started!")
        players.attack("Troll")
    }
}

fun main() {
    println("--- Lesson 4 03: Open Closed Principle ---")

    val game = Games()
    game.start()

}