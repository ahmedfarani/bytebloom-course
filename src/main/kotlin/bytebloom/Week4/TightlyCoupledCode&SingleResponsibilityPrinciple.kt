package bytebloom.Week4


class Player {
    val name = "Arin"
    val health = 100

    // The Player is directly dependent on the Sword class. TIGHT COUPLING.
    private val weapon = Sword()

    fun attack(target: String) {
        weapon.swing(target)
    }
}

class Sword {
    fun swing(target: String) {
        println("Swing the sword at the $target for 10 damage!")
    }
}

// NEW CLASS! Its ONLY responsibility is to generate player reports.
class PlayerReportGenerator {
    fun generateReport(player: Player) {
        println("--- Player Report ---")
        println("Name: ${player.name}")
        println("Health: ${player.health}")
        println("----------------------")
    }
}

class Game {
    private val player = Player()

    // It uses the new reporting class to handle reporting.
    private val reporter = PlayerReportGenerator()

    fun start() {
        println("Game started!")
        player.attack("Goblin")

        // This class is doing too much. Its job should be to manage the game, not reporting.
        // printPlayerReport()

        // It delegates the reporting task to the specialist class.
        reporter.generateReport(player)
    }

    /*
        private fun printPlayerReport(){
            println("--- Player Report ---")
            println("Name: ${player.name}")
            println("Health: ${player.health}")
            println("----------------------")
        }
    */
}

fun main() {
    println("--- Lesson 4.01: Tightly Coupled Code (The 'Before' Picture) ---")
    println("--- Lesson 4.02: Single Responsibility Principle ---")

    val game = Game()
    game.start()
}