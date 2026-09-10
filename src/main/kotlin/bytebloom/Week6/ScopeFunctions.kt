package bytebloom.Week6

data class Mage(var name: String, var level: Int, var mana: Int, var guild: String?)

fun main() {
    println("--- Lesson 6.03 & 6.04: Scope Functions ---")

    // let
    val newMage: Mage? = Mage("Clara", 15, 100, null)
    val result = newMage?.let { mage ->
        println("Mage name: ${mage.name}, with level: ${mage.level}")

        "Proceed"
    }

    // apply
    val rouge = Mage("Ben", 11, 0, null).apply {
        this.guild = "World"
        this.mana = 50
        level += 1
    }

    // with
    val warrior: Mage? = Mage("Warrior", 15, 100, null)
    with(warrior) {
//        name = "Warrior Pro Max"
//        println("Warrior level is ${level}")
    }

    // run
    val result2 = warrior?.run {
        this.guild
        name = "Warrior Pro Max"

        "Guild ${this.name}, Status: Active"
    }
}