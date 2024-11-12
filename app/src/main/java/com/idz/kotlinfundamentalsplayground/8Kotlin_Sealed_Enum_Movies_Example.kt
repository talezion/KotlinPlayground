/**
 * Kotlin's Sealed Classes and Enum Classes offer specialized ways to represent restricted class hierarchies.
 * Sealed classes define a closed set of subclasses, while Enum classes are for enumerations.
 * This file uses blockchain and cryptocurrency concepts to illustrate these ideas in Kotlin.
 */

// Enum Class: Enumerates a set of constants (e.g., types of transactions)
enum class TransactionType {
    DEPOSIT, WITHDRAWAL, TRANSFER, STAKE
}

// Demonstrates usage of the TransactionType enum
fun describeTransaction(type: TransactionType) {
    when (type) {
        TransactionType.DEPOSIT -> println("Processing a deposit transaction.")
        TransactionType.WITHDRAWAL -> println("Processing a withdrawal transaction.")
        TransactionType.TRANSFER -> println("Processing a transfer transaction.")
        TransactionType.STAKE -> println("Processing a staking transaction.")
    }
}

// Sealed Class: Defines a set of possible blockchain states
sealed class BlockchainStatus {
    data object Active : BlockchainStatus()
    data object Inactive : BlockchainStatus()
    data class Syncing(val progress: Int) : BlockchainStatus() // Sync progress as percentage
}

// Function to display blockchain status using a sealed class
fun displayBlockchainStatus(status: BlockchainStatus) {
    when (status) {
        is BlockchainStatus.Active -> println("Blockchain is active and operational.")
        is BlockchainStatus.Inactive -> println("Blockchain is inactive.")
        is BlockchainStatus.Syncing -> println("Blockchain is syncing. Progress: ${status.progress}%")
        else -> {}
    }
}

fun main() {
    // Example usage of TransactionType enum
    describeTransaction(TransactionType.DEPOSIT)
    describeTransaction(TransactionType.WITHDRAWAL)

    // Example usage of BlockchainStatus sealed class
    displayBlockchainStatus(BlockchainStatus.Active)
    displayBlockchainStatus(BlockchainStatus.Syncing(45))
    displayBlockchainStatus(BlockchainStatus.Inactive)
}