/**
 * Kotlin provides a variety of collection types, including both immutable and mutable versions.
 * - listOf, setOf, and mapOf create immutable collections.
 * - ArrayList, mutableListOf, mutableSetOf, and mutableMapOf create mutable collections.
 * This file demonstrates various ways to use these collections, now in a blockchain and cryptocurrency context.
 */

fun main() {
    // Immutable List representing a set of blockchain network names
    val blockchainNetworks = listOf("Bitcoin", "Ethereum", "Solana", "Cardano")
    println("Blockchain Networks: $blockchainNetworks")

    // Mutable ArrayList of transaction IDs (e.g., for tracking recent transactions)
    val transactionIds = ArrayList<String>()
    transactionIds.add("tx123")
    transactionIds.add("tx456")
    transactionIds.add("tx789")
    transactionIds.add("tx101") // Adding a new transaction
    println("Transaction IDs (ArrayList): $transactionIds")

    // Immutable Set of unique crypto wallet addresses
    val walletAddresses = setOf("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa", "1JHGvM8BCdsWx6LT2eQvF7Ps2TiU3P3pR", "3H8yU7CD4dKsF8fhSjk7Z")
    println("Unique Wallet Addresses: $walletAddresses")

    // Mutable Set for storing mined block hashes (no duplicates allowed)
    val minedBlocks = mutableSetOf("0000000000000000000a1b2c3d4e5f6g", "0000000000000000007e8f9a0b1c2d3e")
    minedBlocks.add("0000000000000000004a5b6c7d8e9f0g") // Adding a new block hash
    println("Mined Blocks: $minedBlocks")

    // Immutable Map for associating wallet addresses with account balances
    val walletBalances = mapOf(
        "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa" to 1.2345,
        "1JHGvM8BCdsWx6LT2eQvF7Ps2TiU3P3pR" to 0.5678,
        "3H8yU7CD4dKsF8fhSjk7Z" to 2.3456
    )
    println("Wallet Balances: $walletBalances")

    // Mutable Map for tracking recent block confirmations (block hash to confirmation count)
    val blockConfirmations = mutableMapOf(
        "0000000000000000000a1b2c3d4e5f6g" to 100,
        "0000000000000000007e8f9a0b1c2d3e" to 75
    )
    blockConfirmations["0000000000000000004a5b6c7d8e9f0g"] = 50 // Adding a new block with confirmations
    println("Block Confirmations: $blockConfirmations")
}