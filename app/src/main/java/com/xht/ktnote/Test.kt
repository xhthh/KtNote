package com.xht.ktnote

fun main() {

    //test1()
    //test2()
    //test3()
    test4()
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