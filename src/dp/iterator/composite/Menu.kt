package dp.iterator.composite

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class Menu(var name: String, var description: String): MenuComponent() {
    val menuComponents = ArrayList<MenuComponent>()

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(position: Int) = menuComponents[position]

    override fun print() {
        println("\n$name, $description \n ------------------")

        val iterator = menuComponents.iterator()

        while(iterator.hasNext()) {
            iterator.next().print()
        }
    }

    override fun createIterator(): Iterator<MenuComponent> {
       return CompositeIterator(menuComponents.iterator()) as Iterator<MenuComponent>
    }
}