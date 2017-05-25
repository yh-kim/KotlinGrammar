package dp.observer

/**
 * Created by yonghoon on 2017-05-24
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class WeatherData: Subject {
    val observers = mutableListOf<Observer>()
    var temperature: Float = 0F
    var humidity: Float = 0F
    var pressure: Float = 0F


    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        val index = observers.indexOf(o)

        if(index >= 0)
            observers.removeAt(index)
    }

    override fun notifyObservers() {
        for(x in observers)
            x.update(temperature, humidity, pressure)
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure

        measurementsChanged()
    }
}