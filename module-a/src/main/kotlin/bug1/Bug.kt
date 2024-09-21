package bug1

@JvmInline
value class ReturnValue(val irrelevant: Int)

interface BaseInterface {
    fun interfaceMethod(other: Int): ReturnValue = ReturnValue(5)
}

@JvmInline
value class MyValueClass(val irrelevant: Int) : BaseInterface