package bytebloom.Week5

fun main(){
    println("--- Lesson 5.07: groupBy and partition ---")

    /* Map<String, List<Player>>
    "Warrior" : list(arin, erik)
    "mage" : list(clara)
    "Rogue" : list(ben)
     */

    val playerByClass = players.groupBy { it.playerClass }
    playerByClass.forEach { (className, players) ->
        println("Class: $className")
        players.forEach { println(it.name) }
    }

    val (highLevelPlayers, lowLevelPlayers) = players.partition {
        it.level >= 12
    }

    println("High level players:")
    highLevelPlayers.forEach { println(it.name) }

    println("Low level players:")
    lowLevelPlayers.forEach { println(it.name) }
}
