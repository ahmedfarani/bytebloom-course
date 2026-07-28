package org.bytebloom

enum class WeaponType {
    SWORD, AXE, BOW, STAFF
}

data class LootItem(val name: String, val value: Int)

sealed class SpellResult {
    class Success : SpellResult() {
        fun test() {
            println("test")
        }
    }

    data class Failure(val reason: String, val manaRequired: Int) : SpellResult()
    class Evaded : SpellResult()
}

fun castHealingSpell(mana: Int): SpellResult {
    val cost = 50
    return if (mana >= cost) {
        SpellResult.Success()
    } else {
        SpellResult.Failure("Not enough mana", cost - mana)
    }
}

fun main() {
    println("--- Lesson 3.07: Special Classes ---")
    // --- Using an Enum ---
    val currentWeapon = WeaponType.AXE
    println("Current weapon is: $currentWeapon")
    if (currentWeapon == WeaponType.AXE) {
        println("Ready to chop!")
    }

    /**
    when (currentWeapon) {
    WeaponType.SWORD -> TODO()
    WeaponType.AXE -> TODO()
    WeaponType.BOW -> TODO()
    WeaponType.STAFF -> TODO()
    }
     */

    // --- Using a Data Class ---
    val potion = LootItem("Health Potion", 50)
    println(potion)

//    val superPotion = potion.copy(name = "Super Health Potion", value = 200)
//    println(superPotion)

    var item1 = LootItem("Gold Ring", 100)
    var item2 = LootItem("Gold Ring", 100)

    println(item1.equals(item2))

    // --- Using a Sealed Class ---
    val result= castHealingSpell(30)

    when (result) {
        is SpellResult.Success -> println("Your wounds have been healed!")
        is SpellResult.Failure -> println("Spell failed: ${result.reason}. You need ${result.manaRequired} more mana.")
        is SpellResult.Evaded -> println(("The spell was dodged!"))
    }
}