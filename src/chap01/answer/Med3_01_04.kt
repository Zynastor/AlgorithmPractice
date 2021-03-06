package chap01.answer

import kotlin.jvm.JvmStatic
// 세 정수값의 중앙값을 구하여 나타냄 (모든 조합의 대소관계에 대하여 검증)
internal object Med3_01_04 {
    // a, b, c의 중앙값을 구하여 반환
    fun med3(a: Int, b: Int, c: Int): Int {
        return if (a >= b) if (b >= c) b else if (a <= c) a else c else if (a > c) a else if (b > c) c else b
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println("med3(3,2,1) = " + med3(3, 2, 1)) // a＞b＞c
        println("med3(3,2,2) = " + med3(3, 2, 2)) // a＞b＝c
        println("med3(3,1,2) = " + med3(3, 1, 2)) // a＞c＞b
        println("med3(3,2,3) = " + med3(3, 2, 3)) // a＝c＞b
        println("med3(2,1,3) = " + med3(2, 1, 3)) // c＞a＞b
        println("med3(3,3,2) = " + med3(3, 3, 2)) // a＝b＞c
        println("med3(3,3,3) = " + med3(3, 3, 3)) // a＝b＝c
        println("med3(2,2,3) = " + med3(2, 2, 3)) // c＞a＝b
        println("med3(2,3,1) = " + med3(2, 3, 1)) // b＞a＞c
        println("med3(2,3,2) = " + med3(2, 3, 2)) // b＞a＝c
        println("med3(1,3,2) = " + med3(1, 3, 2)) // b＞c＞a
        println("med3(2,3,3) = " + med3(2, 3, 3)) // b＝c＞a
        println("med3(1,2,3) = " + med3(1, 2, 3)) // c＞b＞a
    }
}