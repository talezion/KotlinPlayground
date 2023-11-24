import java.util.Date

/**
 * Kotlin provides a concise and powerful syntax for defining classes and constructors.
 * This includes primary constructors, secondary constructors, and data classes.
 * This file uses a movie-themed example to illustrate these concepts in Kotlin, with Java and Swift comparisons.
 */

// Defining a simple class with a primary constructor
// Java: class Movie { String title; Movie(String title) { this.title = title; } }
// Swift: class Movie { var title: String; init(title: String) { self.title = title } }
class Movie(val title: String)
//class Movie @Deprecated("Use EnhancedMovie class instead") private constructor(val title: String)
//class Movie constructor(val title: String)

// Using a secondary constructor
// Java & Swift: Secondary constructors are handled similarly in both languages
class MovieWithDirector(val title: String) {
    lateinit var director: String

    // Primary constructor
    constructor(title: String, director: String) : this(title) {
        this.director = director
    }
}



// Class with secondary constructor and visibility modifier
class MovieWithReleaseDate(val title: String) {
    var releaseDate: Date? = null

    // Secondary constructor with visibility modifier
    internal constructor(title: String, releaseDate: Date) : this(title) {
        this.releaseDate = releaseDate
    }
}

// Data class: Provides a concise way to create classes that just hold data
// Data class features: Automatically generated toString(), equals(), hashCode(), and copy() methods
// Java: Typically involves creating a class with private fields, public getters, and a constructor
// Swift: Similar concept with struct
data class MovieDetails(val title: String, val director: String, val year: Int)

// Data class with default values and named parameters
//data class MovieDetails(val title: String, val year: Int = 2020, val genre: String = "Drama")

// Data class with various instantiation methods
//data class MovieDetails(val title: String, val year: Int, val genre: String)


// Class with annotated constructor
@Deprecated("Use new Movie class", replaceWith = ReplaceWith("Movie"))
class OldMovie {
    var title: String

    // Annotated constructor
    constructor(title: String) {
        this.title = title
    }
}

fun main() {
    // Creating instances of classes
    val inception = Movie("Inception")
    val interstellar = MovieWithDirector("Interstellar", "Christopher Nolan")
    val movieDetails = MovieDetails("Inception", "Christopher Nolan", 2010)
    //val movieDetails = MovieDetails(title = "Interstellar", year = 2014, genre = "Sci-Fi")

    // Data class features: Automatically generated toString(), equals(), hashCode(), and copy() methods
    val copiedMovieDetails = movieDetails.copy()

    // Instantiating using secondary constructor
    val movieWithReleaseDate = MovieWithReleaseDate("Inception", Date())

    println("Movie: ${movieWithReleaseDate.title}, Released on: ${movieWithReleaseDate.releaseDate}")
    // println("Details: ${movieDetails.title}, Year: ${movieDetails.year}, Genre: ${movieDetails.genre}")


    // Using annotated constructor
    val oldFilm = OldMovie("Classic Movie")



    // Print details
    println(inception.title)
    println(interstellar.title + " directed by " + interstellar.director)
    println(oldFilm.title)

//    println("Details: " + movieDetails.title + ", " + movieDetails.year + ", " + movieDetails.genre)

    createAndPrintMovieDetails()
}

// Data class with named parameters
fun createAndPrintMovieDetails() {
    val dataInception = MovieDetails(title = "Inception", director = "Phill Collins", year = 2010)
    val inception = Movie("Inception")
    println("Class: $inception")
    println("Data: $dataInception")
}

/*
*Kotlin Secondary Constructors
* - Secondary constructors in Kotlin are additional constructors a class can have besides the primary constructor.
- Each secondary constructor must delegate to the primary constructor, either directly or indirectly through another secondary constructor.
- Secondary constructors are useful when you need to provide additional ways to instantiate a class with different parameters.

* Swift Convenience Initializers
- Convenience initializers in Swift are secondary initializers for a class that must call another initializer (a designated initializer) from the same class.
- They are used to create a shortcut or more specific ways to initialize the class, often with fewer or differently processed parameters.
- Convenience initializers always end up calling a designated initializer of the class.

* Comparison
- Purpose: Both Kotlin's secondary constructors and Swift's convenience initializers provide alternative ways to create instances of a class.
- Delegation: In Kotlin, secondary constructors delegate to the primary constructor. In Swift, convenience initializers delegate to a designated initializer, which could be the primary initializer or another initializer marked with the init keyword.
- Flexibility: Kotlin's secondary constructors can directly initialize class properties if they don't delegate those properties to the primary constructor. In Swift, convenience initializers cannot directly set properties; they must delegate to another initializer that does.
- Inheritance: In Swift, subclasses can inherit convenience initializers under certain conditions, which is not the case with Kotlin's secondary constructors.
* */
