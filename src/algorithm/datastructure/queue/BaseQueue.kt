package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-05-26
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class BaseQueue<T>: Queue<T> {

    private val dataList: ArrayList<T> = ArrayList()

    override fun enqueue(t: T): T {
        dataList.add(t)
        return t
    }

    override fun peek() = dataList.firstOrNull()

    override fun dequeue(): T? {
        if(size() == 0)
            return null

        val getData = peek()
        dataList.removeAt(0)

        return getData
    }

    override fun isFull() = false

    override fun size() = dataList.size

    override fun isEmpty() = (size() == 0)

    fun back() = dataList.lastOrNull()
}