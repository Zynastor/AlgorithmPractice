package chap01.answer

import kotlin.jvm.JvmStatic
import java.util.*

// 숫자를 늘어놓아 피라미드를 출력
internal object NumPira_01_17 {
    fun npira(n: Int) {
        for (i in 1..n) {                    // i행 (i = 1, 2, … ,n)
            for (j in 1..n - i + 1)  // n-i+1개의 ' '를 나타냄
                print(' ')
            for (j in 1..(i - 1) * 2 + 1)  // (i-1)*2+1개의 '*'를 나타냄
                print(i % 10)
            println() // 개행(줄변환)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val stdIn = Scanner(System.`in`)
        var n: Int
        println("피라미드 모양으로 나타냅니다.")
        do {
            print("단수는 ：")
            n = stdIn.nextInt()
        } while (n <= 0)
        npira(n) // 피라미드를 나타냄
    }
}