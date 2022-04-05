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
import java.util.*

// 네 값의 최댓값을 구하여 나타냄
internal object Max4_01_01 {
    // a, b, c, d의 최댓값을 구하여 반환
    fun max4(a: Int, b: Int, c: Int, d: Int): Int {
        var max = a // 최댓값
        if (b > max) max = b
        if (c > max) max = c
        if (d > max) max = d
        return max
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val stdIn = Scanner(System.`in`)
        val a: Int
        val b: Int
        val c: Int
        val d: Int
        println("네 정수의 최댓값을 구합니다.")
        print("a의 값：")
        a = stdIn.nextInt()
        print("b의 값：")
        b = stdIn.nextInt()
        print("c의 값：")
        c = stdIn.nextInt()
        print("d의 값：")
        d = stdIn.nextInt()
        val max = max4(a, b, c, d) // a, b, c, d의 최댓값
        println("최댓값은 " + max + "입니다.")
    }
}