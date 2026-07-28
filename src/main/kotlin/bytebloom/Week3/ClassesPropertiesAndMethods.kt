package bytebloom.Week3


class Players(val name: String, var health: Int, val strength: Int) {

    fun takeDamage(damage: Int) {
        this.health -= damage
        println("$name take $damage damage! Remaining health: ${this.health}")
    }

    fun attack(monster: String) {
        println("$name attacks the $monster for $strength damage!")
    }
}


fun main() {
    println("--- Lesson 3.02: Classes, Properties, and Methods ---")

    val warrior = Players("Arin the Valiant", 100, 15)
    val rogue = Players("Ben the Silent", 80, 20)

    println("Created player: ${warrior.name} with ${warrior.health} HP and ${warrior.strength} Strength.")
    println("Created player: ${rogue.name} with ${rogue.health} HP and ${rogue.strength} Strength.")

    println("\n--- A battle begins! ---")
    warrior.attack("Goblin")
    rogue.attack("Goblin")

    warrior.takeDamage(25)

    rogue.health=85
    println("${rogue.name}'s health was restored to ${rogue.health} HP.")
}