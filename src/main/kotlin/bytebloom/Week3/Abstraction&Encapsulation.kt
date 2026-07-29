package bytebloom.Week3



class Playerss(val name: String, var health: Int, val strength: Int) {

    // Encapsulation
    private var mana = 100

    fun takeDamage(damage: Int) {
        this.health -= damage
        println("$name takes $damage damage! Remaining health: ${this.health}")
    }

    fun attack(monster: String) {
        println("$name attacks the $monster for $strength damage!")
    }

    // Abstarction
    fun castFireball(target: String) {
        val manaCost=20

        if (mana >= manaCost) {
            mana -= manaCost
            println("$name casts a fireball at the $target!")
            println("Remaining mana: $mana")
        } else {
            println("$name doesn't have enough mana to cast fireball!")
        }
    }
}



fun main(){
    println("--- Lesson 3.03: Abstraction and Encapsulation ---")

    val mage = Playerss("Clara the Wise", 70, 5)


    mage.castFireball("Orc")
    mage.castFireball("Orc")
    mage.castFireball("Orc")
    mage.castFireball("Orc")
    mage.castFireball("Orc")
}