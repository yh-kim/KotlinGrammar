package dp.iterator.composite

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class NullIterator: Iterator<MenuComponent?> {
    override fun hasNext(): Boolean {
        return false
    }

    override fun next(): MenuComponent? {
        return null
    }

    fun remove() {
        throw UnsupportedOperationException()
    }
}