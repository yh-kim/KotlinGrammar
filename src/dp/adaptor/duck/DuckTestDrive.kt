package dp.adaptor.duck

/**
 * Created by yonghoon on 2017-06-02
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val duck = MallardDuck()
    val turkey = WildTurkey()

    val turkeyAdapter: Duck = TurkeyAdapter(turkey)

    println("The Turkey says...")
    turkey.gobble()
    turkey.fly()

    println("\n The Duck says...")
    duck.quack()
    duck.fly()

    println("\n The TurkeyAdapter says...")
    turkeyAdapter.quack()
    turkeyAdapter.fly()
}