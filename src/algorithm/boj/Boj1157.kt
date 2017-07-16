package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-07-16
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/1157
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().trim().map { it.toUpperCase().toInt() }
    br.close()
    val values = Array(26, { 0 })

    for(i in input) {
        values[i - 65]++
    }

    var maxValue = 0
    var preValue = 0
    var result = 0
    var check = false
    for(i in 0..values.size-1) {
        if(values[i] >= maxValue) {
            check = false
            preValue = maxValue
            maxValue = values[i]
            result = i
            if(preValue == maxValue) {
                check = true
            }
        }
    }

    print(if(check) "?" else (result+65).toChar())
}