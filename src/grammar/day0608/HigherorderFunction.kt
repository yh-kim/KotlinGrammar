package grammar.day0608

import java.util.concurrent.locks.Lock

/**
 * Created by yonghoon on 2017-06-08
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class HigherorderFunction {
    fun <T> lock(lock: Lock, body: () -> T): T {
        lock.lock()

        try {
            return body()
        }
        finally {
            lock.unlock()
        }
    }

    fun lockTest() {

    }

    fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
        val result = arrayListOf<R>()
        for(item in this) {
            result.add(transform(item))
        }

        return result
    }

    fun mapTest() {
        val list = listOf(10, 20, 30)

//        val doubled = list.map { value -> value * 2 }
        val doubled = list.map { it * 2 }

//        for(i in 0..doubled.size-1)
//            println(doubled[i])

//        for(i in list.indices)
//            println(doubled[i])

        for(i in doubled)
            println(i)
    }

    fun <T> max(collection: Collection<T>, less: (T,T) -> Boolean): T? {
        var max: T? = null
        for(item in collection) {
            if(max == null || less(max, item))
                max = item
        }

        return max
    }

    fun maxTest() {
        val strings = listOf("yonghoon", "goozi")
        var result = max(strings, { a, b -> a.length < b.length})
        println(result)
    }

//    val sum = { x: Int, y:Int -> x+y }
    val sum: (Int, Int) -> Int = { x,y -> x+y }

    fun sumTest() {
        println(sum(3, 4))
    }
}

fun main(args: Array<String>) {
    HigherorderFunction().sumTest()
}