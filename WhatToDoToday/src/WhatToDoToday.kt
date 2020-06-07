//==================================================================
//Author: James Anthony Ortiz
//File: WhatToDoToday.kt
//Description: This is a practice on function in Kotlin
//Main function calls whatShouldIDoToday, which returns user input
//on how they feel on the day.
//==================================================================


fun main(args: Array<String>)
{
    println("Enter your state (happy/sad): ")
    val mood:String = readLine().toString()

    println("Enter the weather in your area (rainy/sunny): ")
    val weather:String = readLine().toString()

    println("Enter the temperature in your area: ")
    val temp:Int = readLine()?.toIntOrNull() ?: 1

    println(whatShouldIDoToday(mood, weather, temp))



    val spices = listOf("curry", "pepper", "cayenne", "ginger", "green curry", "red pepper")

    println(spices.filter{it.startsWith('c') && it.endsWith('e')})
    
}

fun whatShouldIDoToday(mood: String, weather: String, temperature: Int): String
{

    return when {
        mood == "happy" && weather == "sunny" && temperature > 25 -> "go for a walk!"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        mood == "happy" && weather == "sunny" && temperature > 35 -> "go swimming"
        else -> "Stay home and read."


    }

}
