/**
 * In Kotlin, anonymous objects are often used to create one-time use instances of an abstract class or interface.
 * This file provides a simpler example of using anonymous objects in a blockchain context.
 */

// Defining a simple interface
interface TransactionObserver {
    fun observe(transactionId: String)
}

fun main() {
    // Creating an anonymous object implementing the TransactionObserver interface
    val transactionLogger = object : TransactionObserver {
        override fun observe(transactionId: String) {
            println("Transaction observed with ID: $transactionId")
        }
    }

    // Using the anonymous object
    transactionLogger.observe("tx12345")

    // Another anonymous object for immediate handling of a transaction
    val transactionHandler = object : TransactionObserver {
        override fun observe(transactionId: String) {
            println("Handling transaction with ID: $transactionId")
            println("Transaction status: Confirmed")
        }
    }

    transactionHandler.observe("tx67890")
}