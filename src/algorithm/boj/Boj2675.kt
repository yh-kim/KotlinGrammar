package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-07-12
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/2675
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val T = br.readLine().toInt()
    for(i in 0..T-1) {
        val input = br.readLine().trim().split(' ')
        val R = input[0].toInt()

        for(j in input[1]) {
            for(k in 0..R-1) {
                print(j)
            }
        }
        println()
    }

    br.close()

}