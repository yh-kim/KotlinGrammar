package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-07-12
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/2908
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val input = br.readLine().trim().split(' ')
    br.close()
    var num1 = changeNum(input[0])
    var num2 = changeNum(input[1])

    print(if(num1 > num2) num1 else num2)
}

fun changeNum(value: String): Int {
    var num = 0
    for(i in 0..value.length-1) {
        num += (value[i].toInt()-48) * Math.pow(10.toDouble(),i.toDouble()).toInt()
    }
    return num
}