
/**
 * Sealed classes in Kotlin are used to represent a restricted set of types. 
 * Each type can be represented as a subclass of the sealed class, which can be a regular class, a data class, or an object.
 * This allows for more expressive and safer type hierarchies.
 * Below are various examples of sealed classes and their usage in 'when' expressions.
 */

// Example 1: Basic Usage of Sealed Class
sealed class MovieResponse
class Success(val movieTitle: String) : MovieResponse()
class Failure(val error: String) : MovieResponse()

fun handleResponse(response: MovieResponse) {
    when (response) {
        is Success -> println("Success: ${response.movieTitle}")
        is Failure -> println("Error: ${response.error}")
        else -> println("Unknown")
    }
}

// Example 2: Sealed Class with Object Declaration
sealed class NetworkState
object Loading : NetworkState()
class Loaded(val content: String) : NetworkState()
object Error : NetworkState()

fun displayState(state: NetworkState) {
    when (state) {
        is Loading -> println("Loading...")
        is Loaded -> println("Content: ${state.content}")
        is Error -> println("An error occurred")
        else -> println("Unknown state")
    }
}

// Example 3: Sealed Class with Properties and Methods
sealed class MovieRating {
    abstract fun getRatingDescription(): String

    class Good : MovieRating() {
        override fun getRatingDescription() = "Highly recommended"
    }

    class Average : MovieRating() {
        override fun getRatingDescription() = "Decent but not outstanding"
    }

    class Poor : MovieRating() {
        override fun getRatingDescription() = "Below expectations"
    }
}

fun rateMovie(rating: MovieRating) {
    when (rating) {
        is MovieRating.Good -> println(rating.getRatingDescription())
        is MovieRating.Average -> println(rating.getRatingDescription())
        is MovieRating.Poor -> println(rating.getRatingDescription())
        else -> println("Unknown rating")
    }
}

// Example 4: Nested Sealed Classes
sealed class MovieEvent {
    class Premiere(val movie: String) : MovieEvent()
    sealed class Award : MovieEvent() {
        class Oscar : Award()
        class GoldenGlobe : Award()
    }
}

fun describeEvent(event: MovieEvent) {
    when (event) {
        is MovieEvent.Premiere -> println("Premiere of ${event.movie}")
        is MovieEvent.Award.Oscar -> println("Oscar award event")
        is MovieEvent.Award.GoldenGlobe -> println("Golden Globe award event")
        else -> println("No event")
    }
}

// Example 5: Sealed Class with Data Class
sealed class MovieReview
data class PositiveReview(val comment: String) : MovieReview()
data class NegativeReview(val comment: String) : MovieReview()
object NoReview : MovieReview()

fun displayReview(review: MovieReview) {
    when (review) {
        is PositiveReview -> println("Positive: ${review.comment}")
        is NegativeReview -> println("Negative: ${review.comment}")
        is NoReview -> println("No review available")
        else -> println("No review")
    }
}

fun main() {
    // Execute examples
    handleResponse(Success("Inception"))
    displayState(Loading)
    rateMovie(MovieRating.Good())
    describeEvent(MovieEvent.Premiere("Dune"))
    displayReview(PositiveReview("A masterpiece of modern cinema"))
}
