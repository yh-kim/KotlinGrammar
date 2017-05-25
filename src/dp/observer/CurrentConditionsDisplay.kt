package dp.observer

/**
 * Created by yonghoon on 2017-05-24
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class CurrentConditionsDisplay(weatherData: Subject): Observer, DisplayElement {
    var temperature: Float = 0F
    var humidity: Float = 0F
    var pressure: Float = 0F
    var weatherData: Subject? = null

    init {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }



    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure

        display()
    }

    override fun display() {
        println("Current conditions: $temperature F degrees and $humidity % humidity")
    }
}