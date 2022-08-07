/***
 *
 *     Input =  [1, 2, 3, 4, 5, 6, 7]
 *     Sum = 9
 *     Output =
 *
 *     {2,7}
 *     {3,6}
 *     {4,5}
 *
 */


class PairsWithGivenSum {

    fun findPairsWithGivenSum(intArrayOf: IntArray, sum: Int) {
        var firstPointer = 0
        var lastPointer = intArrayOf.size - 1
        for (i in intArrayOf.indices) {
            when {
                sum > intArrayOf[firstPointer] + intArrayOf[lastPointer] -> {
                    firstPointer++
                }

                sum == intArrayOf[firstPointer] + intArrayOf[lastPointer] -> {
                    println("{" + intArrayOf[firstPointer] + "," + intArrayOf[lastPointer] + "}")
                    if (firstPointer + 1 == lastPointer) {
                        break
                    } else {
                        firstPointer++
                        lastPointer--
                    }
                }

                sum < intArrayOf[firstPointer] + intArrayOf[lastPointer] -> {
                    lastPointer--
                }
            }
        }
    }
}

fun main() {
    val pairsWithGivenSum = PairsWithGivenSum()
    pairsWithGivenSum.findPairsWithGivenSum(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8), 9)
}