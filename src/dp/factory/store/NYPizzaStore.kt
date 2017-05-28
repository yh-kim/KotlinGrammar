package dp.factory.store

import dp.factory.NYPizzaIngredientFactory
import dp.factory.pizza.Pizza
import dp.factory.pizza.CheesePizza

/**
 * Created by yonghoon on 2017-05-28
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class NYPizzaStore: PizzaStore() {

    override fun createPizza(type: String): Pizza? {
        var pizza: Pizza? = null

        val ingredientFactory = NYPizzaIngredientFactory()

        when (type) {
            "cheese" -> pizza = CheesePizza(ingredientFactory)
        }

        return pizza
    }
}