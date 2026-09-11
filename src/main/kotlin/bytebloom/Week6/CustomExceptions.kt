package bytebloom.Week6

class InsufficientManaException(
    val currentMana: Int,
    val requiredMana: Int,
    message: String = "Not enough mana to cast fireball, Have $currentMana, need $requiredMana",
) : Exception(message)

fun castFireball(mana: Int) {
    val manaCost = 50
    if (mana < manaCost) {
        throw InsufficientManaException(mana, manaCost)
    }
    println("You have casted fireball!")
}

fun main() {
    println("--- Lesson 6.07: Custom Exceptions ---")

    try {
        castFireball(40)
    } catch (e: InsufficientManaException) {
//        ui.showInsufficientMana(e.currentMana, e.requiredMana)
        println(e.message)
    } catch (e: Exception) {
        println(e.message)
    }
}