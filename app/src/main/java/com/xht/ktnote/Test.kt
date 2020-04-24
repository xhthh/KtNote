package com.xht.ktnote

fun main() {

    //test1()
    //test2()
    //test3()
    //test4()
    //test5()
    //test6()
    //test7()
    //test8()
    //test9()
    //test10()
    test11()
}

fun test11() {
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

fun test10() {
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
}

fun test9() {
    val x = 100
    val y = 9
    if (x in 2..y + 1) {
        println("fits in range")
    }

}

fun test8() {
    val result = describe(233)
    print("result is $result")
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

fun test7() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    println()

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

/**
 * is 运算符检测一个表达式是否某类型的一个实例。 如果一个不可变的局部变量或属性已经判断出为某类型，那么检测后的分支中可以直接当作该类型使用，无需显式转换
 */
fun test6() {
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
}

fun printLength(obj: Any) {
    println("'$obj' string length is ${getStringLength(obj) ?: "... err, not a string"} ")
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` 在该条件分支内自动转换成 `String`
        return obj.length
    }
    // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String) {
        return null
    }
    return obj.length
}

fun getStringLength3(obj: Any): Int? {
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}

/**
 * 当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。
 */
fun test5() {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    println("x = $x, y = $y")

    // 直接使用 `x * y` 会导致编译错误，因为它们可能为 null
    if (x != null && y != null) {
        // 在空检测后，x 与 y 会自动转换为非空值（non-nullable）
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

/**
 * 条件表达式
 *
 * 在 Kotlin 中，if 也可以用作表达式
 */
fun test4() {
//    val value = maxOf(3, 5)
    val value = maxOf2(3, 5)
    println("value = $value")
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

/**
 * 字符串
 */
fun test3() {
    var a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    print(s2)
}

/**
 * 变量
 * 定义只读局部变量使用关键字 val 定义。只能为其赋值一次。
 *
 * 可重新赋值的变量使用 var 关键字
 */
fun test2() {
    val a: Int = 1  // 立即赋值
    val b = 2   // 自动推断出 `Int` 类型
    val c: Int  // 如果没有初始值类型不能省略
    c = 3       // 明确赋值

    println("a = $a, b = $b, c = $c")

//    var x = 5// 自动推断出 `Int` 类型
//    x += 1
//    println("x = $x")

    println("x = $x, PI = $PI")
    incrementX()
    println("x = $x, PI = $PI")
}

var PI = 3.14
var x = 0
fun incrementX() {
    x += 1
}

/**
 * 函数
 * 将表达式作为函数体、返回值类型自动推断的函数
 * 函数返回无意义的值：Unit，Unit可以省略
 */
private fun test1() {
//    print("sum of 3 and 5 is ")
//    println(sum(3, 5))
//    println(sum2(3, 4))
    println(printSum(3, 5))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}