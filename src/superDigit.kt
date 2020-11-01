fun superDigit(n: String, k: Int): Int {
    if (k > -1) return superDigit((n.map { it.toString().toLong() }.sum() * k).toString(), -1)
    else if (n.length == 1) return n.toInt()
    return superDigit(n.map { it.toString().toLong() }.sum().toString(), k)
}
