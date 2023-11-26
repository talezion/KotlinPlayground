
/**
 * In Kotlin, anonymous objects are often used to create one-time use instances of an abstract class or interface.
 * This file provides a simpler example of using anonymous objects with a movie-themed context.
 * Java and Swift have similar concepts, though implemented differently.
 */

// Defining a simple interface
// Java & Swift: Similar concept of defining an interface or protocol.
interface MovieWatcher {
    fun watch(movie: String)
}

fun main() {
    // Creating an anonymous object
    // Java: MovieWatcher watcher = new MovieWatcher() { public void watch(String movie) { System.out.println("Watching " + movie); } };
    // Swift: Not directly supported, but similar behavior can be achieved with closures or protocol conformances.
    val watcher = object : MovieWatcher {
        override fun watch(movie: String) {
            println("Watching $movie")
        }
    }

    // Using the anonymous object
    watcher.watch("Inception")
    
    // Anonymous object without conforming to an interface
    // Java: Similar concept using anonymous class
    // Swift: Closures or structs are typically used instead
    val anonymousReviewer = object {
        fun review(movie: String) = "$movie was enjoyable!"
    }

    println(anonymousReviewer.review("Interstellar"))
}

// Sample Movie class for demonstration
data class AnonMovie(val title: String, val rating: Int)
