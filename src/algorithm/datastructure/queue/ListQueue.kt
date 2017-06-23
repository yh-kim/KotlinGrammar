package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-06-21
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class ListQueue<T>: Queue<T> {

    private var front: Node? = null
    private var rear: Node? = null
    private var count = 0

    override fun enqueue(t: T): T {
        val data = Node(t as Any, null)

        if(isEmpty()) {
            rear = data
            front = data
        } else {
            rear!!.nextNode = data
            rear = data
        }
        count++
        return t

    }

    override fun peek(): T? {
        if(isEmpty()) {
//            throw ArrayIndexOutOfBoundsException()
            return null
        }

        return front!!.data as T
    }

    override fun dequeue(): T? {
        val data = peek() ?: return null

        front = front!!.nextNode
        count--

        if(front == null) {
            rear = null
        }

        return data
    }


    override fun isFull() = false

    override fun size() = count

    override fun isEmpty() = (front == null)

    fun back(): T? {
        if(isEmpty()){
            return null
        }

        return rear!!.data as T
    }

    class Node(val data: Any, var nextNode: Node? = null)
}