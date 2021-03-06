package chap06

internal object BubbleSort2 {
    fun swap(a: IntArray, idx1: Int, idx2: Int) {
        val t = a[idx1]
        a[idx1] = a[idx2]
        a[idx2] = t
    }

    //버블 정렬
    fun bubbleSort(a: IntArray, n: Int) {
        for (i in 0 until n - 1) {
            var exchg=0//패스의 교환 횟수 기록
            var j = n - 1
            while (j > i) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j)
                    exchg++
                }
                j--
            }
            if(exchg==0) break//교환이 이루어지지 않으면 종료합니다.
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println("버블정렬(버전2)")
        print("요소수 : ")
        val nx = readLine()!!.toInt()
        val x = IntArray(nx)
        for (i in 0 until nx) {
            print("x[$i] : ")
            x[i] = readLine()!!.toInt()
        }
        bubbleSort(x, nx)
        println("오름차순으로 정렬했습니다.")
        for (i in 0 until nx)
            println("x[$i]=${x[i]}")
    }
}