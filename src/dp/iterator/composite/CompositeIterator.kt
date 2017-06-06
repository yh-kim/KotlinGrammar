package dp.iterator.composite

import java.util.*

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class CompositeIterator(val iterator: Iterator<MenuComponent>): Iterator<MenuComponent?> {
    val stack = Stack<Iterator<MenuComponent>>()

    init {
        stack.push(iterator)
    }

    override fun hasNext(): Boolean {
        if(stack.empty()) {
            return false
        } else {
            if(!stack.peek().hasNext()) {
                stack.pop()
                return hasNext()
            } else {
                return true
            }
        }
    }

    override fun next(): MenuComponent? {
        if(hasNext()) {
            val component = stack.peek().next()
            if(component is Menu) {
                stack.push(component.createIterator())
            }

            return component
        } else {
            return null
        }
    }

    fun remove() {
        throw UnsupportedOperationException()
    }
}