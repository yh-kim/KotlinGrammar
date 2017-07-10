package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-07-10
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/2577
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val results = Array(10, {0})
    var value = 1

    for(i in 0..2) {
        value *= br.readLine().trim().toInt()
    }
    br.close()

    while(value/10 != 0) {
        results[value%10]++
        value /= 10
    }

    if(value != 0) {
        results[value]++
    }

    for(i in 0..9) {
        println(results[i])
    }
}