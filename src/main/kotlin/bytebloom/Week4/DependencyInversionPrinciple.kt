package bytebloom.Week4


class ConsoleLogger : Logger {
    override fun log(message: String) {
        println("[CONSOLE LOG] $message")
    }
}

class NetworkLogger : Logger {
    override fun log(message: String) {
        println("[NETWORK LOG, write to the database]: $message")
    }
}

class Playersss(val name: String, val logger: Logger) {
    fun takeTurn() {
        logger.log("$name is taking their turn.")
        println("$name attacks the dragon!")
    }
}

interface Logger {
    fun log(message: String)
}

fun main() {
    println("--- Lesson 4 06: Dependency Inversion Principle ---")

    val networkLogger = NetworkLogger()
    val consoleLogger = ConsoleLogger()

    val player1 = Playersss("Arin", networkLogger)
    val player2 = Playersss("Ben", consoleLogger)

    player1.takeTurn()
    player2.takeTurn()


}