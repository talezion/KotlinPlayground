/**
 * Kotlin is a modern, statically typed programming language used for developing Android apps and other applications.
 * Here, we'll explore Kotlin fundamentals through examples relevant to blockchain and cryptocurrency.
 */

fun main() {
    // Integer types representing blockchain data
    val blockSize: Byte = 127 // Byte: Smallest unit for block size, typically 8-bit. Range: -128 to 127
    val transactionCount: Short = 1000 // Short: Transaction count in a block, up to 32,767 transactions.
    val blockHeight: Int = 652314 // Int: Height of a block in the blockchain, represents the position of the block.
    val accountBalance: Long = 7500000000L // Long: Cryptocurrency balance in smallest unit (like satoshis).

    // Floating-point types representing financial values in crypto
    val transactionFee: Float = 0.0015f // Float: Transaction fee percentage, minimal precision.
    val currentPrice: Double = 58943.75 // Double: Current price of cryptocurrency with high precision.

    // Boolean type representing crypto transaction status
    val isConfirmed: Boolean = true // Boolean: Indicates if a transaction is confirmed on the blockchain.

    // Character type representing blockchain operation codes
    val operationCode: Char = 'M' // Char: Operation code, e.g., 'M' for mining or 'T' for transaction.

    // String type representing crypto wallet addresses and block hashes
    val walletAddress: String = "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa" // String: A sample Bitcoin wallet address.
    val blockHash: String = "0000000000000000000767fa4d9b7c0b50bb8f8a03bc3c8a91b4ea3ccebc30ef" // String: Hash of a block in the blockchain.

    // Printing out the values
    println("Block Size: $blockSize")
    println("Transaction Count: $transactionCount")
    println("Block Height: $blockHeight")
    println("Account Balance: $accountBalance")
    println("Transaction Fee: $transactionFee")
    println("Current Price: $currentPrice")
    println("Is Confirmed: $isConfirmed")
    println("Operation Code: $operationCode")
    println("Wallet Address: $walletAddress")
    println("Block Hash: $blockHash")
}