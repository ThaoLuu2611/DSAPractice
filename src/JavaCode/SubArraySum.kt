package JavaCode
import java.util.HashMap

class  SubArraySum{
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val map: HashMap<Int, Int> = HashMap()
        var sum = 0
        map.put(0, -1)
        for (i in nums.indices) {
            sum += nums[i]
            val modulo = if (k == 0) sum else sum % k
            if (map.containsKey(modulo) ) {
                var index = map.get(modulo)
                if(index != null && i - index > 1)
                    return true;
            }
            if (!map.containsKey(modulo))
                map.put(modulo, i)
        }
        return false
    }
}