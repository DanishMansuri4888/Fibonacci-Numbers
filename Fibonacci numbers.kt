fun fibonacci(n: Int): Int {
    return if (n <= 1) n else fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    println("Enter the number of Fibonacci terms to print:")
    val n = readLine()?.toIntOrNull() ?: 0

    println("The first $n Fibonacci numbers are:")
    for (i in 0 until n) {
        print("${fibonacci(i)} ")
    }
}

