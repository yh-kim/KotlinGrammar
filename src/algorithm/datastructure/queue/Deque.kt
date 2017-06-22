package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-06-22
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class Deque<T> {
    private var header = Node("Header Node", null, null)

    fun addFront(t: T) {
        val data = Node(t as Any, null, null)
        if(isEmpty()) {
            header.preNode = data
            header.postNode = data
        } else {
            header.postNode!!.preNode = data
            data.postNode = header.postNode
            header.postNode = data
        }
        show()
    }

    fun addRear(t: T) {
        val data = Node(t as Any, null, null)
        if(isEmpty()) {
            header.preNode = data
            header.postNode = data
        } else {
            header.preNode!!.postNode = data
            data.preNode = header.preNode
            header.preNode = data
        }
        show()
    }

    fun getFront(): T {
        if(isEmpty()) {
            throw ArrayIndexOutOfBoundsException("is Empty")
        }

        return header.postNode!!.data as T
    }

    fun getRear(): T {
        if(isEmpty()) {
            throw ArrayIndexOutOfBoundsException("is Empty")
        }

        return header.preNode!!.data as T
    }

    fun deleteFront(): T {
        val data = getFront()

        header.postNode = header.postNode!!.postNode
        header.postNode!!.preNode = header
        show()
        return data
    }

    fun deleteRear(): T? {
        val data = getRear()

        header.preNode = header.preNode!!.preNode
        header.preNode!!.postNode = header
        show()
        return data
    }

//    fun size(): Int {
//    }

    fun isEmpty() = (header.postNode == null)

    fun show() {
        val ste = Thread.currentThread().stackTrace[2]
        print("${ste.methodName} - \t[")
        var node = header.postNode
        while(node != header && node != null) {
            print("${node.data}, ")
            node = node.postNode
        }
        print("]\n")
    }

    class Node(val data:Any, var preNode:Node? = null, var postNode: Node? = null)
}