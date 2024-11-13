/**
 * Kotlin provides a strong system for handling nullability, which helps prevent NullPointerExceptions.
 * In Kotlin, you can declare whether a variable can hold a null value or not.
 * If a variable can hold a null, it is declared with a '?' after the type.
 * This file uses a blockchain-themed example to illustrate nullability in Kotlin.
 */

import com.idz.kotlinfundamentalsplayground.NullStringProvider
import java.util.Locale

fun main() {
    // Nullable String: Can hold a null value
    var transactionNote: String? = null // Transaction note is optional and may be null
    println("Transaction Note: $transactionNote")

    // Non-nullable String: Must hold a non-null value
    val walletId: String = "wallet12345" // A wallet ID that cannot be null
    println("Wallet ID: $walletId")

    // Nullable Int: Last known transaction confirmation count, which might be null if not confirmed
    var confirmationCount: Int? = null
    println("Confirmation Count: $confirmationCount")

    // Setting values after checking for nulls
    transactionNote = "Payment for services rendered"
    confirmationCount = 3

    // Teaching note for Locale.ROOT usage in uppercase transformations
    // The use of `uppercase(Locale.ROOT)` here ensures a locale-independent uppercase transformation.
    // This is a best practice for predictable results, especially when handling data in an international context.
    println("Transaction Note (after update): ${transactionNote?.uppercase(Locale.ROOT)}")

    println("Confirmation Count (after update): ${confirmationCount?.plus(1)}")

    // The Elvis operator ?: provides a default value if null
    val confirmationStatus = confirmationCount ?: 0 // If no confirmations, set to 0
    println("Confirmation Status: $confirmationStatus")

    // Forcing a nullable variable to be non-null with !! (use cautiously)
    println("Confirmation Count (non-null): ${confirmationCount!!}")

    // JAVA Null String! example
    val javaString = NullStringProvider.getNullString()
    println(javaString.length)
}