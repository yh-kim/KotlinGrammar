package algorithm.boj
  
import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2019-01-08
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/2775
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val T = Integer.parseInt(br.readLine())
    
    for(i in 0 until T) {
        val k = Integer.parseInt(br.readLine())
        val n = Integer.parseInt(br.readLine())
    
        // println(solve(k+2,n))
        println(solve2(k+2,n))
    }
    br.close()
    
}

// 재귀2 -> 메모리 13232, 시간 1172
fun solve2(k: Int, n: Int): Int {
    if(k == 0 || n == 0) {
        return 0
    }
    
    if(k == 1 && n ==1) {
        return 1
    }
    
    return solve(k-1,n)+solve(k,n-1)
}

// 재귀 -> 메모리 13236, 시간 832
fun solve(k: Int, n: Int): Int {
    if(k == 1 && n ==1) {
        return 1
    } else if(k == 1) {
        return solve(k,n-1)
    } else if(n == 1) {
        return solve(k-1,n)
    }
    
    return solve(k-1,n)+solve(k,n-1)
}