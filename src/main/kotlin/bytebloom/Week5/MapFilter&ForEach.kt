package bytebloom.Week5

data class Player(val name: String, val level: Int, val playerClass: String, val gold: Int)

val players = listOf(
    Player("Arin", 12, "Warrior", 150),
    Player("Clara", 15, "Mage", 100),
    Player("Ben", 11, "Rogue", 250),
    Player("Dara", 15, "Cleric", 180),
    Player("Erik", 9, "Warrior", 80)
)

fun main() {
    println("--- Lesson 5.05: map, filter, forEach ---")

    println("--- Players ---")
    players.forEach { player ->
        println("player name: ${player.name}")
    }

    println("\n--- Warriors ---")
    val warriors = players.filter { player -> player.playerClass == "Warrior" }
    warriors.forEach { println(it.name) }

    println("\n--- Player Names (as a list of Strings) ---")
    val playerNames= players.map { player -> player.name.uppercase() }
    println(playerNames)

    println("\n--- Names of Mages above level 12 ---")
    val highLevelMageNames = players
        .filter { it.playerClass == "Mage" && it.level > 12 }
        .map { it.name }
    println(highLevelMageNames)
}