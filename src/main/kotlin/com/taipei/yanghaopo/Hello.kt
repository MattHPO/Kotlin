package com.taipei.yanghaopo

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human()
    h.hello()

    var age = 28
    age = age.plus(1)
    var weight = 66.5
    val name = "HaoPo"
    var enroll = true
    println(age)

}


class Human {
    fun hello() {
        println("Hello kotlin")
    }
}