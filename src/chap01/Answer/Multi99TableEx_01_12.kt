package chap01.Answer

import kotlin.jvm.JvmStatic
import chap01.Answer.Max4_01_01
import chap01.Answer.Med3_01_04
import chap01.Answer.Min3_01_02
import chap01.Answer.Min4_01_03
import chap01.Answer.NumPira_01_17
import chap01.Answer.StarPira_01_16
import chap01.Answer.SumOf_01_09
import chap01.Answer.Triangle_01_15

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