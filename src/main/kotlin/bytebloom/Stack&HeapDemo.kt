package org.bytebloom

data class Player(var name: String, var score: Int)

fun main() {
    println("--- Lesson 1.08: Stack vs Heap Demo ---")

    var a = 10
    var b = a
    println("Initially: a = $a, b = $b")

    // Stack memory

    a = 20
    println("After changing a: a = $a, b = $b <-- Notice b is unchanged!")

    println("\n--------------------------------------")

    val player1 = Player("Aisha", 200)
    val player2 = player1

    println("Initially: player1's score is ${player1.score}")
    println("Initially: player1's score is ${player2.score}")

    player2.score = 250
    println("\n...Changed player2's score to 250...")

    println("After changing: player1's score is now ${player1.score} <-- It changed!")
    println("After changing: player2's score is now ${player2.score}")
}
