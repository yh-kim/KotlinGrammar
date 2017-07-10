package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-07-10
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/10039
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var result = 0
    for(i in 1..5) {
        var input = br.readLine().trim().toInt()
        if(input < 40) {
           input = 40
        }
        result += input
    }
    br.close()
    print(result/5)
}