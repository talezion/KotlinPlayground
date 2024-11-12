/**
 * Kotlin provides the 'companion object' feature to implement the Singleton pattern in a class.
 * This file demonstrates the usage of companion objects in a blockchain context.
 */

class TransactionLogger {
    private val transactions: MutableList<String> = mutableListOf()

    fun logTransaction(transactionId: String) {
        transactions.add(transactionId)
        println("Transaction logged: $transactionId")
    }

    companion object {
        // Singleton instance
        val instance = TransactionLogger()

        fun displayLog() {
            println("Displaying all logged transactions:")
            instance.transactions.forEach { println(it) }
        }
    }
}

class BlockchainNetwork {
    var networkStatus: String = "Inactive"

    fun activateNetwork() {
        networkStatus = "Active"
        println("Blockchain network activated.")
    }

    companion object {
        // Singleton instance for network control
        val instance = BlockchainNetwork()
    }
}

fun main() {
    // Using TransactionLogger singleton to log transactions
    TransactionLogger.instance.logTransaction("tx12345")
    TransactionLogger.instance.logTransaction("tx67890")
    TransactionLogger.displayLog() // Displaying the transaction log

    // Using BlockchainNetwork singleton to manage network state
    BlockchainNetwork.instance.activateNetwork()
    println("Current network status: ${BlockchainNetwork.instance.networkStatus}")
}