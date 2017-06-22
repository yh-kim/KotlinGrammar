package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-06-21
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class ArrayQueue<T>(val maxSize: Int): Queue<T> {
    private val dataArray = Array<Any?>(maxSize, {null}) as Array<T>
    private var rear = -1
    private var front = -1

    override fun enqueue(t: T): T {
        dataArray[++rear] = t
        return t
    }

    override fun peek(): T? {
        if(empty()) {
            return null
        }

        return dataArray[front + 1]
    }

    override fun dequeue(): T? {
        val data = peek()
        if(data != null) {
            front++
        }

        return data
    }

    override fun isFull() = (rear == maxSize - 1)

    override fun size() = rear - front

    override fun empty() = (front == rear)

    fun back(): T? {
        if(empty()) {
            return null
        }
        return dataArray[rear]
    }
}