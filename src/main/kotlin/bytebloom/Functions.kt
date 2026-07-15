package org.bytebloom

fun main() {
    println("--- Lesson 2.05: Functions ---")

    val playerName = "Zara"
    val playerHealth = 55
    val mana = 80
    displayPlayerStatus(playerName, playerHealth, mana)

    var baseDamage = 15
    val critChance = 20

    calculateAttackDamage(baseDamage, critChance)
}

fun displayPlayerStatus(name: String, health: Int, mana: Int) {
    println("--- Status ---")
    println("Player: $name")
    println(", Health: $health | mana: $mana")
    println("----------------------")
}

fun calculateAttackDamage(critChance: Int, baseDamage: Int): Int {
    val isCriticalHit = (1..10).random() <= critChance
    val totalDamage = if (isCriticalHit) {
        println("Critical Hit!")
        baseDamage * 2
    } else baseDamage
    return totalDamage
}