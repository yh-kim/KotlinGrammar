package dp.iterator

import kotlin.collections.Iterator

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class Waitress(val pancakeHouseMenu: Menu, val dinerMenu: Menu) {

    fun printMenu() {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        println("메뉴\n---\n아침메뉴")
        printMenu(pancakeIterator)

        val dinerIterator = dinerMenu.createIterator()
        println("\n저녁메뉴")
        printMenu(dinerIterator)
    }

    private fun printMenu(iterator: Iterator<MenuItem?>) {
        while(iterator.hasNext()) {
            val menuItem = iterator.next() as MenuItem
            println("${menuItem.name}, ${menuItem.price} -- ${menuItem.description}")
        }
    }

}