package dp.decorator

import dp.decorator.coffee.DarkRoast
import dp.decorator.coffee.Espresso
import dp.decorator.coffee.HouseBlend
import dp.decorator.extra.Mocha
import dp.decorator.extra.Soy
import dp.decorator.extra.Whip

/**
 * Created by yonghoon on 2017-05-25
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    var beverage: Beverage = Espresso()
    println(beverage.description + " $" + "${beverage.cost()}")

    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println(beverage2.description + " $" + "${beverage2.cost()}")

    var beverage3: Beverage = HouseBlend()
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    println(beverage3.description + " $" + "${beverage3.cost()}")
}