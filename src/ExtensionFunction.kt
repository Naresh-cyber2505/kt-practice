// concept of extension functions in Kotlin.
/*
we define an extension function named addExclamation() for the String class.
This function appends an exclamation mark to the string it's called on.
The extension function can be utilized on any instance of the String class,
such as the message variable. It enhances the string by
appending an exclamation mark, resulting in "Hello!". Extension functions
are a powerful mechanism for adding utility methods or enriching existing
classes with custom functionality.
*/
fun main() {
    println(modifierMessage)
}

fun Int.addExclamation(): String {
    return "$this!"
}

fun String.addExclamation2(): String {
    return "$this!"
}

val message = 1
val modifierMessage = message.addExclamation()



