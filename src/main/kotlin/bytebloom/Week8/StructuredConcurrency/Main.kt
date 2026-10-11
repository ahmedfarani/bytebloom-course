package bytebloom.Week8.StructuredConcurrency

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() {
    println("--> Lesson 8.04: Structured Concurrency <--")

    runBlocking {
        val parentJob = launch {
            val job1 = launch { fetchUserData() }
            val job2 = launch { fetchUserNew() }
        }
        delay(2500.milliseconds)
        parentJob.cancel()
        parentJob.join()
    }
}

suspend fun fetchUserData(): String { // suspend / resume
    try {
        println("Fetching User Data")
        delay(5000.milliseconds) // 5 Seconds
        val userData = "User Data"
        println(userData)
        return userData
    } finally {
        println("User Data is closed")
    }
}

suspend fun fetchUserNew(): String {
    try {
        println("Fetching User news")
        delay(2000.milliseconds) // 2 Seconds
        val userNews = "User News"
        println(userNews)
        return userNews
    } finally {
        println("User News is closed")
    }
}