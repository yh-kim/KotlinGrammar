package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-07-10
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/2920
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val results = arrayOf("ascending", "descending", "mixed")
    var switch = 1
    var preInput = 0
    var result = ""
    for(i in 1..8) {
        var input = br.read()
        if(input == 32) {
            input = br.read()
        }
        if(i == 2) {
            switch = preInput - input
        }
        if(i > 2) {
            if(preInput != input + switch) {
                result = results[2]
                break
            }
        }
        if(i == 8) {
            if(switch == 1) {
                result = results[1]
            } else {
                result = results[0]
            }
        }

        preInput = input
    }
    br.close()
    print(result)
}