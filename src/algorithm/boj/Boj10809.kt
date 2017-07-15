package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-07-12
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/10809
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val alphabets = Array(26, {-1})
    val input = br.readLine()
    br.close()

    for(i in 0..input.length-1) {
        val num = input[i].toInt()-97
        if(alphabets[num] == -1) {
            alphabets[num] = i
        }
    }

    for(i in alphabets) print("$i ")
}