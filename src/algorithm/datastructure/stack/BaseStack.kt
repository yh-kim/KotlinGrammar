package algorithm.datastructure.stack

/**
 * Created by yonghoon on 2017-05-26
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class BaseStack<T>: Stack<T> {
    val dataList: ArrayList<T> = ArrayList()

    override fun push(t: T) {
        dataList.add(t)
    }

    override fun pop(): T? {
        val getData = peek()
        if(getData != null)
            dataList.removeAt(dataList.size-1)

        return getData
    }

    override fun peek(): T? {
        if(size() == 0) {
            return null
        }

        return dataList.last()
    }

    override fun size(): Int = dataList.size

    override fun empty() = (size() == 0)
}