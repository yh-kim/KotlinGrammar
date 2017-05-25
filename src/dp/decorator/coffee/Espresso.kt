package dp.decorator.coffee

/**
 * Created by yonghoon on 2017-05-25
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class Espresso: dp.decorator.Beverage() {
    init {
        description = "에스프레소"
    }

    override fun cost(): Double {
        return 1.99
    }
}