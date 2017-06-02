package dp.facade.sub

/**
 * Created by yonghoon on 2017-06-02
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class Amplifier {
    fun on() {
        println("Top-O-Line Amplifier on")
    }

    fun setDvd(dvd:DvdPlayer) {
        println("Top-O-Line Amplifier setting VD player to Top-O-Line DVD Player")
    }

    fun setSurroundsSound() {
        println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)")
    }

    fun setVolume(volume: Int) {
        println("Top-O-Line Amplifier setting volume to 5")
    }

    fun off() {
        println("Top-O-Line Amplifier off")
    }
}