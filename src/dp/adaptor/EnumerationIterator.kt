package dp.adaptor

import java.util.*

/**
 * Created by yonghoon on 2017-06-02
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class EnumerationIterator(val enumeration: Enumeration<Unit>): Iterator<Unit> {
    fun remove() {
        throw UnsupportedOperationException()
    }

    override fun hasNext(): Boolean {
        return enumeration.hasMoreElements()
    }

    override fun next():Unit {
        return enumeration.nextElement()
    }
}