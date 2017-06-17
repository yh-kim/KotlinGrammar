package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-06-17
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/13275
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val input = br.readLine().trim()
    br.close()

    val values = Array(130, {0})
    var answer = 0

    for(i in 0..input.length-1) {
        val value = input[i].toInt()

        values[value] = values[value].xor(1)

        if(values[value] == 0) {
            answer += 2
        }

    }

    var check = false
    for(i in values) {
        if(i == 1) {
            answer++
            check = true
            break
        }
    }

    if(!check) {
        answer--
    }

    print(answer)
}