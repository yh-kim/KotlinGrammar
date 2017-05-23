package day0523.dp

import day0523.dp.fly.FlyRocketPowered

/**
 * Created by yonghoon on 2017-05-23
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    var mallard = MallardDuck()
    mallard.performFly()
    mallard.performQuack()

    var model = ModelDuck()
    model.performFly()
    model.flyBehavior = FlyRocketPowered()
    model.performFly()
}