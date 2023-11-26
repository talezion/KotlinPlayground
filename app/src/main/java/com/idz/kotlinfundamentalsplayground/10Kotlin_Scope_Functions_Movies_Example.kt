
/**
 * Kotlin's scope functions ('let', 'run', 'with', 'apply', and 'also') are used to execute code within the context of an object.
 * They differ in how they refer to the context object and what they return.
 * This file demonstrates the usage of these scope functions with a movie-themed context.
 * Java and Swift don't have direct equivalents but similar behavior can be achieved with different constructs.
 */

class SFMovie(var title: String, var director: String, var year: Int)

fun main() {
    val movie = SFMovie("Inception", "Christopher Nolan", 2010)

    // 'let' is used for executing a block of code and returning the result. It refers to the context object using 'it'.
    // Java & Swift: Similar to using an object within a block and returning a value.
    val titleLength = movie.let {
        println("Title: ${it.title}")
        it.title.length // Returns the length of the title
    }

    // 'run' is similar to 'let' but refers to the context object using 'this'.
    // Java & Swift: Similar to using an object within a block and returning a value.
    val movieInfo = movie.run {
        "Movie: $title, Directed by $director, Released in $year"
    }

    // 'with' is used to configure an object. It's not an extension like 'let' or 'run', so the context object is passed as an argument.
    // Java & Swift: Similar to setting multiple properties of an object within a block.
    with(movie) {
        title = "Interstellar"
        director = "Christopher Nolan"
        year = 2014
    }

    // 'apply' is used for configuring an object and returns the context object.
    // Java & Swift: Similar to setting multiple properties of an object within a block and then returning the object.
    val updatedMovie = movie.apply {
        title = "Dunkirk"
    }

    // 'also' is used for additional operations that don't alter the object. It refers to the context object using 'it' and returns the object.
    // Java & Swift: Similar to performing operations on an object and then returning the object.
    movie.also {
        println("Updated movie: ${it.title}")
    }

    println("Title Length: $titleLength")
    println("Movie Info: $movieInfo")
    println("Updated Movie: ${updatedMovie.title}")
}
