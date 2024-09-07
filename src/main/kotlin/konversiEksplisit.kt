fun main(args: Array<String>) {
    // Doubler program parsing

    println("enter a number and I'II double it: ")
    val input = readLine()!!
    var a = input.toInt() // eventually Double
    a = a * 2
    println(a)

    println("Enter a number, and I'II square it: ")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: " + square)

}