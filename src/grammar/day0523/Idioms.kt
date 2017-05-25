package grammar.day0523

/**
 * Created by yonghoon on 2017-05-23
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    grammar.day0523.Idioms().testClass()
}

class Idioms {
    // Default values for function parameters
    fun defaultFun(a: Int = 3, b: String) {
        print("a = $a, b = $b")
    }

    // Using ranges
    fun useRanges() {
        for(x in 1..10) {
            print("$x ")
        }
        println()

        for(x in 1 until 10) {
            print("$x ")
        }
        println()

        for(x in 1..10 step 2) {
            print("$x ")
        }
        println()

        for(x in 10 downTo 1) {
            print("$x ")
        }
        println()
    }

    // Using a map
    fun accessMap() {
        val map = mutableMapOf<String, Int>("a" to 1, "b" to 2)
        println(map["a"])
        map["a"] = 2
        println(map["a"])
    }

    // 변수 늦은 초기화 방법(초기화 전에 사용할 수 없음)
    lateinit var age: String

    // 상수 늦은 초기화 방법(호출 시점에 초기화가 됨)
    val name: String by lazy {
        "yonghoon"
    }

    // Extension functions
    fun String.spaceToCamelCase() {
        print("test")
    }

    // If not null shorthand
    fun testNull() {
        val files = java.io.File("Test").listFiles()
        println(files?.size)

        println(files?.size ?: "empty")
    }

    fun testWhen() {
        val num = 10
        val level: String = when(num) {
            in 1 until 10 -> "초보자"
            in 10 until 100 -> "중수"
            else -> "케릭터가 없습니다"
        }

        print(level)
    }

    fun testClass() {
        var product = grammar.day0523.Product.Companion.create()    // Product.create()
        print(product.name)
    }
}

class Product constructor(var name: String) {
    // Constructor
    constructor(name: String, sflk: Int) : this(name) {
    }

    constructor() : this("test") {
    }

    // Companion objects -> 싱글톤 객체, Object 이름을 넣지 않으면 .Companion으로 사용 가능
    companion object {
        fun create() = grammar.day0523.Product()
    }
}
