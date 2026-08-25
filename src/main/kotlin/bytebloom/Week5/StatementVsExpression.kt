package bytebloom.Week5

fun main (){
    println("--- Lesson 5.02: Statement vs Expression ---")
    val playerHealth = 75

    // "if" as a Statement (Imperative)
    // We declare a mutable variable and change its value inside the "if" blocks.
    var statusMessage = ""
    if (playerHealth > 50){
        statusMessage = "Looking good!"
    } else {
        statusMessage = "Danger!"
    }
    println("Statement style: $statusMessage")

    // "if" as an Expression (Functional / Declarative)
    val expressionStatus = if (playerHealth > 50){
        "Looking good!"
    } else {
        "Danger!"
    }
    println("Expression style: $expressionStatus")

    // The Same Applies to 'when'
    val tier = when (playerHealth){
        100 -> "Perfect"
        in 50 .. 99 -> "High"
        else -> "Low"
    }
    println("Health tire: $tier")
}