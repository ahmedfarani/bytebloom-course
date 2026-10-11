package bytebloom.Week8.AsyncAwaitExceptionHandling

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main () = runBlocking {
    println("--> Lesson 8.05: Async, Await, and Exception Handling <--")
    val job = launch {
        val userAvatarDeferred = async { fetchUserAvatar() }
        val userFriendsDeferred = async { fetchUserFriends() }


        try {
            val userAvatar = userAvatarDeferred.await()
            println("Successfully fetched user avatar: $userAvatar")

            val userFriends = userFriendsDeferred.await()
            println("Successfully fetched user friends: $userFriends")
        } catch (e: Exception) {
            println("caught an exception: ${e.message}")
        }
    }
}

suspend fun fetchUserAvatar(): String {
    delay(3000.milliseconds)
    return "avatar.png"
}

suspend fun fetchUserFriends(): String {
    delay(4000.milliseconds)
    // This coroutine will fail!
    throw IllegalStateException("Failed to fetch friends list.")
}

