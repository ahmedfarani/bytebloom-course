package bytebloom.Week8.CoroutineScopes

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() {
    println("--> Lesson 8.02 & 8.03: Coroutines & Coroutines Scopes <--")

    println("Started a coroutine")
    runBlocking {
        // Coroutine Scope

        val job1=launch { // Fire and Forget
            val user = fetchUserData()
            println("User: $user")
        }

        val job2=launch {
            val news = fetchUserNew()
            println("News: $news")
        }

        job1.join()
        job2.join()

        println("All inner coroutines finished!")
    }
    println("Ended a coroutine")
}

// Coroutines => cooperative routines
suspend fun fetchUserData(): String { // suspend / resume
    println("Fetching User Data")
    delay(5000.milliseconds) // 5 Seconds
    return "User Data"
}

suspend fun fetchUserNew(): String {
    println("Fetching User news")
    delay(2000.milliseconds) // 2 Seconds
    return "User News"
}