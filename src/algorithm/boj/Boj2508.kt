package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-06-01
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/2508
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val count = br.readLine().toInt()
    val candyNum = Array(count, {0})
    var checkWord: Array<Int>

    var x = 0
    var y = 0

    // 테스트케이스 반복
    for(i in 0..count - 1) {
        var line = br.readLine()

        if(line == "") {
            line = br.readLine()
        }

        var input = line
                .trim()
                .split(' ')
                .map { it.toInt() }

        x = input[0]
        y = input[1]

        var candy = 0
        checkWord = Array(y, {0})

        // 행 반복
        for(j in 0..x-1) {
            val words = br.readLine()
                    .trim()
                    .toCharArray()
                    .map { it.toInt() }

            // 열 반복
            for(k in 0..y-1) {
                when(words[k]) {
                    //  ^ 일 때
                    94 -> if(checkWord[k] == 4) candy++

                    // o 일 때
                    111 -> {
                        if(k != 0 && k != y-1) {
                            if(words[k-1] == 62 && words[k+1] == 60) {
                                candy++
                            }
                        }

                        if(checkWord[k] == 2) {
                            checkWord[k] = 3
                        }
                    }

                    // v 일 때
                    118 -> checkWord[k] = 1
                }
            } // 열 반복 끝

            // 초기화
            for(k in 0..checkWord.size-1) {
                when(checkWord[k]) {
                    0 -> checkWord[k] = 0
                    2 -> checkWord[k] = 0
                    4 -> checkWord[k] = 0
                    else -> checkWord[k]++
                }

            }

        } // 행 반복 끝
        candyNum[i] = candy
    } // 테스트케이스 반복 끝

    br.close()

    for(i in 0..candyNum.size-1) {
        println(candyNum[i])
    }
}