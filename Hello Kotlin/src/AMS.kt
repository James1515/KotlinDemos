/*

fun dayOfWeek()
{
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    when(day)
    {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Time has stopped")
    }
}

*/



/*
fun main(args: Array<String>)
{
    /*
    println("Hello ${args[0]}!")
    val isUnit = println("This is an expression!")
    println(isUnit)

    val temperature = 10
    val isHot = if(temperature > 50) true else false
    println(isHot)

    val message = "You are ${if(temperature > 50 ) "fried" else "safe"} fish"
    println(message)

     */

    /*

    val timeToInt:String = args[0].substring(0,2)

    val num:Int = timeToInt.toInt()

    if(num in 0..12) println("Good Morning Kotlin!") else println("Good Night Kotlin!")

    */


    for(i in 0..10)
    {
        if(getFortuneCookie().compareTo("Take it easy and enjoy life!") == 0)
            break
        else
            println("Your fortune is... ${getFortuneCookie()}")
    }


}
 */

/*
fun getFortuneCookie(): String{
    var fortunes = listOf("You will have a great day!",
                          "Things will go well for you today",
                          "Enjoy a wonderful day of success",
    "Be humble and all will turn out well.", "Today is a good day for excercizing restraint",
    "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")

    //Enter in user input
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1


    //Return random Index val to fortune:
    return fortunes[birthday.rem(fortunes.size)]
}
*/

/*
fun main(args: Array<String>)
{
    println("Hello, ${args[0]}")
    feedTheFish()
}

fun feedTheFish()
{
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food.")

}

fun randomDay(): String
{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
    "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String) : String {

    return when (day)
    {
        "Monday" -> "flakes"
        "Tuesday" -> "redworms"
        "Wednesday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

 */

/*
fun main(args: Array<String>)
{
    var fortune: String
    for(i in 1..10)
    {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if(fortune.contains("Take it easy")) break;
    }
}

fun getBirthday() : Int?
{
    print("Please enter your birthday: ")
    val birthday = readLine()?.toIntOrNull()

    return birthday
}


fun getFortune(Value: Int?): String
{
    //If the value is 28, or 31:
    if(Value == 28 || Value == 31)
    {
        return "Take it easy, and you will succeed!"
    }
    else if(Value in 1..7)
    {
        return "Keep going, and everything will work out!"
    }
    else
    {
        return "In the next days good news will come your way."
    }

}
*/

//-------------------------------------------------------------------














