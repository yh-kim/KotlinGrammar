package dp.strategy

import dp.strategy.fly.FlyBehavior
import dp.strategy.fly.FlyWithWings
import dp.strategy.quack.Quack
import dp.strategy.quack.QuackBehavior

/**
 * Created by yonghoon on 2017-05-23
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class MallardDuck: Duck() {
    override var flyBehavior: FlyBehavior = FlyWithWings()

    override var quackBehavior: QuackBehavior = Quack()
}