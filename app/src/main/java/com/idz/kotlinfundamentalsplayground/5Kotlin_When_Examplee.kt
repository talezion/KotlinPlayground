/**
 * This file demonstrates the full capabilities of Kotlin's `when` expression with different data types,
 * tricks, and advanced features in a blockchain context.
 */

enum class NetworkStatus { ACTIVE, INACTIVE, SYNCING }

fun main() {
    // Example 1: Using `when` with a String to handle transaction types
    val transactionType = "DEPOSIT"
    when (transactionType) {
        "DEPOSIT" -> println("Processing a deposit.")
        "WITHDRAWAL" -> println("Processing a withdrawal.")
        "TRANSFER" -> println("Processing a transfer.")
        else -> println("Unknown transaction type.")
    }

    // Example 2: Using `when` with an Enum
    val status = NetworkStatus.SYNCING
    when (status) {
        NetworkStatus.ACTIVE -> println("The network is active.")
        NetworkStatus.INACTIVE -> println("The network is inactive.")
        NetworkStatus.SYNCING -> println("The network is syncing.")
    }

    // Example 3: Using `when` with a range
    val confirmations = 8
    when (confirmations) {
        in 0..5 -> println("Transaction pending with low confirmations.")
        in 6..10 -> println("Transaction almost confirmed.")
        else -> println("Transaction fully confirmed.")
    }

    // Example 4: Combining multiple cases with commas
    val crypto = "Bitcoin"
    when (crypto) {
        "Bitcoin", "Ethereum", "Solana" -> println("This is a popular cryptocurrency.")
        "Dogecoin", "Shiba Inu" -> println("This is a meme coin.")
        else -> println("Unknown cryptocurrency.")
    }

    // Example 5: Using `when` with is for type checking and smart casting
    val block: Any = "0000000000000000000767fa4d9b7c0b50bb8f8a03bc3c8a91b4ea3ccebc30ef" // Could be Any type
    when (block) {
        is String -> println("Block hash: $block")
        is Int -> println("Block height: $block")
        else -> println("Unknown block type.")
    }

    // Example 6: Using `when` as an expression to assign a value
    val transactionAmount = 500.0
    val fee = when {
        transactionAmount < 100 -> 1.0 // 1% fee for small transactions
        transactionAmount < 1000 -> 0.5 // 0.5% fee for medium transactions
        else -> 0.1 // 0.1% fee for large transactions
    }
    println("Transaction fee rate: $fee%")

    // Example 7: Using `when` without an argument for complex conditional checks
    val walletBalance = 100.0
    when {
        walletBalance > 500 -> println("High balance wallet.")
        walletBalance in 100.0..500.0 -> println("Medium balance wallet.")
        walletBalance < 100 -> println("Low balance wallet.")
    }
}