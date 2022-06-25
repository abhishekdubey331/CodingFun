fun main(args: Array<String>) {
    val mergeSortAlgorithm = MergeSortAlgorithm()
    println(mergeSortAlgorithm.mergeSort(listOf(5, 4, 3, 2, 1, 0)))
}


class MergeSortAlgorithm {

    fun mergeSort(list: List<Int>): List<Int> {
        if (list.size <= 1) {
            return list
        }

        val middle = list.size / 2
        val left = list.subList(0, middle)
        val right = list.subList(middle, list.size)
        return merge(mergeSort(left), mergeSort(right))
    }

    private fun merge(left: List<Int>, right: List<Int>): List<Int> {
        var i = 0
        var j = 0
        val newList = mutableListOf<Int>()

        while (i < left.count() && j < right.count()) {
            if (left[i] <= right[j]) {
                newList.add(left[i])
                i++
            } else {
                newList.add(right[j])
                j++
            }
        }

        while (i < left.size) {
            newList.add(left[i])
            i++
        }

        while (j < right.size) {
            newList.add(right[j])
            j++
        }
        return newList
    }
}