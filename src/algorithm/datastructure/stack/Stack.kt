package algorithm.datastructure.stack

/**
 * Created by yonghoon on 2017-06-19
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
interface Stack<T> {
    fun push(t: T)

    fun pop(): T?

    fun peek(): T?

    fun size(): Int

    fun empty(): Boolean
}