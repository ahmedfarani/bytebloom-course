package bytebloom.Week4

interface Weapons {
    fun attack(target: String)
}

class Swordss : Weapons {
    override fun attack(target: String) {
        println("Swings thw sword at the $target for 10 damage!")
    }
}

class MagicSword(var mana: Int) : Weapons {
    val manaCost = 10

    override fun attack(target: String) {
        if (mana >= manaCost) {
            mana -= manaCost
            println("Swings the magic sword at the $target for 20 elemental damage!")
        } else {
            // It falls back to a basic behavior that is always possible.
            println("Not enough mana... performs a weak slash for 2 damage.")
        }
    }
}

class Playerss(val name: String, val health: Int, private val weapon: Weapons) {
    fun attack(target: String) {
        weapon.attack(target)
    }
}

fun main() {
    println("--- Lesson 4 04: Liskov Substitution Principle ---")
    val basicSword = Swordss()
    val pwoerfulMagicSword = MagicSword(100)
    val depletedMagicSword = MagicSword(5)

    // A player can be equipped with any of these weapons.
    val player1 = Playerss("Arin", 100, basicSword)
    val player2 = Playerss("Clara", 80, pwoerfulMagicSword)
    val player3 = Playerss("Ben", 90, depletedMagicSword)

    println("\n--- Round 1 ---")
    // The program works correctly for all of them. The Player class doesn't care
    // what kind of weapon it has, only that it can call .attack().
    player1.attack("Goblin")
    player2.attack("Goblin")
    player3.attack("Goblin")
}