import java.util.*

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

    fun primeOrNot() {
        println("----------Prime Number or Not----------")

        val bil: Int
        var cek = 0
        var i = 2
        val input = Scanner(System.`in`)

        print("Enter the number : ")
        bil = input.nextInt()

        while (i < bil) {
            if (bil % i == 0) {
                cek++
            }
            i++
        }
        if (cek == 0) {
            println("$bil is prime number")
        } else {
            println("$bil is not prime number")
        }
        println()
    }

    fun positiveOrNegativefNumbers(){
        println("----------Check Positive Number or Negative----------")

        val nilai: Int
        val input = Scanner(System.`in`)

        print("Enter the number : ")
        nilai = input.nextInt()
        if (nilai > 0) {
            println("$nilai is Positive")
        } else if (nilai < 0) {
            println("$nilai is Negative")
        }
        println()
    }

}

fun main() {
    val intershipTest = IntershipTest()

    intershipTest.helloWorld()
    intershipTest.sumOfTenNumbers()
    intershipTest.primeOrNot()
    intershipTest.positiveOrNegativefNumbers()

}