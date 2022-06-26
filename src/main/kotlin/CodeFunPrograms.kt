import java.util.*

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
     *  Reverse an array without for loop
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

    /***
     *   Swap alternate numbers in an array
     */
    fun swapAlternateNumbersInArray(array: Array<Int>) {
        array.forEachIndexed { i, item ->
            try {
                if (i % 2 == 0) {
                    val temp = array[i + 1]
                    array[i + 1] = item
                    array[i] = temp
                }
            } catch (ex: Exception) {
            }
        }
        println(array.asList())
    }

    /***
     *  Program to find a number which is present only once in an array
     *  [3,3,5,1,1]
     */
    fun numberPresentOnce(array: Array<Int>) {
        var ans = 0
        array.forEachIndexed { _, item ->
            ans = ans xor item
        }
        println(ans)
    }

    /***
     *  Program to print true if an array has all numbers unique and false in case numbers are not unique
     */
    fun uniqueNumberOfElements(array: Array<Int>): Boolean {
        val hashMap = HashMap<Int, Int>()
        var allUniqueNumbers = true
        array.forEachIndexed { _, item ->
            if (hashMap.containsKey(item).not()) {
                hashMap[item] = item
            } else {
                allUniqueNumbers = false
            }
        }
        return allUniqueNumbers
    }

    /***
     *  Fibonacci program
     *   5 ! = 5 * 4 * 3 * 2 * 1
     */
    fun fibonacciNumber(number: Int): Int {
        return if (number - 1 >= 1) {
            number * fibonacciNumber(number - 1)
        } else {
            1
        }
    }

    /***
     *  Longest Common Prefix
     */
    fun longestCommonPrefix(array: Array<String>): String {
        if (array.isNullOrEmpty())
            return ""

        var smallestString = array[0]

        for (i in 1 until array.size) {
            while (array[i].indexOf(smallestString) != 0) {
                smallestString = smallestString.substring(0, smallestString.length - 1)
            }
        }
        return smallestString
    }

    /***
     *  "([}}])"
     */
    fun isValid(s: String): Boolean {
        if (s.length % 2 != 0) return false

        val stack: Stack<Char> = Stack()
        val charArray = s.toCharArray()

        for (c in charArray) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c)
            } else if (c == ')' && stack.isEmpty().not() && stack.peek() == '(') {
                stack.pop()
            } else if (c == '}' && stack.isEmpty().not() && stack.peek() == '{') {
                stack.pop()
            } else if (c == ']' && stack.isEmpty().not() && stack.peek() == '[') {
                stack.pop()
            } else {
                stack.push(c)
            }
        }
        return stack.isEmpty()
    }

    /***
     *   Next Greater Element and if no greater element exists then -1
     *   [13, 7, 6, 12]
     *
     *   [-1, 12, 12, -1]
     *
     */

    fun nextGreaterElement(array: Array<Int>) {
        var greatestNum = array[array.size - 1]
        array[array.size - 1] = -1
        for (i in array.size - 2 downTo 0) {
            if (array[i] < greatestNum) {
                if ((i - 1) > -1 && array[i - 1] < array[i]) {
                    val temp = array[i]
                    array[i] = greatestNum
                    greatestNum = temp
                } else {
                    array[i] = greatestNum
                }
            } else {
                greatestNum = array[i]
                array[i] = -1
            }
        }
        println(array.asList())
    }

    fun twoSumInSortedArray(array: Array<Int>, sum: Int): String {
        var i = 0
        var j = array.size - 1

        for (index in 0 until array.size - 1) {
            if (array[i] + array[j] == sum) {
                return "Numbers found for given sum : ${array[i]}, ${array[j]}"
            } else if (array[i] + array[j] < sum) {
                i++
            } else if (array[i] + array[j] > sum) {
                j--
            }
        }
        return "No numbers found for given sum: $sum"
    }
}