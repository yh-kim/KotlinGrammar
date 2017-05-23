package day0522

/**
 * Created by yonghoon on 2017-05-22
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
// object는 싱글톤으로 사용
object BaseGrammar {
    val a = 1           // val : 변할 수 없는 상수(final), Int를 추론
    var b: Int = 2      // var : 변수, 자료형을 뒤에 씀

    val immutableList = listOf(100, 200, 300, 400)              // 변경 불가능한 정적 리스트
    val mutableList = mutableListOf(10,20,30,40,50)     // 변경 가능한 리스트

    // 여러 줄의 스트링을 사용할 수 있게 함. |와 공백을 제거하는 trimMargin을 사용하면 가독성을 높일 수 있음.
    val stringLine = """
        |asdf
        |zxcv
        |qwr
        """.trimMargin()

    // 기본 함수 정의
    fun sum1(a:Int, b:Int): Int {
        return a+b
    }

    // 함수를 expression 으로 만들 수 있음, 대신 return 키워드를 사용하면 안됨
    fun sum2(a: Int, b:Int): Int = a+b

    // Int를 추론하므로 생략 가능
    fun sum3(a: Int, b:Int) = a+b

    // 함수에 조건문을 넣을 때때
    fun max(a: Int, b:Int) = if(a>b) a else b

    // String Interpolation
    // Unit Object는 자바의 void 역할을 수행
    fun testString():Unit {
        val hello = "hello"
        val num = 3
        println("1. $hello")        // hello
        println("2. " + hello)      // hello
        println("3. ${num + 30}")   // 33
        println("4. $num + 30")     // 3 + 30
    }

    // Any Object는 자바의 Object 역할을 수행
    fun getStringLength(obj: Any): Int {
        if(obj is String)
            return obj.length   // 위의 is가 자동 캐스팅을 해줌
        else
            return 0
    }

    // loop
    fun iteratePrint(x:Int): Unit {
        // ranges
        for(y in 1..5)
            print("$y ")
        println()
        for(z in 1..x)
            print("$z " )
        println()

        // for each
        for(number in immutableList)
            print("$number ")
        println()
        for(position in immutableList.indices)
            print("${immutableList[position]} ")
        println()

        print(immutableList.joinToString("-"))  // 리스트 사이에 문자열 낄 수도 있음
    }

    fun testCollection():Unit {
        mutableList.add(60)

        mutableList
                .filter { number -> number > 20 }
                .map { number -> number * 2 }
                .forEach { number -> print("$number ") }

        println()

        mutableList
                .filter { it > 20 }
                .map { it * 2 }
                .forEach { print("$it ") }
    }

    // main 함수
    @JvmStatic fun main(args: Array<String>) {
        iteratePrint(10)
    }


}
