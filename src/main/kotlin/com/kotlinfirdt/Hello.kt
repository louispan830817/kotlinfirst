package com.kotlinfirdt

fun main() {
    //println("Hello Kotlin");
//    Human().hello();
    val h = Human()
    h.hello()
    var age : Int = 19;//var可變val不可變
    var name = "我是誰";
    var weight = 66.5f;


}

class Human {
    fun hello(){
        println("Hello Kotlin");
    }
}