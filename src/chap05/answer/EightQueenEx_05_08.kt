package chap05.answer

import kotlin.jvm.JvmStatic

// 8퀸 문제를 풀이합니다 (체스판을 □와 ■로 나타냄)
internal object EightQueenEx_05_08 {
    var flag_a = BooleanArray(8) // 각 행에 퀸이 이미 배치되어 있는가?
    var flag_b = BooleanArray(15) // ／대각선에 퀸이 이미 배치되어 있는가?
    var flag_c = BooleanArray(15) // ＼대각선에 퀸이 이미 배치되어 있는가?
    var pos = IntArray(8) // 각 열의 퀸의 위치

    // 체스판 (각 열의 퀸의 위치)을 출력
    fun print() {
        for (i in 0..7) {
            for (j in 0..7) print("%s".format(if (j == pos[i]) "■" else "□"))
            println()
        }
        println()
    }

    // i 열의 알맞은 위치에 퀸을 배치
    fun set(i: Int) {
        for (j in 0..7) {
            if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]
            ) { // ＼대각선에 미배치
                pos[i] = j // 퀸을 j행에 배치
                if (i == 7) // 모든 열에 배치 마침
                    print() else {
                    flag_c[i - j + 7] = true
                    flag_b[i + j] = flag_c[i - j + 7]
                    flag_a[j] = flag_b[i + j]
                    set(i + 1)
                    flag_c[i - j + 7] = false
                    flag_b[i + j] = flag_c[i - j + 7]
                    flag_a[j] = flag_b[i + j]
                }
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        set(0)
    }
}