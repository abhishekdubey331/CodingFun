fun main(args: Array<String>) {
    val codeFunPrograms = CodeFunPrograms()
    println("Missing Number in Array is -> " + codeFunPrograms.getMissingNumFromArray(arrayOf(1, 2, 3, 5), 5))

    /*
     * Sort an array using bubble sort
     *
     */
    println("Sorted array is --> " + codeFunPrograms.bubbleSort(arrayOf(-34, -55, 44, 22, -100)).asList())

    val array = arrayOf(1, 2, 3, 4, 5)
    codeFunPrograms.reverseArray(array, array.size)
    codeFunPrograms.twoSum(arrayOf(1, 2, 3, 4, 5), 3)
}