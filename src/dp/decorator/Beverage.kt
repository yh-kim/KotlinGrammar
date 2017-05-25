package dp.decorator

/**
 * Created by yonghoon on 2017-05-25
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
abstract class Beverage {
    var description: String = "설명 없음"

    abstract fun cost(): Double
}