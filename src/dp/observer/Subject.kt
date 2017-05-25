package dp.observer

/**
 * Created by yonghoon on 2017-05-24
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
interface Subject {
    fun registerObserver(o: Observer)

    fun removeObserver(o: Observer)

    fun notifyObservers()
}