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

    fun lowertoUpper() {
        println("----------Program Lower Case to Upper Case----------")

        print("Input the word : ")
        val input = Scanner(System.`in`).nextLine()
        val result = input.uppercase()

        println(result)
        println()
    }

    fun findThe9thChar() {
        println("----------Find the 9th Char of a Given String----------")
        print("Input the word : ")
        val word = Scanner(System.`in`).nextLine()

        println("the 9th char of the word $word is = ${word[9]}")
        println()
    }

    fun printCharNewLine() {
        println("----------Char in New Line----------")
        print("Input the word : ")
        val input = Scanner(System.`in`).nextLine()

        for (i in input) {
            println(i)
        }
        println()
    }

    fun printLowtInteger() {
        println("----------lowest integer from array ----------")
        println("Array of numbers: {5,9,13,43,2,7}")

        val array = arrayOf(5, 9, 13, 43, 2, 7)
        val result = array.toList()

        println("Lowest integer in arraay is = ${result.min()}")
    }

    fun sumNumberinArray() {
        println("----------Sum the numbers in array ----------")
        println("Array of numbers: {5,9,13,43,2,7}")

        val array = arrayOf(5, 9, 13, 43, 2, 7)
        var result = 0

        for (i in array) {
            result+= i
        }
        println("result: $result")
    }

    fun printArrayAscending() {
        println("----------Print array to sort ascending----------")
        println("Array of numbers: {5,9,13,43,2,7}")

        val array = arrayOf(5, 9, 13, 43, 2, 7)
        val result = Array(array.size, {0})
        for (i in 0 until array.size) {
            result[i] = array[i]
        }
        result.sort()
        println("result: {${result.joinToString(", ")}}")
        println()
    }

}

fun main() {
    val intershipTest = IntershipTest()

    intershipTest.helloWorld()
    intershipTest.sumOfTenNumbers()
    intershipTest.primeOrNot()
    intershipTest.positiveOrNegativefNumbers()
    intershipTest.lowertoUpper()
    intershipTest.findThe9thChar()
    intershipTest.printCharNewLine()
    intershipTest.printLowtInteger()
    intershipTest.sumNumberinArray()
    intershipTest.printArrayAscending()
}