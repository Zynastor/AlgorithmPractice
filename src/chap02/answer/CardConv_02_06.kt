package chap02.answer

import kotlin.jvm.JvmStatic

// 입력 받은 10진수를 2진수 ~36진수로 기수변환하여 나타냄(윗자리부터 배열에 저장)
internal object CardConv_02_06 {
    // 정수 x를 r진수로 변환하여 배열 d에 윗자리부터 저장하고 자릿수를 반환
    fun cardConv(x: Int, r: Int, d: CharArray): Int {
        var x = x
        var digits = 0 // 변환 뒤의 자릿수
        val dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        do {
            d[digits++] = dchar[x % r] // r로 나눈 나머지를 저장
            x /= r
        } while (x != 0)
        for (i in 0 until digits / 2) { // d[0]~d[digits-1]
            val temp = d[i]
            d[i] = d[digits - i - 1]
            d[digits - i - 1] = temp
        }
        return digits
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var no: Int // 변환하는 정수
        var cd: Int // 기수
        var dno: Int // 변환 뒤의 자릿수
        var retry: Int // 한 번 더?
        val cno = CharArray(32) // 변환 뒤의 각 자리를 저장하는 문자인 배열
        println("10진수를 기수변환합니다.")
        do {
            do {
                print("변환하는 음이 아닌 정수：")
                no = readLine()!!.toInt()
            } while (no < 0)
            do {
                print("어떤 진수로 변환할까요? (2~36)：")
                cd = readLine()!!.toInt()
            } while (cd < 2 || cd > 36)
            dno = cardConv(no, cd, cno) // no를 cd진수로 변환
            print("${cd}진수로는 ")
            for (i in 0 until dno)  // 윗자리부터 차례로 나타냄
                print(cno[i])
            println("입니다.")
            print("한번 더 할까요? (1.예/0.아니오)：")
            retry = readLine()!!.toInt()
        } while (retry == 1)
    }
}