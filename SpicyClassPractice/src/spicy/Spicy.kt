//
//Author: James Anthony ortiz
//File: Spicy.kt
//Description:
//

package spicy

class Spicy
{
    var spice: String = "curry"

    var spicyLevel: String = "mild"

    var spiceHeat: Int = 5
        //Getter Function:
    get()
    {
        if(spicyLevel == "none") {
            return 0
        }

        if(spicyLevel == "mild") {
            return 5
        }

        if(spicyLevel == "hot") {
            return 10
        }

        return 0
    }

}//END Class Spicy