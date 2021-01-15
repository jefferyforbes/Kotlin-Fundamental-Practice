fun main() {
    val wholeNumber = 3
    print("The value of whole Number is $wholeNumber")
    val bigNumber = 3L
    val preciseDecimal = 3.33
    val normalDecimal = 3.33f
    val booleanValue = false
    val iAmALetter = "a"
// End of Value Types

    val x = 3 * 4
    println("The value of x is $x")
    val exampleOfLackOfPrecision = 3 / 4
    println("$exampleOfLackOfPrecision Is the wrong answer ")
    val correctionToPrecision = 3f / 4f
    print("$correctionToPrecision is the correct Answer ")
//
    val wrongModularValue = 10 % 2
    println("$wrongModularValue Is the wrong answer to check modular calculations ")
//
    val amIAnAdult = true
    val amIAnProgrammer = true
    val amIAnAdultProgrammer = amIAnAdult && amIAnProgrammer
    println("$amIAnAdultProgrammer")
    val checkTwoValueSame = (amIAnAdult == amIAnProgrammer)
    val checkTwoValueNotSame = (amIAnAdult != amIAnProgrammer)
//
    val negateABoolean = !(amIAnAdult == amIAnProgrammer)
//    The code above essentially does the opposite. So if the evalution in the brackets is true, then
//    it will change it to false and vice versa.
    val immediateVariableAssign: String = "This is a strongly typed string"
    println(immediateVariableAssign)

    val string = "Kotlin is the best language"
    println("$string")
    println("${string.toUpperCase()}")
//
    val conStatement = 1 + 1

    if (conStatement == 2){
            println("x is 2")
    } else if (x == 3) {
        println("x is 3")
    } else {
        println("x is not 2 / 3 !")
    }
//    The code below is the way to write expressions in Kotlin
    val y = if(x == 2) 2 else 3
//    what the line (46) does above is it checks the value of "y" and assigns it the appropriate value
//    based on the results of the condition.

//    Example of Null value below
    val h: Int? = null
    val number1 = readLine() ?: "0"
    val number2 = readLine() ?: "0"
//    The use of the "!!" is not advised because it could crash the program so the "?: "0" " changes the value
//    from null to "0" if the program returns null.
    val result = number1!!.toInt() + number2!!.toInt()
//    The two "!!" after the variables checks to make sure that the value is not equal to null before running
//    the code
    println("$result")

// ---- LISTS ----

    val shoppingList = mutableListOf("Lamborghini", "Penthouse", "Rolex")
    println(shoppingList[0])
    shoppingList.add("Ferrari")
    println(shoppingList)

// ---- LOOPS ----


    var counter = 0
    while (counter < shoppingList.size){
        println(shoppingList[counter])
        counter++
    }

    for (shoppingItem in shoppingList) {
        println(shoppingItem)
    }

    for(i in 1..100){
        println(i)
    }

    val n = 3
    when(x) {
        in 1..2 -> println("x is between 1 and 2")
        in 3..10 -> println(" x is between 3 and 10")
        else -> {
            println("x is not in the range of 1 to 10")
        }
    }

    print(print10Numbers())

    val isEvenCheck = isEven(5)
//    The boolean is saved in the isEvenCheck variable from the isEven function
    println(isEvenCheck)

    println(n.isOdd())
//    "n" is defined above


    val dog = Dog()
    dog.makeSound()
    val cat = Cat()
    cat.makeSound()

//    Bear is an temporary object or class
    val bear = object : Animal("Camebear"){
        override fun makeSound(){
            println("ROAR!!!!")
        }
    }

    val number = readLine() ?: "0"

//    The block below is called a "try and catch" block
//    which attempts to catch user input errors and resolve
//    them without allowing the code to crash.

    val parsedNumber = try {
        number.toInt()
    } catch (e: Exception) {
        0
//        The block essentially tries to convert what the user inputs
//        to the correct data type, in this case an integer and if it fails
//        the program converts their input to 0
    }

    println(parsedNumber)

//  ----- Lambda ----
    val list = listOf("Kotlin", "is", "fun")
//    the block below checks the indexes in the list/array to see if the strings
//    have more than 3 length and adds it to the counter.
    val count = list.count { currentString ->
        currentString.length == 3
    }
    println(count)
}
// ------- End of the main function ------

fun <T>List<T>.customCount(function: (String) -> Boolean): Int {
    var counter = 0
    for(String in this) {
        if(function(String)){
            counter++
        }
    }
    return counter

//    ----- FUNCTIONS ------

fun print10Numbers(){
    for(i in 1..10){
        println(i)
    }
}

fun isEven(number: Int): Boolean {
//    The parameter checks that the input is integer
//    You can set default parameters like this (number: Int = 10): Boolean, a default value is used
//    until the user changes it.
    return number % 2 == 0
}

// -----Extension Functions-----
fun Int.isOdd(): Boolean {
    return this % 2 == 1
}