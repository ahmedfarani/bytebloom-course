package bytebloom.Week4

/*
    // THE "FAT" INTERFACE (Bad Practice):
    interface CharacterActions {
        fun attack(target: String)
        fun heal(ally: String)
        fun castSpell(spellName: String)
    }
*/

// THE SEGREGATED INTERFACES (Good Practice)
interface Attacker {
    fun attack(target: String)
}

interface Healer {
    fun heal(ally: String)
}

interface SpellCaster {
    fun castSpell(spellName: String)
}

// NOW classes implement ONLY the interfaces they need.
class Warrior : Attacker {
    override fun attack(target: String) {
        println("Warrior attacks the $target")
    }
}

class Priest : Healer {
    override fun heal(ally: String) {
        println("Prime healing $ally")
    }
}

class Mage : Attacker, SpellCaster {
    override fun attack(target: String) {
        println("Mage weakly bonks the $target with a staff.")
    }

    override fun castSpell(spellName: String) {
        println("Mage spell $spellName")
    }
}

fun main() {
    println("--- Lesson 4 05: Interface Segregation Principle ---")

    val conan = Warrior()
    val anduin = Priest()
    val jaina = Mage()

    conan.attack("a skeleton")
    anduin.heal("Conan")
    jaina.castSpell("Fireball")
}