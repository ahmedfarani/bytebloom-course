package org.bytebloom

fun main() {
    println("--- Lesson 1.10: String Templates & Functions ---")

    val playerName="zara"
    val level=5
    val className="Mage"

    val capitalizedPlayerName = playerName.replaceFirstChar {firstChar -> firstChar.uppercase() }

    val welcomeMessage="Welcome, $capitalizedPlayerName! Your level ${level+1} $className $playerName is ready."
    println(welcomeMessage)

    val playerBio="""
        Player Profile:
        - Name: $playerName
        - Class: $className
        - Power: ${level*100}
    """.trimIndent()
    println(playerBio)

    println("\n---  Common & Useful String Finctions ---")
    val questTitle = "The Serpent's Lair"
    println("Original Title: $questTitle")

    println("Title length: ${questTitle.length}")

    println("In all caps: ${questTitle.uppercase()}")

    println("Does it start with 'The'? ${questTitle.startsWith("The")}")

    val keyword=questTitle.substring(4,11)
    println("The Keyword is: $keyword")

    val newTitle = questTitle.replace("Lair", "Cove", true)
    println("The new Title is: $newTitle")
}