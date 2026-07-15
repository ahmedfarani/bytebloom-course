package org.bytebloom

fun main() {
    println("--- Lesson 2.03: For Loops and Ranges ---")

    println("--- Simple Range '..' ---")
    for (i in 1..5) {
        println("Preparing spell #$i...")
    }

    println("\n--- 'until' Range ---")
    val enemyCount=5
    for (i in 0 until enemyCount) {
        println("Targeting enemy #$i")
    }

    println("\n--- 'downTo' Range ---")
    for (i in 5 downTo 1) {
        println("Launch in $i...")
    }
    println("Lifeoff!")

    println("\n--- 'step' ---")
    for (i in 0..10 step 2) {
        println("Charging power to $i%")
    }
}