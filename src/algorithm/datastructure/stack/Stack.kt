package algorithm.datastructure.stack

import java.util.Stack

/**
 * Created by yonghoon on 2017-05-26
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
open class Stack<T> {
    val dataList: ArrayList<T> = ArrayList()

    fun push(t: T) {
        dataList.add(t)
    }

    fun pop(): T? {
        if(size() == 0) {
            return null
        }

        val getData = top()
        if(getData != null)
            dataList.removeAt(dataList.size-1)

        return getData
    }

    fun top(): T? {
        if(size() == 0) {
            return null
        }

        return dataList.last()
    }

    fun size(): Int = dataList.size

    fun empty() = if(size() == 0) 1 else 0
}