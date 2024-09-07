fun main(args: Array<String>) {
    // Character accurrence in a sentence analysis
    // the string that we want to anlyze

    var s = "A programer gets stuck in the shower because the intructions on the shampoo: Lather, Wash, and Repeat."

    println(s)
    s = s.toLowerCase()

    // counter initialization
    var vowelCount = 0
    var consonantCount = 0

    // definition of charecter grups
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    // main loop
    for (c in s) {
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }
    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other character: ${s.length - (vowelCount + consonantCount)}")
}