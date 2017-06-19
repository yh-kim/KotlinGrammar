package algorithm.datastructure.stack

/**
 * Created by yonghoon on 2017-06-19
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class ArrayStack<T>(var maxSize: Int): Stack<T> {
    var top = -1
    var dataArray: Array<T?> = Array<Any?>(maxSize, { null }) as Array<T?>


    override fun push(t: T) {
        if(full()) {
//            throw ArrayIndexOutOfBoundsException("${top+1}>=$maxSize")
            return
        }

        dataArray[++top] = t
    }

    override fun pop(): T? {
        val data = peek()
        if(data != null) top--
        return data
    }

    override fun peek(): T? {
        if(empty()) {
//            throw ArrayIndexOutOfBoundsException("Empty, top=$top")
            return null
        }

        return dataArray[top]
    }

    override fun size(): Int = top+1

    override fun empty(): Boolean = (top == -1)

    fun full(): Boolean {
        if(top+1 == maxSize) {
            return true
        }
        return false
    }

}