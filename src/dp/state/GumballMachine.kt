package dp.state

import dp.state.state.*

/**
 * Created by yonghoon on 2017-06-13
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class GumballMachine(var count: Int) {
    val soldOutState = SoldOutState(this)
    val noQuarterState = NoQuarterState(this)
    val hasQuarterState = HasQuarterState(this)
    val soldState = SoldState(this)
    val winnerState = WinnerState(this)

    lateinit var state:State

    init {
        if(count>0)
            state = noQuarterState
    }

    fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        if(count != 0) {
            count--
        }
    }

    fun insertQuarter() {
        state.insertQuarter()
    }

    fun ejectQuarter() {
        state.ejectQuarter()
    }

    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    override fun toString(): String {
        return "뽑기 기계입니다\n남은 개수 : $count\n현재 상태 : ${state.toString()}\n"
    }
}