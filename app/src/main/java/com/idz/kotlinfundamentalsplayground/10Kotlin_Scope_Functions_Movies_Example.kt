/**
 * Kotlin's scope functions ('let', 'run', 'with', 'apply', and 'also') are used to execute code within the context of an object.
 * They differ in how they refer to the context object and what they return.
 * This file demonstrates the usage of these scope functions in a blockchain context.
 */

class Wallet4(var address: String, var balance: Double)

fun main() {
    // Example using 'let' to safely work with a nullable Wallet
    val wallet: Wallet4? = Wallet4("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa", 500.0)
    wallet?.let {
        println("Wallet Address: ${it.address}")
        println("Wallet Balance: ${it.balance}")
    }

    // Example using 'run' to execute multiple operations on the wallet
    val newBalance = wallet?.run {
        balance += 100.0 // Adding funds to the balance
        println("Updated Balance with run: $balance")
        balance // Return the balance as the result
    }
    println("Balance after run: $newBalance")

    // Example using 'with' for a transaction summary
    with(wallet!!) {
        println("Transaction Summary")
        println("Address: $address")
        println("Final Balance: $balance")
    }

    // Example using 'apply' for initializing a new Wallet
    val newWallet = Wallet4("3J98t1WpEZ73CNmQviecrnyiWrnqRhWNLy", 0.0).apply {
        balance = 300.0
        println("Created new wallet with address: $address and balance: $balance")
    }

    // Example using 'also' to log actions during a transaction
    newWallet.also {
        println("Attempting transaction of 50.0 from wallet: ${it.address}")
    }.apply {
        balance -= 50.0
    }.also {
        println("New Balance after transaction: ${it.balance}")
    }
}