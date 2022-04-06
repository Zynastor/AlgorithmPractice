package chap02

import kotlin.jvm.JvmStatic

internal object IntArray1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val a = IntArray(5) //선언
        a[1] = 37
        a[2] = 51
        a[4] = a[1] * 2 //a[4]에 a[1]*2, 곧 74를 대입
        for (i in a.indices) println("a[" + i + "] = " + a[i])
    }
}