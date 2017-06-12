package dp.singleton

/**
 * Created by yonghoon on 2017-05-29
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class ChocolateBoiler {
    var empty: Boolean = false
    var boiled: Boolean = false

    // Constructs an inaccessible constructor.
    private constructor() {

    }

    companion object {
        // Kotlin use annotation because there is no volatile keyword.
        // The volatile keyword allows variables to initialize correctly even if multithreading is used.
//        @Volatile lateinit private var uniqueInstance: ChocolateBoiler
        // 초기화를 시켜줘야 됨
        @Volatile private var uniqueInstance: ChocolateBoiler? = null

        fun getInstance(): ChocolateBoiler {
            if(uniqueInstance == null) {

                // Synchronize only the first time.
                synchronized(this) {
                    if(uniqueInstance == null)
                        uniqueInstance = ChocolateBoiler()
                }

            }

            return uniqueInstance!!
        }
    }

    init {
        empty = true
        boiled = false
    }

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