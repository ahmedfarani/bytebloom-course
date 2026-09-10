package bytebloom.Week6

data class Players(val name: String, val level: Int, val guild: String?)

fun main(){
    println("--- Lesson 6.02: Null Safety ---")

    val p1 = Players("Arin", 15, "The Silver Blades")
    val p2 = Players("Ben", 11, null)

    // Safe Call
    val p1GuildNameLength = p1.guild?.length
    val p2GuildNameLength = p2.guild?.length

    println(p1GuildNameLength)
    println(p2GuildNameLength)

    // Elvis Operator

    val guildNameToDisplay1 = p1.guild ?: "No guild"
    var guildNameToDisplay2 = p2.guild ?: "No guild"

//    if (p2.guild != null) {
//        guildNameToDisplay2 = p2.guild
//    }else{
//        guildNameToDisplay2 = "No guild"
//    }

    println(guildNameToDisplay1)
    println(guildNameToDisplay2)

    try {
        p2.guild!!.length
    } catch (e: NullPointerException) {
        println("CRASH occurred")
    }
}