package chap01.answer

import kotlin.jvm.JvmStatic

// 구구단 표를 나타냄 (곱한 수를 나타냄)
internal object Multi99TableEx_01_12 {
    @JvmStatic
    fun main(args: Array<String>) {
        print("   |")
        for (i in 1..9) System.out.printf("%3d", i)
        println("\n---+---------------------------")
        for (i in 1..9) {
            System.out.printf("%2d |", i)
            for (j in 1..9) System.out.printf("%3d", i * j)
            println()
        }
    }
}