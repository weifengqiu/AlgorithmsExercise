package personal.qiuweifeng.algorithmsexercise.easy

/**
 * Q description
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
object TwoSum {

    /**
     * my solution
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in (nums.indices)) {
            for (j in ((i + 1) until nums.size)) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf(-1, -1)
    }


    /**
     * better solution with hashMap
     */
    fun twoSum2(nums: IntArray, target: Int): IntArray {
        val hashMap = mutableMapOf<Int, Int>()
        for (i in (nums.indices)) {
            val value = target - nums[i]
            if (hashMap.containsKey(value) && hashMap[value] != i) {
                return intArrayOf(hashMap[value]!!, i)
            }
            hashMap[nums[i]] = i
        }
        return intArrayOf(-1, -1)
    }

}