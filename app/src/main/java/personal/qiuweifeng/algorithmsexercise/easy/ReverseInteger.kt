package personal.qiuweifeng.algorithmsexercise.easy

/**
 * Q description:
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
object ReverseInteger {
    fun reverse(x: Int): Int {
        var x = x
        var rev = 0
        while (x != 0) {
            // 弹出最后一个
            val pop = x % 10
            x /= 10
            // 溢出检测
            if (rev > Int.MAX_VALUE / 10 || (rev == Int.MAX_VALUE && pop > 7)) return 0
            if (rev < Int.MIN_VALUE / 10 || (rev == Int.MIN_VALUE && pop < -8)) return 0
            // 入栈
            rev = rev * 10 + pop
        }
        return rev
    }
}