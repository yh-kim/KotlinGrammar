package dp.factory.store

import dp.factory.pizza.Pizza

/**
 * Created by yonghoon on 2017-05-28
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
abstract class PizzaStore {
    fun orderPizza(type: String): Pizza? {
        var pizza: Pizza? = null

        pizza = createPizza(type)

        pizza?.prepare()
        pizza?.bake()
        pizza?.cut()
        pizza?.box()

        return pizza
    }

    abstract fun createPizza(type: String): Pizza?
}