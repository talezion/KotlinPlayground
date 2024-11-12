/**
 * Kotlin's extension functions allow you to add new functions to existing classes without modifying them.
 * This file demonstrates the usage of extension functions in a blockchain context.
 */

class Wallet5(val address: String, var balance: Double)

// Extension function for the Wallet class to display balance in a formatted string
fun Wallet5.displayBalance(): String {
    return "Wallet Balance: $${"%.2f".format(balance)}"
}

// Extension function for the Wallet class to check if balance is above a certain threshold
fun Wallet5.isHighBalance(threshold: Double): Boolean {
    return balance > threshold
}

class Transaction2(val id: String, val amount: Double)

// Extension function for the Transaction class to display a transaction summary
fun Transaction2.summary(): String {
    return "Transaction ID: $id, Amount: $${"%.2f".format(amount)}"
}

fun main() {
    // Using the Wallet extension functions
    val wallet = Wallet5("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa", 750.0)
    println(wallet.displayBalance()) // Shows formatted balance
    println("Is high balance wallet? ${wallet.isHighBalance(500.0)}")

    // Using the Transaction extension function
    val transaction = Transaction2("tx12345", 150.0)
    println(transaction.summary()) // Shows transaction summary
}