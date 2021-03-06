package chap01.answer

import kotlin.jvm.JvmStatic
import java.util.*

// 가우스 공식에 의해 1, 2, …, n의 합을 구합니다.
internal object SumGauss_01_08 {
    @JvmStatic
    fun main(args: Array<String>) {
        val stdIn = Scanner(System.`in`)
        println("1부터 n까지의 합을 구합니다.")
        print("n의 값：")
        val n = stdIn.nextInt()
        val sum = (n + 1) * (n / 2) + if (n % 2 == 1) (n + 1) / 2 else 0 // 합
        println("1부터 " + n + "까지의 합은 " + sum + "입니다.")
    }
}