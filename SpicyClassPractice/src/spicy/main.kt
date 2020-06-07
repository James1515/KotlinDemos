//=====================================================
//Author: James Anthony ortiz
//File: main.kt
//Description: In illustration of a sample class
//in kotlin using different spicy foods
//======================================================

package spicy

fun main(args: Array<String>)
{
    buildSpicyFood()
}

fun buildSpicyFood()
{
    var spicyFood = Spicy()

    println("The type of spicy food is ${spicyFood.spice}")
    println("The level of spicyness of this food is ${spicyFood.spicyLevel}")
    println("The heat index for this food is: ${spicyFood.spiceHeat}")

    //Changing variables from class:
    spicyFood.spicyLevel = "low"
    spicyFood.spice = "soup"
    spicyFood.spiceHeat = 0

    //Display new values:
    println("The spicy food is: ${spicyFood.spice}")
    println("The level of spice is: ${spicyFood.spicyLevel}")
    println("The heat index for ${spicyFood.spice} is ${spicyFood.spiceHeat}")



}