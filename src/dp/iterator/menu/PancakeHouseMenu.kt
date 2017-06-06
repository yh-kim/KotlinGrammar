package dp.iterator.menu

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class PancakeHouseMenu: Menu {
    var menuItems = ArrayList<MenuItem>()

    init {
        addItem("블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크", true, 3.49)
    }

    fun addItem(name:String, description:String, vegetarian:Boolean, price:Double) {
        menuItems.add(MenuItem(name, description, vegetarian, price))
    }

    override fun createIterator(): Iterator<MenuItem?> = menuItems.iterator()

}