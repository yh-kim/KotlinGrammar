package algorithm.boj

import java.io.InputStreamReader
import java.io.BufferedReader

/**
 * Created by yonghoon on 2017-05-25
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/8595
 */
fun main(args: Array<String>) {
    var result: Long = 0
    var num: Int = 0
    var hiddenNum: Int = 0
    var value: Int = 0

    val br = BufferedReader(InputStreamReader(System.`in`))

    val count = Integer.parseInt(br.readLine())

    for(i in 0..count - 1) {
        value = br.read()

        if (value in 48..57) {
            if (num > 0) {
                hiddenNum = hiddenNum * 10 + (value - 48)
            } else {
                hiddenNum += (value - 48)
            }
            num++
        } else {
            if (num in 1..6) {
                result += hiddenNum
            }
            hiddenNum = 0
            num = 0
        }
    }

    if(num > 0) {
        result += hiddenNum
    }

    print(result)
}