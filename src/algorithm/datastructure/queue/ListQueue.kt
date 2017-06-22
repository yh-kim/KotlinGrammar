package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-06-21
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class ListQueue<T>: Queue<T> {
    var front: Node? = null
    var rear: Node? = null
    var count = 0

    override fun insert(t: T): T {
        val data = Node(t as Any, null)

        if(empty()) {
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
        if(empty()) {
//            throw ArrayIndexOutOfBoundsException()
            return null
        }

        return front!!.data as T
    }

    override fun remove(): T? {
        val data = peek() ?: return null

        front = front!!.nextNode
        count--

        if(front == null) {
            rear = null
        }

        return data
    }

    override fun size() = count

    override fun empty() = (front == null)

    fun back(): T? {
        if(empty()){
            return null
        }

        return rear!!.data as T
    }

    class Node(val data: Any, var nextNode: Node? = null)
}