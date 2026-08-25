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

    // .foeEach is the functional way tp loop.
    println("--- Players ---")
    players.forEach { player ->
        println("player name: ${player.name}")
    }

    // .filter creates a NEW list containing only the elements that match the predicate.
    // The lambda must return a Boolean.
    println("\n--- Warriors ---")
    val warriors = players.filter { player -> player.playerClass == "Warrior" }
    warriors.forEach { println(it.name) }

    // .map creates a NEW list by transforming every element from the original list.
    // The lambda's return value is what goes into the new list.
    println("\n--- Player Names (as a list of Strings) ---")
    val playerNames= players.map { player -> player.name.uppercase() }
    println(playerNames)

    // --- Chaining them together ---
    // This is the real power of functional programming.
    // We create a declarative pipline of transformations.
    println("\n--- Names of Mages above level 12 ---")
    val highLevelMageNames = players
        .filter { it.playerClass == "Mage" && it.level > 12 } // List<Player>
        .map { it.name } // List<String>
    println(highLevelMageNames)
}