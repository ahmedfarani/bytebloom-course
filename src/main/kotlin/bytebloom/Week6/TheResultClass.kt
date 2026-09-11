package bytebloom.Week6

fun parsePlayerLevel(input: String): Result<Int> {
    return try {
        val level = input.toInt()
        if (level < 1) {
            Result.failure(IllegalArgumentException("Level can't be negative or zero"))
        } else {
            Result.success(level)
        }
    } catch (e: NumberFormatException) {
        Result.failure(e)
    } // "A" "" // NumberFormatException
}

fun main() {
    println("--- Lesson 6.08: The Result Class ---")

    val input1 = "25"
    val input2 = "abc"
    val input3 = "-25"

    val results = listOf(
        parsePlayerLevel(input1),
        parsePlayerLevel(input2),
        parsePlayerLevel(input3),
    )

    results.forEach {
//        if (it.isSuccess){
//            println("Successfully parsed level: ${it.getOrNull()}")
//        }
//
//        if (it.isFailure){
//            println("Failer to parsed level: ${it.exceptionOrNull()?.message}")
//        }

//        it.fold(
//            onSuccess = { level -> println(level) },
//            onFailure = { exception -> println(exception.message) }
//        )

        it.fold(
            onSuccess = ::onParsingPlayerLevelSuccess,
            onFailure = ::onParsingPlayerLevelFailure
        )
    }
}

fun onParsingPlayerLevelSuccess(level: Int) {
    println("Player level: $level")
}

fun onParsingPlayerLevelFailure(throwable: Throwable) {
    println(throwable.message)
}
