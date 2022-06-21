fun main(args: Array<String>) {
    val findMissingNum = FindMissingNum()
    println("Missing Number in Array is -> " + findMissingNum.getMissingNumFromArray(arrayOf(1, 2, 3, 5), 5))

    /*
     * Sort an array using bubble sort
     *
     */
    println("Sorted array is --> " + findMissingNum.bubbleSort(arrayOf(-34, -55, 44, 22, -100)).asList())

    val array = arrayOf(1, 2, 3, 4, 5)
    findMissingNum.reverseArray(array, array.size)
}