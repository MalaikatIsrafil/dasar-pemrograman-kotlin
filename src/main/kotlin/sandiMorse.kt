fun main(args: Array<String>) {

    // split() and joinToString()
    // Morse code decoder
    // the string which we want to decode

    val  s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")

    // the string with the decoded message
    var message = ""

    // array definitions
    val alphabetChar = "acbdefghijklmnopqrstuvwxyz"
    val morseChar = arrayOf(".-", "-...", "-.-.", "-..", ".","..-.", "--.", "....","..", ".---",
        "-.-",".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

    // splitting the string into morse character
    var characters = s.split(" ")

    // interating over morse characters
    for (morseChar in characters) {

        val index = morseChar.indexOf(morseChar)
        // character was found

        if (index != -1){
            message += alphabetChar[index]


        }
    }
    println("The decoded messsage: $message")



}