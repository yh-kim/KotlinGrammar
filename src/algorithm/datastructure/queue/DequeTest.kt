package algorithm.datastructure.queue

/**
 * Created by yonghoon on 2017-06-22
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    var deque = Deque<String>()

    deque.addFront("1")

    deque.addRear("10")

    deque.addFront("2")
    deque.addFront("3")
    deque.addFront("4")

    deque.addRear("9")
    deque.addRear("8")
    deque.addRear("7")
    deque.addRear("6")

    deque.addFront("5")

    deque.deleteFront()

    deque.deleteRear()
    deque.deleteRear()
    deque.deleteRear()
    deque.deleteRear()
    deque.deleteRear()
    deque.deleteRear()
    deque.deleteRear()
    deque.deleteRear()
    deque.deleteRear()
}