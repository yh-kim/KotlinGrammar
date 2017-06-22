package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-06-22
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val queue = CircularQueue<String>(10)

    queue.enqueue("1")
    queue.enqueue("2")
    queue.enqueue("3")

    queue.dequeue()
    queue.dequeue()
    queue.dequeue()

    queue.enqueue("4")
    queue.enqueue("5")
    queue.enqueue("6")
    queue.enqueue("7")
    queue.enqueue("8")
    queue.enqueue("9")
    queue.enqueue("10")
    queue.enqueue("11")

    println("peek - ${queue.peek()}")

}