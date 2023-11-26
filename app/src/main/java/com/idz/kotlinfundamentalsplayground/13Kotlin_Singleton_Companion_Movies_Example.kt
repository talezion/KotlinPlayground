
/**
 * Kotlin provides the 'companion object' feature to implement the Singleton pattern in a class.
 * This file demonstrates the usage of companion objects with a movie-themed context.
 * Java and Swift implement singletons differently.
 */

class MovieDatabase {
    var movies: MutableList<String> = mutableListOf()

    fun addMovie(movie: String) {
        movies.add(movie)
    }

    companion object {
        // Singleton instance
        // Java: Similar concept with a private static instance and a public static getInstance() method.
        // Swift: Similar concept using 'static let sharedInstance = MovieDatabase()'
        val instance = MovieDatabase()
    }
}

fun main() {
    // Accessing the singleton instance
    val db = MovieDatabase.instance

    // Using the instance to perform operations
    db.addMovie("Inception")
    db.addMovie("Interstellar")

    println("Movies in the database: ${db.movies}")
}
