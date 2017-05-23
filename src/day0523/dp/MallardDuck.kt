package day0523.dp

import day0523.dp.fly.FlyBehavior
import day0523.dp.fly.FlyWithWings
import day0523.dp.quack.Quack
import day0523.dp.quack.QuackBehavior

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