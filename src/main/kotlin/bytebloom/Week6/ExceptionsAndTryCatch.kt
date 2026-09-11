package bytebloom.Week6

fun getPlayerScore(playerName: String): Int {
    if (playerName.isBlank()) {
        throw IllegalArgumentException("playerName cannot be blank")
    }

    return (100..1000).random()
}

fun main() {
    println("--- Lesson 6.05 & 6.06: Exceptions and try catch ---")

    // Happy Path
    val playerName1 = "Arin"
    try {
        getPlayerScore(playerName1)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    } finally {
        println("Finished getting player score for $playerName1")
    }

    // Unhappy Path
    val playerName2 = ""
    try {
        getPlayerScore(playerName2)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    } finally {
        println("Finished getting player score for $playerName2")
    }
}