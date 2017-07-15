package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-07-12
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/1316
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var result = 0

    val N = br.readLine().toInt()
    for(i in 0..N-1) {
        val alphabets = Array(26, {false})

        val input = br.readLine()
        var preValue = input[0]
        alphabets[input[0].toInt()-97] = true
        for(j in input) {
            if(preValue != j && alphabets[j.toInt()-97]) {
                result--
                break
            }
            alphabets[j.toInt()-97] = true
            preValue = j
        }
        result++
    }

    br.close()
    print(result)
}