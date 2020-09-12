class Singlton2{}
class AA {

    object Singleton
    {

        init {
            println("Singleton class invoked.")
        }
        var name = "Kotlin Objects"
        fun printName()
        {
            println(name)
        }

    }

    init {
        println("Class init method. Singleton name property")
    }
}
fun main(args: Array<String>) {
    var a = AA()
    Singleton.printName()
}
