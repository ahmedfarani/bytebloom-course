package bytebloom.Week5

data class PlayerWithInventory(val name: String, val items: List<String>)

fun main(){
    println("--- Lesson 4.06: flatMap, zip, associateBy ---")

    val playersWithInventory = listOf(
        PlayerWithInventory("Arina", listOf("Sword", "Shield")),
        PlayerWithInventory("Clara", listOf("Staff", "Potion", "Scroll")),
    )

    // .map = [ ["Sword", "Shield"], ["Staff", "Potion", "Scroll"] ]
    // .flat = [ "Sword", "Shield", "Staff", "Potion", "Scroll" ]

    val allItems = playersWithInventory.flatMap { it.items }
    println("All items: $allItems")

    // "Arin", "Clara", "Ben"
    // 500, 800, 750
    // (Arin, 500), (Clara, 800), (Ben, 750)

    val playerNames = listOf("Arin", "Clara", "Ben")
    val scores = listOf(500, 800, 750)
    val leaderBoard = playerNames.zip(scores)
    println("Leaderboard: $leaderBoard")

    leaderBoard.forEach { (name, score) ->
        println("Playername: $name, with score: $score")
    }

    // List -> Map
    // associateBy
    val playerMap = players.associateBy { it.name }
    println(playerMap)

}