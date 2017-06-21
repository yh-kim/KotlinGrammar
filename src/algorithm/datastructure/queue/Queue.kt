package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-06-21
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
interface Queue<T> {
    fun insert(t: T): T

    fun remove(): T?

    fun peek(): T?

    fun size(): Int

    fun empty(): Boolean

}