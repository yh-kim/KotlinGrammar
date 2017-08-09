package grammar.day0807

import dp.singleton.ChocolateBoiler

/**
 * Created by yonghoon on 2017-08-07
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val boiler = ChocolateBoiler.getInstance()

    boiler.fill()
    boiler.boil()
    boiler.drain()

    println()
    SingletonObject.run {
        fill()
        boil()
        drain()
    }
}