class PrintDuplicateArrayElements {

    /**
     * Input ={1,5,4,2,1,4,7}
     *
     * Output = {1,4}
     *
     */

    fun printDuplicates(array: IntArray) {
        val numMap = mutableMapOf<Int, Int>()
        var duplicateFound = false
        array.forEach {
            numMap[it] = (numMap[it] ?: 0) + 1
        }
        numMap.forEach {
            if (it.value > 1) {
                duplicateFound = true
                println(it.key)
            }
        }
        if (duplicateFound.not()) {
            println("No duplicates found")
        }
    }
}


fun main() {
    val printDuplicateArrayElements = PrintDuplicateArrayElements()
    printDuplicateArrayElements.printDuplicates(intArrayOf(1, 5, 4, 2, 1, 4, 7))
}