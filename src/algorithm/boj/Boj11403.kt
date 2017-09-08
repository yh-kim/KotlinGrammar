/*
 * Copyright 2017 Yonghoon Kim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-09-07
 * Blog   : http://blog.pickth.com
 *
 * site   : https://www.acmicpc.net/problem/11403
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val count = br.readLine().toInt()
    val inputs = Array(count, { IntArray(count) })
    for(i in 0 until count) {
        inputs[i] = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    }
    br.close()

    for(i in 0 until count)
        for(j in 0 until count)
            for (k in 0 until count)
                if(inputs[j][i] == 1 && inputs[i][k] == 1) inputs[j][k] = 1

    inputs.forEach {
        it.forEach {
            print("$it ")
        }
        println()
    }

}