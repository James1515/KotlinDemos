package Aquarium

class Aquarium{

    //val: variable cannot be changed
    //var: ... can be changed

    //Variable Attributes
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    var volume: Int
        //Getter function:
        get()
        {
            return width * height * length / 1000
        }
        //Setter function:
        set(value)
        {
            height = (value * 1000) / (width * length)
        }

    /*
    fun volume(): Int
    {
        return width * height * length / 1000
    }
    */

    //Same as above, but function is on only one line:
    fun volume() = width * height * length / 1000

}//END Class Aquarium: