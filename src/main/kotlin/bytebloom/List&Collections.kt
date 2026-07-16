package org.bytebloom

fun main() {
    println("--- Lesson 2.06: Lists and Collections ---")

    println("--- Immutable List ---")
    val startingInventory = listOf("Potion", "Sword", "Map")
    println("Your starting inventory is: $startingInventory")
    println("You have ${startingInventory.size} items.")

    val firstItem = startingInventory[0]
    println("Your first item is: $firstItem.")

    if ("Map" in startingInventory) {
        println("You have a map! You know where to go.")
    }

    println("\n--- Mutable List ---")
    val lootBag = mutableListOf("Gold Coin", "Gemstone")
    println("Your loot bag contains: $lootBag")

    lootBag.add("Magic Scroll")
    println("You found a scroll! Loot Bag: $lootBag")

    lootBag.remove("Gold Coin")
    println("Your spent the coin. Loot Bag: $lootBag")

    lootBag.clear()
    println("You sold everything. Is the loot bag empty? ${lootBag.isEmpty()}.")
}