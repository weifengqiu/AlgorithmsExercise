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
        var fistIndex = -1
        var secondIndex = -1
        for(i in (nums.indices)) {
            fistIndex = i
            for (j in ((i + 1) until nums.size)) {
                secondIndex = j
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(fistIndex, secondIndex)
                }
            }
        }
        return intArrayOf(-1, -1)
    }


}