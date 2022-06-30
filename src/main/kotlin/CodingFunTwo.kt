fun main(args: Array<String>) {
    val codingFunTwo = CodingFunTwo()
    codingFunTwo.stockBuySell(intArrayOf(3, 13, 1, 10, 4, 9, 3))
}

class CodingFunTwo {

    fun stockBuySell(array: IntArray) {
        var maxProfit = 0
        var minSoFar = array[0]

        for (num in array) {
            if (num < minSoFar)
                minSoFar = num
            if ((num - minSoFar) > maxProfit) {
                maxProfit = num - minSoFar
            }
        }
        println(maxProfit)
    }

}