package dp.strategy

import dp.strategy.fly.FlyBehavior
import dp.strategy.quack.QuackBehavior

/**
 * Created by yonghoon on 2017-05-23
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
abstract class Duck {
    abstract var flyBehavior: FlyBehavior
    abstract var quackBehavior: QuackBehavior

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠")
    }
}