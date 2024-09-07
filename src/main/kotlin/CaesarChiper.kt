fun main(args: Array<String>) {
    // the Caesar cipher
    // variabel intialization

    val s = "blackholesarewheregoddividedbyzero"
    println("Original messege: $s")
    var message = ""
    var shift = 1

    // Loop interating over character
    for (c in s) {
        var i = c.toInt()
        i += shift

        if (i > 'z'.toInt()){
            i -= 26

        }
        val char = i.toChar()
        message += char

    }

    // Printing
    println("Encrypted message: $message")
}