package dp.iterator.composite

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class CompositeWaitress(val allMenus: MenuComponent) {
    fun printMenu() {
        allMenus.print()
    }


    fun printVegetarianMenu() {
        val iterator = allMenus.createIterator()

        println("\nVEGETARIAN MENU\n---")

        while(iterator.hasNext()) {
            val menuComponent = iterator.next()

            try {
                if(menuComponent.isVegetarian()) {
                    menuComponent.print()
                }
            } catch (e: UnsupportedOperationException) {

            }
        }
    }
}