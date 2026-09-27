package bytebloom.Week7

import org.koin.core.context.startKoin

fun main(){
    val koin = startKoin {
        modules(gameModule)
    }.koin

    val game = koin.get<Game>()

    println("Game Started.")
    game.damagePlayer(100)
    println("Player Defeated")
}