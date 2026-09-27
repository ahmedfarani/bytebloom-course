package bytebloom.Week7

// Lesson 7.02: Your Testing Toolkit: Introduction to JUnit 5

class PlayerStats{
    private val maxHealth = 100
    var health = 100
        private set
    var isAlive = true
        private set

    fun takeDamage(damage: Int) {
        health -= damage
        if (health <= 0){
            health = 0
            isAlive = false
        }
    }

    fun heal(amount: Int) {
        health += amount
        if (health > maxHealth) {
            health = maxHealth
        }
    }
}