
/**
 * Kotlin provides a variety of collection types, including both immutable and mutable versions.
 * - listOf, setOf, and mapOf create immutable collections.
 * - ArrayList, mutableListOf, mutableSetOf, and mutableMapOf create mutable collections.
 * This file demonstrates various ways to use these collections, with a movie-themed context.
 * Java and Swift comparisons are included in the comments.
 */

fun main() {
    // Immutable List
    // Java: List<String> immutableList = Collections.unmodifiableList(Arrays.asList("Inception", "Interstellar"));
    // Swift: let immutableList: [String] = ["Inception", "Interstellar"]
    val immutableList = listOf("Inception", "Interstellar")

    // Mutable List - ArrayList
    // Java: ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Inception", "Interstellar"));
    // Swift: var arrayList: [String] = ["Inception", "Interstellar"]
    val arrayList = ArrayList(immutableList)
    arrayList.add("Dunkirk")

    // Immutable Set
    // Java: Set<String> immutableSet = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("Sci-Fi", "Drama")));
    // Swift: let immutableSet: Set<String> = ["Sci-Fi", "Drama"]
    val immutableSet = setOf("Sci-Fi", "Drama")

    // Mutable Set
    // Java: Set<String> mutableSet = new HashSet<>(Arrays.asList("Sci-Fi", "Drama"));
    // Swift: var mutableSet: Set<String> = ["Sci-Fi", "Drama"]
    val mutableSet = mutableSetOf("Sci-Fi", "Drama")
    mutableSet.add("Thriller")

    // Immutable Map
    // Java: Map<String, String> immutableMap = Collections.unmodifiableMap(new HashMap<String, String>() {{ put("Inception", "Nolan"); put("Interstellar", "Nolan"); }});
    // Swift: let immutableMap: [String: String] = ["Inception": "Nolan", "Interstellar": "Nolan"]
    val immutableMap = mapOf("Inception" to "Nolan", "Interstellar" to "Nolan")

    // Mutable Map
    // Java: Map<String, String> mutableMap = new HashMap<String, String>() {{ put("Inception", "Nolan"); put("Interstellar", "Nolan"); }};
    // Swift: var mutableMap: [String: String] = ["Inception": "Nolan", "Interstellar": "Nolan"]
    val mutableMap = mutableMapOf("Inception" to "Nolan", "Interstellar" to "Nolan")
    mutableMap["Dunkirk"] = "Nolan"

    // Demonstrating usage
    println("Immutable List: $immutableList")
    println("ArrayList: $arrayList")
    println("Immutable Set: $immutableSet")
    println("Mutable Set: $mutableSet")
    println("Immutable Map: $immutableMap")
    println("Mutable Map: $mutableMap")
}
