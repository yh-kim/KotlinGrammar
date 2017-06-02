package dp.facade.sub

/**
 * Created by yonghoon on 2017-06-02
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class DvdPlayer {
    lateinit var movie: String
    fun on() {
        println("Top-O-Line DVD Player on")
    }

    fun play(movie: String) {
        this.movie = movie
        println("Top-O-Line DVD Player playing \"$movie\"")
    }

    fun stop() {
        println("Top-O-Line DVD Player stopped \"$movie\"")
    }

    fun eject() {
        println("Top-O-Line DVD Player eject")
    }

    fun off() {
        println("Top-O-Line DVD Player off")
    }
}