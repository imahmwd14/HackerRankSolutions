//https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    val map = hashMapOf<String, Int>().apply { magazine.forEach { put(it, getOrDefault(it, 0) + 1) } }
    for (i in note)
        if (!map.contains(i) || (map.contains(i) && map[i]!! <= 0)) {
            println("No")
            return
        } else {
            map[i] = map.getOrDefault(i, 0) - 1
        }
    println("Yes")
}
