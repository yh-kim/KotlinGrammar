
package dp.singleton

/**
 * Created by yonghoon on 2017-06-12
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val boiler = ChocolateBoiler.getInstance()

    boiler.fill()
    boiler.boil()
    boiler.drain()
}