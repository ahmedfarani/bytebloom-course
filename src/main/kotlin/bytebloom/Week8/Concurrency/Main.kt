package bytebloom.Week8.Concurrency

import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() {
    println("--> Lesson 8.01: The Need for Concurrency <--")


    // --> A Blocking Operation <--
    // Imagine this is a heavy task like a network request or reading a large file.
    // The program STOPS and waits for it to finish.

    val totalTime = measureTimeMillis {
        println(fetchUserDataBlocking())
        println(fetchUserNewBlocking())
    }
    println("Total time is: $totalTime")

    val totalThreadsTime = measureTimeMillis {
        val thread1 = thread { fetchUserDataBlocking() }
        val thread2 = thread { fetchUserNewBlocking() }

        thread1.join()
        thread2.join()
    }
    println("Total threads time is: $totalThreadsTime")
}

fun fetchUserDataBlocking(): String {
    println("Fetching User Data")
    Thread.sleep(5000) // 5 Seconds
    return "User Data"
}

fun fetchUserNewBlocking(): String {
    println("Fetching User news")
    Thread.sleep(5000) // 2 Seconds
    return "User News"
}