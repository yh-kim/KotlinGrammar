package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-06-21
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class ArrayQueue<T>(val size: Int): Queue<T> {
    val dataArray = Array<Any?>(size, {null}) as Array<T>
    var rear = -1
    var front = 0

    override fun insert(t: T): T {
        dataArray[++rear] = t
        return t
    }

    override fun peek(): T? {
        if(empty()) {
            return null
        }

        return dataArray[front]
    }

    override fun remove(): T? {
        val data = peek()
        if(data != null) {
            front++
        }

        return data
    }

    override fun size() = rear - front + 1

    override fun empty() = (front == rear + 1)

    fun back(): T? {
        if(empty()) {
            return null
        }
        return dataArray[rear]
    }
}