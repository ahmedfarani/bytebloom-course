package bytebloom.Week5

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    println("--- Lesson 4.04: Higher-Order Functions ---")

//    val add = { a: Int, b: Int -> a + b }
//    val product = { a: Int, b: Int -> a * b }

    calculate(6, 2) { a: Int, b: Int -> a * b }
}