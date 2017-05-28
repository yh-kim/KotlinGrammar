package dp.factory

import dp.factory.ingredient.Dough.Dough
import dp.factory.ingredient.Dough.ThinCrustDough
import dp.factory.ingredient.cheese.Cheese
import dp.factory.ingredient.cheese.ReggianoCheese
import dp.factory.ingredient.clam.Clams
import dp.factory.ingredient.clam.FreshClams
import dp.factory.ingredient.pepperoni.Pepperoni
import dp.factory.ingredient.pepperoni.SlicedPepperoni
import dp.factory.ingredient.sauce.MarinaraSauce
import dp.factory.ingredient.sauce.Sauce
import dp.factory.ingredient.veggie.*

/**
 * Created by yonghoon on 2017-05-28
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createVeggies(): MutableList<Veggies> {
        val veggies: MutableList<Veggies> = mutableListOf(Garlic(), Onion(), Mushroom(), RedPepper())
        return veggies
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FreshClams()
    }
}