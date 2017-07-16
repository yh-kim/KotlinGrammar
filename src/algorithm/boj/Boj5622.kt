package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-07-16
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/5622
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().trim().map { it.toInt()-65 }
    br.close()
    var result = 0
    for(i in input) {
        result += (i/3 + 3)

        if(i == 18 || i == 21 || i > 23) result--
    }
    print(result)
}