package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-07-10
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/1152
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().trim()
    var isFirst = true
    var result = 0
    br.close()
    for(i in 0..input.length-1) {
        if(input[i] == ' ') {
            isFirst = true
        } else {
            if(isFirst) {
                result++
                isFirst = false
            }
        }
    }
    print(result)
}