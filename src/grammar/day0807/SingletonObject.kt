package grammar.day0807

/**
 * Created by yonghoon on 2017-08-07
 * Mail   : yonghoon.kim@pickth.com
 */
object SingletonObject {
    var empty: Boolean = true
    var boiled: Boolean = false

    fun fill() {
        if(isEmpty()) {
            empty = false
            boiled = false
            println("fill")
            // 보일러에 우유/초콜릿을 혼합한 재료를 넣음
        }
    }

    /**
     * 끓인 재료를 다음 단계로 넘김
     */
    fun drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true
            println("drain")
        }
    }

    fun boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true
            println("boil")
        }
    }

    fun isEmpty(): Boolean = empty

    fun isBoiled(): Boolean = boiled
}