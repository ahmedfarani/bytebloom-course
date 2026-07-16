package org.bytebloom

fun main() {
    println("--- Lesson 2.07: Collections in Memory ---")

    val partyMembers = mutableListOf("Arin", "Ben", "Clara")
    println("Original party: $partyMembers")

    val questGroup = partyMembers

    println("\n...The quest group decides to add another member...")
    questGroup.add("Dara")

    println("Quest group is now: $questGroup")
    println("Original party is now also: $partyMembers  <-- It changed!")

    println("\n--- To make a true copy, you must be explicit ---")
    val originParty = mutableListOf("Arin", "Ben", "Clara")

    val independentGroup = originParty.toMutableList()
    independentGroup.add("Dara")

    println("Original party: $originParty  <-- Unchanged!")
    println("Independent group: $independentGroup")
}