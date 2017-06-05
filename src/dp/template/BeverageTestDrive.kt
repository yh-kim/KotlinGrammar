package dp.template

/**
 * Created by yonghoon on 2017-06-05
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val coffeeHook = CoffeeWithHook()
    val tea = Tea()

    println("\n차 준비중...")
    tea.prepareRecipe()

    println("\n커피 준비중...")
    coffeeHook.prepareRecipe()
}