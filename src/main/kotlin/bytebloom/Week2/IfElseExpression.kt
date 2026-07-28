package org.bytebloom

fun main() {
    println("--- Lesson 2.01: The if/else Expression ---")

    val playerHealth = 45

    println("--- As a Statement ---")
    if (playerHealth == 100) {
        println("Playeris at fill health.")
    } else if (playerHealth > 50) {
        println("Player is in good shape.")
    } else if (playerHealth > 20) {
        println("Player is injured. Find a potion!")
    } else {
        println("DANGER! Player health is critical!")
    }

    println("\n--- As an Expression ---")
    var healthStatus = if (playerHealth == 100) {
        "Perfect"
    } else if (playerHealth > 50) {
        "Good"
    } else if (playerHealth > 20) {
        "Injured"
    } else {
        "Critical"
    }

    println("Player Status: $healthStatus")
}