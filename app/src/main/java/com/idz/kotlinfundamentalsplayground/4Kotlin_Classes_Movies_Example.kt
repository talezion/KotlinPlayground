import java.util.Date

/**
 * Kotlin provides a concise and powerful syntax for defining classes and constructors.
 * This includes primary constructors, secondary constructors, and data classes.
 * This file uses a blockchain-themed example to illustrate these concepts in Kotlin.
 */

// Defining a simple class with a primary constructor
class Block(val hash: String) {
    fun printHash() {
        println("Block Hash: $hash")
    }
}

// Using a secondary constructor to add additional initialization for a Transaction class
class Transaction(val transactionId: String) {
    var amount: Double = 0.0
    lateinit var date: Date

    constructor(transactionId: String, amount: Double, date: Date) : this(transactionId) {
        this.amount = amount
        this.date = date
    }

    fun printTransactionDetails() {
        println("Transaction ID: $transactionId, Amount: $amount, Date: $date")
    }
}

// Defining a data class to represent a Wallet
data class Wallet(val address: String, val balance: Double)

fun main() {
    // Creating an instance of Block
    val genesisBlock = Block("0000000000000000000767fa4d9b7c0b50bb8f8a03bc3c8a91b4ea3ccebc30ef")
    genesisBlock.printHash()

    // Creating an instance of Transaction with the secondary constructor
    val transaction = Transaction("tx12345", 0.25, Date())
    transaction.printTransactionDetails()

    // Creating an instance of Transaction with the secondary constructor
    // This wil crash!!
    val transactionCrash = Transaction("tx12345")
    transaction.printTransactionDetails()

    // Creating an instance of Wallet data class
    val wallet = Wallet("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa", 1.2345)
    println("Wallet Address: ${wallet.address}, Balance: ${wallet.balance}")
}