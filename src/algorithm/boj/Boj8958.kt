package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-07-10
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/8958
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val T = br.readLine().trim().toInt()
    for(i in 0..T-1) {
        val input = br.readLine().trim()

        var count = 0
        var length = 0
        for(j in 0..input.length-1) {
            if(input[j] == 'O') {
                count += (++length)
            } else {
                length = 0
            }
        }

        println(count)
    }
    br.close()
}