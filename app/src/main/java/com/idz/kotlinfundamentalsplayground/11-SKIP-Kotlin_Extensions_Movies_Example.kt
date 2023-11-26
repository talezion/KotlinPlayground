
/**
 * Kotlin's extension functions allow you to add new functions to existing classes without modifying them.
 * This file demonstrates the usage of extension functions with a movie-themed context.
 * In Java and Swift, similar functionality is achieved differently, as they don't support extension functions natively.
 */

class EXMovie(val title: String, var rating: Int)

// Extension function for the Movie class
// Java: Typically achieved through helper classes with static methods.
// Swift: Similar concept with 'extension' keyword.
fun EXMovie.isHighlyRated(): Boolean = this.rating >= 8

// Extension property
// Java: Not directly supported; use getter methods in utility classes.
// Swift: Similar concept with 'extension' to add computed properties.
val EXMovie.yearOfRelease: Int
    get() = if (title.contains("Inception")) 2010 else 2020

fun main() {
    val inception = EXMovie("Inception", 9)
    val interstellar = EXMovie("Interstellar", 8)
    val movies = listOf(inception, interstellar)

    // Using the extension function
    if (inception.isHighlyRated()) {
        println("${inception.title} is highly rated.")
    }

    // Using the extension property
    println("${inception.title} was released in ${inception.yearOfRelease}")
}
