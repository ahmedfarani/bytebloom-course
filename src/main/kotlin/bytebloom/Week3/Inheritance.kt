package bytebloom.Week3


open class Character(val name: String, var health: Int) {

    fun takeDamage(damage: Int) {
        health -= damage
        if (health < 0) health = 0
        println("$name take $damage damage! Health is now $health.")
    }
}


// Playersss also "is-a" Character.
class Playersss(name: String, health: Int, val strength: Int) : Character(name, health) {

    fun attack(target: Character) {
        println("$name attacks ${target.name} for $strength damage!")
        target.takeDamage(strength)
    }
}

// Monster also "is-a" Character.
class Monster(name: String, health: Int, val attackPower: Int) : Character(name, health) {

    fun roar() {
        println("$name let's out a terrifying roar!")
    }
}

fun main() {
    println("--- Lesson 3.04: Inheritance ---")

    val player = Playersss("Dara the Fearless", 100, 20)
    val goblin = Monster("Goblin Grunt", 50, 8)

    goblin.roar()
    player.attack(goblin)

    goblin.takeDamage(20)
    player.takeDamage(8)

}