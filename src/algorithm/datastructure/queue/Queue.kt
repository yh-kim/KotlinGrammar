package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-06-21
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
interface Queue<T> {
    fun enqueue(t: T): T

    fun peek(): T?

    fun dequeue(): T?

    fun isFull(): Boolean

    fun size(): Int

    fun isEmpty(): Boolean

}