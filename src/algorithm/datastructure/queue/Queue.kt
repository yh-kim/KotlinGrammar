package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-05-26
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class Queue<T> {
    val dataList: ArrayList<T> = ArrayList()

    fun push(t: T): T {
        dataList.add(t)
        return t
    }

    fun pop(): T? {
        if(size() == 0)
            return null

        val getData = front()
        dataList.removeAt(0)

        return getData
    }

    fun size() = dataList.size

    fun empty() = if(size() == 0) 1 else 0

    fun front() = dataList.firstOrNull()

    fun back() = dataList.lastOrNull()
}