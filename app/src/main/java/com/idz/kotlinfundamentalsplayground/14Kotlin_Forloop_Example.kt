package com.idz.kotlinfundamentalsplayground

fun main() {
    // Example 1: Basic range iteration for transaction confirmations
    for (confirmations in 1..5) {
        println("Confirmation count: $confirmations") // Output confirmation numbers 1 to 5
    }

    // Example 2: Range with step to monitor block heights
    for (blockHeight in 1..20 step 5) {
        println("Monitoring block at height: $blockHeight") // Outputs 1, 6, 11, 16
    }

    // Example 3: Downward range iteration for transaction countdown
    for (secondsLeft in 10 downTo 1) {
        println("Seconds left for transaction confirmation: $secondsLeft") // Outputs countdown from 10 to 1
    }

    // Example 4: Array iteration for list of cryptocurrencies
    val cryptos = arrayOf("Bitcoin", "Ethereum", "Solana")
    for (crypto in cryptos) {
        println("Tracking crypto: $crypto") // Outputs each cryptocurrency name
    }

    // Example 5: List iteration with index for wallet addresses
    val wallets = listOf("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa", "1JHGvM8BCdsWx6LT2eQvF7Ps2TiU3P3pR")
    for ((index, wallet) in wallets.withIndex()) {
        println("Wallet $index: $wallet") // Outputs each wallet with index
    }

    // Example 6: Map iteration for crypto prices
    val cryptoPrices = mapOf("Bitcoin" to 58000, "Ethereum" to 1800)
    for ((crypto, price) in cryptoPrices) {
        println("Crypto: $crypto, Price: $$price") // Outputs each crypto and price
    }

    // Example 7: Loop with range check (until) for processing blocks
    for (block in 0 until 5) {
        println("Processing block number: $block") // Outputs block numbers 0 to 4, stops before 5
    }

    // Example 8: Nested loop with labels for transaction batches
    outer@ for (batch in 1..3) {
        inner@ for (transaction in 1..3) {
            if (batch == transaction) continue@outer // Skip to next batch if batch == transaction
            println("Batch $batch, Processing transaction $transaction")
        }
    }
}