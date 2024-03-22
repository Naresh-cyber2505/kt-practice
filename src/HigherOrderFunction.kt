
// concept of higher-order functions in Kotlin.


/*In this example, the calculate function is a higher-order function that accepts two Int parameters
and a function named operation as its third parameter. The operation parameter
is a lambda expression that performs a specific operation on the input parameters (e.g., a + b).
The higher-order function then invokes the operation function with the provided arguments 5 and 3,
resulting in a value of 8. Higher-order functions facilitate flexible and concise code,
particularly when combined with lambda expressions.*/

fun main(){

    val res = calculator(15,6) {a, b -> a - b}

    println(res)//9
}


fun calculator(a : Int, y : Int, operation : (Int, Int) -> Int): Int {
    return operation(a,y)
}