import java.util.*
import java.util.function.BiFunction

// https://www.hackerrank.com/challenges/frequency-queries/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
fun freqQuery(queries: Array<Array<Int>>): Array<Int> {
    val output = mutableListOf<Int>()
    val map = hashMapOf<Int, Int>()

    for (q in queries) {
        if (q[0] == 3) {
            val value = if (map.values.distinct().sorted().binarySearch(q[1]) > -1) 1 else 0
            output.add(value)
        } else if (q[0] == 2) {
            map.computeIfPresent(q[1]) { _, u -> if (u > 1) u - 1 else null }
        } else if (q[0] == 1) {
            map.compute(q[1]) { _, u -> u?.plus(1) ?: 1 }
        }
    }

    return output.toTypedArray()
}