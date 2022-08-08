/***
 *
 *     [4,5,6,7]
 *
 *     [9,11,13]
 *
 *     [10,4]
 *
 *     [0,4]
 *
 */

class PascalTriangleEncryption {

    fun getEncryptedString(arr: IntArray) {
        val mutableList = arr.asList().toMutableList()
        encrypt(mutableList)
    }

    private fun encrypt(mutableList: MutableList<Int>) {
        val newList = mutableListOf<Int>()
        mutableList.forEachIndexed { index, _ ->
            if (index < mutableList.size - 1) {
                val sum = mutableList[index] + mutableList[index + 1]
                if (sum < 10)
                    mutableList[index] = sum
                else
                    mutableList[index] = sum % 10
                newList.add(mutableList[index])
            }
        }
        if (newList.size > 2) {
            encrypt(newList)
        } else {
            println(newList)
        }
    }
}


fun main() {
    val pascalTriangle = PascalTriangleEncryption()
    pascalTriangle.getEncryptedString(intArrayOf(4, 5, 6, 7))
}