fun twoStrings(s1: String, s2: String): String {
    return if (s1.toSet().map(Char::toString).intersect(s2.toSet().map(Char::toString)).isNotEmpty()) "YES" else "NO"
}