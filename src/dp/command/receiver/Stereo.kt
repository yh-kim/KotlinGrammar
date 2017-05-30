package dp.command.receiver

/**
 * Created by yonghoon on 2017-05-30
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class Stereo(val name: String) {
    fun on() {
        println("$name stereo is on")
    }

    fun off() {
        println("$name stereo is off")
    }

    fun setCd() {
        println("Set the Stereo device in $name to CD")
    }

    fun setDvd() {
        println("Set the Stereo device in $name to DVD")
    }

    fun setRadio() {
        println("Set the Stereo device in $name to Radio")
    }

    fun setVolume(volume: Int) {
        println("Set the Stereo volume in $name to $volume")
    }
}