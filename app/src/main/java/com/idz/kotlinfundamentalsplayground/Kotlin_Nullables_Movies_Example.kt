
/**
 * Kotlin provides a strong system for handling nullability, which helps prevent NullPointerExceptions.
 * In Kotlin, you can declare whether a variable can hold a null value or not.
 * If a variable can hold a null, it is declared with a '?' after the type.
 * This file uses a movie-themed example to illustrate nullability in Kotlin, with Java and Swift comparisons.
 */

fun main() {
    // Nullable String: Can hold a null value
    // Java: String nullableMovie = null; // In Java, all reference types can be null
    // Swift: var nullableMovie: String? = nil // Similar nullable syntax with '?'
    var nullableMovie: String? = "Inception"
    nullableMovie = null // Allowed as it's a nullable variable

    // Non-Nullable String: Cannot hold a null value
    // Java: String nonNullableMovie = "Interstellar"; // In Java, non-null is default but not enforced
    // Swift: var nonNullableMovie: String = "Interstellar" // In Swift, non-null is default
    val nonNullableMovie: String = "Interstellar"
    // nonNullableMovie = null // Uncommenting this line will cause a compilation error

    // Safe call operator (?.): Used to access methods and properties of a nullable object
    // Java & Swift: Requires explicit null check before accessing properties or methods
    val movieLength = nullableMovie?.length // Returns null if nullableMovie is null

    // Elvis operator(?:): Provides a default value if the expression to the left is null
    // Java & Swift: Similar use of ternary operator for null checks
    val movieNameLength = nullableMovie?.length ?: 0 // Defaults to 0 if nullableMovie is null

    // !! operator: Converts a nullable type to a non-nullable type, throwing an exception if the value is null
    // Java & Swift: Forced unwrapping of optional values, may lead to runtime exceptions
    // val nonNullableLength = nullableMovie!!.length // Uncomment to throw NullPointerException if nullableMovie is null
}
