package dp.template

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-06-05
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class CoffeeWithHook : CaffeineBeverageWithHook() {
    override fun brew() {
        println("필터를 통해서 커피를 우려내는 중")
    }

    override fun addCondiments() {
        println("설탕과 우유를 추가하는 중")
    }

    override fun customerWantsCondiments(): Boolean {
        var answer: String = getUserInput()

        return answer.toLowerCase().startsWith("y")
    }

    fun getUserInput():String {
        println("커피에 우유와 설탕을 넣어 드릴까요?")

        val br = BufferedReader(InputStreamReader(System.`in`))
        val answer = br.readLine()
        br.close()
        return answer ?: "n"
    }
}