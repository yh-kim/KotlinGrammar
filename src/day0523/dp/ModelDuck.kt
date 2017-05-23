package day0523.dp

import day0523.dp.fly.FlyBehavior
import day0523.dp.fly.FlyNoWay
import day0523.dp.quack.Quack
import day0523.dp.quack.QuackBehavior

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