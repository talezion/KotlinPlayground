
/**
 * Kotlin's Sealed Classes and Enum Classes offer specialized ways to represent restricted class hierarchies.
 * Sealed classes define a closed set of subclasses, while Enum classes are for enumerations.
 * This file uses a movie-themed example to illustrate these concepts in Kotlin, with Java and Swift comparisons.
 */

// Enum Class: Enumerates a set of constants (e.g., genres of movies)
// Java: enum Genre { ACTION, COMEDY, DRAMA, FANTASY }
// Swift: enum Genre { case action, comedy, drama, fantasy }
enum class MovieGenre {
    ACTION, COMEDY, DRAMA, THRILLER
}

fun describeGenre(genre: MovieGenre) {
    when (genre) {
        MovieGenre.ACTION -> println("Genre is action-packed")
        MovieGenre.COMEDY -> println("Genre is humorous")
        MovieGenre.DRAMA -> println("Genre is serious and narrative")
        MovieGenre.THRILLER -> println("Genre is suspenseful")
    }
}

// Enum with Properties

enum class MovieRatings(val stars: Int) {
    BAD(1), AVERAGE(3), GOOD(5)
}

fun rateMovie(rating: MovieRatings) {
    when (rating) {
        MovieRatings.BAD -> println("Rating: ${rating.stars} - Poor quality")
        MovieRatings.AVERAGE -> println("Rating: ${rating.stars} - Decent choice")
        MovieRatings.GOOD -> println("Rating: ${rating.stars} - Highly recommended")
    }
}

// Enum with Methods

enum class MovieDuration {
    SHORT, MEDIUM, LONG;

    fun getDescription(): String {
        return when (this) {
            SHORT -> "Under 90 minutes"
            MEDIUM -> "Between 90 and 120 minutes"
            LONG -> "Over 120 minutes"
        }
    }
}


// Enum Iteration

enum class MovieType {
    HORROR, SCI_FI, ROMANCE
}

fun listAllMovieTypes() {
    MovieType.values().forEach { type ->
        when (type) {
            MovieType.HORROR -> println("Horror movies are scary")
            MovieType.SCI_FI -> println("Sci-Fi movies are futuristic")
            MovieType.ROMANCE -> println("Romance movies focus on love stories")
        }
    }
}


fun main() {


    // Working with enum classes
    val genre = MovieGenre.ACTION
    describeGenre(genre)

    rateMovie(MovieRatings.AVERAGE)

    val movieDuration = MovieDuration.LONG
    println("Duration: ${movieDuration.getDescription()}")

    listAllMovieTypes()
}
