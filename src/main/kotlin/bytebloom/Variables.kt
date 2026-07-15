package org.bytebloom

fun main() {
    println("--- Lesson 1.06: val vs var")

    val playerName = "Aisha"
    val startingLives = 3

    println("Welcome to the game, $playerName")
    println("You start with $startingLives lives.")

    // playerName = "Ben"

    var currentScore = 0
    println("Your initial score is: $currentScore")

    currentScore = 100
    println("You found a treasure! Your score is now: $currentScore")

    currentScore = 250
    println("You leveled up! Your score is now: $currentScore")


}