package dp.iterator

import dp.iterator.menu.CafeMenu
import dp.iterator.menu.DinerMenu
import dp.iterator.menu.PancakeHouseMenu

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val dinerMenu = DinerMenu()
    val pancakeMenu = PancakeHouseMenu()
    val cafeMenu = CafeMenu()

    val waitress = Waitress(pancakeMenu, dinerMenu, cafeMenu)
    waitress.printMenu()
}