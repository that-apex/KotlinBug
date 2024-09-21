package bug2

import bug1.MyValueClass

fun main() {
    // works fine in module-a
    println(MyValueClass(8).interfaceMethod(4))
}
