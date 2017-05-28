package dp.factory

import dp.factory.ingredient.Dough.Dough
import dp.factory.ingredient.cheese.Cheese
import dp.factory.ingredient.clam.Clams
import dp.factory.ingredient.pepperoni.Pepperoni
import dp.factory.ingredient.sauce.Sauce
import dp.factory.ingredient.veggie.Veggies

/**
 * Created by yonghoon on 2017-05-28
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
interface PizzaIngredientFactory {
    fun createDough() : Dough
    fun createSauce() : Sauce
    fun createCheese() : Cheese
    fun createVeggies() : MutableList<Veggies>
    fun createPepperoni() : Pepperoni
    fun createClam() : Clams
}