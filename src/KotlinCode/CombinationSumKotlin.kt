package KotlinCode


import java.util.*

class CombinationsSumKotlin {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        val temp = ArrayList<Int>()
        helper(candidates, 0, target, 0, temp, result)
        return result
    }

    private fun helper(candidates: IntArray, start: Int, target: Int, sum: Int,
                       list: MutableList<Int>, result: MutableList<List<Int>>) {
        if (sum > target) {
            return
        }

        if (sum == target) {
            result.add(ArrayList(list))
            return
        }

        for (i in start .. candidates.size - 1) {
            list.add(candidates[i])
            helper(candidates, i, target, sum + candidates[i], list, result)
            list.remove(list.size - 1)
        }
    }

    fun test() {
        var list: List<List<Int>> = ArrayList()
        val candidates = intArrayOf(2, 3, 5)
        val target = 8
        list = combinationSum(candidates, target)
        for (i in list.indices) {
            println(list[i])
        }
    }
}
