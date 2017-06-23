package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-06-23
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class PriorityQueue<T>(val maxSize: Int): Queue<T> {
    var front = 0
    val dataArray = Array<Any?>(maxSize, { null }) as Array<T>

    override fun enqueue(t: T): T {
        if(isFull()) {
            throw ArrayIndexOutOfBoundsException("is full")
        }

        var index = 0

        if(isEmpty()) {
            dataArray[front++] = t
        } else {
            for(i in front-1 downTo 0) {
                if(t is Int) {
                    if(t > (dataArray[i] as Int)) {
                        dataArray[i+1] = dataArray[i]
                    } else {
                        index = i+1
                        break
                    }
                }
            }

            dataArray[index] = t
            front++
        }

        show()
        return t
    }

    override fun peek(): T? {
        if(isEmpty()) {
            throw ArrayIndexOutOfBoundsException("is empty")
        }

        return dataArray[front-1]
    }

    override fun dequeue(): T? {
        val data = peek()
        front--
        show()
        return data
    }

    override fun isFull() = front == maxSize

    override fun size() = front

    override fun isEmpty() = front == 0

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

        print("] - front:$front \n")
    }
}