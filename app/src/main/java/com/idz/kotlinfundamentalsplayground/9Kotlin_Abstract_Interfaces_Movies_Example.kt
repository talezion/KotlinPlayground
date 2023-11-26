
/**
 * Kotlin Abstract Classes and Interfaces offer a way to define contracts that other classes can implement or inherit.
 * Abstract classes can have both abstract (unimplemented) and non-abstract (implemented) members.
 * Interfaces can contain abstract methods and property definitions, and since Kotlin 1.4, they can also contain implementations.
 * This file demonstrates various uses of abstract classes and interfaces, along with Java and Swift comparisons.
 * The examples are themed around movies to make them more engaging and understandable.
 */

// Abstract class example
// Java: abstract class Movie { abstract void play(); }
// Swift: protocol Movie { func play() }
abstract class AbstractMovie {
    abstract fun play()
    fun getDescription() = "This is a movie"
}

// Implementing an abstract class
class ActionMovie : AbstractMovie() {
    override fun play() = println("Action movie playing")
}

// Interface with properties and methods
// Java: interface MovieDetails { String getGenre(); void setGenre(String genre); }
// Swift: protocol MovieDetails { var genre: String { get set } }
interface InterfaceMovieDetails {
    var genre: String
    fun displayDetails()
}

// Implementing an interface
class ComedyMovie(override var genre: String) : InterfaceMovieDetails {
    override fun displayDetails() = println("Genre: $genre")
}

// Interface with a generic type
// Java: interface Review<T> { void review(T item); }
// Swift: protocol Review { associatedtype T; func review(_ item: T) }
interface Review<T> {
    fun review(item: T)
}

// Implementing a generic interface
class GenericMovieReview : Review<AbstractMovie> {
    override fun review(item: AbstractMovie) = println("Reviewing movie $item")
}

// Abstract class with annotations
@Deprecated("Use new Movie system")
abstract class AbstractOldMovie {
    abstract fun playOldMovie()
}

fun main() {
    // Instantiating and using a class that implements an abstract class
    val actionMovie = ActionMovie()
    actionMovie.play()
    println(actionMovie.getDescription())

    // Instantiating and using a class that implements an interface
    val comedyMovie = ComedyMovie("Comedy")
    comedyMovie.displayDetails()

    // Using a class that implements a generic interface
    val movieReview = GenericMovieReview()
    movieReview.review(actionMovie)
}
