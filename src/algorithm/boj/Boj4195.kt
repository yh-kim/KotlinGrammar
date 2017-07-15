package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-06-30
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/4195
 */
fun main(args: Array<String>) {
//    var values = kotlin.arrayOfNulls<Int>(2000001)
//    var counter = kotlin.arrayOfNulls<Int>(2000001)
    val values = Array(200001, {0})
    val counter = Array(200001, {0})

    fun find(k: Int): Int {
        if(k == values[k]) return k

        values[k] = find(values[k])
        return values[k]
    }

    fun merge(p: Int, q: Int): Int {
        val pValue = find(p)
        val qValue = find(q)

        if(pValue != qValue) {
            values[qValue] = pValue
            counter[pValue] += counter[qValue]
            counter[qValue] = 1
        }

        return counter[pValue]
    }

    val br = BufferedReader(InputStreamReader(System.`in`))
    val T = br.readLine().trim().toInt()
    for(i in 0..T - 1) {
        var num = 1
        val F = br.readLine().trim().toInt()
        val index = HashMap<String, Int>()

        for (j in 1..2*F) {
            values[j] = j
            counter[j] = 1
        }

        for(j in 0..F - 1) {
            val friend = br.readLine().trim().split(" ")

            if(index[friend[0]] == null) index[friend[0]] = num++

            if(index[friend[1]] == null) index[friend[1]] = num++

            val result = merge(index[friend[0]]!!, index[friend[1]]!!)

            println(result)
        }
    }

    br.close()
}