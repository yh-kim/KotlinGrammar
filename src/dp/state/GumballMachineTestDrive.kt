package dp.state

/**
 * Created by yonghoon on 2017-06-13
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    var gumballMachine = GumballMachine(5)

    println(gumballMachine)

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    println(gumballMachine)

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    println(gumballMachine)
}