package dp.factory.pizza

import dp.factory.PizzaIngredientFactory

/**
 * Created by yonghoon on 2017-05-28
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class CheesePizza(val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    init {
        name = "Cheese Pizza"
    }

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}