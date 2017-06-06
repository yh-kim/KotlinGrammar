package dp.iterator.composite

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
abstract class MenuComponent {
    open fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun getChild(position: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    open fun print() {
        throw UnsupportedOperationException()
    }

    open fun createIterator(): Iterator<MenuComponent> {
        throw UnsupportedOperationException()
    }

    open fun isVegetarian(): Boolean {
        throw UnsupportedOperationException()
    }
}