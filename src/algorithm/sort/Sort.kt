package algorithm.sort

/**
 * Created by yonghoon on 2017-06-29
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
abstract class Sort<T> {
    abstract val complexity: String

    abstract fun sort(arr:Array<T>,compare: (T,T) -> Boolean): Array<T>

    protected fun show(arr: Array<T>) {
        val cls = Thread.currentThread()
                .stackTrace[2]
                .className
                .split(".")[2]

        print("${cls}($complexity) \t-  [")
        for(i in arr) {
            print("$i, ")
        }
        print("]\n")
    }

}