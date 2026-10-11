package bytebloom.Week8.IntroductionToFlow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {
    println("--> Lesson 8.07: Introduction to Flow <--")

    // streams, Flow
    val playerScores = getPlayerScores() // Cold flow - Hot flow

    delay(2000.milliseconds)

    playerScores.collect { score ->
        println(score)
    }
}

fun getPlayerScores(): Flow<Int> = flow {
    for (i in 1..5) {
        delay(1000.milliseconds)
        emit(i)
    }
}