/**
 * Kotlin Abstract Classes and Interfaces offer a way to define contracts that other classes can implement or inherit.
 * Abstract classes can have both abstract (unimplemented) and non-abstract (implemented) members.
 * Interfaces can contain abstract methods and property definitions, and since Kotlin 1.4, they can also contain implementations.
 * This file demonstrates various uses of abstract classes, interfaces, and generics in a blockchain context.
 */

// Abstract Class: Defines a blueprint for blockchain entities
abstract class BlockchainEntity(val id: String) {
    abstract fun validate(): Boolean // Abstract method to validate the entity
    open fun displayId() {
        println("Blockchain Entity ID: $id")
    }
}

// Concrete class inheriting from BlockchainEntity
class Block2(id: String, val hash: String) : BlockchainEntity(id) {
    override fun validate() = hash.startsWith("0000") // A simple validation rule for demo purposes
    override fun displayId() {
        println("Block ID: $id with Hash: $hash")
    }
}

// Interface defining transaction processing methods
interface TransactionProcessor {
    fun processTransaction(amount: Double): Boolean // Abstract method
    fun cancelTransaction(transactionId: String) {
        println("Transaction $transactionId has been canceled.")
    }
}

// Implementing the TransactionProcessor interface in Wallet class
class Wallet3(id: String, private var balance: Double) : BlockchainEntity(id), TransactionProcessor {
    override fun validate() = balance >= 0 // A wallet is valid if balance is non-negative

    override fun processTransaction(amount: Double): Boolean {
        return if (amount <= balance) {
            balance -= amount
            println("Processed transaction of $amount. Remaining balance: $balance")
            true
        } else {
            println("Insufficient balance.")
            false
        }
    }
}

// Generic class for handling different types of blockchain responses
class ResponseHandler<T> {
    fun handleResponse(response: T) {
        println("Handling response: $response")
    }
}

fun main() {
    // Creating and validating a Block
    val genesisBlock = Block2("blk123", "00001234abcd5678")
    genesisBlock.displayId()
    println("Is Genesis Block valid? ${genesisBlock.validate()}")

    // Creating a Wallet and processing a transaction
    val wallet = Wallet3("wallet123", 500.0)
    wallet.displayId()
    wallet.processTransaction(150.0)
    wallet.cancelTransaction("tx5678")

    // Validating Wallet
    println("Is Wallet valid? ${wallet.validate()}")

    // Using the generic ResponseHandler with a String type
    val responseHandler = ResponseHandler<String>()
    responseHandler.handleResponse("Transaction Completed")

    // Using the generic ResponseHandler with a Wallet type
    val walletHandler = ResponseHandler<Wallet3>()
    walletHandler.handleResponse(wallet)
}