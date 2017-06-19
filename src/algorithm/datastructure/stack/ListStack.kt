package algorithm.datastructure.stack

/**
 * Created by yonghoon on 2017-06-20
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class ListStack<T>: Stack<T> {
    var top: Node? = null
    var size = 0

    override fun push(t: T) {
        val newNode = Node(t as Any)
        newNode.nextNode = top
        top = newNode
        size++
    }

    override fun pop(): T? {
        val data = peek()
        if(data != null) {
            top = top!!.nextNode
            size--
        }

        return data
    }

    override fun peek(): T? {
        if(empty()) {
            return null
        }
        return top!!.data as T
    }

    override fun size(): Int = size

    override fun empty(): Boolean = (top == null)

    class Node(val data: Any,var nextNode: Node? = null)
}