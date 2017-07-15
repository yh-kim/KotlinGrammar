package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-07-12
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/2941
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().trim()
    br.close()

    val chars = arrayListOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    var check = false
    var preChar = ' '
    var result = 0
    for(i in input.length-1 downTo 0) {
        if(input[i] == '=' || input[i] == '-' || input[i] == 'j') {
            preChar = input[i]
            check = true
        } else if(check) {

            for(j in chars) {
                if(""+input[i]+preChar == j) {
                    println(""+input[i]+preChar)
                    result--
                }
            }

            check = false
        } else {
            if(i < input.length-2 && input[i+2] == '=' && input[i+1] == 'z' && input[i] == 'd') {
                result--
            }
        }

        result++
    }
    print(result)
}