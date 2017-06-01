package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-05-31
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/11053
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var length = 0
    val count = br.readLine().toInt()

    val weightValues = Array(count, {0})

    val valueList = br.readLine()
            .split(' ')
            .map { it.trim().toInt() }

    br.close()

    for(i in 0..count - 1) {
        for(j in 0..i-1) {
            if(valueList[i] > valueList[j]) {
                weightValues[i] = if(weightValues[i] > weightValues[j]) weightValues[i] else weightValues[j]
            }
        }

        weightValues[i]++
        length = if(weightValues[i] > length) weightValues[i] else length
    }

    print(length)
}