abstract class Animal (
    val name: String,
    val legCount: Int = 4
        ) {

    init {
        // The init block is a block of code that will execute everytime
        // a instance of a class is created.
        println("Hello, My name is $name.")
    }

    abstract fun makeSound()
}


