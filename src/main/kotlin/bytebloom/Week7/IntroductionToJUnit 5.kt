package bytebloom.Week7

// Lesson 7.02: Your Testing Toolkit: Introduction to JUnit 5

class PlayerStats{
    var health = 100
        private set

    fun takeDamage(damage: Int) {
        health -= damage
    }
}