fun main() {
    println(modifierMessage)
}

fun Int.addExclamation() : String{
    return "$this!"
}

fun String.addExclamation2() : String{
    return "$this!"
}

val message = 1
val modifierMessage = message.addExclamation()