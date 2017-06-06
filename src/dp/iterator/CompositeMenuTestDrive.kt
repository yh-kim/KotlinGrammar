package dp.iterator

import dp.iterator.composite.CompositeWaitress
import dp.iterator.composite.Menu
import dp.iterator.composite.MenuItem

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val pancakeHouseMenu = Menu("팬케이크 하우스 메뉴", "아침 메뉴")
    val dinerMenu = Menu("객체마을 식당 메뉴", "점심 메뉴")
    val cafeMenu = Menu("카페 메뉴", "저녁 메뉴")
    val dessertMenu = Menu("디저트 메뉴", "디저트 메뉴")

    val allMenus = Menu("전체 메뉴", "전체 메뉴")

    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)

    dinerMenu.add(MenuItem("파스타", "마리나라 소스 스파게티, 효모빵도 드립니다.", true, 3.89))
    dinerMenu.add(dessertMenu)

    dessertMenu.add(MenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라 아이스크림이 얹혀 있는 애플 파이", true, 1.59))

    val waitress = CompositeWaitress(allMenus)
//    waitress.printMenu()
    waitress.printVegetarianMenu()
}