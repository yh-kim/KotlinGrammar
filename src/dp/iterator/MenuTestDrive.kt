package dp.iterator

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val dinerMenu = DinerMenu()
    val pancakeMenu = PancakeHouseMenu()

    val waitress = Waitress(pancakeMenu, dinerMenu)
    waitress.printMenu()
}