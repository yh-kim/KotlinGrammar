package dp.strategy

import dp.strategy.fly.FlyBehavior
import dp.strategy.fly.FlyNoWay
import dp.strategy.quack.Quack
import dp.strategy.quack.QuackBehavior

/**
 * Created by yonghoon on 2017-05-23
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class ModelDuck: Duck() {
    override var flyBehavior: FlyBehavior = FlyNoWay()
        set(value) {
            field = value
        }

    override var quackBehavior: QuackBehavior = Quack()

    fun display() {
        println("저는 모형 오리입니다")
    }
}