package dp.decorator.extra

import dp.decorator.Beverage
import dp.decorator.CondimentDecorator

/**
 * Created by yonghoon on 2017-05-25
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class Mocha(beverage: Beverage):CondimentDecorator() {
    val beverage: Beverage = beverage

    init {
        description = beverage.description + ", 모카"
    }

    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}