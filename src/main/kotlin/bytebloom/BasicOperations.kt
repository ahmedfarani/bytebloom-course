package org.bytebloom

fun main() {
    println("--- Lesson 1.09: Basic Operations ---")

    println("--- Arithmetic Operations ---")
    val baseAttack = 50
    val bonusDamage = 15
    val totalDamage = baseAttack + bonusDamage
    println("Total Damage: $totalDamage")

    var monsterHealth = 100
    monsterHealth -= totalDamage
    println("Monster health after hit: $monsterHealth")

    val lootGold = 103
    val partyMembers = 4
    val goldPerMember = lootGold / partyMembers
    val remainingGold = lootGold % partyMembers
    println("Loot split: $goldPerMember gold per member, with $remainingGold gold left over.")

    println("--- Comparison ---")
    val playerLevel= 10
    val requiredLevel= 12
    println("Can enter dungeon? ${playerLevel >= requiredLevel}")
    println("Is player level NOT 10? ${playerLevel != 10}")

    println("--- Logical ---")
    val hasKey = true
    val isDoorLocked = false
    val canOpenDoor = hasKey && !isDoorLocked
    println("HasKey: $hasKey, Door is NOT Locked: ${!isDoorLocked}. Can Open? $canOpenDoor")

    val mana = 15
    val health=80

    val canPerformSpecialMove = mana >= 20 || health > 50
    println("Mana > 20 OR Health > 50? Can Perform Special Move? $canPerformSpecialMove")
}