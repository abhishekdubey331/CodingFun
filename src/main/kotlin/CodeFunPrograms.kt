import java.util.*
import kotlin.math.max
import kotlin.math.min

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

    /**
     *   LeetCode Search Insert Position
     *
     */
    fun searchInsert(nums: IntArray, target: Int): Int {
        var i = 0
        var j = nums.size - 1

        nums.forEachIndexed { num, index ->
            if (target > nums[i] && i < nums.size - 1) {
                i++
            }
            if (target < nums[j] && j > 0) {
                j--
            }
        }

        return if (target < nums[j]) {
            j
        } else if (i == j) {
            if (target == nums[i]) {
                i
            } else {
                i + 1
            }
        } else {
            i
        }
    }

    /***
     *   Program to find largest and smallest number in an unsorted integer array
     */
    fun minMaxFromArray(nums: IntArray): String {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE

        for (num in nums) {
            if (num > max) {
                max = max(max, num)
            }
            if (num < min) {
                min = min(min, num)
            }
        }
        return "Max number in array is : $max\nMin number in array is : $min"
    }

    /**
     *  Program to check if out of two given array's second array has square numbers of first array
     *
     *   [1,2,4] [1,4,16]
     *
     */
    fun checkIfArrayHasSquares(array1: IntArray, array2: IntArray): Boolean {
        val hashMap: HashMap<Int, Int> = HashMap()
        var isValid = true

        for (num in array1) {
            hashMap[num * num]?.let {
                hashMap[num * num] = it + 1
            } ?: run {
                hashMap[num * num] = 1
            }
        }
        var counterForCurrentElem = 0
        for (i in array2.indices) {
            if (hashMap.contains(array2[i])) {
                counterForCurrentElem++
            } else {
                isValid = false
                break
            }
            if (i == array2.size - 1 && counterForCurrentElem != hashMap[array2[i]]) {
                isValid = false
                break
            } else {
                counterForCurrentElem = 0
            }
        }
        return isValid
    }

    /***
     *    Find one extra character in a string
     *    Given two strings which are of lengths n and n+1.
     *    The second string contains all the character of the first string, but there is one extra character.
     *    Your task to find the extra character in the second string.
     *
     *    Input : string strA = "abcd";
    string strB = "cbdae";
    Output : e
     */
    fun getExtraString(string1: String, string2: String) {
        val firstCharArray = string1.toCharArray()
        val secondCharArray = string2.toCharArray()

        val firstMap = HashMap<Char, Int>()
        val secondMap = HashMap<Char, Int>()

        for (c in firstCharArray) {
            firstMap[c]?.let {
                firstMap[c] = it + 1
            } ?: run {
                firstMap[c] = 1
            }
        }

        for (i in secondCharArray.indices) {
            secondMap[secondCharArray[i]]?.let {
                secondMap[secondCharArray[i]] = it + 1
            } ?: run {
                secondMap[secondCharArray[i]] = 1
            }
        }

        val keySet = secondMap.keys
        for (key in keySet) {
            if (secondMap[key] != firstMap[key]) {
                println(key)
            }
        }
    }

    /**
    Two strings are anagram
    Input: s = "anagram", t = "nagaram"
    Output: true
     */


    fun isAnagram(s: String, t: String) {
        if (s.length != t.length) {
            println("$s and $t are not anagram strings")
            return
        }

        val firstCharArray = s.toCharArray()
        val secondCharArray = t.toCharArray()
        val firstMap = HashMap<Char, Int>()
        val secondMap = HashMap<Char, Int>()

        for (i in firstCharArray.indices) {
            if (firstMap[firstCharArray[i]] != null) {
                firstMap[firstCharArray[i]] = firstMap[firstCharArray[i]]!! + 1
            } else {
                firstMap[firstCharArray[i]] = 1
            }

            if (secondMap[secondCharArray[i]] != null) {
                secondMap[secondCharArray[i]] = secondMap[secondCharArray[i]]!! + 1
            } else {
                secondMap[secondCharArray[i]] = 1
            }
        }

        val keySet = firstMap.keys

        for (key in keySet) {
            if (firstMap[key] != secondMap[key]) {
                println("$s and $t are not anagram strings")
                return
            } else {
                println("$s and $t are anagram strings")
                return
            }
        }
    }
}