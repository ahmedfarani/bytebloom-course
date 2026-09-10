package bytebloom.Week6

data class Player(val name: String, val level: Int)
data class LootItem(val name: String, val value: Int)

class LootBox<T>(val lootItem: T){
    fun fetch(): T{
        println(lootItem)
        return lootItem
    }
}

fun <T> printLootBoxContent(box: LootBox<T>){
    println(box.fetch())
}

fun main(){
    println("--- Lesson 6.01: Generics ---")

    val magicScrollBox = LootBox<String>("Magic Scroll")
    val scroll = magicScrollBox.fetch()
    println(scroll)

    val goldBox = LootBox<Int>(500)
    val gold = goldBox.fetch()
    println("You have collected $gold gold!")

    val sword = LootItem("Sword", 3)
    val legendaryWeaponBox = LootBox<LootItem>(sword)
    val weapon = legendaryWeaponBox.fetch()
    println("You have found the legendary ${weapon.name} worth ${weapon.value}")
}