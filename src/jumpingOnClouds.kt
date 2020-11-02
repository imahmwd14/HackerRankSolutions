fun jumpingOnClouds(c: Array<Int>): Int {
    var jumps = 0
    var i = 0
    while (i < c.size - 2) {
        i += if (c[i + 2] == 0) 2 else 1
        jumps++
    }
    return jumps + if (i < c.size) c.size - i - 1 else 0
}