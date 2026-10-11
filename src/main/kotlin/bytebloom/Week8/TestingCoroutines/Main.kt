package bytebloom.Week8.TestingCoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main()= runBlocking {
    println("--> Lesson 8.06: Testing Coroutines <--")

    UserProfileRepository().fetchProfile()


}

class UserProfileRepository{

    suspend fun fetchProfile(userId: String): String {
        delay(1000.milliseconds)
        return "Profile for: $userId"
    }
}