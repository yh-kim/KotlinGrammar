package dp.factory

import dp.factory.store.ChicagoPizzaStore
import dp.factory.store.NYPizzaStore
import dp.factory.store.PizzaStore

/**
 * Created by yonghoon on 2017-05-28
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val nyStore: PizzaStore = NYPizzaStore()
    val chicagoStore: PizzaStore = ChicagoPizzaStore()

    var pizza = nyStore.orderPizza("cheese")
    println("Ethan ordered a ${pizza?.name}")

    pizza = chicagoStore.orderPizza("cheese")
    println("Joel ordered a ${pizza?.name}")

}