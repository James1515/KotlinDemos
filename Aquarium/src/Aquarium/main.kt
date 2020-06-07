//==========================================================
//Author: James Anthony Ortiz
//File:  main.kt
//Description: Driver source code for class Aquarium
//
//==========================================================



package Aquarium

fun main(args: Array<String>)
{
    //Class to build aquarium
    buildAquarium()
}


fun buildAquarium()
{
    //Create an instance of the class:
    val myAquarium = Aquarium()

    //Display the attributes of the class:
    println("Length: ${myAquarium.length}" +
            "\nWidth: ${myAquarium.width}" +
            "\nHeight: ${myAquarium.height}")

    //Change the height of the Aqurium:
    myAquarium.height = 80

    println("New Height: ${myAquarium.height} cm")

    println("New Volume: ${myAquarium.volume} liters")

}