package org.bytebloom

fun main() {
    println("--- Lesson 2.02: The 'when' Statement ---")

    val diceRoll = 4

    println("--- Simple 'when' ---")
    when (diceRoll) {
        1 -> println("Critical Fail! You tripped on a rock.")
        6 -> println("Critical Success! You deal double damage.")
        else -> println("A normal roll of $diceRoll")
    }

    println("\n--- 'when' with ranges ---")
    val itemTier = when (diceRoll) {
        1,2 -> "Common"
        in 3..5 -> "Uncommon"
        6 -> "Epic"
        else -> "Error"
    }
    println("You found an item of tier: $itemTier")

    println("\n--- 'when' as an expression ---")
    val message= when (itemTier) {
        "Common" -> "You found a Rusty Sword."
        "Uncommon" -> "You found a Sturdy Shield."
        "Epic" -> "You found the Legendary Axe of Bloom!"
        else -> "No item found."
    }
    println(message)
}