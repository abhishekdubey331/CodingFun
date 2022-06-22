class CodeFunPrograms {

    /***
     *
     *  How do you find the missing number in a given integer array of 1 to 100?
     *  [1,2,3,5] --> Missing number 4
     *
     */
    fun getMissingNumFromArray(array: Array<Int>, size: Int): Int {
        val expectedSum = size * (size + 1) / 2
        var arraySum = 0
        array.iterator().forEach { number ->
            arraySum += number
        }
        return expectedSum - arraySum
    }


    /**
     *    Sort an array using bubble sort
     *
     */
    fun bubbleSort(array: Array<Int>): Array<Int> {
        for (i in array.indices) {
            for (j in 1 until array.size - i) {
                if (array[j] < array[j - 1]) {
                    val temp = array[j]
                    array[j] = array[j - 1]
                    array[j - 1] = temp
                }
            }
        }
        return array
    }

    /**
     *  Reverse an array without recursion
     *
     *   [1,2,3,4,5]
     *
     */
    fun reverseArray(array: Array<Int>, size: Int) {
        if (size > 0) {
            println(array[size - 1])
            reverseArray(array, size - 1)
        }
    }

    /***
     *
     *   Program to return two numbers from an array whose sum is given number
     *    [1,2,3,4,5]  7
     *
     */
    fun twoSum(array: Array<Int>, requiredSum: Int) {
        val hashMap: HashMap<Int, Int> = HashMap()
        for (i in array.indices + 1) {
            if (hashMap.containsKey(array[i])) {
                println((requiredSum - array[i]).toString() + " " + array[i].toString())
                break;
            } else {
                hashMap[requiredSum - array[i]] = array[i]
            }
        }
    }
}