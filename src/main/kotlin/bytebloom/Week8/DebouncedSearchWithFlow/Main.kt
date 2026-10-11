package bytebloom.Week8.DebouncedSearchWithFlow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main () = runBlocking {
    println("--> Lesson 8.08: Debounced Search with Flow <-- ")

    val queryFlow = MutableStateFlow("")
    queryFlow
        .debounce(300.milliseconds)
        .filter { it.isNotBlank() && it.length > 2 }
        .distinctUntilChanged()
        .flatMapLatest {
            flow { emit(searchApi(it)) }
        }
        .onEach { println(it) }
        .launchIn(this)

    // Simulate user typing
    println("User is typing..")
    queryFlow.value = "k"
    delay(300.milliseconds)
    queryFlow.value = "ko"
    delay(300.milliseconds)
    queryFlow.value = "kot"
    delay(500.milliseconds)
    queryFlow.value = "kotlin"
    delay(1000.milliseconds)

}

// A fake search function that simulates a network call.
suspend fun searchApi(query: String): String {
    delay(500.milliseconds)
    return "Results for '$query'"
}