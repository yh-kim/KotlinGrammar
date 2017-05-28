package dp.factory.pizza

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
abstract class Pizza {
    var name: String = ""
    var dough: Dough? = null
    var sauce: Sauce? = null
    var veggies: MutableList<Veggies>? = null
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null
    val toppings: ArrayList<String> = ArrayList()

//    fun prepare() {
//        println("""
//        |Preparing $name
//        |Tossing dough...
//        |Adding topings:
//""".trimMargin())
//
//        for(i in 1..toppings.size) {
//            println(" ${toppings.get(i-1)}")
//        }
//    }

    abstract fun prepare()

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }
}