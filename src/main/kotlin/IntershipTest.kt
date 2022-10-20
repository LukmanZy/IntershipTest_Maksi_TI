class IntershipTest {

    fun helloWorld() {
        println("Hello World!")
        println()
    }

    fun sumOfTenNumbers() {
        println("----------Sum of 10 Numbers----------")

        var i = 1
        var result = 0
        while (i <= 10) {
            result += i
            if (i == 10) {
                print("$i = ")
            } else{
                print("$i + ")
            }
            i++
        }
        println(result)
        println()
    }
}

fun main() {
    val intershipTest = IntershipTest()

    intershipTest.helloWorld()
    intershipTest.sumOfTenNumbers()
}