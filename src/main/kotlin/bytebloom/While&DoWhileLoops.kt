package org.bytebloom

fun main() {
    println("--- Lesson 2.04: The 'while' and 'do-while' Loops ---")

    println("--- 'while' loop ---")
    var monsterHealth = 100
    var attackDamage = 15
    var attackCount = 0

    while (monsterHealth > 0) {
        attackCount++
        println("Attack #$attackCount: Dealing $attackDamage damage!")
        monsterHealth -= attackDamage
        if (monsterHealth < 0) monsterHealth=0
        println("Monster health is now $monsterHealth")
    }
    println("The moster is defeated after $attackCount attacks!")

    println("\n--- 'do-while' loop ---")
    var userChoice: Int
    do {
        println("Choose a door (1, 2, or 3):")
        userChoice = 3
        println("You chose door #$userChoice")

        if (userChoice !in 1..3) {
            println("Invalid option")
        }
    } while (userChoice !in 1 .. 3)
    println("You proceed through door #$userChoice")
}