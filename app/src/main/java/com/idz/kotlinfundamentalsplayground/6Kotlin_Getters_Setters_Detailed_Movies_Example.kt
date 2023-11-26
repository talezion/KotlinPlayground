
/**
 * In Kotlin, getters and setters are used to control how properties are accessed and modified.
 * The 'field' identifier can be used within a getter or setter to refer to the backing field of the property.
 * This file contains various examples of getters and setters with advanced techniques and annotations, using a movie-themed context.
 * Corresponding Java and Swift examples are included in the comments.
 */

class GSMovie(private var _title: String) {

    // Example of a custom getter with 'field'
    // Java: public String getTitle() { return this.title.toUpperCase(); }
    // Swift: var title: String { return self.title.uppercase() }
    var title: String = ""
        get() = field.uppercase()
        set(value) {
            field = value.trim() // Setting the backing field
        }

    // Property with a backing field and custom logic in the setter
    var rating: Int = 0
        get() = field
        set(value) {
            field = if (value in 1..5) value else throw IllegalArgumentException("Rating must be between 1 and 5")
        }

    // Property with an annotated setter
    var category: String = "Sci-Fi"
        @Deprecated("Category is deprecated, use genre instead")
        set(value) {
            field = value
        }
}

// Using a backing field to track changes
class Documentary(var topic: String) {
    private var _timesEdited = 0

    // Property with custom getter and setter using a backing field
    var detailedTopic: String
        get() = "Documentary about $topic"
        set(value) {
            topic = value
            _timesEdited++ // Incrementing the backing field
        }

    // Exposing the times edited through a custom getter
    val timesEdited: Int
        get() = _timesEdited
}

fun main() {
    val movie = GSMovie("Inception")
    println("Original title: ${movie.title}")

    // Using the custom setter
    movie.title = " Interstellar "
    println("Edited title: ${movie.title}")

    // Using a property with a custom setter logic
    movie.rating = 3
    println("Movie rating: ${movie.rating}")

    // Using an annotated setter
    movie.category = "Adventure"
    println("Movie category: ${movie.category}")

    // Working with a documentary
    val doc = Documentary("Space")
    doc.detailedTopic = "Mars"
    doc.detailedTopic = "Moon"
    println("Documentary topic: ${doc.topic}, Edited times: ${doc.timesEdited}")
}
