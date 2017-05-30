package dp.command.receiver

/**
 * Created by yonghoon on 2017-05-30
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class Light(val name: String) {
    fun on() {
        println("$name light is on")
    }

    fun off() {
        println("$name light is off")
    }
}