package dp.decorator.coffee

import dp.decorator.Beverage

/**
 * Created by yonghoon on 2017-05-25
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class DarkRoast: Beverage() {
    init {
        description = "다크 로스트 커피"
    }

    override fun cost(): Double {
        return .99
    }
}