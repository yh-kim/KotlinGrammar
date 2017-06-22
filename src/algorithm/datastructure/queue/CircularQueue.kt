package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-06-22
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class CircularQueue<T>(val maxSize: Int): Queue<T> {

    val dataArray = Array<Any?>(maxSize, {null}) as Array<T>
    var rear = 0
    var front = 0

    override fun enqueue(t: T): T {
        if(isFull()) {
            throw ArrayIndexOutOfBoundsException("is full")
        }

        rear = (rear+1) % maxSize

        dataArray[rear] = t
        show()
        return t
    }


    override fun peek(): T? {
        if(empty()) {
            throw ArrayIndexOutOfBoundsException("is empty")
        }

        return dataArray[front+1]
    }

    override fun dequeue(): T? {
        val data = peek()
        front = (front+1)%maxSize
        show()
        return data
    }

    override fun isFull() = front == (rear + 1) % maxSize

    override fun size() = (rear - front + 1)

    override fun empty() = (front == rear)

    fun show() {
        val ste = Thread.currentThread().stackTrace[2]

        print("${ste.methodName} - [")
        for(i in dataArray) {
            if(i == null) {
                print("-, ")
            } else {
                print("${i}, ")
            }

        }

        print("] - rear:$rear front:$front \n")
    }
}