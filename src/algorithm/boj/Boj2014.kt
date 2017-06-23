package algorithm.boj

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 * Created by yonghoon on 2017-06-24
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * site   : https://www.acmicpc.net/problem/2014
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine(), " ")
    val count = st.nextToken().toInt()
    val size = st.nextToken().toInt()

    var values = Array(count, {0})
    st = StringTokenizer(br.readLine(), " ")

    val nums = Array<ListQueue<Long>?>(values.size, { null })

    for(i in 0..nums.size-1) {
        values[i] = st.nextToken().toInt()
        nums[i] = ListQueue<Long>()
        nums[i]!!.enqueue(values[i].toLong())
    }

    br.close()

    var result: Long = 0

    for(i in 0..size-1) {
        result = Long.MAX_VALUE
        var index = 0

        for(j in 0..nums.size-1) {
            if(result > nums[j]!!.peek()) {
                result = nums[j]!!.peek()
                index = j
            }
        }

        for(j in 0..nums.size-1) {
            if(values[j] >= values[index]) {
                nums[j]!!.enqueue(values[j] * result)
            }

        }

        nums[index]!!.dequeue()
        println("$i 번째 값은 $result 입니다")
    }

    print(result)
}

class ListQueue<T> {

    private var front: Node? = null
    private var rear: Node? = null
    private var count = 0

    fun enqueue(t: T): T {
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

    fun peek(): T {
        if(isEmpty()) {
            throw ArrayIndexOutOfBoundsException("is empty")
        }

        return front!!.data as T
    }

    fun dequeue(): T {
        val data = peek()

        front = front!!.nextNode
        count--

        if(front == null) {
            rear = null
        }

        return data
    }

    fun size() = count

    fun isEmpty() = (front == null)

    class Node(val data: Any, var nextNode: Node? = null)
}