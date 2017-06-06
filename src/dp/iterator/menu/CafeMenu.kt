package dp.iterator.menu

import java.util.*

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class CafeMenu: Menu {
    val menuItems = Hashtable<String, MenuItem>()

    init {
        addItem("베리또", "통 핀토콩과 살사, 구아카몰이 곁들여진 푸짐한 베리또", true, 4.29)
    }

    fun addItem(name:String, description:String, vegetarian:Boolean, price:Double) {
      menuItems.put(name, MenuItem(name, description, vegetarian, price))
    }

    override fun createIterator(): Iterator<MenuItem?> = menuItems.elements().iterator()
}