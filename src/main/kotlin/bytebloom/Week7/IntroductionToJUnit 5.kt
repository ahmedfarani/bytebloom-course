package bytebloom.Week7

// Lesson 7.02: Your Testing Toolkit: Introduction to JUnit 5

class PlayerStats{
    private val maxHealth = 100
    var health = 100
        private set

    fun takeDamage(damage: Int) {
        health -= damage
    }

    fun heal(amount: Int) {
        health += amount
        if (health > maxHealth) {
            health = maxHealth
        }
    }
}