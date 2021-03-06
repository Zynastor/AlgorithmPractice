package chap01.answer

import kotlin.jvm.JvmStatic
import java.util.*

// 1, 2, …, n의 합을 구합니다(while문 종료 뒤의 i의 값을 확인).
internal object SumWhileEx_01_06 {
    @JvmStatic
    fun main(args: Array<String>) {
        val stdIn = Scanner(System.`in`)
        println("1부터 n까지의 합을 구합니다.")
        print("n의 값：")
        val n = stdIn.nextInt()
        var sum = 0 // 합
        var i = 1
        while (i <= n) {    // i가 n 이하면 반복
            sum += i // sum에 i를 더함
            i++ // i의 값을 1 증가(increment)
        }
        println("1부터 " + n + "까지의 합은 " + sum + "입니다.")
        println("i의 값은 " + i + "가(이) 되었습니다.")
    }
}