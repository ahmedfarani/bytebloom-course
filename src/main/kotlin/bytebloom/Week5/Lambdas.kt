package bytebloom.Week5

fun main() {
    println("--- Lesson 5.03: Lambdas ---")

    // A Normal Function
    val double = {x: Int -> x * 2 }
    println("The doubled number is: ${double(4)}")

    val add: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println("The add number is: ${add(1, 2)}")
}