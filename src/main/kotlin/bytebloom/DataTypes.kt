package org.bytebloom

fun main() {
    println("--- Lesson 1.07: Data Types & Type Interface ---")

    val level = 10
    val healthPoints = 95.5
    val isGameOver = false
    val characterName = "Magnus"
    val firstInitial = 'M'

    println("Player: $characterName")
    println("Level: $level")
    println("HP: $healthPoints")
    println("Initial: $firstInitial")
    println("Game Over? $isGameOver")

    val mana: Int = 100
    val magicResistance: Float = 0.75f
    val canCastSpell: Boolean = true

    println("\nMana: $mana")
    println("Magic Resistance: $magicResistance")
    println("Can Cast Spell: $canCastSpell")
}