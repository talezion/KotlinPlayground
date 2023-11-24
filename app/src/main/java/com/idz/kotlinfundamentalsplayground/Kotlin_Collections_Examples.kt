
/**
 * Collections in Kotlin are a powerful feature for storing groups of related objects.
 * There are two main types: immutable (read-only) and mutable (modifiable).
 * Immutable collections are created using listOf, setOf, and mapOf.
 * Mutable collections are created using mutableListOf, mutableSetOf, and mutableMapOf.
 */

fun main() {
    // List: Ordered collection of elements. Allows duplicate values.
    // Java: List<Integer> list = Arrays.asList(1, 2, 3);
    // Swift: let list: [Int] = [1, 2, 3]
    val list = listOf(1, 2, 3) // Immutable List

    // MutableList: A List with read-write access.
    // Java: List<Integer> mutableList = new ArrayList<>(Arrays.asList(1, 2, 3));
    // Swift: var mutableList: [Int] = [1, 2, 3]
    val mutableList = mutableListOf(1, 2, 3) // Mutable List

    // Set: Unordered collection of unique elements.
    // Java: Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
    // Swift: let set: Set<Int> = [1, 2, 3]
    val set = setOf(1, 2, 3) // Immutable Set

    // MutableSet: A Set with read-write access.
    // Java: Set<Integer> mutableSet = new HashSet<>(Arrays.asList(1, 2, 3));
    // Swift: var mutableSet: Set<Int> = [1, 2, 3]
    val mutableSet = mutableSetOf(1, 2, 3) // Mutable Set

    // Map: Collection of key-value pairs. Keys are unique.
    // Java: Map<Integer, String> map = new HashMap<>(); map.put(1, "One"); map.put(2, "Two");
    // Swift: let map: [Int: String] = [1: "One", 2: "Two"]
    val map = mapOf(1 to "One", 2 to "Two") // Immutable Map

    // MutableMap: A Map with read-write access.
    // Java: Map<Integer, String> mutableMap = new HashMap<>(); mutableMap.put(1, "One"); mutableMap.put(2, "Two");
    // Swift: var mutableMap: [Int: String] = [1: "One", 2: "Two"]
    val mutableMap = mutableMapOf(1 to "One", 2 to "Two") // Mutable Map
}
