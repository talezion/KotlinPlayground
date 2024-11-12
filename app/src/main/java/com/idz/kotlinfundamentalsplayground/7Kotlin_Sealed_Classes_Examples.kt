/**
 * Sealed classes in Kotlin are used to represent a restricted set of types.
 * Each type can be represented as a subclass of the sealed class, which can be a regular class, a data class, or an object.
 * This allows for more expressive and safer type hierarchies.
 * Below are various examples of sealed classes and their usage in 'when' expressions in the context of blockchain.
 */

// Example 1: Basic Usage of Sealed Class
sealed class TransactionResponse
class Success(val transactionId: String) : TransactionResponse()
class Failure(val error: String) : TransactionResponse()

fun handleResponse(response: TransactionResponse) {
    when (response) {
        is Success -> println("Success: ${response.transactionId}")
        is Failure -> println("Error: ${response.error}")
        else -> {}
    }
}

// Example 2: Sealed Class with Object Declaration
sealed class NetworkState {
    data object Syncing : NetworkState()
    class Synced(val blockData: String) : NetworkState()
    data object SyncError : NetworkState()
}

fun displayState(state: NetworkState) {
    when (state) {
        is NetworkState.Syncing -> {
            println("Syncing blockchain...")
        }
        is NetworkState.Synced -> {
            println("Block data: ${state.blockData}")
        }
        is NetworkState.SyncError -> {
            println("An error occurred during sync")
        }

        else -> {}
    }
}

// Example 3: Sealed Class with Properties and Methods
sealed class TransactionStatus {
    abstract fun getStatusDescription(): String

    data object Confirmed : TransactionStatus() {
        override fun getStatusDescription() = "Transaction is confirmed"
    }

    data object Pending : TransactionStatus() {
        override fun getStatusDescription() = "Transaction is pending confirmation"
    }

    data object Rejected : TransactionStatus() {
        override fun getStatusDescription() = "Transaction was rejected"
    }
}

fun checkTransactionStatus(status: TransactionStatus) {
    when (status) {
        is TransactionStatus.Confirmed -> println(status.getStatusDescription())
        is TransactionStatus.Pending -> println(status.getStatusDescription())
        is TransactionStatus.Rejected -> println(status.getStatusDescription())
        else -> println("Unknown status")
    }
}

// Example 4: Nested Sealed Classes
sealed class BlockchainEvent {
    class BlockMined(val blockHash: String) : BlockchainEvent()
    sealed class NetworkUpdate : BlockchainEvent() {
        data object HardFork : NetworkUpdate()
        data object SoftFork : NetworkUpdate()
    }
}

fun describeEvent(event: BlockchainEvent) {
    when (event) {
        is BlockchainEvent.BlockMined -> println("Block mined with hash: ${event.blockHash}")
        is BlockchainEvent.NetworkUpdate.HardFork -> println("Network update: Hard Fork")
        is BlockchainEvent.NetworkUpdate.SoftFork -> println("Network update: Soft Fork")
        else -> println("No event")
    }
}

// Example 5: Sealed Class with Data Class
sealed class TransactionReview
data class PositiveReview(val comment: String) : TransactionReview()
data class NegativeReview(val comment: String) : TransactionReview()
data object NoReview : TransactionReview()

fun displayReview(review: TransactionReview) {
    when (review) {
        is PositiveReview -> println("Positive review: ${review.comment}")
        is NegativeReview -> println("Negative review: ${review.comment}")
        is NoReview -> println("No review available")
        else -> println("No review")
    }
}

fun main() {
    // Execute examples
    handleResponse(Success("tx12345"))
    displayState(NetworkState.Syncing)
    checkTransactionStatus(TransactionStatus.Confirmed)
    describeEvent(BlockchainEvent.BlockMined("0000000000000000000767fa4d9b7c0b50bb8f8a03bc3c8a91b4ea3ccebc30ef"))
    displayReview(PositiveReview("Transaction completed successfully"))
}