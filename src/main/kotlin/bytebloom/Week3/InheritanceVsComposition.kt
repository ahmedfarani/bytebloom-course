package bytebloom.Week3

import java.net.Proxy

class Sword(val damage: Int, val sharpness: Int) {
    fun swing() {
        println("Swings the sword for $damage damage!")
    }
}

class Bow(val damage: Int, val range: Int) {
    fun shoot(){
        println("Shoots an arrow for $damage damage from $range meters!")
    }
}

class Playerssssss<TYPE>(val name: String, var health: Int, val weapon: TYPE) {
    fun attack() {
        when (weapon) {
            is Sword -> weapon.swing()
            is Bow -> weapon.shoot()
            else -> println("$name doesn't know how to use this!")
        }
    }
}

fun main() {
    println("--- Lesson 3.08: Inheritance vs Composition ---")

    val steelSword = Sword(15, 90)
    val elvenBow = Bow(12, 100)

    val warrior = Playerssssss<Sword>("Borin the Brave", 150, steelSword)
    val ranger = Playerssssss<Bow>("Lyra Swiftarrow", 100, elvenBow)

    println("--- The Warrior's Turn ---")
    warrior.attack()

    println("\n--- The Ranger's Turn ---")
    ranger.attack()
}