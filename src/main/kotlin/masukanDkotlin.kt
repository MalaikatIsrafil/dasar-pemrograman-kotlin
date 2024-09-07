fun main(args: Array<String>) {
    //parrot program
    println("hi I'am Lora, the virtual parrot, and i love to repeat!");
    println("type something in: ");

    var input: String
    input = readLine()!!

    var output: String
    output = input + "," + input + "!"
    println(output)
}