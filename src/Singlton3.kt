open class AAA {
    companion object SingletonB{
        init {
            println("SingletonB class invoked")
        }
        var name="Kotlin Objects B"


        fun printName(){
            println(name)
        }
    }
    open fun printName() {
        print("This is class A")
    }

    init {
        println("Class init method.")
    }
}

object SingletonA : AAA() {


    init {
        println("SingletonA class invoked.")
    }

    var name = "Kotlin Objects A"
    override fun printName() {
        println(name)
    }

}
fun main(args: Array<String>) {

    var a = AAA.name
    AAA.name = "Kotlin Tutorials"
    AAA.printName() //prints Kotlin Tutorials
}
