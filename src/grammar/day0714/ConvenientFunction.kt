package grammar.day0714

/**
 * Created by yonghoon on 2017-07-14
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val mHuman = Human()
    println(mHuman)

//    changeStatus()
    applyTest(mHuman)
    withTest(mHuman)
}

fun changeStatus(human: Human) {
}

fun applyTest(human: Human) {
    human.apply {
        name = "ddd"
        age = 223
        job = "xvxcv"
    }.let { println(it.toString()) }
}

fun runTest() {

}

fun withTest(human: Human) {
    with(human) {
        name = "ppp"
        age = 999
        job = "ㅎㅎㅎ"
    }.let { println(it.toString()) }
    println(human)
}

class Human(var name: String, var age: Int, var job: String) {
    constructor(): this("a")
    constructor(name: String): this(name, 10)
    constructor(name: String, age: Int): this(name, age, "ds")

    override fun toString(): String {
        return "name: $name, age: $age, job:$job "
    }
}