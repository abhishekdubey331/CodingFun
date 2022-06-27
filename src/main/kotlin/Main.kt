fun main(args: Array<String>) {
    val codeFunPrograms = CodeFunPrograms()
    println("Missing Number in Array is -> " + codeFunPrograms.getMissingNumFromArray(arrayOf(1, 2, 3, 5), 5))

    println("Sorted array is --> " + codeFunPrograms.bubbleSort(arrayOf(-34, -55, 44, 22, -100)).asList())

    val array = arrayOf(1, 2, 3, 4, 5)
    codeFunPrograms.reverseArray(array, array.size)

    codeFunPrograms.twoSum(arrayOf(1, 2, 3, 4, 5), 3)

    codeFunPrograms.swapAlternateNumbersInArray(arrayOf(2, 1, 4, 3, 5))

    codeFunPrograms.numberPresentOnce(arrayOf(2, 2, 4, 3, 3))

    val result = codeFunPrograms.uniqueNumberOfElements(arrayOf(2, 3, 4, 5, 6))
    println(result)

    println(codeFunPrograms.fibonacciNumber(4))

    println(codeFunPrograms.longestCommonPrefix(arrayOf("flower", "flow", "flight")))

    println(codeFunPrograms.isValid("([}}])"))

    codeFunPrograms.nextGreaterElement(arrayOf(13, 7, 6, 12))

    println(codeFunPrograms.twoSumInSortedArray(arrayOf(2, 3, 4, 5, 6), -1))

    println(codeFunPrograms.searchInsert(intArrayOf(1, 3, 5, 6), 5))

    println(codeFunPrograms.minMaxFromArray(intArrayOf(1, 3, 5, 6)))

    println(codeFunPrograms.checkIfArrayHasSquares(intArrayOf(1, 3, 5, 6), intArrayOf(1, 25, 9, 36)))
}


