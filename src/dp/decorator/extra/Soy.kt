package dp.decorator.extra

import dp.decorator.Beverage
import dp.decorator.CondimentDecorator

/**
 * Created by yonghoon on 2017-05-25
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class Soy(beverage: Beverage): CondimentDecorator() {
    val beverage = beverage

    init {
        description = beverage.description + ", 두유"
    }

    override fun cost(): Double {
        return beverage.cost() + 0.15
    }
}