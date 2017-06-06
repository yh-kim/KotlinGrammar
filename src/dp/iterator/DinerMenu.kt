package dp.iterator

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class DinerMenu: Menu {

    companion object {
        val MAX_ITEMS = 6
    }

    var numberOfItems = 0
    var menuItems: Array<MenuItem?>

    init {
        menuItems = Array(MAX_ITEMS, { null })

        addItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05)
    }

    fun addItem(name:String, description:String, vegetarian:Boolean, price:Double) {
        if(numberOfItems >= MAX_ITEMS) {
            println("죄송합니다, 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다")
        } else {
            menuItems[numberOfItems++] = MenuItem(name, description, vegetarian, price)
        }
    }

    override fun createIterator() = DinerMenuIterator(menuItems)
//    override fun createIterator() = menuItems.iterator()

}