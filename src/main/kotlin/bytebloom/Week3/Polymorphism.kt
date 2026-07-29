package bytebloom.Week3


open class Characters(val name: String, var health: Int) {

    open fun attack(target: Characters) {
        println("$name attacks ${target.name}...")
    }
}


// Playerssss also "is-a" Character.
class Playerssss(name: String, health: Int, val strength: Int) : Characters(name, health) {

    override fun attack(target: Characters) {
        val damage = strength
        println("$name swings their sword at ${target.name} for $damage damage!")
        target.health -= damage
    }
}

// Monster also "is-a" Character.
class Monsters(name: String, health: Int, val attackPower: Int) : Characters(name, health) {

    override fun attack(target: Characters) {
        val damage = attackPower
        println("$name bits ${target.name} for $damage damage!")
        target.health -= damage
    }
}


fun main() {
    println("--- Lesson 3.05: Polymorphism ---")

    val player = Playerssss("Sir Reginald", 100, 25)
    val goblin = Monsters("Goblin Spearman", 40, 10)
    val dragon = Monsters("Ignis", 200, 40)

    val charactersInBattle = listOf(player, goblin, dragon)

    for (character in charactersInBattle) {
        if (character is Playerssss) {
            character.attack(dragon)
        } else if (character is Monsters) {
            character.attack(player)
        }
    }

}